package net.whitmire.example.azureb2c.controller;

import net.whitmire.example.azureb2c.model.CustomerModel;
import net.whitmire.example.azureb2c.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

/**
 * Implements REST endpoints to support Customer lookup operations
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /**
     * Looks up and returns a single {@link CustomerModel}
     * @param customerId The customer id lookup key
     * @return 200 status code if found, 404 if a matching resource is not found
     */
    @GetMapping("/{customerId}")
    public CustomerModel findById(@PathVariable("customerId") Long customerId) {
        CustomerModel selectedRecord = customerService.findById(customerId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer Not Found"));
        return selectedRecord;
    }

    /**
     * @return all customer records as a {@link List<CustomerModel>}
     */
    @GetMapping
    public List<CustomerModel> findAll() {
        return customerService.findAll();
    }

}