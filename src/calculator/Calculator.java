package calculator;

import java.util.Stack;

public class Calculator {

    public static int calculator(String input){
        int len;
        if(input == null || (len = input.length()) == 0){
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';

        for (int i = 0; i < len; i++){
            if(Character.isDigit(input.charAt(i))){
                num = num *10 + input.charAt(i) -'0';
            }
            if(!Character.isDigit(input.charAt(i)) || i == len -1){
                if(sign == '-') {
                    stack.push(-num);
                }
                if(sign == '+') {
                    stack.push(num);
                }
                if(sign == '*') {
                    stack.push(stack.pop()*num);
                }
                sign = input.charAt(i);
                num = 0;
            }
        }
        int ans = 0;
        for(int i : stack){
            ans += i;
        }
        return ans;
    }
}
