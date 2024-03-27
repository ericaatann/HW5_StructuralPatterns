abstract class Topping implements FoodItem{
    private FoodItem foodItem;
    private double toppingCost;

    public Topping(FoodItem foodItem, double toppingCost){
        this.foodItem = foodItem;
        this.toppingCost = toppingCost;
    }

    @Override
    public double getCost(){
        return foodItem.getCost() + toppingCost;
    }
}
