import java.util.Scanner;
class Array{
    int[] createArray(Scanner sc){
        System.out.print("How much element want array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Element are : ");
        for(int i=0;i < n;i++){
            array[i] = sc.nextInt();
        }
        return array;
    }
    void sort(int[] arr){
        for(int i=0;i < arr.length-1;i++){
            for(int j = 0;j < arr.length - i - 1;j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                   arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    void display(int[] ar){
        for(int i: ar){
            System.out.print(i+" ");
        }
    }
}
public class Task29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Array obj = new Array();
        System.out.println("For first array. ");
        int[] array1 = obj.createArray(sc);
        System.out.println("For second array. ");
        int[] array2 = obj.createArray(sc);
        System.out.print("1st Shorted array: ");
        obj.sort(array1);
        obj.display(array1);
        System.out.print("\n2nd shorted array: ");
        obj.sort(array2);
        obj.display(array2);
        //merging array
        int[] marge = new int[array1.length +array2.length];
        int i=0, j=0, k=0;
        while(i < array1.length && j < array2.length){
            if(array1[i] < array2[j]){
                marge[k++] = array1[i++];
            }else{
                marge[k++] = array2[j++];
            }
        while(i < array1.length){
            marge[k++]=array1[i++];
        }
        while(j < array2.length){
            marge[k++] = array2[j++];
        }
        System.out.print("\nMarge sorted array: ");
        obj.display(marge);
        }
    }
}
