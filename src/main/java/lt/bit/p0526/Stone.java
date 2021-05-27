package lt.bit.p0526;

/**
 * Akmenys naudojami musu 3D simuliacijoje
 */
public class Stone implements IColor {

    private String color;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
