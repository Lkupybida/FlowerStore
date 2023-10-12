package flower.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowerPack {

    private final Flower flower;
    private int quantity;

    public <T extends Flower> FlowerPack(final T flower,
            final int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}