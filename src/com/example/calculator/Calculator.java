package com.example.calculator;

import java.io.Console;
import java.util.Collection;

public class Calculator {
    // 속
    private int num1,num2,result;
    private char op;
    private Collection collection;

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
        // 3collection.add(result);
        //System.out.println(collection);
        return result;

    }

    public void removeResult() {

    }

}
