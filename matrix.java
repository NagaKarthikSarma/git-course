import java.util.Scanner;
public class matrix {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();

        int[][] a= new int[num][num];
        for(int i = 0;i<num;i++){
            for (int j=0;j<num;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println(a[0][1]);
        sc.close();
    }
}
