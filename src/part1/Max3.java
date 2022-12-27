package part1;
//3개의 정숫값을 입력하고 최댓값을 구하여 출력

import java.util.Scanner;

public class Max3 {
    public static void main(String[]args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("A의 값: ");
        int a = stdIn.nextInt();

        System.out.print("B의 값: ");
        int b = stdIn.nextInt();

        System.out.print("C의 값: ");
        int c = stdIn.nextInt();

        /*입력 값 중 최댓값을 구함
        1. 먼저 a를 최댓값으로 설정
        2. b와 비교하여 b가 크다면 b를 최댓값으로 설정
        3. c와 비교하여 c가 크다면 c를 최댓값으로 설정
        */

        int max = a;
        if(max<b)
            max = b;
        else if(max<c)
            max = c;

        //최댓값 출력
        System.out.println("최댓값은 " + max + "입니다.");

    }
}
