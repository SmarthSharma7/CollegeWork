
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        int[] arr = null;
        int choice, size = 0;
        System.out.println("\nMenu:");
        System.out.println("1. Create array");
        System.out.println("2. Display array");
        System.out.println("3. Insert element");
        System.out.println("4. Delete element");
        System.out.println("5. Search element");
        System.out.println("6. Exit");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Enter choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter size of the array : ");
                    size = sc.nextInt();
                    arr = createArray(size);
                    System.out.println("Array created");
                    break;

                case 2:
                    if (arr == null) {
                        System.out.println("Array is empty");
                        break;
                    }
                    displayArray(arr, size);
                    break;

                case 3:
                    if (arr == null) {
                        System.out.println("Array is empty");
                        break;
                    }
                    int element;
                    System.out.println("Enter element : ");
                    element = sc.nextInt();
                    int index;
                    System.out.println("Enter index : ");
                    index = sc.nextInt();
                    arr = insertElement(arr, element, index);
                    size++;
                    break;

                case 4:
                    if (arr == null) {
                        System.out.println("Array is empty");
                        break;
                    }
                    int indexx;
                    System.out.println("Enter index : ");
                    indexx = sc.nextInt();
                    deleteElement(arr, indexx);
                    size--;
                    break;

                case 5:
                    if (arr == null) {
                        System.out.println("Array is empty");
                        break;
                    }
                    int elementx;
                    System.out.println("Enter element you want to search : ");
                    elementx = sc.nextInt();
                    linearSearch(arr, elementx);
                    break;

                case 6:
                    System.out.println("Exiting program");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }

    }

    static int[] createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + i + "th element : ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    static void displayArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) System.out.print(arr[i] + ", ");
    }

    static int[] insertElement(int[] arr, int element, int index) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        for (int i = arr.length - 1; i >= index; i--) {
            newArr[i + 1] = newArr[i];
        }
        newArr[index] = element;

        return newArr;
    }

    static void deleteElement(int[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;
    }

    static void linearSearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

}