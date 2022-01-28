package Test;

public class arrtest {

    public static void addOneDarr(int[] arr, int add){
        for(int i = 0; i < arr.length; i++) {
            arr[i] += add;
        }
    }
    public static void addTwoDarr(int[][] arr, int add){

        for(int i = 0; i < arr.length; i++)
            addOneDarr(arr[i],add);
    }
    public static void main(String[] args) {
        int[][] cha = {
                {10,20,30},
                {40,50,60}
        };
        for(int i = 0; i < cha.length ;i++){
            for (int j = 0; j < cha[i].length; j++){
                addTwoDarr(cha,100);
                System.out.print(cha[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
