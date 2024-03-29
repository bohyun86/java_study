package library.lang;

public class StringMethod0 {
    public static void main(String[] args) {
        // 문자열에서 자주 사용되는 메서드

        // 1. length: 문자열의 길이(문자 수)를 반환
        int l1 = "".length();   // 0    l1: 0
        int l2 = "반갑습니다.".length(); // 6 특수문자나, 기호도 글자로 포함  l2: 6
        int l3 = "공백도 길이로 칠까요? 네, 길이로 칩니다.".length();   // l3: 12
        int l4 = "\n\t이스케이프문자는?".length();  // l4: 11

        // 2. isEmpty: 문자열의 길이가 0인지 여부
        String em1 = "";
        String em2 = " ";
        String em3 = "\t\t\n";

        System.out.println("1번 길이 0 ? " + em1.isEmpty());
        System.out.println("2번 길이 0 ? " + em2.isEmpty());
        System.out.println("3번 길이 0 ? " + em3.isEmpty());

        // 3. isBlank: 공백을 제외한 문자 길이가 0인지 여부
        System.out.println("1번 blank ? " + em1.isBlank());
        System.out.println("2번 blank ? " + em2.isBlank());
        System.out.println("3번 blank ? " + em3.isBlank());

        // 4. trim: 문자열 white space 제거
        String str = " \t 입력된 정보   아하하   \n";
        // 기본 문자열을 변경하지 않고 새로운 문자열 객체를 생성하여 리턴한다.
        System.out.println("기존 문자열: " + str);
        System.out.println("trim 문자열: " + str.trim());

        System.out.println(str.trim().replace(" ",""));
    }

}
