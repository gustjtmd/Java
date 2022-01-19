package Java.ch32;

import java.io.*;

public class Write7ToFile {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("data.dat");    //출력 스트림 생성
        out.write(7);   //7을 저장
        out.close();
    }

    public static class ObjectInput {
        public static void main(String[] args) {
            try(ObjectInputStream oi =
                    new ObjectInputStream(new FileInputStream("Ojbect bin"))){
                SBox box1 = (SBox)oi.readObject();  //인스턴스 복원
                System.out.println(box1.get());
                SBox box2 = (SBox)oi.readObject();  //인스턴스 복원
                System.out.println(box2.get());
            }
            catch (ClassNotFoundException e){
                e.printStackTrace();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static class ObjectOutput {
        public static void main(String[] args) {
            SBox box1 = new SBox("Robot");
            SBox box2 = new SBox("Strwaberry");

            try(ObjectOutputStream oo =
                    new ObjectOutputStream(new FileOutputStream("Ojbect bin"))){
                oo.writeObject(box1);   //box1이 참조하는 인스턴스 저장
                oo.writeObject(box2);   //box2가 참조하는 인스턴스 저장
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static class SBox implements Serializable{
        transient String s;
        public SBox(String s){this.s = s;}
        public String get(){return s;}
    }
}
