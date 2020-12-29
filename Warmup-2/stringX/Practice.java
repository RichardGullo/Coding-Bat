package practice;

public class Practice 
{
    
    public static void main(String[] args)
    {
        int[] array1 = {1,9};
        int[] array2 = {1,2,3,9};
        
        System.out.println(arrayFront9(array1));
        System.out.println(arrayFront9(array2));
        
    }
    
    public static boolean arrayFront9(int[]array)
    {
        int end = array.length;
        
        if(end > 4)
            end = 4;
        
        for(int i = 0; i < end; i++)
        {
            if(array[i] == 9)
               return true;
        }
        
        return false;
    }
}


