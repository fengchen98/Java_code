package 反射;

/**
 * @author ：fc
 * @date ：Created in 2021/3/2 18:56
 * @description：
 * @version: $
 */

public class TestDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> c1=Class.forName("反射.Student");

        Class<?> c2= Student.class;

        Student student=new Student();
        Class<?> c3 =student.getClass();

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c3));
    }
}
