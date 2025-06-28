import java.util.Scanner;
public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }
            System.out.print("Enter two numbers: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            switch (choice) {
                case 1: System.out.println("Result: " + (a + b)); break;
                case 2: System.out.println("Result: " + (a - b)); break;
                case 3: System.out.println("Result: " + (a * b)); break;
                case 4: 
                    if (b == 0) System.out.println("Cannot divide by zero.");
                    else System.out.println("Result: " + (a / b));
                    break;
                default: System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
