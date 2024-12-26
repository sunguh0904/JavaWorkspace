package section01.object.book;

public class Book {
    private int num;
    private String title;
    private String author;
    private int price;

    public Book() {}
    // 기본 생성자는 반환값이 없고, 클래스 이름을 적어준다.

    public Book(int num, String title, String author, int price) {
        this.num = num;
        this.title = title;
        this.author = author;
        this.price = price;
        // 모든 필드 초기화
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookVO [number=" + this.num
                + ", title=" + title
                + ", author=" + author
                + ". price=" + price
                + "]";
        // toString() 오버라이딩
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            // 현재 인스턴스의 주소가 파라미터의 값과 같다면
            return true;
        }
        if (obj == null) {
            return false;
        }
        Book other = (Book) obj;
        if (this.num != other.num) {
            return false;
        }
        /* title 필드가 null 인 경우 다른 인스턴스의 title 이 null 이 아니면 false 반환 */
        if (this.title == null) {
            if (other.title != null) {
                return false;
            }
        }else if (!this.title.equals(other.title)) {
            // 문자열이 같은지 확인하는 구문
            /* title 필드가 null 이 아닌경우
            두 인스턴스의 title 필드값이 같아야 한다. 그렇지 않은 경우 false 반환
            String 클래스가 equals() 메소드를 오버라이딩해서
            문자열의 내용이 같은지 비교하도록 재정의 되었기 때문에
            this.title 과 other.title 의 문자열이 같은 내용을 가지고 있는지 확인 */
            return false;
        }
        /* equals 로 비교 */
        if (this.author == null) {
            if (other.author != null) {
                return false;
            }
        }else if (!this.author.equals(other.author)) {
            return false;
        }
        if (this.price != other.price) {
            // "!" 논리 not 연산자
            return false;
        }
        return true;
        // 모든 조건을 통과하면 두 인스턴의 모든 필드는 같은 값을 가지므로 true 반환
        // 필드값을 비교하기 위한 오버라이딩
    }

    /* hashCode() 오버라이딩 */
    @Override
    public int hashCode() {
        int result = 1;
        final int PRIME = 31;
        /* 필드마다 곱해줄 소숫값 선언
        31은 소수이기 때문에 연산 시 동일한 hashCode 값이 나오지 않을 확률을 증가
        31이 통상적인 관례이며 String 클래스의 hashCode 에서도 사용한 값 */

        /* 31과 필드값을 이용하여 새로운 hashCode 를 연산
        필드값이 같은 경우 동일한 hashCode 를 반환 */
        result  = PRIME * result + this.num;
        result = PRIME * result + this.title.hashCode();
        result  = PRIME * result + this.author.hashCode();
        // String 클래스의 hashCode 메소드는 이미 재정의 되어있다.
        // 같은 값을 가지는 문자열은 동일한 hashCode 값을 반환
        result  = PRIME * result + this.price;

        return result;
    }
}
