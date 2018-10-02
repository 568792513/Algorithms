package classify;

//【程序3】   题目：打印出所有的 水仙花数 ，所谓 水仙花数 是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 水仙花数 ，因为153=1的三次方＋5的三次方＋3的三次方。
public class Daffodils {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (f(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean f(int x){
        String temp = String.valueOf(x);
        int i = Character.getNumericValue(temp.charAt(0));
        int j = Character.getNumericValue(temp.charAt(1));
        int k = Character.getNumericValue(temp.charAt(2));
        int result = i*i*i + j*j*j + k*k*k;
        if (result == x){
            return true;
        } else {
            return false;
        }
    }
}
