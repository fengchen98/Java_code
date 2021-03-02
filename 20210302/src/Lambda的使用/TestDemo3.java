package Lambda的使用;

/**
 * @author ：fc
 * @date ：Created in 2021/3/2 21:18
 * @description：
 * @version: $
 */
class Test{
    public void func(){
        System.out.println("asdasdfa");
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        int a=100;
        new Test(){
            @Override
            public void func(){
                //变量不能被修改
                System.out.println("匿名内部类func");
                System.out.println("捕获的变量"+a);
            }
        }.func();
    }
}
