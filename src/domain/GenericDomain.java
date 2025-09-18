package domain;

import java.util.Objects;

public abstract class GenericDomain<T> {

    private T id;

    public GenericDomain() {
    }

    public GenericDomain(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GenericDomain<?> that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "GenericDomain{" +
                "id=" + id +
                '}';
    }
}
