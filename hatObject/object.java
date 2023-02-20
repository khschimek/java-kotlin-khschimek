private class Kettle implements AutoCloseable {
    private int water = 0;
    private String material;
    Kettle(String material) {
        this.material=material;
    }
    public void fill() {
        this.water+=1;
    }
    public void empty() {
        this.water = 0;
    }
    public int waterAmount() {
        return this.water;
    }
    public String whatMaterial() {
        return this.material;
    }
}