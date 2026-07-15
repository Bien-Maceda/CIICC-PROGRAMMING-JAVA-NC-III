package chapter1;

public class Constructor1Lesson {
    public static void main(String[] args) {
        Chicken c1 = new Chicken();
        Chicken c2 = new Chicken();
        System.out.println("Chicken 1: " + c1.name);
        System.out.println("Chicken 2: " + c2.name);

        Chick chick = new Chick();
        chick.showMessage();
    }
}

class Chicken {
    int numEggs = 0;
    String name;

    public Chicken() {
        name = "Duke";
    }
}

class Chick { //🥚
    public Chick() {
        System.out.println("🐣 in constructor");
    }

    public void showMessage() {
        System.out.println("🐥💬 I'm a method");
    }
}