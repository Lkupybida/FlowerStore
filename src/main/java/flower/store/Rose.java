package flower.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Rose extends Flower {
    private double numberOfThorns;

    Rose(double sepalLength, FlowerColor color,
                double price, FlowerType flowerType, double numberOfThorns) {
        super();
        this.numberOfThorns = numberOfThorns;
    }

    public Rose() {
        super();
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
