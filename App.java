package com.example.calculator;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        System.out.println("계산 시스템 가동");
        String command;
        do {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            while (!sc.hasNextInt()) {
                System.out.println("정수가 아닌 값이 입력되었습니다. 재입력 바랍니다.");
                sc.nextLine();
                System.out.println("첫 번째 숫자를 입력하세요: ");
            }
            int firstNumber = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            char sign = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("두 번째 숫자를 입력하세요: ");
            while (!sc.hasNextInt()) {
                System.out.println("정수가 아닌 값이 입력되었습니다. 재입력 바랍니다.");
                sc.nextLine();
                System.out.println("두 번째 숫자를 입력하세요: ");
            }
            int secondNumber = sc.nextInt();
            sc.nextLine();

            int result = 0;

            switch (sign) {
                case '+':
                    result = cal.sum(firstNumber,secondNumber);
                    break;
                case '-':
                    result = cal.sub(firstNumber, secondNumber);
                    break;
                case '*':
                    result = cal.mul(firstNumber, secondNumber);
                    break;
                case '/':
                    try {
                        result = cal.div(firstNumber, secondNumber);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("잘못된 사칙연산 기호입니다. +, -, *, / 중 선택바랍니다.");
                    break;
            }
            System.out.println("결과: " + result);
            System.out.println("더 계산 하시겠습니까? (yes or no)");
            command = sc.nextLine();
            if (Objects.equals(command, "no")) {
                System.out.println("시스템이 종료됩니다.");
            } else if (Objects.equals(command, "yes")) {
                System.out.println("재가동합니다.");
            } else {
                System.out.println("알 수 없는 입력! 시스템이 종료됩니다.");
                break;
            }
        } while (command.equals("yes"));
    }
}