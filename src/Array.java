import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [] array;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = input.nextInt();
        array = new int[size];
        for (int i =0; i < size;i++){
            System.out.println("Enter the element of array: " + (i+1) + " : ");
             array[i] = input.nextInt();
        }
        for (int j = 0; j < size;j++){
            System.out.print(array[j] + "\t");
        }
        for (int k =0; k < size/2;k++){
            int temp =array[k];
            array[k] = array[array.length-1-k];
            array[array.length-1-k] = temp;
        }
        System.out.println("mang sau khi da dao nguoc");
        for(int l =0; l <size;l++){
            System.out.print(array[l] + "\t");
        }
    }
}
