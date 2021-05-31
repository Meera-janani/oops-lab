import java.util.*;
public class Book{
     int ISBN;  
     String title;
     String author;
     String publisher;
      int price;
     
    public Book(int ISBN,String title,String author,String publisher,int price)

    {   this.ISBN=ISBN;
	this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.price=price;

    }
  public void getISBN(){

        System.out.println("ISBNo: "+ISBN);

    }

    public void getTitle(){

        System.out.println("Title of Book: "+title);

    }

    public void getAuthor(){

        System.out.println("Author of Book: "+author);

    }

  

    public void getPublisher(){

        System.out.println("Publisher of Book: "+publisher);

    } 

    public void getPrice(){

        System.out.println("Price of Book: "+price);

    }
     public void setISBN(int ISBN){

        this.ISBN=ISBN;

    }

    public void setTitle(String title){

        this.title=title;

    }

    public void setAuthor(String author){

       this.author=author;

    }

   

    public void setPublisher(String publisher){

        this.publisher=publisher;

    } 

    public void setCost(int price){

        this.price=price;

    }    

    public void show(){

        getISBN();
	getTitle();

        getAuthor();

        

        getPublisher();

        getPrice();

    } 
  public static void main(String []args){
        Book books[] = new Book[5];
        books[0] =new Book(1,"A","S","Au",50);
        books[1] =new Book(2,"BC","D","At",100);
        books[2] =new Book(3,"AC","F","Ah",150);
        books[3] =new Book(4,"C","A","Ao",200);
        books[4] =new Book(5,"AD","G","Ar",250);

        int size = 5;  
        for(int i = 0; i<size-1; i++) { 
            for (int j = i+1; j<size; j++) { 
                if(books[i].title.compareTo(books[j].title)>0) {   
                    Book temp = books[i];  
                    books[i] = books[j];  
                    books[j] = temp;  
                }  
            }  
        }  

        for(int i=0;i<5;i++){
            books[i].show();
        }
    }  
  }

