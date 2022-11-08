public class EseciziStringhe {
    public static void main(String [] args) {
        String s="Anna";
        char c = s.charAt(1);
        System.out.println(c);
        boolean result = checkPal(s);
        System.out.println(result);
        boolean result2 = checkPal2(s);
        System.out.println(result2);
        int[] array = new int [] {2,3,4,4,5,6,2,2,2};
        int mode = findMode(array);
        System.out.println(mode);
    }
    public static boolean checkPal(String target)
    {
        target = target.toLowerCase();
        int limit = target.length()/2;
        for(int i=0; i < limit; i++)
        {
            if(target.charAt(i) != target.charAt(target.length()-i-1))
                return false;
        }
        return true;
    }
    public static boolean checkPal2(String target)
    {
        target = target.toLowerCase();
        for(int i=0, j=target.length()-1; i < j; i++,j--)
        {
            if(target.charAt(i)!=target.charAt(j))
                return false;
        }
        return true;
    }
    public static int findMode(int[] array)
    {
        int[] max = new int [2];
        for(int i=0; i < array.length; i++)
        {
            int counter = 0;
            for(int j=0; j < array.length; j++)
            {
                if(array[i] == array[j])
                {
                    counter++;
                }
            }
            if(counter > max[1])
            {
                max[0] = array[i];
                max[1] = counter;
            }
        }
        return max[0];
    }
}

