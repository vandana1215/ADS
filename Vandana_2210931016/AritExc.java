public class AritExc{
    public static void main(String[] args){
        int a=59;
        int n;
        try{
            n=a/0;
            System.out.println("Ans:"+n);
        }catch(ArithmeticException e){
            System.out.println("Error");
        }
    }
}