import java.util.UUID;

public class Author {

    private UUID id;
    private String name;
    private String dateOfBirth;

    public Author(String name, String dateOfBirth) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Author { ");
        sb.append("id = ").append(id);
        sb.append(", name = ").append(name);
        sb.append(", dateOfBirth = ").append(dateOfBirth);
        sb.append(" }");
        return sb.toString();
    }
}
