package ThemePark;

public class Visitor {
    private int age;
    private double height;
    private int money;

    public Visitor(int age, double height, int money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }

    public int getMoney() {
        return this.money;
    }
}
