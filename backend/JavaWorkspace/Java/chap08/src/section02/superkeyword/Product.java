package section02.superkeyword;

import java.util.Date;

public class Product {
    // 상품코드
    private String code;

    // 제조사
    private String brand;

    // 상품명
    private String name;

    // 가격
    private int price;

    //제조일자
    private Date manufacturingDate;

    public Product() {
        System.out.println("Product 클래스의 기본 생성자 호출함");
    }
    public Product(String code, String brand, String name, int price, Date manufacturingDate) {
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
        // 알트 + 인서트 -> constructor -> 초기화 하고자 하는 항목 선택
        // 존나 좋은 개꿀 단축키, 기능이 존나 많음

        System.out.println("Product 클래스의 매개변수 있는 생성자 호출함");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getInformation() {
        return "Product [code=" + code + ", brand=" + brand + ", name=" + name + ", price=" + price
                + ", manufacturingDate=" + manufacturingDate + "]";
    }
}
