
import java.util.Scanner;

class Sorting {
    <E> E[] sort(E arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (((Comparable<E>) arr[j]).compareTo(arr[smallest]) <= 0) {
                    smallest = j;
                    if (i != j) {
                        E temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return arr;
    }

    <E> void display(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class mprac41 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Sorting s = new Sorting();

        System.out.println("Enter the size of the array : ");
        int n = scnr.nextInt();
        Integer arr[] = new Integer[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scnr.nextInt();
        }

        System.out.println("\nThe elements you entered are: ");
        s.display(arr);

        System.out.println("\nElements after sorting:");
        s.display(s.sort(arr));

        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}
