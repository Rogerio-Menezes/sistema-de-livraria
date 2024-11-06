import java.time.LocalDate;
import java.util.UUID;

public class Book {

    private final UUID id;
    private String title;
    private final Author author;
    private boolean available;
    private final LocalDate castratedDate;
    private LocalDate dateUpdate;

    public Book(String title, Author author) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.available = true; // We start all books with available
        this.castratedDate =  LocalDate.now();
        this.dateUpdate =  LocalDate.now();
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }


    public void setTitle(String title) {
        this.title = title;
        this.dateUpdate = LocalDate.now();
    }


    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDate getCastratedDate() {
        return castratedDate;
    }


    public LocalDate getDateUpdate() {
        return dateUpdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book { ");
        sb.append("id = ").append(id);
        sb.append(", title = ").append(title);
        sb.append(", ").append(author);
        sb.append(", available = ").append(available);
        sb.append(", castratedDate = ").append(castratedDate);
        sb.append(", dateUpdate = ").append(dateUpdate);
        sb.append(" }");
        return sb.toString();
    }
}
