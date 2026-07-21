package TASKS;

public class tasksheet_1_3_1 {
    public static void main(String[] args) {
        // 4 meal objects, each declared as the base type Afritada
        // but referring to a different subclass object (polymorphism)
        Afritada meal1 = new Afritada();
        Afritada meal2 = new Mechado();
        Afritada meal3 = new Menudo();
        Afritada meal4 = new Caldereta();

        // display all ingredients at every object
        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();
    }
}

class Afritada {
    public void showIngredients() {
        String[] ingredients = {"Tomato Sauce", "Meat"};
        System.out.println("Afritada = " + java.util.Arrays.toString(ingredients) + "🍲 \n");
    }
}

// Mechado extends Afritada
class Mechado extends Afritada {
    public void showIngredients() {
        String[] ingredients = {"Tomato Sauce", "Meat", "Potatoes & Carrots", "Tomato Paste"};
        System.out.println("Mechado = " + java.util.Arrays.toString(ingredients) + "🍲 \n");
    }
}

// Menudo extends Mechado
class Menudo extends Mechado {
    public void showIngredients() {
        String[] ingredients = {"Tomato Sauce", "Meat", "Potatoes & Carrots", "Liver Spread", "Raisins", "Hotdog"};
        System.out.println("Menudo = " + java.util.Arrays.toString(ingredients) + "🍲 \n");
    }
}

// Caldereta extends Menudo
class Caldereta extends Menudo {
    public void showIngredients() {
        String[] ingredients = {"Tomato Sauce", "Meat", "Potatoes & Carrots", "Tomato Paste",
                "Liver Spread", "Raisins", "Hotdog", "Cheese"};
        System.out.println("Caldereta = " + java.util.Arrays.toString(ingredients) + "🍲 \n");
    }
}