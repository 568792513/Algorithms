package classify;

// 【程序2】   题目：判断101-200之间有多少个素数，并输出所有素数。
public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 101; i <= 200; i+=2) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (j % i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
            }
        }
    }
}
