package lt.bit.p0526;

public class Brick implements IColor, IMaterial {

    private String material;
    private String color;

    /**
     * Grazina akmens medziaga
     * @return medziaga
     */
    @Override
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
