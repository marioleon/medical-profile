package co.mymedicalprofile.domain.providers;

import co.mymedicalprofile.domain.people.Person;
import co.mymedicalprofile.domain.people.State;
import co.mymedicalprofile.domain.people.Type;

import java.io.Serializable;
import java.util.List;

/**
 * <p>TODO javadoc here, be short, mention purpose and usage of the function.</p>
 *
 * @author mario
 */
public class Clinic extends Person implements HealthServiceProvider {

    protected List<Medic> medics;

    public Clinic(){
        this.state = State.INACTIVE;
        this.type = Type.JURIDICAL;
    }

    public List<Medic> getMedics() {
        return medics;
    }

    public void setMedics(List<Medic> medics) {
        this.medics = medics;
    }
}