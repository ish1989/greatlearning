public class EvenOdd{
  public static void main(String[] args) {
    int i=Integer.parseInt(args[0]);
    String result=(i%2==0)?" true" : "false";
    System.out.println("result is" + result);
  }
}
