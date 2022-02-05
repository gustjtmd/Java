package Test;

import review.ColdPatient2;

public class arrtest2 {
    public static void chaos(int[][] arr) {
        int[] last = arr[arr.length-1];

        for(int i = arr.length-1; i >0; i--)
            arr[i] = arr[i-1];
        arr[0] = last;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        chaos(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.printf("==========================================================\n");

        chaos(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    static class SinusCap2{
        void sniTake(){
            System.out.println("콧물이 낫습니다.");
        }
        void sneTake(){
            System.out.println("재채기가 멎습니다.");
        }
        void snuTake(){
            System.out.println("기침이 멈춥니다.");
        }
        void take(){
            sniTake();
            sneTake();
            snuTake();
        }
    }

    public static class OneClassEncapsultation {
        public static void main(String[] args) {
            ColdPatient2 coldPatient2 = new ColdPatient2();
            coldPatient2.takeCap(new SinusCap2());
        }
    }
}
