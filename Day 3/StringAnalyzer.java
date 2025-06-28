import java.util.Scanner;
class StringAnalyzer{
  public static void main(String[]a){
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    String[] words=str.split(" ");
    int wc=words.length,cc=0; String lw="";
    for(String w:words){
      cc+=w.length();
      if(w.length()>lw.length())lw=w;
    }
    String rev="";
    for(int i=str.length()-1;i>=0;i--)rev+=str.charAt(i);
    System.out.println("words:"+wc);
    System.out.println("chars:"+cc);
    System.out.println("reverse:"+rev);
    System.out.println("longest:"+lw);
  }
}
