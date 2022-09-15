public class Test01_Operator {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2); // 比较地址
        System.out.println(s1.equals(s2)); // 比较内容

        byte b1 = 10;
        b1 += 1; // 默认做了强转
        System.out.println(b1);

        b1 = b1++; // (tmp), 比较混乱
        System.out.println(b1);
    }
}
