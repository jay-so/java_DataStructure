package part1;

import java.util.Scanner;

public class JudgeABC1 {

    public static void main(String[]args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int n = stdIn.nextInt();

        /*
         1. n의 값이 1이면 A를 출력
         2. n의 값이 2이면 B를 출력
         3. n의 값이 1,2가 아니라면 C를 출력
         */

        if(n ==1)
            System.out.println("A");
        else if(n==2)
            System.out.println("B");
        else
            System.out.println("C");
    }
}
