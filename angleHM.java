public class angleHM {
    public void angleHtoM(int H,int M){
        int a=H*60;
        int b=M;
    double hour=((a+b)*(0.5));
  
    int min=(int)(b*6);
    
    System.out.println((int)(360-(hour-min)));
    
    }
     public void angleMtoH(int H,int M){
        int a=H*60;
        int b=M;
    double hour=((a+b)*(0.5));
    
    int min=(int)(b*6);
    
    System.out.println((int)(hour-min));
    
    }
    public static void main(String[] args){
angleHM hm=new angleHM();
hm.angleHtoM(9, 0);
hm.angleMtoH(9, 0);
    }
}
