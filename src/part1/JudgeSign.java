package part1;
//입력한 정숫값의 부호(양수/음수/0)을 판단
import java.util.Scanner;

public class JudgeSign {
    public static void main(String[]args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int n = stdIn.nextInt();

        /*
        1. n의 값을 양수, 음수, 0으로 구분
        2. 양수일 경우 -> 이 수는 양수입니다. 출력
        3. 음수일 경우 -> 이 수는 음수입니다. 출력
        4. 0일 경우 -> 이 수는 0입니다. 출력
        */

        if(n>0)
            System.out.println("이 수는 양수입니다.");
        else if(n<0)
            System.out.println("이 수는 음수입니다.");
        else
            System.out.println("이 수는 0입니다.");
    }
}
