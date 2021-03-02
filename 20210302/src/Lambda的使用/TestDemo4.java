package Lambda的使用;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @author ：fc
 * @date ：Created in 2021/3/2 21:24
 * @description：
 * @version: $
 */
public class TestDemo4 {



    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("fccc");
        list.add("hello");
        list.add("lambda");
        //表示调用一个，不带有参数的方法，其执行花括号内的语句，为原来的函数体内容。
        list.forEach(s -> {
            System.out.println(s);
        });
        list.sort((o1,o2)-> o1.compareTo(o2));
    }



    public static void main1(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("fccc");
        list.add("hello");
        list.add("lambda");
        list.forEach(new Consumer<String>(){
            @Override
            public void accept(String str){
//简单遍历集合中的元素。
                System.out.print(str+" ");
            }
        });
    }

}
