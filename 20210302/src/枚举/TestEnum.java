package 枚举;

/**
 * @author ：fc
 * @date ：Created in 2021/3/2 20:20
 * @description：
 * @version: $
 */
public enum  TestEnum {
    //默认继承 java.lang.enmu
    RED("red",1),BLACK("black",2),GREEN("green",3);
    public  String color;
    public  int ordinal;
    //默认是私有的构造方法
    //但是在类外通过反射是不可以拿到枚举对象的
    //用枚举实现单例模式是最棒的
    TestEnum(String color,int ordinal){
        this.color=color;
        this.ordinal=ordinal;
    }

    public static void main(String[] args) {

    }

    public static void main2(String[] args) {
        TestEnum[] testEnums=TestEnum.values();
//        for (枚举.TestEnum testEnum:testEnums) {
//            System.out.println(testEnum);
//        }
        for (int i = 0; i < testEnums.length; i++) {
            System.out.println(testEnums[i] + " " + testEnums[i].ordinal());
        }
        System.out.println(RED.compareTo(BLACK));
    }


    public static void main1(String[] args) {
        TestEnum testEnum=TestEnum.BLACK;
        switch (testEnum) {
            case RED:
                System.out.println("red");
                break;
            case BLACK:
                System.out.println("black");
                break;

            case GREEN:
                System.out.println("black");
                break;
            default:
                break;
        }

    }
}
