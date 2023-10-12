package flower.store;

public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
    }

    public int getPrice() {
        return (int) flower.getPrice() * quantity;
    }
}