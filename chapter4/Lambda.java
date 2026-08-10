package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {
    static void print(List<Animal> animals, Predicate<Animal> checker){
        for(Animal animal:animals){
            if(checker.test(animal)) System.out.print(animal+", ");
        
        }
        System.out.println("**************");

    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true,1));
        animals.add(new Animal("kangaroo", true, false,5));
        animals.add(new Animal("rabbit", true, false,2));
        animals.add(new Animal("turtle", false, true,10));
        animals.add(new Animal("frog", true,true,2));
        animals.add(new Animal("kaola", false, false,2));

        System.out.println("can hop");
        print(animals, a->a.canHop());
        System.out.println("can swim");
        print(animals, a->a.canSwim());
        print(animals, a->!a.canSwim()&& !a.canHop());
        print(animals, a->a.canSwim()&& a.canHop());
        print(animals, a->a.age>5);

        NumberInterface aAddB = (x,y,z)-> x+y;
        System.out.println(aAddB.aOpsB(10, 20, true));
        NumberInterface aAdd2 = (a,b,c)-> a*b;
        System.out.println(aAdd2.aOpsB(10, 20, true));

        Discount tenPercent = a->a-(a*0.10);
        Discount twentyPercent = a-> a-(a*0.20);
        Discount fiftyPercent = a->{ return (a*0.50);};
        int price = 1000;
        System.out.println(tenPercent.dc(price));
        System.out.println(twentyPercent.dc(price));
        System.out.println(fiftyPercent.dc(price));
}
}

class Animal{
    String spicies;
    boolean canHop;
    boolean canSwim;
    int age;
    public Animal(String spicies, boolean canHop, boolean canSwim, int age){
        this.spicies=spicies;
        this.canHop=canHop;
        this.canSwim=canSwim;
        this.age= age;
    }
    boolean canHop(){
        return canHop;
    }
    boolean canSwim(){
        return canSwim;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return spicies;
    }
}

interface NumberInterface{
    int aOpsB(int a, int b, boolean c);
}

interface Discount{
    double dc(double i);
}

