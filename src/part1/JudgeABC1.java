package part1;

import java.util.Scanner;

public class JudgeABC1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요. : ");
        int n = sc.nextInt();

        //점수 판별
        if(n==1)
            System.out.println("A");
        else if (n == 2 ) {
            System.out.println("B");
        }else {
            System.out.println("C");
        }
    }
}
