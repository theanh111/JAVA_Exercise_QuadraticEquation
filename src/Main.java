import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a:");
        double a = input.nextDouble();
        System.out.println("Enter number b:");
        double b = input.nextDouble();
        System.out.println("Enter number c:");
        double c = input.nextDouble();

        QuadraticEquation calculator = new QuadraticEquation(a, b, c);
        double delta = calculator.getDiscriminant();
        double x1 = calculator.getRoot1();
        double x2 = calculator.getRoot2();
        System.out.println("Delta is: " + delta);

        if (delta > 0) {
            System.out.println("The equation has 2 roots: " + x1 + " and " + x2);
        } else if (delta == 0) {
            System.out.println("The equation has 1 roots: " + x1);
        } else {
            System.out.println("The equation has NO real roots!");
        }
    }
}
