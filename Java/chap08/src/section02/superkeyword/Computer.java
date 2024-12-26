package section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    // Computer 는 Product 를 상속 받는다

    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer() {
        System.out.println("Computer 클래스의 기본 생성자 호출");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스 모든 필드를 초기화하는 생성자 호출");
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        // super 는 부모 클래스의 인스턴스 생성자를 호출
        // this(cpu, hdd, ram, operationSystem);
        // super 와 this 는 동시에 사용 불가능
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 부모 필드도 초기화하는 생성자 호출");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInformation() {
        // this 를 참조할 경우 부모 클래스의 메소드가 아닌 자신의 메소드를 호출 시켜서 에러
        // this 를 쓰지 않아도 컴파일러가 자동으로 this 를 써 자신의 메소드를 호출 시켜서 에러
//        return this.getInformation()
        return super.getInformation()
                // super 부모 클래스를 참조해서 부모 클래스 안에 있는 메소드를 호출
                + "Computer ["
                + "Cpu=" + this.cpu
                + ", hdd=" + this.hdd
                + ", ram=" + this.ram
                + ", operationSystem=" + this.operationSystem
                + "]";
    }
}
