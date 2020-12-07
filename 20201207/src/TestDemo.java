/**
 * @author ：fc
 * @date ：Created in 2020/12/7 15:35
 * @description：
 * @version: $
 */
public class TestDemo {
    //递归求 N 的阶乘
    public static int fac(int n){
        if (n==1){
            return 1;
        }
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fac(5));
    }




    //递归求 1 + 2 + 3 + ... + 10
    public static int sumAdd(int n){
        if (n==1){
            return 1;
        }
        return n+sumAdd(n-1);
    }
    public static void main14(String[] args) {
        System.out.println(sumAdd(10));
    }



    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
    public static void print(int n){
        if (n>9){
            print(n/10);
        }
        System.out.print(n%10+" ");
    }
    public static void main13(String[] args) {
        print(1234);
    }



    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int addSum(int n){
        if (n<10){
            return n;
        }
       return n%10+addSum(n/10);
    }
    public static void main12(String[] args) {
        System.out.println(addSum(123));
    }



    //递归求斐波那契数列的第 N 项
    public  static int fib1(int n){
        if (n==1){
            return 1;
        }
        if (n==2){
            return 1;
        }
        return fib1(n-1)+fib1(n-2);
    }

    public static void main11(String[] args) {
        int ret=fib1(5);
        System.out.println(ret);
    }



    //递归求解汉诺塔问题
    public static void move(char pos1,char pos2){
        System.out.print(pos1+"->"+pos2+" ");
    }
    public static void hanoi(int n,char pos1,char pos2,char pos3){
        if(n==1){
           move(pos1,pos3);
        }else {
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }

    }
    public static void main10(String[] args) {
        hanoi(3,'A','B','C');
    }



    //青蛙跳台阶问题
    public static long frogJump(int n ){
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        return frogJump(n-1)+frogJump(n-2);
    }

    public static void main9(String[] args) {
        System.out.println(frogJump(5));
    }



    //在同一个类中,分别定义求两个整数求和的方法 和 三个小数之和的方法。 并执行代码，求出结果
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b,double c){
        return a+b+c;
    }

    public static void main8(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1.0,2.0,3.0));
    }


    //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的最大值
    public static int max(int a,int b){
        return a>b?a:b;
    }
    public static double max(double a,double b){
        return a>b?a:b;
    }
    public static double max(double a,double b,int c){
        return max(max(a,b),c);

    }
    public static void main7(String[] args) {
        System.out.println(max(9.0, 1.0, 20));
    }



    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public static int max2(int a,int b){
        return a>b?a:b;
    }
    public static int max3(int a,int b,int c){
        return max2(a,b)>c?max2(a,b):c;
    }

    public static void main6(String[] args) {
        System.out.println(max2(1,2));
        System.out.println(max3(1,2,3));
    }



    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序
    public static int[] swap(int[]  nums) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]%2==1){
                i++;
            }else if(nums[j]%2==0){
                j--;
            } else{
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
        return nums;

    }

    public static void main5(String[] args) {
        int[] nums=new int[]{1,2,3,4,5,6};
        int[] a=swap(nums);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }




    //求 N 的阶乘
    public static int fac1(int n){
        int num=1;
        for (int i = 1; i <=n ; i++) {
            num*=i;
        }
        return num;
    }

    public static void main4(String[] args) {
        System.out.println(fac1(5));
    }



    //求1！+2！+3！+4！+........+n!的和
    public static int fac2(int n){
        int num=1;
        for (int i = 1; i <=n ; i++) {
            num*=i;
        }
        return num;
    }

    public static int add(int n){
        int num=0;
        for (int i = 1; i <=n ; i++) {
            num+=fac2(i);
        }
        return num;
    }

    public static void main3(String[] args) {
        System.out.println(add(3));
    }



    //求斐波那契数列的第n项。(迭代实现)
    public  static int fib(int n){
        int f1=1;
        int f2=1;
        int f3=1;
        for (int i = 3; i <=n; i++) {
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }

    public static void main2(String[] args) {
        int ret=fib(5);
        System.out.println(ret);
    }



    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
    public static void main1(String[] args) {
        int[] arr={1,1,2,3,3,4,5,5 };
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count==1){
                System.out.println(arr[i]);
            }
        }
        }
    }

