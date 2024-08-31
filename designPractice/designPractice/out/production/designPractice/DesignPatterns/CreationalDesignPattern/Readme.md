# Creation Design Patterns

The Creation Design Patterns are a family of design patterns that deal with object creation. They provide different ways to instantiate objects, making the process more flexible, efficient, and decoupled.

## Key Characteristics:

* Abstract Object Creation: These patterns abstract the process of creating objects, making the client code independent of the specific object creation logic.
* Flexibility: They allow for dynamic object creation based on different criteria, making the code more adaptable to changes.
* Efficiency: Some patterns can improve performance by avoiding unnecessary object creation or reusing existing objects.

## Common Creation Patterns:

1. Factory Method: Defines an interface for creating an object, but lets subclasses decide which class to instantiate.
2. Abstract Factory: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.  
3. Builder: Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.  
4. Prototype: Creates new objects by copying an existing object.
5. Singleton: Ensures a class has only one instance and provides a global point of access to it.
6. Object Pool: Manages a pool of reusable objects, allowing clients to reuse and share objects efficiently.


## When to Use Creation Patterns:

* When you want to decouple the client code from the object creation process.
* When you need to create objects dynamically based on different criteria.
* When you want to improve performance by avoiding unnecessary object creation or reusing existing objects.
* When you need to create families of related objects.
* When you want to ensure that only one instance of a class exists.

## Benefits of Creation Patterns:

* Flexibility: Allows for dynamic object creation based on different criteria.
* Decoupling: Separates the client code from the object creation process.
* Efficiency: Can improve performance by avoiding unnecessary object creation or reusing existing objects.
* Consistency: Ensures that objects are created consistently within a family.
* Control: Provides a way to control the creation of objects.