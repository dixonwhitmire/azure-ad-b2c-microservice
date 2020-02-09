package net.whitmire.example.azureb2c.controller;

import net.whitmire.example.azureb2c.B2CApplication;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Tests {@link CustomerController} endpoints
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application.properties")
public class CustomerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Validates that resource lookups return either a 200 or 404 status code.
     */
    @Test
    public void testFindById() throws Exception {
        mockMvc.perform(get("/customers/1"))
                .andExpect(status().isOk());

        mockMvc.perform(get("/customers/10"))
                .andExpect(status().isNotFound());
    }

    /**
     * Validates that an endpoint to fetch all resources returns a 200 status code
     * @throws Exception
     */
    @Test
    public void testFindAll() throws Exception {
        mockMvc.perform(get("/customers"))
                .andExpect(status().isOk());
    }
}
