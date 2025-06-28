import java.util.Scanner;
class AddressBook{
  public static void main(String[]a){
    Scanner s=new Scanner(System.in);
    String[] contacts=new String[5];
    for(int i=0;i<5;i++){
      contacts[i]=s.nextLine();
    }
    for(String c:contacts)System.out.println(c);
  }
}
