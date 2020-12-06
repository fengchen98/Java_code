import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
/**
 * @author ：fc
 * @date ：Created in 2020/12/5 19:35
 * @description：
 * @version: $
 */
public class TestDemo {
    //打印 1 - 100 之间所有的素数
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i==1||i==2){
                ;
            }
            else{
                int j=0;
                for ( j = 2; j < i; j++) {
                    if (i%j==0){
                        break;
                    }
                }
                if (j<i){
                    ;
                }else {
                    System.out.print(i+" ");
                }
            }
        }
    }



    //判定一个数字是否是素数
    public static void main16(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if(num==1||num==2){
            System.out.println("不是素数");
        }else{
            int i=0;
            for ( i = 2; i < num; i++) {
                if (num%i==0){
                    break;
                }
            }
            if (i<num){
                System.out.println("不是素数");
            }else {
                System.out.println("是素数");
            }
        }

    }



    //输出n*n的乘法口诀表，n由用户输入。
    public static void main15(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ "*" + i + "="+i*j+" ");
            }
            System.out.println();
        }
    }



    //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
    public static void main14(String[] args) {
        int ret=0;
        Scanner scanner=new Scanner(System.in);
        ret=scanner.nextInt();
        int temp=ret;
        int num=0;
        if (temp<10){
            num=1;
        }else{
            while (temp!=0){
                temp/=10;
                num++;
            }
        }

        String[] str=new String[10];
        for (int i = 0; i < num; i++) {
            str[i]=String.valueOf(ret%10);
            ret/=10;
        }
        for (int i = num-1; i >=0 ; i--) {
            System.out.println(str[i]);
        }
    }



    //编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
    public static void main13(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=3;
        while (num!=0){
            System.out.print("请输入密码：");
            String str=scanner.nextLine();
            if(str.equals("123456")){
                System.out.println("登录成功");
                break;
            }else {
                --num;
                System.out.println("输入有误，你还有"+num+"次机会");
            }
        }
    }



    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
    public static void main12(String[] args) {
        int num=7;
        //获得奇数位
        System.out.println("奇数位：");
        for (int i = 31; i >= 1; i-=2) {
            System.out.print(((num>>i)&1)+" ");
        }
        System.out.println();
        System.out.println("偶数位：");
        for (int i = 30; i >= 0; i-=2) {
            System.out.print(((num>>i)&1)+" ");
        }
    }





    //求一个整数，在内存当中存储时，二进制1的个数。
    public static void main11(String[] args) {
        int count=0;
        int num=15;
        for (int i = 0; i < 32; i++) {
            if((num&1)==1){
                count++;
            }
            num=num>>1;
        }
        System.out.println(count);
    }



    //求两个正整数的最大公约数
    public static void main10(String[] args) {
        int i=10;
        int j=15;
        int min=i>j?j:i;
        while (min>0){
            if(i%min==0&&j%min==0){
                break;
            }
            min--;
        }
        System.out.println(min);
    }



    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
    public static void main9(String[] args) {

        int flag=1;
        double sum=0.0;
        for (int i = 1; i <= 100; i++) {
            sum+=1.0/i*flag;
            flag=-flag;
        }
        System.out.println(sum);
    }



    //水仙花数
    public static void main8(String[] args) {
        int num ;
        for (num = 0; num < 1000; num++) {
            int len = 0;
            int tmp=num;
            if (tmp < 10) {
                len = 1;
            } else {
                while (tmp != 0) {
                    tmp /= 10;
                    len++;
                }
            }
               int sum=0;
               tmp=num;
                while (tmp != 0) {
                    sum += Math.pow(tmp % 10, len);
                    tmp /= 10;
                }

                if (sum == num) {
                    System.out.print(num + " ");
                }
            }
        }




    //猜数字游戏
    public static void main7(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int randNum=random.nextInt(100);
        while (true){
            int num=scanner.nextInt();
            if (num<randNum){
                System.out.println("猜小了");
            }else if (num>randNum){
                System.out.println("猜大了");
            }else {
                System.out.println("猜对了");
                break;
            }
        }
    }



    //打印 X 图形
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            int i, j;
            for (i = 0; i < num; i++) {
                for (j = 0; j < num; j++) {
                    if (i == j || i + j == num - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }


    //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
    public static void main5(String[] args) {
        int age=0;
        Scanner scanner=new Scanner(System.in);
        age=scanner.nextInt();
        if (age<18){
            System.out.println("少年");
        }else if(age<=28){
            System.out.println("青年");
        }else if (age<=55){
            System.out.println("中年");
        }else {
            System.out.println("老年");
        }
    }


    //给定一个数字，判定一个数字是否是素数
    public static void main4(String[] args) {
        int num=0;
        int i;
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();
        if (num<2){
            System.out.println("不是素数");
        }else {
            for (i = 2; i <num ; i++) {
                if (num%i==0){
                    break;
                }
            }
            if (i<num){
                System.out.println("不是素数");
            }else{
                System.out.println("是素数");
            }
        }

    }



    //打印 1 - 100 之间所有的素数
    public static void main3(String[] args) {
        for (int i = 2; i <=100 ; i++) {
            boolean flag=true;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.print(i+" ");
            }
        }
    }



    //输出 1000 - 2000 之间所有的闰年
    public static void main2(String[] args) {
        for (int year = 1000; year <2000 ; year++) {
            if((year%4==0&&year%100!=0)||year%400==0)
            {
                System.out.print(year+" ");
            }
        }
    }



    //编写程序数一下 1到 100 的所有整数中出现多少个数字9
    public static void main1(String[] args) {
        int i=1;
        int num=0;
        for (i = 0; i <=100 ; i++) {
            if(i/10==9){
                num++;
            }
            if(i%10==9){
                num++;
            }
        }
        System.out.println(num);
    }
}
