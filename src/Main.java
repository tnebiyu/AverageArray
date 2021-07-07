import java.util.Scanner;


import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      /*  int[] myIntArray = new int[10];
        //myIntArray[2] = 1;
      for (int i = 0; i < myIntArray.length; i++){
          myIntArray[i] = i * 10;
      }
       for (int i = 0; i<myIntArray.length; i++){
           System.out.println("Element " + i + "value is " + myIntArray[i]);
      printArray(myIntArray);
       }
*/
int[] myInteger = getInteger(5);
for (int i =0;i<myInteger.length;i++){
    System.out.println("Element " + i + "typed values is " + myInteger[i]);

}
        System.out.println("the average " + average(myInteger));

    }
    public static int[] getInteger(int number){
        System.out.println("enter " + number + " integer values .\r");
        int[] values = new int[number];

        for (int i = 0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }
        return values;

    }
    public static double average(int[] array){
        int sum = 0;
        for (int i = 0; i<array.length;i++){
            sum+=array[i];
        }
        return  (double)sum /(double)array.length;
    }
   /* public static void printArray(int[] array){
        for (int i = 0; i<array.length; i++){
            System.out.println("Element " + i + "value is " + array[i]);
        }
    }*/
}
