class NonVegItem extends FoodItem {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + 50;
    }
}
