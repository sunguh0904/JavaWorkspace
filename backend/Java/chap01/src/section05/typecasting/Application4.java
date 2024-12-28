package section05.typecasting;

public class Application4 {
    public static void main(String[] args) {
        /* 형변환 사용 시 주의할 잠
        데이터 손실에 유의해서 사용해야 한다.
         */

        // 의도치 않은 데이터 손실
        int inum = 290;
        byte bnum = (byte) inum;

        System.out.println("inum : " + inum);
        System.out.println("bnum : " + bnum); // 비트 앞부분 손실로 예측 어려움

        // 의도한 데이터 손실
        double height = 175.5;
        int floorHeight = (int)height;
        System.out.println("height : " + height);
        System.out.println("floorHeight : " + floorHeight);
    }
}
