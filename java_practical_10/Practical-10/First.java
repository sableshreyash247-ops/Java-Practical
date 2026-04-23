//Demostrating single inheritance code

class Animal{
      void eat(){
             System.out.println("Animal is eatting");
        }
}

class Dog extends Animal{
      void bark(){
             System.out.println("Dog is barking");
        }
}

class First{
      public static void main(String args[]){
      Dog d = new Dog();
      d.eat();
      d.bark();
        }
}
