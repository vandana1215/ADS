public class Recusrion2{
    public static void PermutaStr(String s, String result){
        if(s.length()==0){
            System.out.println(result);
            return;
        }
        for(int i=0;i<s.length();i++){
            char currentChar=s.charAt(i);
            String leftov=s.substring(0,i)+s.substring(i+1);
            PermutaStr(leftov,result+currentChar);
        }
    }
    public static void main(String[] args){
        String s="pqr";
    //    System.out.println(s);
        PermutaStr(s,"");
    }
}