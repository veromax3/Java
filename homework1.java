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


        // Задача 3. Реализовать простой калькулятор
        System.out.printf("Input the 1st number: ");
        int number1 = iScanner.nextInt();
        System.out.printf("Input the 2nd number: ");
        int number2 = iScanner.nextInt();
        System.out.printf("Input the sign : ");
        char sign = iScanner.next().charAt(0);
        if (sign == '+'){
            int result1 = number1 + number2;
            System.out.printf("Result of operation " + number1 + sign + number2 + " = " + result1);
        }
        if (sign == '-'){
            int result2 = number1 - number2;
            System.out.printf("Result of operation " + number1 + sign + number2 + " = " + result2);
        }
        if (sign == '*'){
            int result3 = number1 * number2;
            System.out.printf("Result of operation " + number1 + sign + number2 + " = " + result3);
        }
        if (sign == '/'){
            int result4 = number1 / number2;
            System.out.printf("Result of operation " + number1 + sign + number2 + " = " + result4);
        }

        iScanner.close();

            }
        }


    
    

