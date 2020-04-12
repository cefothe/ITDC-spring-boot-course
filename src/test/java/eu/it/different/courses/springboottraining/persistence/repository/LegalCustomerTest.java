package eu.it.different.courses.springboottraining.persistence.repository;

import static org.junit.jupiter.api.Assertions.*;

import eu.it.different.courses.springboottraining.persistence.entity.common.Address;
import eu.it.different.courses.springboottraining.persistence.entity.common.Phone;
import eu.it.different.courses.springboottraining.persistence.entity.common.PhoneType;
import eu.it.different.courses.springboottraining.persistence.entity.customer.LegalCustomer;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
@DataJpaTest
class LegalCustomerTest {

    @Autowired
    private LegalCustomerRepository legalCustomerRepository;

    @Test
    public void createLegacyUser(){
        //given
        var legacyUser = LegalCustomer.create("ITDC",
            List.of(new Address("Plovdiv","Granda")),
            List.of(new Phone(PhoneType.MOBILE, "0895151615")),
            "TESTTEST",
            "Stefan Angelov");
        //when
        legalCustomerRepository.save(legacyUser);

        //then
        assertEquals(1, legalCustomerRepository.count(), "Legal customer is not persisted correctly");
    }
}