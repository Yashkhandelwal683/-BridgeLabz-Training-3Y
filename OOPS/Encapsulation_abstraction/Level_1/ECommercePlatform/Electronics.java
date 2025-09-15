class Electronics extends Product {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1;
    }
}
