//Demonstrating Method Overloading
class Animal {

    // 1. No parameter
    void sound() {
        System.out.println("Animal makes a sound");
    }

    // 2. One parameter (animal name)
    void sound(String name) {
        System.out.println(name + " makes a sound");
    }

    // 3. Two parameters (name + times)
    void sound(String name, int times) {
        for(int i = 1; i <= times; i++) {
            System.out.println(name + " makes sound " + i);
        }
    }
}

public class Sixth {
    public static void main(String[] args) {

        Animal a = new Animal();

        a.sound();                // Method 1
        a.sound("Dog");           // Method 2
        a.sound("Cat", 2);        // Method 3
    }
}