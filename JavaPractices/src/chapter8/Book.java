
package chapter8;

public class Book {
    String name;
    String price;

    public Book() {
    }

    public Book(String name, String price) {
        this.name = name;
        this.price = price;
    }
    
    public static void main(String[] args) {
        Book Book1 = new Book("Gitanjoli", "350");
        System.out.println("Name: "+ Book1.getName());
        System.out.println("Price: "+ Book1.getPrice());
        
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    
    
}
