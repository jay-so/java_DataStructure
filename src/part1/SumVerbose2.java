package part1;

//1,2,...,n의 합과 그 과정을 구하는 과정을 출력(2)
import java.util.Scanner;

public class SumVerbose2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.print("n값: ");
            n = sc.nextInt();
        }while (n<=0);

        int sum = 0;

        for(int i = 1;i< n; i++){
            System.out.print(i + " + ");
            sum += i; //sum에 i를 더함
        }
        System.out.print(n + " = ");
        sum += n; //sum에 n을 더함
        System.out.println(sum);
    }
}
