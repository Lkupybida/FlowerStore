package flower.store;

import lombok.*;

@Getter
@Setter
class Rose extends Flower {
    private double numberOfThorns;

    public Rose(double sepalLength, FlowerColor color, double price, FlowerType flowerType, double numberOfThorns) {
        super(sepalLength, price, color, flowerType);
        this.numberOfThorns = numberOfThorns;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ","
                + "sepalLength" + ","
                + "color" + ","
                + "price" + ","
                + "flowerType" + ","
                + "numberOfThorns";
    }
}
