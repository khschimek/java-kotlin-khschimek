private class Kettle implements AutoCloseable {
    private boolean isFull = false;
    private int water = 0;
    private String material;
    Kettle(String material) {
        this.material=material;
    }
    public void fill() {
        if(this.water<5) {
            this.water += 1;
            if(this.water==5) {
                this.isFull=true;
            }
        }
    }
    public void empty() {
        this.water = 0;
        this.isFull = false;
    }
    public boolean isFull() {
        return this.isFull;
    }
    public int waterAmount() {
        return this.water;
    }
    public String whatMaterial() {
        return this.material;
    }
}