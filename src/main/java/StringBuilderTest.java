public class StringBuilderTest {
    public static void main(String[] args) {
        Integer x = 400;
        Integer w = x;
        x++;
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1;
        sb1.append("5");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println((x == w) + " + " + (sb1 == sb2));
    }
}
