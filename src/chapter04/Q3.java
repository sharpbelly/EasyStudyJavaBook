package chapter04;


// 회원을 관리하려고 회원을 모델링한 Member 클래스를 작성하라. 회원 정보로는 이름, 아이디, 암호, 나이가 있다.
// 외부 객체는 이와 같은 회원 정보에 직접 접근할 수 없고 접근자와 설정자로만 접근할 수 있다.
// 그리고 모든 회원 정보를 사용해 객체를 생성할 수 있는 생성자도 있다.
public class Q3 {
    public static void main(String[] args) {
        Member m = new Member("신주원","tttt","1234",30);

        m.setName("신주원");
        m.setId("tttt");
        m.setPw("1234");
        m.setAge(30);
    }
}
