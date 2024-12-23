import java.util.Scanner;
public class hi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        int a[] = new int[num];
        a[0]=1;
        a[1]=1;
        a[2]=2;
        a[3]=3;
        for(int i=4;i<num;i++){
            if(i%2==0){
            
             a[i]=a[i-2]*2;
            }
            else{
              
             a[i]=a[i-2]*3;  
            }
        }
        
        System.out.println(a[num-1]);
        sc.close();
        
    }
}
