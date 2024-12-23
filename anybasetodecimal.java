import java.util.*;

public class anybasetodecimal {
    
    public static String basetodec(String str,int base){
        int z=0;
        int x=0;
        int mul=0;
        StringBuffer sb= new StringBuffer();
        for (int i=str.length()-1;i>=0;i--){
            int b=64+base-10;
            char c= (char)b;
            if (str.charAt(i)>='A'&& str.charAt(i)<=c){
                 x= ( 10+((int)(str.charAt(i))-65));
                
                 
                double y=(x *(Math.pow(base,mul)));
                 z=z+(int)y;
                 mul=mul+1;
    
                

            }
            else
            {
                String a= ""+str.charAt(i);
                x=Integer.parseInt(a);
                
                double y=(x *(Math.pow(base,mul)));
                System.out.println(y);
                z=z+(int)y;
                mul=mul+1;
                
            }
        }
        sb.append(z);

        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String  abc=sc.next();
        sc.close();
        System.out.println(basetodec(abc,16));
    }
}
