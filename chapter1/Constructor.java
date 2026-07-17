package chapter1;

public class Constructor {
    public static void main(String[] args) {
        Chicken c1 = new Chicken();
        Chicken c2 = new Chicken();
        System.out.println();
    }
    
}

class Chicken{
    int numEggs = 0;
    String name;
    public Chicken(){
        name = "Duke";
    }
}

class Chick{ //🥚
    public Chick(){
        System.out.println("🐣 in constructor");
    }
    public void Chick(){
        System.out.println("🐥💬 I'm a method");
    }
}

class Swan{
    int numEggs;
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numEggs = 4;//writting object fields
        System.out.println(mother.numEggs); //reading object fields
    }

}
class Name{
    String first = "Theodore";
    String last = "Moose";
    String full = first+last;
    public static void main(String[] args) {
        Name name1 = new Name();
        System.out.println(name1.full);
        name1.first = "Marc";
        name1.last = "Yim";
        // name1.full = name1.first+name1.last;
        System.out.println(name1.full);
    }
}