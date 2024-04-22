
## EcommerceSystem

The `EcommerceSystem` is a simple Java application that simulates an ecommerce system where customers can browse and purchase products. The system allows customers to:

1. **Register as a Customer**: 
    - Customers can enter their ID, name, and address to create an account.

2. **Add Products to Cart**: 
    - Customers can add electronic products, clothing items, and books to their shopping cart. 
    - Available products include a Samsung smartphone, a cotton T-shirt, and a book on Object-Oriented Programming.

3. **Calculate Total Price**: 
    - The system calculates the total price of all items in the cart.

4. **Place an Order**: 
    - Customers have the option to place an order after reviewing the total price. 
    - If the order is confirmed, an order summary is printed.

### Classes and Components:

- **Product**: 
    - Abstract base class for all products.
    - Derived classes include `ElectronicProduct`, `ClothingProduct`, and `BookProduct`.

- **Customer**: 
    - Represents a customer with attributes like ID, name, and address.

- **Cart**: 
    - Manages the shopping cart for a customer, allowing them to add products and calculate the total price.

- **Order**: 
    - Represents an order placed by a customer, linked to a cart.

### How to Run:

1. Compile and run the `EcommerceSystem.java` file.
2. Follow the on-screen prompts to register as a customer, add products to the cart, calculate the total price, and place an order.

---
