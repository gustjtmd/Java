package Java.ch20;

import java.util.StringTokenizer;

public class TokenizeString {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("PM:80:45", ":");

        while(st1.hasMoreTokens()){ //반환결과가 true일 경우에만
            System.out.print(st1.nextToken() +' ');
        }
        System.out.println();

        StringTokenizer st2 = new StringTokenizer("12+36-8/2 = 44", "+-/= ");   // 둘 이상의 구분자 공백도 구분자 포함

        while(st2.hasMoreElements())
            System.out.print(st2.nextToken()+ ' ');
        System.out.println();
    }
}
/*
    public boolean hasMoreTokens() : 반환할 토큰이 남아 있는가?
    public String nextToken() : 다음 토큰을 반환
 */