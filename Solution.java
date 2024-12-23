import java.util.Scanner;
public class Solution {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        
        int size = scanner.nextInt();
        
        int[] arr = new int[size];

        int count=0;

       
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();

        }
        for (int j=2;j<size;j++){
            if ((arr[j] != arr[0] && arr[j] != arr[1])) {
            count=count+1;
            }
        }
    
     scanner.close();
    System.out.println(count);
    }
    }
    

