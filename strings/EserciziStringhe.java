public class EserciziStringhe {

    public static void main (String [] args) {

        String s="annna";
        boolean x = isPalindrome (s);
        //char c= s.charAt (1);
        //System.out.println(c);
    }
    //scrivere una funzione che riceva in input una stringa e ritorni true se la stringa è palindrome, false altrimenti
    public static boolean isPalindrome (String s){
        int limit= s.length()/2;
        
        for(int i=0; i<limit; i++){
            int pos2=s.length()-1-i;
            if(s.charAt(i)!=s.charAt(pos2)){
                return false
            }
        }

        return true;

    }
    public static boolean isPalindrome2 (String s){
        s=s.toLowerCase();
        for (int i=0, j=s.length()-1; i<j; i++, j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
}