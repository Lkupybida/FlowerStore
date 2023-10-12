package flower.store;

import lombok.Getter;
import java.util.ArrayList;
import java.util.List;
public class FlowerBucket {
    @Getter
    private int price = 0;

    public FlowerBucket() {
    }
    private final List<FlowerPack> flowerPacks = new ArrayList<>();

    public void add(FlowerPack fp) {
        flowerPacks.add(fp);
        price += fp.getPrice();
    }
}