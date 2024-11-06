import java.time.LocalDate;
import java.util.UUID;

public class BookLending {

    private final UUID id;
    private  int dayCounter = 1;
    private final Book book;
    private final Student student;
    private final LocalDate loanDate;
    private LocalDate returnDate;
    private boolean active;

    public BookLending(Book book, Student student) {
        this.id = UUID.randomUUID();
        this.dayCounter = dayCounter++;
        this.book = book;
        this.student = student;
        this.loanDate = LocalDate.now();
        this.active = true;

    }

    public UUID getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public boolean isActive() {
        return active;
    }

    public Student getStudent() {
        return student;
    }

    public void returnBook(){
        this.returnDate = LocalDate.now();
        this.active = false;
        this.book.setAvailable(true);
    }

    @Override
    public String toString() {
        return "BookLending { " +
                "id = " + id +
                ", dayCounter = " + dayCounter +
                ", " + book +
                ", " + student +
                ", loanDate = " + loanDate +
                ", returnDate = " + returnDate +
                ", active = " + active +
                '}';
    }
}
