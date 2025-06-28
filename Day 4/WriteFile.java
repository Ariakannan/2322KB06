import java.io.*;
import java.util.Scanner;
class WriteFile{
  public static void main(String[]a) throws Exception{
    Scanner s=new Scanner(System.in);
    BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));
    for(int i=0;i<3;i++){
      String line=s.nextLine();
      bw.write(line);
      bw.newLine();
    }
    bw.close();
  }
}
