import java.util.Objects;

public class Author {
    String fullName;

    public Author(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "fullName=" + fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(fullName, author.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }
}

