Definition: Attaches additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing for extending functionality.

Algorithm
- Create a base class (Beverage)
- Create child classes that extend Beverage (Decaf and Espresso)
- Create AddOnDecorator that extends Beverage.
- Create concrete decorator (CaramelDecorator) that IS-A Beverage (it behaves like a beverage) and it HAS-A Beverage.
