package Java.ch11;
/*
    String birth = "<양>" + 7 + '.' + 16; -> <양>7.16
    = "<양>".concat(String.valueOf(7)).concat(String.valueOf('.')).concat(String.valueOf(16));
    기본 자료형의 값을 문자열로 변환하는 과정을 여러번 거쳐야하는 문제점이 생김
    StringBuilder 활용하기
    String birth = (new StringBuilder("<양>").append(7).append('.').append(16)).toString();

    StringBuilder클래스는 내부적으로 문자열을 저장하기 위한 메모리 공간을 지님 그리고 이 메모리 공간은 String 클래스의
    메모리 공간과 달리 문자를 추가하거나 삭제하는것이 가능
    따라서 수정하면서 유지해야할 문자열이 있다면 StringBuilder클래스에 내용을 담아서 관리하는것이 효율적

    public StringBuilder append(int i) -> 기본 자료형 데이터를 문자열 내용에 추가
    public StringBuilder delete(int start, int end) -> 인덱스 start에서부터 end 이전까지의 내용을 삭제
    public StringBuilder insert(int offset,String str) -> 인덱스 offset의 위치에 str 전달된 문자열 추가
    public StringBuilder replace(int start, int end, String str)-> 인덱스 start에서 end 이전까지의 내용을 str의 문자열로 대체
    public StringBuilder reverse() -> 저장된 문자열의 내용을 뒤집는다
    public String substring(int start, int end) -> 인덱스 start에서부터 end 이전까지의 내용만 담은 String인스턴스 생성 및 반환
    public String toString() -> 저장된 문자열의 내용을 담은 String 인스턴스의 생성 및 반환
 */

public class BuildString {
    public static void main(String[] args) {
        //문자열 "123"이 저장된 인스턴스의 생성
        StringBuilder stbuf = new StringBuilder("123");

        stbuf.append("45678"); //문자열 덧붙이기
        System.out.println(stbuf.toString());

        stbuf.delete(0,2); //문자열 일부 삭제
        System.out.println(stbuf.toString());

        stbuf.reverse(); //문자열 내용 뒤집기
        System.out.println(stbuf.toString());

        String sub = stbuf.substring(2,4);
        System.out.println(sub);
    }
}
/*
    StringBuilder 인스턴스 내부에는 문자열 관리를 위한 메모리 공간이 존재하는데 이 공간의 크기를 인스턴스 생성 과정에서 지정할 수 있다.
    StringBuilder stbuf = new StringBuilder(64); -> 생성자의 인자로 전달된 숫자의 크기만큼 문자를 저장할 공간 마련.

    물론 StringBuilder 인스턴스는 메모리 공간을 스스로 관리한다 부족하면 공간을 늘리는데 이는 소모가 많은 작업임
    따라서 사용 계획에 따라 적절히 크기를 초기에 만들면 그만큼의 성능 향상을 기대할 수 있음.
    StringBuilder의 생성자는 다음과 같이 정의되어 있다.

    public StringBuilder() -> 16개의 문자를 저장할 수 있는 메모리 공간 확보
    public StringBuilder(int capacity) -> capacity개의 문자를 저장할 수 있는 메모리 공간 확보
    public StringBuilder(String str) -> 전달되는 문자열과 16개의 문자를 저장할 수있는 메모리 공간 확보.
 */
