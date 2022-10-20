package part1;

//양수만 입력하여 1,2,...n의 합을 구함
import java.util.Scanner;

public class SumFor2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do{
            System.out.print("n값: ");
            n = sc.nextInt();
        }while (n<=0);

        int sum = 0; //합

        for(int i = 1;i<=n;i++)
            sum += i; //sum에 i를 더함

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
