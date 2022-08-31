import java.util.Scanner;

public class HelloWorld {
    public static int USCLN(int a , int b){
        while (a!=b){
            if(a>b){
                a-=b;
            } else {
                b-=a;
            }
        }
        return a;
    }
    public static int BSCNN(int a, int b){
        return a*b/USCLN(a,b);
    }
    public static void main(String[] args) {
        System.out.println("tinh USCLN va BSCNN");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so a");
        int a = scanner.nextInt();
        System.out.println("nhap vao so b");
        int b = scanner.nextInt();
        System.out.println("USCLN : " + USCLN(a,b));
        System.out.println("BSCNN : " + BSCNN(a,b));

    }

}
