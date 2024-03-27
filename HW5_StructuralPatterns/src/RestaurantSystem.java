public class RestaurantSystem {
    public static void main(String[] args) {
        // Create food items
        FoodItem burger = new Burger(5.0);
        FoodItem fries = new Fries(3.0);
        FoodItem hotDog = new HotDog(4.0);

        // Add toppings using decorators
        FoodItem cheeseBurger = new Cheese(burger);
        FoodItem baconCheeseBurger = new Bacon(cheeseBurger);
        FoodItem cheeseFries = new Cheese(fries);
        FoodItem baconHotDog = new Bacon(hotDog);

        // Create an order
        Order order = new Order();
        order.addItem(baconCheeseBurger);
        order.addItem(cheeseFries);
        order.addItem(baconHotDog);

        // Calculate total cost before discount
        double totalCost = order.calculateTotalCost();
        System.out.println("Total cost before discount: $" + totalCost);

        // Apply loyalty discount based on loyalty level
        Loyalty loyaltyStatus = new Loyalty();
        int loyaltyLevel = 2; // loyalty level
        double discountedCost = loyaltyStatus.applyDiscount(totalCost, loyaltyLevel);
        System.out.println("Discounted cost after loyalty discount: $" + discountedCost);
    }
}
