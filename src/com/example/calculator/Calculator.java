package com.example.calculator;
import java.util.*;

// 1. **요구사항 정의**
//    - 어떤 계산기 기능이 필요한지: 기본적인 사칙연산(덧셈, 뺄셈, 곱셈, 나눗셈) 구현 완료 후 -> 괄호 사용, 제곱근, 제곱 등.
//    - 사용자 인터페이스 방식 결정 : 콘솔 기반
//    - 예외 처리 : 0으로 나누기와 같은 오류 -> 경고 메시지 출력
//2. **설계**
//    - 클래스 설계: 계산기에 필요한 클래스를 설계합니다.
//    - 기능 분해: 주요 기능을 메소드로 분리합니다.
//    - 데이터 흐름 설계: 데이터가 클래스 간에 어떻게 흐를지를 결정합니다. 입력, 처리, 출력의 흐름을 이해합니다.

// **필수 기능 요약**
//
//        **Lv 1.**
//        1. 계산기는 2개의 숫자를 받을 수 있고 사칙연산 될 문자를 받을 수 있다.
//        2. 계산기는 exit을 입력할 때까지 계속해서 값을 받고 연산 결과를 반환한다.
//        **Lv 2.**
//        1. 계산된 결과 값들을 기록하는 컬렉션을 만든다.
//        2. 컬렉션의 가장 먼저 저장된 데이터를 삭제하는 기능을 만든다.
//        **Lv 3.**
//        1. 양의 정수만 받을 수 있었지만, 이제부터는 실수도 받을 수 있게 수정한다.
//        2. 결과가 저장되어 있는 컬렉션을 조회하는 기능을 만든다.
//        3. 그 때 특정 값보다 큰 결과 값을 출력할 수 있도록 한다.

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, Calculator!");
        int result = 0;
        Collection<Integer> collection = new ArrayList<>();

        while (true){
            System.out.print("Please enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Please enter the second number: ");
            int num2 = sc.nextInt();
            System.out.print("Please enter the Operator: ");
            char op = sc.next().charAt(0);
            sc.nextLine();

            switch (op){
                case '+':
                    collection.add(num1 + num2);
                    break;
                case '-':
                    collection.add(num1 - num2);
                    break;
                case '/':
                    if(num2 == 0){
                        System.out.println("Cannot divide by zero");
                        break;
                    }
                    else{
                        collection.add(num1 / num2);
                    }
                    break;
                case '*':
                    collection.add(num1 * num2);
                default:
                   break;

            }
            System.out.println("Calcualtion Result: " + result);
            System.out.print("Enter exit if you want to exit: ");
            String exit = sc.nextLine();
            System.out.println("exit 변수의 값: [" + exit + "]");

            if(exit.equals("exit")){
                break;
            }
        }



    }
}