package 反射;

/**
 * @author ：fc
 * @date ：Created in 2021/3/2 19:28
 * @description：
 * @version: $
 */
public class Student {
    //私有属性name
    private String name = "fccc";
    //公有属性age
    public int age = 18;
    //不带参数的构造方法
    public Student(){
        System.out.println("反射.Student()");
    }
    private Student(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("反射.Student(String,name)");
    }
    private void eat(){
        System.out.println("i am eat");
    }
    public void sleep(){
        System.out.println("i am pig");
    }
    private void function(String str) {
        System.out.println(str);
    }
    @Override
    public String toString() {
        return "反射.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
