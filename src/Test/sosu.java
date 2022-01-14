package Test;

public class sosu {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            int x = i;
            if (sosu(x))
                System.out.println(x);
        }
    }
    public static boolean sosu(int x){
        if(x==1)
            return false;
        for(int i = 2; i < x; i++) {
            if(x % i == 0)
                return false;
        }
        return true;
    }
}
