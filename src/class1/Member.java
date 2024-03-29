package class1;

public class Member {
    String name;
    int score;
    int age;

    // 생성자
    // 생성자는 Return 타입이 없다.
    // 생성자는 클래스의 이름과 같아야 한다.
    // 생성자가 하나라도 존재할 경우, 기본 생성자가 제공되지 않는다.

    Member(String name, int score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    // 생성자 오버로딩: 매개변수의 개수, 순서가 다르거나, 타입이 다를 경우
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Member(String name) {
        // System.out.println("매개변수 한개짜리 생성자 호출");
        this(name,0,0); // 첫줄에만 호출 가능
        this.name = name;

    }
}
