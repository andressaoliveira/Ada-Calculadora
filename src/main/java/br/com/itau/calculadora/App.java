package br.com.itau.calculadora;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        String operation = readString("Digite a operação desejada: ");
        int number1 = readNumber("Digite o primeiro numero: ");
        int number2 = readNumber("Digite o segundo numero: ");

        int result = calculate(operation, number1, number2);
    }

    private static int readNumber(String message){
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextInt();
    }

    private static String readString(String message){
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextLine();
    }

    private static int calculate(String operation, int number1, int number2){
        int result = 0;
        if(operation.equals("+")){
            result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
            return result;
        }
        else{
            System.out.println("Operação inválida");
            return 0;
        }
    }
}
