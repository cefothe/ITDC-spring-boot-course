package eu.it.different.courses.springboottraining.persistence.entity.customer;

import eu.it.different.courses.springboottraining.persistence.entity.common.Address;
import eu.it.different.courses.springboottraining.persistence.entity.common.Phone;
import java.util.List;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class LegalCustomer extends Customer{

    @NotNull
    private String vatNumber;
    @NotNull
    private String contactPerson;

    private LegalCustomer(String name,
        List<Address> address,
        List<Phone> phones, String vatNumber, String contactPerson) {
        super(name, address, phones);
        this.vatNumber = vatNumber;
        this.contactPerson = contactPerson;
    }

    protected LegalCustomer() {
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public static LegalCustomer create(String name, List<Address> address,
        List<Phone> phones, String vatNumber, String contactPerson){
        return new LegalCustomer(name, address, phones, vatNumber, contactPerson);
    }
}
