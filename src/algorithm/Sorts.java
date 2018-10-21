/**
 * 
 */
package algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * @author zhang
 *
 */
public class Sorts {

    public static void main(String[] args) {
        // �����������
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        printArr(arr);
        bubbleSort(Arrays.copyOf(arr, arr.length));
        insertionSort(Arrays.copyOf(arr, arr.length));
    }

    private static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int data = arr[i];
            int j = i - 1;
            for(; j >= 0; j--){
                if(data < arr[j]){
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = data;
        }
        System.out.println("������������");
        printArr(arr);

    }

    private static void bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            int temp = -1;
            for (int i = 0; i < arr.length - j; i++) {
                if (i == 0) {
                    // ��һ��������
                    continue;
                }
                if (arr[i - 1] > arr[i]) {
                    temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
//            System.out.println(String.format("��%d�������", j));
//            printArr(arr);
        }

        System.out.println("ð����������");
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        System.out.println("��ӡ����:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print("\t");
        }
        System.out.println("\n");
    }
}
