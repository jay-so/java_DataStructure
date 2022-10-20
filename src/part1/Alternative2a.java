package part1;

import java.util.Scanner;

public class Alternative2a {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");


        System.out.print("n의 값:" );
        n = sc.nextInt();

        for(int i = 0; i<n/2;i++){
            System.out.print("+-");
        }
    }
}
