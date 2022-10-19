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



    

    public static void main(String[] args) {
        int[] array = {4, 8, 3, 9, 4, 2, 1, 7, 3, 8, 4, 4};
        
        int a = 4, b = 2, c = 3, d = 5;
        System.out.println("Maximum of " + a + " " + b + " " + c + " " + d + " is " + max(a, b, c, d));
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nMinimum: " + min(array));

        System.out.println("Greater then first is: " + greatersThenFirst(array));
        System.out.println("The second minimum is: " + secondMin(array));
        countOfRepeats(array);



    }
}
