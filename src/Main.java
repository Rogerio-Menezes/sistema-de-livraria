import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scan = new Scanner(System.in);


        Author n1 = new Author("Jorge", "12/02/1980");
        Author n2 = new Author("Luis", "08/10/1997");

        library.addAuthor(n1);
        library.addAuthor(n2);

        Book b1 = new Book("Homem, de Ferro", n1);
        Book b2 = new Book("Mario e Luigi", n2);

        library.addBook(b1);
        library.addBook(b2);

        Student s1 = new Student("Lucas", "lucas@email.com", "06/07/2000");
        Student s2 = new Student("Maria", "mari@email.com", "19/05/1999");

        library.addStudent(s1);
        library.addStudent(s2);

        library.listStudents();
        library.listBook();

        while (true) {
            System.out.println("Do you want to see the available books? (yes/no)");
            String answer = scan.nextLine().toLowerCase();

            if (answer.equals("yes")) {
                List<Book> booksAvailable = library.listOfAvailableBooks();

                if (booksAvailable.isEmpty()) {
                    System.out.println("There are no books available at this time.");
                } else {
                    System.out.println("Books available:");
                    for (Book book : booksAvailable) {
                        System.out.println(book.getId() + ": " + book.getTitle());
                    }

                    System.out.println("Enter the ID of the book you want to borrow:");
                    String idBook = scan.nextLine();

                    Book bookSelected = library.findBookById(UUID.fromString(idBook));


                    if (bookSelected != null && bookSelected.isAvailable()) {
                        System.out.println("Student available:");
                        List<Student> studentAvailable = library.listStudents();
                        for (Student student : studentAvailable) {
                            System.out.println(student.getId() + ": " + student.getName());
                        }
                        System.out.println("Enter student id:");
                        String idStudent = scan.nextLine();
                        Student studentSelected = library.findStudentById(UUID.fromString(idStudent));

                        library.lendBook(bookSelected, studentSelected);
                        System.out.println("The book " + bookSelected.getTitle() + " was loaned to " + studentSelected.getName());
                    } else {
                        System.out.println("Book not found or not available to borrow.");
                    }
                }
            } else if (answer.equals("no")) {
                System.out.println("Thank you for using the library system.");
                break;
            } else {
                System.out.println("Invalid response. Please respond with 'yes' or 'no'.");
            }
        }

            }
        }
