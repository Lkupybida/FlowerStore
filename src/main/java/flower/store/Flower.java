package flower.store;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Flower {
    @Getter
    private double sepalLength;
    @Getter
    private double price;
    @Getter
    private FlowerColor flowerColor;
    @Getter
    private FlowerType flowerType;

    public Flower() {
    }

    public void setColor(FlowerColor color) {
        this.flowerColor = color;
    }

    public String getColor() {
        return flowerColor.toString();
    }

    public String getHeaders() {
        return "sepalLength" + ","
                + "color" + ","
                + "price" + ","
                + "flowerType";
    }
}
