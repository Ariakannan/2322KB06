import java.io.*;
class ResultProcess{
  public static void main(String[]a) throws Exception{
    BufferedReader br=new BufferedReader(new FileReader("marks.txt"));
    BufferedWriter bw=new BufferedWriter(new FileWriter("result.txt"));
    String line;
    while((line=br.readLine())!=null){
      String[] parts=line.split(" ");
      int total=0;
      for(int i=1;i<parts.length;i++) total+=Integer.parseInt(parts[i]);
      double per=total/(parts.length-1.0);
      bw.write(parts[0]+" "+per);
      bw.newLine();
    }
    br.close(); bw.close();
  }
}
