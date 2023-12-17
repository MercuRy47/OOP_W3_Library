package Library;

public class Book {
    private String bookID;
    private String title;
    private String author;
    private char status;

    // Constructor
    public Book(String bookID, String title, String author){
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.status = 'A';
    }

    // GET
    public String getBookID(){
        return bookID;
    }
    public char getStatus(){
        return status;
    }
    public String getTitle(){
        return title;
    }

    // Other
    public void updateStstus(){
        if(this.status == 'A'){
            this.status = 'U';
        }else {
            this.status = 'A';
        }    
    }
    public String checkStatus(){
        if(this.status == 'A'){
            return "Available";
        }else {
            return "Unavailable";
        }
    }
    public String toString(){
        
        return "ID : " + bookID + " Title : " + title + " Author : " + author + " Status : " + checkStatus();
    }
}
