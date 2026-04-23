//Demostrating Multilevel Inheritance
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

class Puppy extends Dog{
      void clusm(){
           System.out.println("Puppy is clusming");
      }
}

class Second{
      public static void main(String args[]){
            Dog d = new Dog();
            Puppy p = new Puppy();
            
            d.eat();
            d.bark();
           
            p.eat();
            p.clusm();
      }
}