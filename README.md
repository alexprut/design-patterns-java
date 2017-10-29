<div align="center">
<img src="https://github.com/alexprut/design-patterns-java/raw/staging/logo.png" height="300" height="auto"/>
<h1>Design Patterns in Java</h1>

[![Google Java Style](https://img.shields.io/badge/style%20guide-google-yellow.svg)](https://github.com/google/google-java-format)
[![MIT](https://img.shields.io/dub/l/vibe-d.svg)](https://github.com/alexprut/design-patterns-java/blob/master/LICENSE)
[![Build Status](http://img.shields.io/travis/alexprut/design-patterns-java/staging.svg)](https://travis-ci.org/alexprut/design-patterns-java)
[![Coverage Status](http://img.shields.io/coveralls/alexprut/design-patterns-java/staging.svg)](https://coveralls.io/r/alexprut/design-patterns-java?branch=staging)
<p>Classic OOP Design Patterns from <a href="https://en.wikipedia.org/?title=Design_Patterns">GoF</a>, implemented in Java.</p>
</div>
<br />

Design Patterns Implemented
---------------------------
#### Structural
* [Class Adapter](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/structural/class_adapter)
— _allows classes with incompatible interfaces to work together by wrapping its own interface around that of an already existing class_
* [Object Adapter](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/structural/object_adapter)
* [Facade](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/structural/facade)
— _provides a simplified interface to a large body of code_
* [Composite](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/structural/composite)
— _composes zero-or-more similar objects so that they can be manipulated as one object_
* [Decorator](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/structural/decorator)
— _dynamically adds/overrides behaviour in an existing method of an object_
* [Proxy](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/structural/proxy)
— _provides a placeholder for another object to control access, reduce cost, and reduce complexity_
* [Flyweight](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/structural/flyweight)
— _reduces the cost of creating and manipulating a large number of similar objects_
* [Bridge](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/structural/bridge)
— _decouples an abstraction from its implementation so that the two can vary independently_

#### Creational
* [Factory Method](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/creational/factory_method)
— _creates objects without specifying the exact class to create_
* [Abstract Factory](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/creational/abstract_factory)
— _groups object factories that have a common theme_
* [Prototype](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/creational/prototype)
— _creates objects by cloning an existing object_
* [Singleton](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/creational/singleton)
— _restricts object creation for a class to only one instance_
* [Builder](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/creational/builder)
— _constructs complex objects by separating construction and representation_

#### Behavioral
* [Template Method](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/behavioral/template_method)
— _defines the skeleton of an algorithm as an abstract class, allowing its subclasses to provide concrete behavior_
* [Strategy](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/behavioral/strategy)
— _allows one of a family of algorithms to be selected on-the-fly at runtime_
* [State](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/behavioral/state)
— _allows an object to alter its behavior when its internal state changes_
* [Command](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/behavioral/command)
— _creates objects which encapsulate actions and parameters_
* [Observer](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/behavioral/observer)
— _is a publish/subscribe pattern which allows a number of observer objects to see an event_
* [Mediator](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/behavioral/mediator)
— _allows loose coupling between classes by being the only class that has detailed knowledge of their methods_
* [Memento](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/behavioral/memento)
— _provides the ability to restore an object to its previous state (undo)_
* [Iterator](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/behavioral/iterator)
— _accesses the elements of an object sequentially without exposing its underlying representation_
* [Visitor](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/behavioral/visitor)
— _separates an algorithm from an object structure by moving the hierarchy of methods into one object_
* [Chain of Responsability](https://github.com/alexprut/design-patterns-java/tree/staging/src/main/java/design_patterns/behavioral/chain_of_responsibility)
— _delegates commands to a chain of processing objects_

License
=======
Licensed under [MIT](https://github.com/alexprut/design-patterns-java/blob/master/LICENSE).