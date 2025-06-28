import java.io.*;
import java.util.*;
class EmployeeFile{
  static final String FILE="employees.txt";
  
  static void add(String id,String name) throws Exception{
    BufferedWriter bw=new BufferedWriter(new FileWriter(FILE,true));
    bw.write(id+" "+name);
    bw.newLine();
    bw.close();
  }
  
  static void display() throws Exception{
    BufferedReader br=new BufferedReader(new FileReader(FILE));
    String line;
    while((line=br.readLine())!=null) System.out.println(line);
    br.close();
  }
  
  static void delete(String id) throws Exception{
    File f=new File(FILE),temp=new File("temp.txt");
    BufferedReader br=new BufferedReader(new FileReader(f));
    BufferedWriter bw=new BufferedWriter(new FileWriter(temp));
    String line;
    while((line=br.readLine())!=null){
      if(!line.startsWith(id+" ")) bw.write(line+"\n");
    }
    br.close(); bw.close();
    f.delete();
    temp.renameTo(f);
  }
  
  static void update(String id,String newName) throws Exception{
    File f=new File(FILE),temp=new File("temp.txt");
    BufferedReader br=new BufferedReader(new FileReader(f));
    BufferedWriter bw=new BufferedWriter(new FileWriter(temp));
    String line;
    while((line=br.readLine())!=null){
      if(line.startsWith(id+" ")) bw.write(id+" "+newName+"\n");
      else bw.write(line+"\n");
    }
    br.close(); bw.close();
    f.delete();
    temp.renameTo(f);
  }
  
  public static void main(String[]a) throws Exception{
    add("101","Alice");
    add("102","Bob");
    System.out.println("All Employees:");
    display();
    update("102","Bobby");
    System.out.println("After update:");
    display();
    delete("101");
    System.out.println("After delete:");
    display();
  }
}
