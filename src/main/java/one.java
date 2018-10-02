public class one {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 6;
        c = a + b;
        b = a + c;
        a = b + c;
        c = (c - b - a)/2;
        b = b - c;
        a = a - b;
        System.out.println("a:" + a + "b:" + b+ "c:" + c);
    }
}
