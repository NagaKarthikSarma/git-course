import java.util.Scanner;
public class addtwo{
    public static void addict(Float a, Float b){
System.out.println(a+b);
}
    public static void main(String[] args){

    Scanner sc= new Scanner(System.in);
    float a = sc.nextFloat();
    float b= sc.nextFloat();
sc.close();
addict(a,b);



    }
}