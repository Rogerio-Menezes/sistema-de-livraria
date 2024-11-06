import java.util.UUID;

public class Student {

    private UUID id;
    private String name;
    private String email;
    private String dateOfBirth;

    public Student(String name, String email, String dateOfBirth) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student { ");
        sb.append("id = ").append(id);
        sb.append(", name = ").append(name);
        sb.append(", email = ").append(email);
        sb.append(", dateOfBirth = ").append(dateOfBirth);
        sb.append(" }");
        return sb.toString();
    }
}
