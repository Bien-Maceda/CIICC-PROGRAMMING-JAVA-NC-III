package chapter5;

public class Inheritance {
    public static void main(String[] args) {
        Animal2 a1 = new Animal2("Generic Animal", 5);
        Lion l1 = new Lion("Simba", 3, 1);
        MountainLion ml1 = new MountainLion("Mufasa", 5, 2, "Rocky Mountains");
    }
}

//class FinalParent {
//    int number;
//    void getParent(){
//    }    
//}

//class Child extends FinalParent {
//    void getChildParent(){
//        getParent();
//        System.out.println(number);
//
//    }
//}

class Animal2 extends java.lang.Object {
    String name;
    int age;
    public Animal2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Lion extends Animal2 {
    int LionId;
    public Lion(String name,int age, int LionId) {
        super(name, age);
        this.LionId = LionId;
        //System.out.println(super.name);
    }
}

class MountainLion extends Lion {
    String locationSting;
    public MountainLion(String name,int age, int LionId, String locationSting ) {
        super(name, age, LionId);
        this.locationSting = locationSting;
        System.out.println(super.name + " " + super.age + " " + super.LionId + " " + this.locationSting);
    }
}

class Canine {
    public double getAverageWeight() {
        return 50;
    }
}

class Wolf extends Canine {
    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }
    Canine getAnimal() {
        Wolf w1 = null;
        return w1;
    }
    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
        Dog h1 = new Dog();

    }
}

abstract class Hayop {
    int age;
    String name;
    public void eat() {
        System.out.println("Hayop is eating");
    }
    public abstract String getName();
    public abstract String getAge();
}

class Dog extends Hayop {
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}