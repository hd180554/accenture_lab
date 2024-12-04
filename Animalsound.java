 class Animal {
        void makeSound() {
            System.out.println("The animal makes a sound.");
        }
    }
    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("The dog are barks.");
        }
    }
    class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("The cat are meows.");
        }
    }
    public class Animalsound {
       public static void main(String[] args) {
            Animal genericAnimal = new Animal();
            Dog dog = new Dog();
            Cat cat = new Cat();               
            System.out.println("Generic Animal:");
            genericAnimal.makeSound();    
            System.out.println("\nDog:");
            dog.makeSound();
            System.out.println("\nCat:");
            cat.makeSound();
        }
    }
    
    

