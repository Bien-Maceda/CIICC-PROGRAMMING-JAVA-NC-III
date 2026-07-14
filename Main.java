package chapter1;

public class Main {
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
