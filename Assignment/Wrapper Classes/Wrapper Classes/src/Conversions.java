public class Conversions {
  public static void main(String args[]) {
    int num = Integer.parseInt(args[0]);
 
    System.out.println(num + " in binary: " +
                       Integer.toBinaryString(num));
 
    System.out.println(num + " in octal: " +
                       Integer.toOctalString(num));
 
    System.out.println(num + " in hexadecimal: " +
                       Integer.toHexString(num));
  }
}
