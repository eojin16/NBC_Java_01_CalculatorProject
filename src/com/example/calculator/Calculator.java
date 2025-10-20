package com.example.calculator;

import java.io.Console;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Calculator {
    // 속
    private int num1,num2,result;
    private char op;
    private static ArrayList<Integer> arrayList = new ArrayList<>();

    // 생
    public Calculator(int num1,int num2, char op){
        this.num1=num1;
        this.num2=num2;
        this.op=op;
    }

    // 기
    public int Calculate(int num1,int num2, char op){
        switch (op){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '/':
                if(num2 == 0){
                    System.out.println("Cannot divide by zero");
                    break;
                }
                else{
                    result = num1/num2;
                }
                break;
            case '*':
                result = num1*num2;
            default:
                break;

        }

        arrayList.add(result);
        // System.out.println(arrayList);
        return result;

    }

    public static void removeResult() { // 객체 생성 없이도 사용할 수 있도록 static
        arrayList.remove(0);    // 가장 먼저 저장된 데이터를 삭제
    }

}
