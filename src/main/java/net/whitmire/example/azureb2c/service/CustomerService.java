package net.whitmire.example.azureb2c.service;

import net.whitmire.example.azureb2c.model.CustomerModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Provides access to sample Customer records
 */
@Service
public class CustomerService {

    /**
\     * Creates five  sample customer records
      * @returns {@link List<CustomerModel>}
     */
    private List<CustomerModel> createSampleRecords() {
        List<CustomerModel> sampleRecords = new ArrayList<>();

        CustomerModel customerModel = new CustomerModel();
        customerModel.setAddresLine1("1400 Anyhoo Lane");
        customerModel.setBirthDate(LocalDate.of(1975, Month.MAY, 1));
        customerModel.setEmail("bdavis@email.com");
        customerModel.setFirstName("William");
        customerModel.setId(1L);
        customerModel.setMiddleName("Ben");
        customerModel.setLastName("Davis");
        customerModel.setPhoneNumber("5551112222");
        customerModel.setState("KY");
        customerModel.setZipCode("90210");
        sampleRecords.add(customerModel);

        customerModel = new CustomerModel();
        customerModel.setAddresLine1("14 Hollow Hill");
        customerModel.setBirthDate(LocalDate.of(1940, Month.JULY, 13));
        customerModel.setEmail("kwatson@email.com");
        customerModel.setFirstName("Keith");
        customerModel.setId(2L);
        customerModel.setMiddleName("Benson");
        customerModel.setLastName("Watson");
        customerModel.setPhoneNumber("5551114444");
        customerModel.setState("AL");
        customerModel.setZipCode("90210");
        sampleRecords.add(customerModel);

        customerModel = new CustomerModel();
        customerModel.setAddresLine1("512 Twin Lane");
        customerModel.setBirthDate(LocalDate.of(1980, Month.JANUARY, 8));
        customerModel.setEmail("larry.stevens@email.com");
        customerModel.setFirstName("Larry");
        customerModel.setId(3L);
        customerModel.setMiddleName("Fleming");
        customerModel.setLastName("Stevens");
        customerModel.setPhoneNumber("5552221111");
        customerModel.setState("SC");
        customerModel.setZipCode("90210");
        sampleRecords.add(customerModel);

        customerModel = new CustomerModel();
        customerModel.setAddresLine1("8 Sherwood");
        customerModel.setBirthDate(LocalDate.of(1982, Month.MARCH, 23));
        customerModel.setEmail("dlawrence@email.com");
        customerModel.setFirstName("Diane");
        customerModel.setId(4L);
        customerModel.setMiddleName("Elizabeth");
        customerModel.setLastName("Lawrence");
        customerModel.setPhoneNumber("5552149677");
        customerModel.setState("NC");
        customerModel.setZipCode("90210");
        sampleRecords.add(customerModel);

        customerModel = new CustomerModel();
        customerModel.setAddresLine1("16 Milton Way");
        customerModel.setBirthDate(LocalDate.of(1994, Month.SEPTEMBER, 14));
        customerModel.setEmail("hmorris@email.com");
        customerModel.setFirstName("Heather");
        customerModel.setId(5L);
        customerModel.setMiddleName("Nell");
        customerModel.setLastName("Morris");
        customerModel.setPhoneNumber("553514291");
        customerModel.setState("FL");
        customerModel.setZipCode("90210");
        sampleRecords.add(customerModel);

        return sampleRecords;
    }

    /**
     * Initializes the sample {@link List<CustomerModel>} records for this service.
     */
    private List<CustomerModel> sampleRecords = createSampleRecords();

    /**
     * Looks up a customer record by id
     * @param customerId The id used for the lookup
     * @return {@link Optional<CustomerModel>}
     */
    public Optional<CustomerModel> findById(Long customerId) {
        Optional<CustomerModel> sampleRecord = sampleRecords.stream()
                .filter(rec -> rec.getId() == customerId).findFirst();
        return sampleRecord;
    }

    /**
     * @return {@link List<CustomerModel>}
     */
    public List<CustomerModel> findAll() {
        return sampleRecords;
    }
}
