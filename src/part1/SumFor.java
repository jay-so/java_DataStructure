package part1;

//for문으로 1,2,3,...n까지의 합을 구함
import java.util.Scanner;

public class SumFor {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        int n = sc.nextInt();

        int sum = 0; //gkq

        for(int i = 1;i<=n;i++){
            sum += i; //sum에 i를 더함
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
