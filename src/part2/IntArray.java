package part2;
//구성 요소의 자료형이 int형인 배열(배열의 길이는 5)
public class IntArray {
    public static void main(String[]args){
        int [] a = new int[5]; //배열의 선언

        a[1] = 37; //a[1]에 37를 대입
        a[2] = 51; //a[2]에 51을 대입
        a[4] = a[1] *2; //a[4]에 a[1] *2 = 74를 대입

        for(int i = 0;i<a.length;i++) //각 요솟값을 출력
            System.out.println("a[" + i+"] = " +a[i] );
    }
}
