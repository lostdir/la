// Superclass
class Animal {
    void eat() {
        System.out.println("Animals can eat");
    }
}

// Subclass 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog can bark");
    }
}

// Subclass 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat can meow");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();   // Inherited from Animal class
        dog.bark();  // Specific to Dog class

        cat.eat();   // Inherited from Animal class
        cat.meow();  // Specific to Cat class
    }
}
