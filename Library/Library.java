package Library;

public class Library {
    private Book[] book;

    // Constuctor
    public Library(Book[] book){
        this.book = book;
    }

    // Other
    public int searchBook(String wantB){
        int index = -1;
        int point = 0;
        for(Book book2 : book) {

            // ID
            if(book2.getBookID().equals(wantB)){
                index = point;
                return index;
            }
            // Title
            if(book2.getTitle().equalsIgnoreCase(wantB)){
                index = point;
                return index;
            }
            point++;
        }
        return index;
    }
    public void borrow(String wantB){
        int index = searchBook(wantB);
        if(index != -1){
            if(book[index].getStatus() == 'A'){
                System.out.println("This book is not borrowed. Re-input again!");
            }else if(book[index].getStatus() == 'U'){
                book[index].updateStstus();
                System.out.println("Thank you, the return successful.");
            }
            
        }
    }
    public void returnBook(String wantB){

    }
    public void showAllBook(){
        for (Book book2 : book){
            System.out.println(book2.toString());
        }
    }
}
