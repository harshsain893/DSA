package oopsConcept;
public class copyConstructor {
    String title;
    String author;
    int price;

    copyConstructor(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    copyConstructor(copyConstructor obj){
        this.title = obj.title;
        this.author = obj.author;
        this.price = obj.price;
        
    }
    void display(){
        System.out.println(title + " "+  author +" "+price);
    }
    public static void main(String[] args) {
        copyConstructor book = new copyConstructor("Java", "Harsh", 2000);
        copyConstructor book2 = new copyConstructor(book);
        book2.display();
    }
}