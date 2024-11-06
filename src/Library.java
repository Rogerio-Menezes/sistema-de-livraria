import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Library {

    private final List<Book> books = new ArrayList<>();
    private final List<Author> authors = new ArrayList<>();
    private final List<Student> students = new ArrayList<>();
    private final List<BookLending> bookLendings = new ArrayList<>();


    //methods for managing books

    public void addBook(Book book) {
        books.add(book);
    }
    public  List<Book> listBook() {
        return books;
    }
    public List<Book> listOfAvailableBooks(){
        List<Book> listAvailable = new ArrayList<>();
        for(Book book : books){
            if(book.isAvailable()){
                listAvailable.add(book);
            }
        }
        return listAvailable;
    }

    public Book findBookById(UUID id){
        for (Book book : books){
            if(book.getId().equals(id)){
                return book;
            }
        }
        return null;
    }

    public void removeBook(UUID id) {
        books.removeIf(book -> book.getId() == id);
    }

    public void updateBook(UUID id, String newTitle) {
        for (Book book : books) {
            if (book.getId() == id) {
                book.setTitle(newTitle);
                break;
            }
        }
    }

    //methods for managing students

    public void addStudent(Student student){
        students.add(student);
    }
    public List<Student> listStudents() {
        return students;
    }

    public Student findStudentById(UUID id){
        for (Student student : students){
            if(student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }

    public void updateStudent(UUID id, String newName) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(newName);
                break;
            }
        }
    }


    //methods for managing authors

    public void addAuthor(Author author) {
        authors.add(author);
    }
    public List<Author> listAuthors() {
        return authors;
    }

    public void updateAuthor(UUID id, String newName) {
        for (Author author : authors) {
            if (author.getId() == id) {
                author.setName(newName);
                break;
            }
        }
    }

    public void removeAuthor(UUID id) {
        authors.removeIf(author -> author.getId() == id);
    }

    //methods for managing book lendings

    public List<BookLending> listBookLendings() {
        return bookLendings;
    }

    public void returnBookLendings(UUID id){
        for (BookLending bookLending : bookLendings) {
            if (bookLending.getId() == id && bookLending.isActive()) {
                bookLending.returnBook();
                break;
            }
        }
    }

    public void lendBook(Book book, Student student) {
        if (book.isAvailable()){
            BookLending bookLending = new BookLending(book, student);
            bookLendings.add(bookLending);
            book.setAvailable(false);
        }
        else{
            System.out.println("Book is not available");
        }
    }

}
