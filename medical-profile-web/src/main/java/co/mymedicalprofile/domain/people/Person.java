package co.mymedicalprofile.domain.people;

/**
 * <p>TODO javadoc here, be short, mention purpose and usage of the function.</p>
 *
 * @author mario
 */
public abstract class Person {

    protected String UID; // Universal ID
    protected String NID; //National Identification Document;
    protected Name name;
    protected Address address;
    protected ContactInformation contactInformation;
    protected State state;
    protected Type type;

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getNID() {
        return NID;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }

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

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
