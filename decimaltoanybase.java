import java.util.*;
public class decimaltoanybase {

    public static String BaseTentoN( String s,int num){
        int n=num;
        int conv= Integer.parseInt(s);
        String  str[]=new String[n-10];
        for(int i=0;i<str.length;i++){
            int c=65+i;
            char x=(char)c;
            String st= Character.toString(x);
            str[i]=st;


        }
        StringBuilder bastobas = new StringBuilder();
        while (conv > 0) {
            int remainder = conv % n;
            if (remainder>=10){
            bastobas.append(str[remainder-10]);
            }
            
            else{
            bastobas.append(remainder);
            
        }
            conv /= n;
        }
        
        return bastobas.reverse().toString();

    }
    public static void main(String[] args){
Scanner sc= new Scanner(System.in);
String input=sc.next();
sc.close();

System.out.println(BaseTentoN(input,36));
    }
}
