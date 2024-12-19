package section05.parameter;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void calcArea() {
        double area = width * height;
        System.out.println("이 사각형의 넓이는 " + area + " 입니다.");
    }

    public void calcRound() {
        double round = (width + height) * 2;
        System.out.println("이 사각형의 둘레는 " + round + " 입니다.");
    }
}
