package eu.it.different.courses.springboottraining.persistence.entity.customer;

import static java.util.Collections.unmodifiableList;

import eu.it.different.courses.springboottraining.persistence.entity.BaseEntity;
import eu.it.different.courses.springboottraining.persistence.entity.common.Address;
import eu.it.different.courses.springboottraining.persistence.entity.common.Phone;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Customer  extends BaseEntity {

    @NotNull
    private String name;

    @ElementCollection
    private List<Address> address;

    @ElementCollection
    private List<Phone> phones;

    protected Customer(String name,
        List<Address> address,
        List<Phone> phones) {
        this.name = name;
        this.address = address;
        this.phones = phones;
    }

    protected Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddress() {
        return unmodifiableList(address);
    }

    public List<Phone> getPhones() {
        return unmodifiableList(phones);
    }

    public void addAddress(Address address){
        this.address.add(address);
    }

    public void addPhone(Phone phone){
        this.phones.add(phone);
    }
}
