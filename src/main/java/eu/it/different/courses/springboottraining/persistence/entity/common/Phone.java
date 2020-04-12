package eu.it.different.courses.springboottraining.persistence.entity.common;

import eu.it.different.courses.springboottraining.persistence.entity.common.PhoneType;
import javax.persistence.Embeddable;

@Embeddable
public class Phone {
    private PhoneType type;
    private String phoneNumber;

    public Phone() {
    }

    public Phone(PhoneType type, String phoneNumber) {
        this.type = type;
        this.phoneNumber = phoneNumber;
    }

    public PhoneType getType() {
        return type;
    }

    public void setType(PhoneType type) {
        this.type = type;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
