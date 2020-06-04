public class plate {

    private int food;

    public plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int appetite) {
        if (food - appetite < 0) {
            return false;
        }
        else {
            food -= appetite;
            return true;
        }
    }

    public void addFood(int food) {
        this.food += food;
    }

    public void info(){
        System.out.println("plate: "+ food);
    }
}
