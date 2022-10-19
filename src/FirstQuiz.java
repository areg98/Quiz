import java.util.ArrayList;
import java.util.List;

public class FirstQuiz {

    public static void sort(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr.length; j++) {
                if (myArr[i] < myArr[j]) {
                    myArr[i] = myArr[i] + myArr[j];
                    myArr[j] = myArr[i] - myArr[j];
                    myArr[i] = myArr[i] - myArr[j];
                }
            }
        }
    }

    // 1.1.  Find the biggest number between four numbers.
    public static int max(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        else if (c > max) max = c;
        else if (d > max) max = d;
        return max;
    }

    //1.2.  Write a Java program to find smallest element of a given array
    public static int min(int[] arr) {
        int[] myArr = new int[arr.length];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = arr[i];
        }
        sort(myArr);
        return myArr[0];
    }

    //2.  Write a Java program to find second smallest element of a given array.
    public static int secondMin(int[] arr) {
        int[] myArr = new int[arr.length];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = arr[i];
        }
        sort(myArr);
        return myArr[1];
    }

    //3. Write a method that will count how many members of an array
    //are greater than the first member

    public static int greatersThenFirst(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[0]) count++;
        }
        return count;
    }

    //4.  Write a Java program to count how many time is the specific number is
    //repeating.

    public static void countOfRepeats(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(i > j && arr[i] == arr[j])
                    break;
                else if(arr[i] == arr[j]) count++;
            }
            if (count > 0) System.out.println(arr[i] + ": " + count);
        }
    }

    //Count the Arithmetic sequences in the Array of size at least 3
    //Given an array arr[] of size N, the task is to find the count of all arithmetic sequences in the array.

    public static boolean isArithmetic(List<Integer> list){
        int temp = list.get(1) - list.get(0);
        int count = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - list.get(i-1) == temp) count++;
        }
        return (count == list.size()-1)?true:false;
    }

    public static void arithmeticSequences(int[] arr){
        int count = 0;
        if (arr.length < 3) {
            System.out.println("Too small array");
            return;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println("Arithmetic sequences");
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 3+i; j <= list.size(); j++) {
                if(isArithmetic(list.subList(i,j))) {
                    count++;
                    for (int k = 0; k < list.subList(i,j).size(); k++) {
                        System.out.print(list.subList(i, j).get(k) + " ");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println("count: " + count);
    }

    

    public static void main(String[] args) {
        int[] array = {4, 8, 12, 3, 9, 4, 2, 1, 7, 3, 8, 4, 4};
        int[] array1 = {1,2,3,4};
        int[] array2 = {1, 3, 5, 6, 7, 8};
        int a = 4, b = 2, c = 3, d = 5;
        System.out.println("Maximum of " + a + " " + b + " " + c + " " + d + " is " + max(a, b, c, d));

        System.out.println("--------------------------");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nMinimum: " + min(array));

        System.out.println("Greater then first is: " + greatersThenFirst(array));
        System.out.println("The second minimum is: " + secondMin(array));
        countOfRepeats(array);

        System.out.println("--------------------------");

        arithmeticSequences(array1);

        System.out.println("--------------------------");
    }
}
