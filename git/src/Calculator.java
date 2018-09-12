import java.util.Scanner;

public class Calculator {


    private static double calculator(double numberOne, double numberTwo, char operation){
        double result;
        switch (operation){
            case '+':
                result = numberOne+numberTwo;
                break;
            case '-':
                result = numberOne-numberTwo;
                break;
            case '*':
                result = numberOne*numberTwo;
                break;
            case '/':
                result = numberOne/numberTwo;
                break;
            default:
                System.out.println("Ошибка! Попробуйте еще раз.");
                result = calculator(numberOne, numberTwo, getOper());
        }
        return result;
    }
    private static Scanner scanner = new Scanner(System.in);
    private static double getNumber(){
        System.out.println("Введите число:");
        double number;
        if(scanner.hasNextDouble()){
            number = scanner.nextDouble();
        } else {
            System.out.println("Ошибка! Попробуйте еще раз.");
            scanner.next();
            number = getNumber();
        }
        return number;
    }
    private static char getOper(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка! Попробуйте еще раз.");
            scanner.next();
            operation = getOper();
        }
        return operation;
    }

    public static void main(String[] args) {
        double numberOne = getNumber();
        double numberTwo = getNumber();
        char operation = getOper();
        double result = calculator(numberOne,numberTwo,operation);
        System.out.println("Ответ: "+result);
    }


}