package Library;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        Book[] listBook = new Book[5];
        listBook[0] = new Book("100", "Programming", "John");
        listBook[1] = new Book("200", "Object-Oriented Programming", "May");
        listBook[2] = new Book("300", "Graphic", "Marry");
        listBook[3] = new Book("400", "Statistics", "Martin");
        listBook[4] = new Book("500", "Database", "John");

        Library library = new Library(listBook);
        library.showAllBook();

        while (true){
            System.out.println("<=== Enter the number what do you want to do ===>");
            System.out.println("1. Borrow a book.");
            System.out.println("2. Return a book.");
            System.out.println("3. Search a book.");
            System.out.println("q. Quit the system.");
            System.out.print("Select = ");
            String textinput = kb.next();

            
            
            if(textinput.equalsIgnoreCase("1")){
                System.out.print("Enter [id/title] of book : ");
                textinput = kb.next();
                if(library.searchBook(textinput) != -1){
                    if(listBook[library.searchBook(textinput)].getStatus() == 'A'){
                        listBook[library.searchBook(textinput)].updateStstus();
                        System.out.println(textinput + " can borrow.");
                    }else if(listBook[library.searchBook(textinput)].getStatus() == 'U'){
                        System.out.println(textinput + " is borrowing. Sorry!");
                    }
                }else {
                    System.out.println("Sorry, this book cannot be found in our library.");
                }
                
            }else if(textinput.equalsIgnoreCase("2")){
                System.out.print("Enter [id/title] of book : ");
                textinput = kb.next();
                if(library.searchBook(textinput) != -1){
                    if(listBook[library.searchBook(textinput)].getStatus() == 'U'){
                        listBook[library.searchBook(textinput)].updateStstus();
                        System.out.println("Thank you, the return successful.");
                    }else if(listBook[library.searchBook(textinput)].getStatus() == 'A'){
                        System.out.println("This book is not borrowed. Re-input agin!");
                    }
                }else {
                    System.out.println("Sorry, this book cannot be found in our library.");
                }
                
            }else if(textinput.equalsIgnoreCase("3")){
                System.out.print("Enter [id/title] of book : ");
                textinput = kb.next();
                if(library.searchBook(textinput) != -1){
                    System.out.println(listBook[library.searchBook(textinput)].toString());
                }else {
                    System.out.println("Sorry, this book cannot be found in our library.");
                }
                
            }else if(textinput.equalsIgnoreCase("q")){
                System.exit(0);
            }

        }
    }
}
