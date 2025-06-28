import java.util.Scanner;
class SplitWords{
  public static void main(String[]a){
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    String[] words=str.split(" ");
    for(String w:words)System.out.println(w);
  }
}
