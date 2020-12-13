import java.util.Arrays;

/**
 * @author ：fc
 * @date ：Created in 2020/12/13 19:28
 * @description：
 * @version: $
 */
public class TestDemo {
    //实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
    public static void toString(int[] arr){

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i!=arr.length-1){
                System.out.print(arr[i]+", ");
            }else {
                System.out.print(arr[i]+"]");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        toString(arr);
    }



    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
    public static int[] copyof(int[] arr,int len){
        if (arr==null){
            return null;
        }
        int[] ret=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i]=arr[i];
        }
        return ret;
    }
    public static void main4(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] arr2=copyof(arr, arr.length);
        System.out.println(Arrays.toString(arr2));
    }



    //给定一个有序整型数组, 实现二分查找
    public static int binarySearch(int[] arr,int key){
        int left=0;
        int right=arr.length-1;
        while (left<right){
            int mid=(left+right)/2;
            if(arr[mid]<key){
                left=mid+1;
            }else if (arr[mid]>key){
                right=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main3(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(binarySearch(arr, 3));
    }



    //给定一个整型数组, 判定数组是否有序（递增）
    public static boolean isSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]> arr[i+1]){
                return false;
            }
        }
        return true;

    }
    public static void main2(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(isSort(arr));
        int[] arr1={3,1,5,2,7};
        System.out.println(isSort(arr1));
    }



    //给定一个整型数组, 实现冒泡排序(升序排序)
    public  static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
    public static void main1(String[] args) {
        int[] arr={1,5,3,2,8,46,23};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
