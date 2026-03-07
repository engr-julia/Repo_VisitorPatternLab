# 🛋️ Furniture Shipping Cost Calculator

> “Calculating shipping has never been this elegant — each furniture knows its visitor!”

This Java project demonstrates the **Visitor Design Pattern** in an **e-commerce furniture platform**.  
The system calculates shipping costs for different types of furniture such as **chairs, tables, and sofas**.

Using the **Visitor Pattern**, the shipping cost calculation logic is separated from the furniture classes, making the system **flexible, maintainable, and easy to extend**.

---

# 📖 Problem Scenario

You are a software developer working on an **e-commerce platform that sells various types of furniture** such as chairs, tables, and sofas.

Each furniture type might have its **own unique shipping cost calculation logic**.

Examples:

- **Chairs** are lightweight and may have a **flat shipping rate**.
- **Tables** may calculate shipping based on **size or surface area**.
- **Sofas** are bulky and may require **volume-based shipping cost calculation**.

If each furniture class implemented its own shipping logic, the system would become **tightly coupled and difficult to extend** when new furniture types or shipping methods are introduced.

To solve this problem, we implement the **Visitor Design Pattern**, which separates the **operations (shipping cost calculations)** from the **objects (furniture types)**.

This approach allows:

- Adding **new operations without modifying furniture classes**
- Keeping furniture classes **simple and focused**
- Making the system **scalable and maintainable**

**Note:** The solution uses **interfaces instead of abstract classes**, as required.

---

# 📊 UML Class Diagram

Below is the UML Class Diagram for the **Visitor Design Pattern implementation** used in this project.

*(Insert UML Diagram Below)*

![Visitor Pattern UML Diagram](Visitor.jpeg)

---

# ✨ Features

- Demonstrates the **Visitor Design Pattern in Java**
- Supports multiple furniture types
- Each furniture type has **custom shipping logic**
- Easy to add **new furniture types**
- Easy to add **new operations** (tax, insurance, discounts)
- Clean and maintainable **object-oriented design**
- Includes **UML diagram for visualization**

---

# 📦 Project Structure


FurnitureVisitorPattern
│
├── README.md
├── Visitor.jpeg
│
├── Furniture.java
├── ShippingVisitor.java
├── ShippingCostVisitor.java
│
├── Chair.java
├── Table.java
├── Sofa.java
│
└── Client.java


---

# ⚙️ How the Visitor Pattern Works

1. The **Client** creates furniture objects:


Chair
Table
Sofa


2. The client creates a **ShippingCostVisitor**.

3. Each furniture object calls:


accept(visitor)


4. The visitor executes the correct method depending on the furniture type:


visitChair()
visitTable()
visitSofa()


5. The visitor calculates the **shipping cost based on the furniture properties**.

---

# 🔄 Execution Flow


Client
↓
Furniture Object (Chair / Table / Sofa)
↓
accept(visitor)
↓
ShippingCostVisitor
↓
visitChair() / visitTable() / visitSofa()
↓
Shipping Cost Calculated


---

# 💡 Design Pattern Used

## Visitor Design Pattern

The **Visitor Pattern** allows new operations to be added to an object structure **without modifying the objects themselves**.

### Benefits in this project

✔ Separation of **business logic** from object structure  
✔ Easier **maintenance and scalability**  
✔ Supports additional operations like:

- Tax calculation
- Insurance cost estimation
- Discount computation

---

# ▶️ Running the Program

### Compile the Java files

```bash
javac *.java
Run the program
java Client
🖥️ Example Output
Chair shipping cost: $10
Table shipping cost: $4.0
Sofa shipping cost: $20.0