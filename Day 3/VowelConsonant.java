import java.util.Scanner;
class VowelConsonant{
  public static void main(String[]a){
    Scanner s=new Scanner(System.in);
    String str=s.nextLine().toLowerCase();
    int v=0,c=0;
    for(char ch:str.toCharArray()){
      if(ch>='a'&&ch<='z'){
        if("aeiou".indexOf(ch)>=0)v++;
        else c++;
      }
    }
    System.out.println("vowels:"+v+" consonants:"+c);
  }
}
