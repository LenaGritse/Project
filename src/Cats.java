public class Cats {

    private String name;
    private int appetite;
    private boolean fed;

    public Cats(String name, int appetite) {
       this.name = name;
       this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(plate plate) {
        fed = plate.decreaseFood(appetite);
    }

    public void info() {
        System.out.println(name + " " + (fed ? " сыт " : " голоден "));
    }

}
