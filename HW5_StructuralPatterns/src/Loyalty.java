public class Loyalty {
    public double applyDiscount(double totalCost, int loyaltyLevel){
        switch (loyaltyLevel) {
            case 1:
                return totalCost * 0.9; // 10%
            case 2:
                return totalCost * 0.8; // 20%
            default:
                return totalCost; // no discount
        }
    }
}
