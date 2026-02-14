# Pizza Store - Factory Design Pattern Implementation

A Java implementation demonstrating the **Factory Method Design Pattern** using a Pizza Store example with regional variations.

## 📖 Overview

This project showcases the Factory Method design pattern, one of the most commonly used creational design patterns in software development. The implementation creates a flexible pizza ordering system where different regional stores (Tunis and Sfax) can produce their own style of pizzas while maintaining a consistent ordering process.

## 🎯 Design Pattern: Factory Method

The Factory Method pattern provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. This pattern:

- **Encapsulates object creation**: The instantiation logic is separated from the client code
- **Promotes loose coupling**: The client depends on abstractions rather than concrete classes
- **Follows Open/Closed Principle**: The system is open for extension (new pizza types) but closed for modification

### Pattern Structure

```
PizzaStore (Abstract Factory)
    ├── TunisStylePizzaStore (Concrete Factory)
    └── SfaxStylePizzaStore (Concrete Factory)

Pizza (Product)
    ├── TunisStyleCheesePizza
    ├── TunisStylePepperoniPizza
    ├── TunisStyleClamPizza
    ├── SfaxStyleCheesePizza
    ├── SfaxStylePepperoniPizza
    └── SfaxStyleClamPizza
```

## 🏗️ Project Structure

```
src/
└── tn/enis/
    ├── pizza/
    │   ├── Pizza.java                      # Base product class
    │   ├── TunisStyleCheesePizza.java     # Concrete product
    │   ├── TunisStylePepperoniPizza.java  # Concrete product
    │   ├── TunisStyleClamPizza.java       # Concrete product
    │   ├── SfaxStyleCheesePizza.java      # Concrete product
    │   ├── SfaxStylePepperoniPizza.java   # Concrete product
    │   └── SfaxStyleClamPizza.java        # Concrete product
    ├── store/
    │   ├── PizzaStore.java                # Abstract factory
    │   ├── TunisStylePizzaStore.java      # Concrete factory
    │   └── SfaxStylePizzaStore.java       # Concrete factory
    └── test/
        ├── Main.java                       # Demo application
        └── Revision.java                   # Additional test class
```

## 🔑 Key Components

### 1. Abstract Factory (`PizzaStore`)
- Defines the `orderPizza()` template method
- Declares the abstract `createPizza()` factory method
- Implements the pizza preparation workflow (prepare, bake, cut, box)

### 2. Concrete Factories
- **`TunisStylePizzaStore`**: Creates Tunis-style pizzas
- **`SfaxStylePizzaStore`**: Creates Sfax-style pizzas
- Each implements the `createPizza()` method to instantiate region-specific pizzas

### 3. Products
- **`Pizza`**: Base class with common operations (prepare, bake, cut, box)
- **Concrete Pizzas**: Regional variations (Tunis and Sfax styles) for different pizza types (Cheese, Pepperoni, Clam)

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, NetBeans) or command line

### Compilation

```bash
# Navigate to the project directory
cd src

# Compile all Java files
javac tn/enis/test/Main.java tn/enis/store/*.java tn/enis/pizza/*.java

# Run the application
java tn.enis.test.Main
```

### Using an IDE
1. Open the project in your Java IDE
2. Locate `Main.java` in `src/tn/enis/test/`
3. Right-click and select "Run"

## 💡 Usage Example

```java
package tn.enis.test;

import tn.enis.store.PizzaStore;
import tn.enis.store.TunisStylePizzaStore;
import tn.enis.store.SfaxStylePizzaStore;

public class Main {
    public static void main(String[] args) {
        // Create a Tunis-style pizza store
        PizzaStore tunisStore = new TunisStylePizzaStore();
        tunisStore.orderPizza("cheese");
        
        // Create a Sfax-style pizza store
        PizzaStore sfaxStore = new SfaxStylePizzaStore();
        sfaxStore.orderPizza("pepperoni");
    }
}
```

### Expected Output
```
Preparing Tunis Style Cheese Pizza
Preparing 
Baking 
Cutting 
Boxing 
```

## 🎨 Available Pizza Types

| Pizza Type | Tunis Style | Sfax Style |
|------------|-------------|------------|
| Cheese     | ✅          | ✅         |
| Pepperoni  | ✅          | ✅         |
| Clam       | ✅          | ✅         |

## 🔄 Extending the System

### Adding a New Pizza Type

1. Create new pizza classes for each regional style:
```java
public class TunisStyleVeggiePizza extends Pizza {
    public TunisStyleVeggiePizza() {
        System.out.println("Preparing Tunis Style Veggie Pizza");
    }
}
```

2. Update the factory methods in each store:
```java
public Pizza createPizza(String type) {
    if ("veggie".equals(type)) {
        pizza = new TunisStyleVeggiePizza();
    }
    // ... other types
}
```

### Adding a New Regional Store

1. Create a new concrete factory:
```java
public class SousseStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        // Implement creation logic for Sousse-style pizzas
    }
}
```

2. Create corresponding pizza products for the new region

## 📚 Design Pattern Benefits Demonstrated

1. **Separation of Concerns**: Object creation is separated from business logic
2. **Code Reusability**: Common pizza operations are defined once in the base class
3. **Flexibility**: New pizza types or stores can be added without modifying existing code
4. **Maintainability**: Changes to one store type don't affect others
5. **Type Safety**: The factory method ensures type-safe object creation

## 🎓 Learning Resources

- **Design Patterns**: "Head First Design Patterns" by Eric Freeman & Elisabeth Robson
- **Gang of Four**: "Design Patterns: Elements of Reusable Object-Oriented Software"
- [Factory Method Pattern - Refactoring Guru](https://refactoring.guru/design-patterns/factory-method)

## 👤 Author

Abdallah Sallem

## 📝 License

This project is available for educational purposes.

---

**Note**: This implementation is based on the classic Factory Method pattern example from design pattern literature, adapted for educational purposes.
