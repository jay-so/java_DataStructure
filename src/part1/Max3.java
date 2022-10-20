package part1;

import java.util.Scanner;

/*
3가지 정숫값을 입력하고 최댓갑을 출력하는 문제
 */
public class Max3 {
    public static void main(String[]args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        //정수 a의 값
        System.out.print("a의 값: ");
        int a = stdIn.nextInt();

        //정수 b의 값
        System.out.print("b의 값: ");
        int b = stdIn.nextInt();

        //정수 c의 값
        System.out.print("c의 값: ");
        int c = stdIn.nextInt();

        //최댓값 설정 - 첫번째로 입력 받은 정수 a로 설정
        int max = a;
        if(b>max){
            max = b;
        } else if (c>max) {
            max = c;
        }

        //3가지 정수 중에 가장 큰 값을 가진 정수를 출력
        System.out.println("최댓값은 " + max + "입니다.");
    }
}
