import java.util.Scanner;

class Array {
    int[] combine(int[] a, int[] b) {
        int[] arr = new int[a.length + b.length];
        int i;
        for (i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        for (int j = 0; j < b.length; j++, i++) {
            arr[i] = b[j];
        }
        return arr;
    }

    int[] union(int[] a, int[] b) {
        int arr[] = new int[a.length + b.length];
        int i = 0;
        int flag = 0;
        for (i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            flag = 0;
            for (int k = 0; k < arr.length; k++) {
                if (b[j] == arr[k]) {
                    flag = 1;
                    break;
                }
            }
            if (flag != 1) {
                arr[i] = b[j];
            }
        }
        return sort(arr);
    }

    int[] intersect(int[] a, int[] b) {
        int arr[] = new int[a.length + b.length];
        int i = 0, k;
        int flag = 0;
        for (i = 0, k = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    arr[k] = a[i];
                    k++;
                }
            }
        }
        return sort(arr);
    }

    int[] subtract(int[] a, int[] b) {
        int arr[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            int flag = 0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    flag = 1;
                }
            }
            if (flag != 1) {
                arr[i] = a[i];
            }
        }
        return sort(arr);
    }

    int[] xor(int[] a, int[] b) {
        return combine(subtract(a, b), subtract(b, a));
    }

    int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j + 1 < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0)
                System.out.print(a[i] + " ");
        }
    }
}

class Prac8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m;
        System.out.println("Enter the size of two arrays :");
        n = scan.nextInt();
        m = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        System.out.println("\nEnter the values of the array1 :");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("\nEnter the values of the array2 :");
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }
        Array a1 = new Array();
        System.out.println("\nAfter combining the two arrays :");
        a1.display(a1.combine(a, b));
        System.out.println("\n\nAfter performing union of the two arrays :");
        a1.display(a1.union(a, b));
        System.out.println("\n\nAfter intersecting the two arrays :");
        a1.display(a1.intersect(a, b));
        System.out.println("\n\nAfter subtracting the two arrays :");
        a1.display(a1.subtract(a, b));
        System.out.println("\n\nAfter performing xor on the two arrays :");
        a1.display(a1.xor(a, b));

        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}
