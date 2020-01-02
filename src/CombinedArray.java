import java.util.Scanner;

public class CombinedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5],
                array2 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Please insert element " + i + " of array1 :");
            array1[i] = scanner.nextInt();
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Please insert element " + i + " of array2 :");
            array2[i] = scanner.nextInt();
        }

        int[] newArray = new int[array1.length + array2.length];
        int countElement = 0;
       // duyet mang 1 de them
        for (int item : array1) {
            newArray[countElement] = item;
            countElement++;
        }
        // duyet mang 2 de them
        for (int value : array2) {
            newArray[countElement] = value;
            countElement++;
        }
System.out.println("this is new array: ");
        for (int value: newArray){
            System.out.println(value);

        }

    }
}

