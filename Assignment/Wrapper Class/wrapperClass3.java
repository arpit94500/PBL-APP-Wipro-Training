import java.util.Scanner;
public class wrapperClass3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String output = String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0');
        System.out.println(output);
    }
}