import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sampleJava 
{

    public static void main(String[] args) 
    {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        
        //solves the evenly divisible list problem
        List<Integer> list1 = Arrays.asList(1, 2, 15, 24, 30, 5, 30, 60, 2, 8, 30, 76, 41, 52, 11, 12);
        List<Integer> list2 = Arrays.asList(1, 2, 15, 24, 16, 5, 104, 5, 2, 8, 89, 6, 41, 52, 10, 12);
        List<Integer> evenlyDivisibleList = EvenlyDivisible(list1, list2);
        System.out.println(Arrays.toString(evenlyDivisibleList.toArray()));
    }
    
    //returns the evenly divisible list
    public static List<Integer> EvenlyDivisible(List<Integer> list1, List<Integer> list2)
    {
    	List<Integer> evenlyDivisibleList = new ArrayList<Integer>();
    	int countOfEvenDivision = 0, i, halfOfList2 = (int)Math.ceil(list2.size()/2);
    	
    	for(int number : list1)
    	{
    		for(i = 0; i < list2.size(); ++i)
    		{
    			if(((double)number % list2.get(i)) == 0)
    			{    				
    				++countOfEvenDivision;
    			}
    		}
    		
    		if(countOfEvenDivision >= halfOfList2 && !evenlyDivisibleList.contains(number))
    		{
    			evenlyDivisibleList.add(number);
    		}
    		
    		countOfEvenDivision = 0;
    	} 
    	
    	return evenlyDivisibleList;
    }
}