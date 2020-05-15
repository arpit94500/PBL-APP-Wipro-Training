public class wrapperClass2 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println("Given Number : "+number);
        System.out.println("Binary : "+Integer.toBinaryString(number));
        System.out.println("Octal : "+Integer.toOctalString(number));
        System.out.println("Hex : "+Integer.toHexString(number));
    }
}