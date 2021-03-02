package Lambda的使用;

/**
 * @author ：fc
 * @date ：Created in 2021/3/2 20:17
 * @description：
 * @version: $
 */
//无返回值无参数
@FunctionalInterface
interface NoParameterNoReturn {
    void test();
}
//无返回值一个参数
@FunctionalInterface
interface OneParameterNoReturn {
    void test(int a);
}
//无返回值多个参数
@FunctionalInterface
interface MoreParameterNoReturn {
    void test(int a,int b);
}
//有返回值无参数
@FunctionalInterface
interface NoParameterReturn {
    int test();
}
//有返回值一个参数
@FunctionalInterface
interface OneParameterReturn {
    int test(int a);
}
//有返回值多参数
@FunctionalInterface
interface MoreParameterReturn {
    int test(int a,int b);
}

public class TestDemo2 {

    public static void main(String[] args) {

        NoParameterNoReturn noParameterNoReturn = ()->{
            System.out.println("无参数无返回值");
        };
        noParameterNoReturn.test();


        OneParameterNoReturn oneParameterNoReturn = (int a)->{
            System.out.println("无参数一个返回值："+ a);
        };
        oneParameterNoReturn.test(10);


        MoreParameterNoReturn moreParameterNoReturn = (int a,int b)->{
            System.out.println("无返回值多个参数："+a+" "+b);
        };
        moreParameterNoReturn.test(20,30);


        NoParameterReturn noParameterReturn = ()->{
            System.out.println("有返回值无参数！");
            return 40;
        };
        //接收函数的返回值
        int ret = noParameterReturn.test();
        System.out.println(ret);


        OneParameterReturn oneParameterReturn = (int a)->{
            System.out.println("有返回值有参数！");
            return a;
        };
        ret = oneParameterReturn.test(50);
        System.out.println(ret);


        MoreParameterReturn moreParameterReturn = (int a,int b)->{
            System.out.println("有返回值多个参数！");
            return a+b;
        };
        ret = moreParameterReturn.test(60,70);
        System.out.println(ret);

    }
}
