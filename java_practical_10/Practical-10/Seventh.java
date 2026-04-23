//Demonstrating Static InIt
class Parent {
    static void show() {
        System.out.println("Parent static");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child static");
    }
}

public class Seventh {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show(); // Parent version runs
    }
}