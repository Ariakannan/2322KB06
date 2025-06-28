import java.io.*;
class ReadFile{
  public static void main(String[]a) throws Exception{
    BufferedReader br=new BufferedReader(new FileReader("input.txt"));
    String line;
    while((line=br.readLine())!=null){
      System.out.println(line);
    }
    br.close();
  }
}
