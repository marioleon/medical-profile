package co.mymedicalprofile.domain.people;


/**
 * <p>TODO javadoc here, be short, mention purpose and usage of the function.</p>
 *
 * @author mario
 */
public class ContactInformation {

    private Name name;
    private Address address;

    private String email;
    private String mainPhone;
    private String optionalPhone;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMainPhone() {
        return mainPhone;
    }

    public void setMainPhone(String mainPhone) {
        this.mainPhone = mainPhone;
    }

    public String getOptionalPhone() {
        return optionalPhone;
    }

    public void setOptionalPhone(String optionalPhone) {
        this.optionalPhone = optionalPhone;
    }
}
