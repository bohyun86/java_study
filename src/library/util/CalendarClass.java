package library.util;

import java.util.Calendar;
import java.util.Date;

public class CalendarClass {
    // java.util 패키지
    // 날짜와 시간 관련, Date, Calendar
    public static void main(String[] args) {
        // Date 클래스는 시간대 정보가 없는 timestamp를 관리
        // timestamp: 197001010000 -> 0으로 시작한 정수값
        Date date = new Date(2024, 3, 8);
        Date dateNow = new Date();

        // Calandar 클래스는 날짜와 시간을 표현하고, 시간대 지원
        // new 연산자를 통해 인스턴스 생성 불가
        // 정적 메서드 getInstance를 통한 사용 (싱글턴 패턴)

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);   // 0~11로 표시 주의!
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초\n",
                year, month + 1, dayOfMonth, hour, minute, second);
    }
}
