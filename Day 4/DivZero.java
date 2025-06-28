import java.util.Scanner;
class DivZero{
  public static void main(String[]a){
    Scanner s=new Scanner(System.in);
    int a1,b1;
    try{
      a1=s.nextInt(); b1=s.nextInt();
      System.out.println("Result:"+(a1/b1));
    }catch(ArithmeticException e){
      System.out.println("Cannot divide by zero");
    }
  }
}
