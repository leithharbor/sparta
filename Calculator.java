package com.example.calculator;

public class Calculator {
    //더하기 메서드
    public int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }
    //빼기 메서드
    public int sub(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }
    //곱하기 메서드
    public int mul(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }
    // 나누기 메서드
    public int div(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {   // 분모가 0일 때 나누기 오류가 나는 것을 ArithmeticException으로 예외 처리
            throw new ArithmeticException("0으로 나누는 것은 불가능합니다.");   // throw new로 예외 던지기
        }                                                              // 괄호안은 나중에 getResult 메세지 내용
        int result = firstNumber / secondNumber;
        return result;
    }
}

