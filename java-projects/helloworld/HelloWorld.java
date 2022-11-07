public class HelloWorld {
    public static void main (String [] args) {
        System.out.println("Hello World !");
        int myInt = 12;
        System.out.println(myInt);
        int mySecondInt = 16;
        int sum = myInt + mySecondInt;
        System.out.println(sum);
        double d1 = 9.5;
        float f1 = 3.5f;
        char c1 = 'a';
        String s1 = "a";
        boolean b1=true;
        int[] ages = new int [10];
        System.out.println(ages[0]);
        ages[1]=100;
        System.out.println(ages[1]);
        for (int i=0; i < 10; i++)
        {
            ages[i]=10*(i+1);
            System.out.println(ages[i]);
        }
        int temp = 0;
        for (int i=0; i < 10; i++)
        {
            if(temp < ages[i])
                temp = ages[i];
        }
        System.out.println("valore massimo array "+temp);
        int valMax = findMax(ages);
        System.out.println("valore massimo array con funzione "+valMax);
        int[] number = new int[]{5,4,12,6,44,33,71,23,101,0,-12,-45};
        int valMinEven = findMinEven(number);
        System.out.println("valore mminimo pari "+valMinEven);
    }
    public static int findMax(int[] nums) {
        if (nums.length == 0)
            return Integer.MIN_VALUE;
        int temp = 0;
        for (int i=0; i < nums.length; i++)
        {
            if(temp < nums[i])
                temp = nums[i];
        }
        return temp;
    }
    public static int findMinEven(int[] nums) {
        if (nums.length == 0)
            return Integer.MAX_VALUE;
        int temp = 0;
        for (int i=0; i < nums.length; i++)
        {
            if(temp > nums[i] && nums[i]%2 == 0)
                temp = nums[i];
        }
       return temp;
    }
    public static int findMinDisp(int[] nums) {
        if (nums.length == 0)
            return Integer.MAX_VALUE;
        int temp = 0;
        for (int i=0; i < nums.length; i++)
        {
            if(temp > nums[i] && nums[i]%2 != 0)
                temp = nums[i];
        }
       return temp;
    }
    public static int findNumber(int[] nums, int x) {
        if (nums.length == 0)
            return Integer.MAX_VALUE;
        for (int i=0; i < nums.length; i++)
        {
            if(x == nums[i])
                return i;
        }
        return -1;
    }
    public static boolean checkSumNumbers(int[] nums, int x) {
        if (nums.length == 0)
            return false;
        int temp = 0;
        for (int i=0; i < nums.length; i++)
            temp += nums[i];
        if(temp == x)
            return true;
        return false;
        //return sum == x;
    }
}