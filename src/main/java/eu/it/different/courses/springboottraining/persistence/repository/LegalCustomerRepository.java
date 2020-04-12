package eu.it.different.courses.springboottraining.persistence.repository;

import eu.it.different.courses.springboottraining.persistence.entity.customer.LegalCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LegalCustomerRepository extends JpaRepository<LegalCustomer, Long> {

}
