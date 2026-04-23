//Demostrating Hybrid Inheritance
class Animal{
      void eat(){
           System.out.println("Animal is eatting");
      }
}

class Dog extends Animal{
      void bark(){
           System.out.println("Dog is Barking");
      }
}

class Cat extends Animal{
      void meow(){
           System.out.println("Cat is meowing");
      }
}

class Third{
      public static void main(String args[]){
            Dog d = new Dog();
            Cat c = new Cat();
            
            d.eat();
            d.bark();
           
            c.eat();
            c.meow();
      }
}
