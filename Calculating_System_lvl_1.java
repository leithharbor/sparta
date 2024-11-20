package com.example.calculator;

import java.util.Objects;
import java.util.Scanner;

public class Calculating_System_lvl_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계산 시스템 가동");
        String command;
        do {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            while (!sc.hasNextInt()) {
                System.out.println("정수가 아닌 값이 입력되었습니다. 재입력 바랍니다.");
                sc.nextLine();
                System.out.println("첫 번째 숫자를 입력하세요: ");
            }
            int n1 = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            char c = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("두 번째 숫자를 입력하세요: ");
            while (!sc.hasNextInt()) {
                System.out.println("정수가 아닌 값이 입력되었습니다. 재입력 바랍니다.");
                sc.nextLine();
                System.out.println("두 번째 숫자를 입력하세요: ");
            }
            int n2 = sc.nextInt();

            int result = 0;

            switch (c) {
                case '+':
                    result = n1 + n2;
                    break;
                case '-':
                    result = n1 - n2;
                    break;
                case '*':
                    result = n1 * n2;
                    break;
                case '/':
                    if (n2 == 0) {
                        System.out.println("0으로는 나눌 수 없습니다. 시스템이 종료됩니다.");
                    } else {
                        result = n1 / n2;
                    }
                    break;
                default:
                    System.out.println("잘못된 사칙연산 기호입니다. +, -, *, / 중 선택바랍니다.");
                    break;
            }
            System.out.println("결과: " + result);
            System.out.println("더 계산 하시겠습니까? (yes or no)");
            sc.nextLine();
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