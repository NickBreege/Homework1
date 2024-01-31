package homework6.ex3;

import java.util.Objects;

public final class Detail {
    private final String name;

    public Detail(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this != o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Detail detail = (Detail) o;
        return Objects.equals(name, detail.name);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}