package Java.ch18;
/*
    허용 할 수 없는 형 변환을 강제로 진행하는 경우에 발생하는 ClassCaseException 예외의 상황
 */
class Board{}
class PBoard extends Board{}
public class ClassCast {
    public static void main(String[] args) {
        Board pbd1 = new PBoard();
        PBoard pbd2 = (PBoard)pbd1; //OK
        System.out.println("..intermediate location ..");

        Board ebd1 = new Board();
        PBoard ebd2 = (PBoard)ebd1; // Exception
    }

}
