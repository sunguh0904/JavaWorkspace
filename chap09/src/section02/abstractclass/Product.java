package section02;

public abstract class Product {
    private int nonStaticField;
    private static int staticField;

    public Product() {}

    public void NonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod 호출함");
    }

    public static void staticMethod() {
        System.out.println("Product 클래스의 staticMethod 호출함");
    }

    public abstract void abstractMethod();
}
