public class Kettle {
    int water;
    String material;
    Kettle(int water, String material) {
        this.water=water;
        this.material=material;
    }
    public int waterAmount() {
        return this.water;
    }
    public String whatMaterial() {
        return this.material;
    }
}