Definition: Factory Method pattern defines an interface for creating an object but lets subclasses decide which class to instantiate.
Factory Method lets the class defer instantiation to subclasses.

Factory method relies heavily on inheritance.
It delegates the object creation to subclasses that implement the factory method.

Algorithm:
- Create abstract class (Restaurant)
- Create abstract method that the subclasses of Restaurant will implement
- Create subclasses of Restaurant that implement the factory method (BeefBurgerRestaurant)