import java.util.Scanner;
public class number2 {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num=sc.nextInt();
int[] arr=  new int[num];
arr[0]=0;
arr[1]=0;

for (int i =2;i<num;i++){
    if (i%2==0){
    arr[i]=arr[i-2]+2;
    }
    else{
        arr[i]=arr[i-2]+1;
    }
}

    System.out.println(arr[num-1]);
    sc.close();

    }
}
