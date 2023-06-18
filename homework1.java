import java.util.Scanner;


public class homework1 {
    public static void main(String[] args) {

        // Задача 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input a number to which the calculation of triangular number will be made: ");
        int num1 = iScanner.nextInt();
        int TriangularNum = 0;
        int counter1 = 1;
        while(counter1 <= num1) {
            TriangularNum += counter1;
            counter1 ++;
        }
        System.out.println("Triangular number from " + num1 + " is: " + TriangularNum);

        System.out.printf("Input a number to which the calculation of factorial will be made: ");
        int num2 = iScanner.nextInt();
        int factorial = 1;
        int counter2 = 1;
        while(counter2 <= num2) {
            factorial *= counter2;
            counter2 ++;
        }
        System.out.println("The factorial from " + num2 + " is: " + factorial);




            }
        }


    
    

