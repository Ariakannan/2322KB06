import java.util.Scanner;
class ReverseArr{
  public static void main(String[]a){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt(),arr[]=new int[n];
    for(int i=0;i<n;i++)arr[i]=s.nextInt();
    for(int i=n-1;i>=0;i--)System.out.print(arr[i]+" ");
  }
}
