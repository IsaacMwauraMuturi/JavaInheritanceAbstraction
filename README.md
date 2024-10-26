# JavaInheritanceAbstraction
Project Structure
The project includes the following components:

MasterClass (Abstract Class): A base class with general properties and methods, meant to be extended by other classes. It has an id and name field and a performOperation method that accepts a MasterSource dependency to execute specific operations.

Admin (Class): A subclass of MasterClass that represents an admin account with an additional private field, authPassword. It inherits the properties and methods of MasterClass, adding specialized behavior.

MasterSource (Interface): Defines a single execute method, which implementing classes need to define. This allows multiple implementations of MasterSource that can perform various operations.

CustomMasterSource (Class): Implements MasterSource and provides a concrete implementation of the execute method.

Main (Class): A demonstration class with a main method to test the relationship between MasterClass, Admin, and MasterSource.
