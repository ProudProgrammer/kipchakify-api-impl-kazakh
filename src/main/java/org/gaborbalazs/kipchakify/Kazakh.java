package org.gaborbalazs.kipchakify;

import java.util.Date;
import java.util.Objects;

public final class Kazakh implements Kipchak {

    private final String name;
    private final Date birthdate;

    public Kazakh(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Kazakh kazakh = (Kazakh) o;
        return Objects.equals(name, kazakh.name) &&
                Objects.equals(birthdate, kazakh.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthdate);
    }
}
