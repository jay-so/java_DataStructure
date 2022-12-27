package part1;

import java.util.Scanner;

public class JudgeABC2 {
    public static void main(String[]args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int n = stdIn.nextInt();

        /*
         1. 1이면 A출력
         2. 2이면 B출력
         3. 3이면 C출력
         4. 모두 아니면 종료
         */

        if(n ==1)
            System.out.println("A");
        else if(n ==2)
            System.out.println("B");
        else if(n ==3)
            System.out.println("C");
        else
            return ;
    }
}
