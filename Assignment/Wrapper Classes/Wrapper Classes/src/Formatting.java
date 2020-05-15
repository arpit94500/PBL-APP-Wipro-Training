class Formatting
{
 public static void main(String a[]){
       
 Scanner sc = new Scanner(System.in);
       
 int n = sc.nextInt();
    	
String s= Integer.toBinaryString(n);
   
System.out.println(String.format("%08d", Integer.parseInt(s)));
        
     
   
    }
}