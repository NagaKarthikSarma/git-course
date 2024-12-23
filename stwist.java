import java.util.Scanner;
public class stwist {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String fir=sc.next(),sec=sc.next(),thi=sc.next();
        String s1="";
        String s2="";
        String s3="";
        sc.close();
        
        int i=0;
        char c;
        for(i=0;i<fir.length();i++){
    
            c=fir.charAt(i);
        if ( c=='a' ||(c=='e')|| (c=='i')||(c=='o')||(c=='u') ||(c=='A') ||(c=='E')|| (c=='I')||(c=='O')||(c=='U') )
        
        {
           s1=s1+'%'; 
        }
        else{
            s1=s1+c;
        }
    }
    for (i=0;i<sec.length();i++){
          c=sec.charAt(i);
          if((c>='a' && c<='z') || (c<='A' && c<'Z')){
        if ( c!='a' &&(c!='e') && (c!='i')&&(c!='o')&&(c!='u') && (c!='A') && (c!='E')&& (c!='I')&&(c!='O')&&(c!='U') )
       /*
       if ( c=='a' ||(c=='e')|| (c=='i')||(c=='o')||(c=='u') ||(c=='A') ||(c=='E')|| (c=='I')||(c=='O')||(c=='U') )
        
        {
           s1=s1+c; 
        }
        else{
            s1=s1+'3';  // we can use || operator for better working
        }
        */ 
        {
           s1=s1+'#'; 
        }
        else{
            s1=s1+c;
        }
    }
}
   s3= thi.toUpperCase();
System.out.println(s1+s2+s3);
sc.close();
    }

    }

