import java.util.Scanner;

public class Interest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal ");
        double p = sc.nextDouble(); 
        System.out.print("Enter Time:");
        double n = sc.nextDouble();
        System.out.print("Enter Rate:");
        double r = sc.nextDouble();
        if (p > 0 && n > 0 && r > 0)
            System.out.println("Simple Interest = " + (p * n * r) / 100);
        else
            System.out.println("Invalid input! P, N, and R must be > 0.");
        sc.close();
    }
}
