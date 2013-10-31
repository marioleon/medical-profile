package co.mymedicalprofile.domain.providers;

import co.mymedicalprofile.domain.people.Person;
import co.mymedicalprofile.domain.people.State;
import co.mymedicalprofile.domain.people.Type;

import java.util.List;

/**
 * Represents in a very simple way a Medic, as such, contains basic personal and contact information.
 *
 * @author Mario Leon
 */
public class Medic extends Person implements HealthProvider {

    protected Speciality speciality;
    protected List<String> tags;

    public Medic(){
        this.state = State.INACTIVE;
        this.type = Type.PHYSICAL;
    }

    public enum Speciality{
        GENERAL_SURGEON, IMMUNOLOGY, NEPHROLOGY
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}