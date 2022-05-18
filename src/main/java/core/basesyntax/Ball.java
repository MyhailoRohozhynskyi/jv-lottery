package core.basesyntax;

public class Ball extends Lottery {
    private String color;
    private int number;

    public Ball(String color, int number) {

        this.color = color;
        this.number = number;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
   public String toString() {
        return "Lottery{"
                + "color='" + getColor() + '\''
                + ", number=" + getNumber()
                + '}';
    }

}
