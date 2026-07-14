/**
 *  Toy Object
 *  has property of name, brand, price and quantity
 *  with a method to setPrice() where you can change
 *  the price state of the Toy object
 */

package chapter1;

public class Toy {
    String name;
    String brand;
    double price;
    int quantity;

    void setPrice(double price) {
        this.price = price;
    }
    public static void main(String[] args) {
        // create and instance of a Toy class = Toy object
        /*this
         *is a
         *multiline
         *comment
*/
        Toy toy1 = new Toy();
        toy1.name = "Rage pink";
        toy1.brand = "Lab vuvu";
        toy1.price = 4500;
        toy1.setPrice((toy1.price * 0.5)); // Applying a 50% discount
        toy1.quantity = 12;
        System.out.println(toy1.price);

    }
    
}
class fruit{

}
class fruit1{
    
}
class fruit2{
    
}
class fruit3{
    
}
class fruit4{
    public static void main(String[] args) {
        System.out.println("I am Fruit 4");
        fruit3 f3 = new fruit3();
    }
}