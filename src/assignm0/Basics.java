package assignm0;

import java.util.ArrayList;

public class Basics {
	
	String[] twentyStrings = {"", "one", "two", "three", "four", "five", "six", "seven", "eight","nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen","sixteen", "seventeen", "eighteen", "nineteen","twenty"};
	String[] overTwenties = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",	"eighty", "ninety"};
	

	// Read System.out.println()
	public void printHelloWorld() {
		System.out.println("Hello world!");
		
	}

	public int getSum(int first, int second) {
		return first+second;
		
	}

	// Read if-else construct
	public int getLargerNumber(int first, int second) {
		if(first<second)
		{
			return second;
		}
		else
		{
			return first;
		}
		
	}

	// Read nested if-else construct
	public int largestNumber(int first, int second, int third) {
		if(first>second && first>third)
		{
			return first;
		}
		else if(second >first && second >third)
		{
			return second;
		}
		else
		{
			return third;
		}
		
	}

	// Go through arrays in java and simple for loop and enhanced for loop
	public void printArray(int array[]) {
		for(int i =0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
	}

	public int getSumOfArrayElements(int array[], int n) {
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=array[i];
		}
		return sum;
	}

	public boolean isPrime(int number) {
		if(number ==0 || number ==1)
		{
			return false;
		}
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
		
	}

	// Say, first = 5 and second = 10, this function should print "5 6 7 8 9 10"
	public int[] getArrayOfRangeOfNumbers(int first, int second) {
		int n = second-first+1;
		int[] array = new int[n];
		int k=0;
		for(int i=first;i<=second;i++)
		{
			array[k++]=i;
		}
		return array;
		
	}

	public int getFactorial(int n) {
		int result=1;
		for(int i=2;i<=n;i++)
		{
			result=result*i;
		}
		return result;
		
	}

	public int getFactorialWithoutLoop(int n) {
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*getFactorial(n-1);
		}
		
	}

	// 1234 should give 4321
	public int reverseDigits(int n) {
		int digit=0;
		while(n!=0)
		{
			int rem = n%10;
			digit = digit*10+rem;
			n=n/10;
		}
		return digit;
		
	}

	// In between 1 to 10, the prime numbers are 1, 2, 3, 5, 7
	public int[] primeNumbersInARange(int lowerLimit, int upperLimit) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int k = 0;
		//System.out.println("check 1");

		for (int i = lowerLimit; i <= upperLimit; i++) {
			int count = 0;
			//System.out.println("check 2");
			 for(int j=2;j*j<=i;j++){
			//for (int j = 2; j < i; j++) {
				//System.out.println("check 3");
				if (i % j == 0) {
					//System.out.println("check 4");
					count++;
				}

			}
			if (count == 0 && i != 0 && i != 1) {
				arrayList.add(i);
				//System.out.println("check 5");
			}
		}
		int n = arrayList.size();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = (int) arrayList.get(i);
			//System.out.println("check 6");
		}
		return array;

	}

	public int findNumberOfOccurences(int[] array, int n) {
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==n)
			{
				count++;
			}
		}
		return count;

		
	}

	public static void main(String args[]) {
		new Basics().printTrianglePointingRight(5);
		

	}

	public int findFirstOccurence(int[] array, int number) {
		int flag=-1;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==number)
			{
				return i;
			}
		}
		return flag;

		
	}

	public void printRhombus(int size) {
		
	}

	public String getNumberLessThanTenInWords(int number) {
		String[] array = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
		return array[number];
					
		
	}

	public String getNumberInWords(int number) {
		
		return thousands(number+"");
		
	}
	public String twenties(int number)
	{
		return twentyStrings[number];
	}
	public String tens(String number)
	{
		int n = Integer.parseInt(number);
		if(n>20)
		{
			int first =n%10;
			n=n/10;
			int second = n%100;
			//System.out.println(first+"  --  "+second);
			return overTwenties[second]+" "+twenties(first);		
		}
		else
		{
		     return twenties(n);
		}
	}
	public String hundreds(String number)
	{
		int n = Integer.parseInt(number);
		int size = number.length();		
		if(n>100)
		{
			String firstpart = number.substring(0,size-2);
			String secondpart = number.substring(size-2);
			//System.out.println("first part "+firstpart+"\n second part "+secondpart);
			return tens(firstpart)+" hundred and "+tens(secondpart);		
		}
		else
		{
		     return tens(number);
		}
	}
	
	public String thousands(String number)
	{
		int n = Integer.parseInt(number);
		int size = number.length();		
		if(n>1000)
		{
			String firstpart = number.substring(0,size-3);
			String secondpart = number.substring(size-3);
			//System.out.println("first part "+firstpart+"\n second part "+secondpart);
			String Stringthousand =" thousand ";
			if(Integer.parseInt(secondpart)<10)
			{
				Stringthousand = " thousand and ";
			}
			return hundreds(firstpart)+Stringthousand+hundreds(secondpart);		
		}
		else
		{
		     return hundreds(number);
		}
	}
	
	
   //end of getNumberInWords  sub Method
	public void printTrianglePointingRight(int size) {
		
		for(int i =0;i<size;i++)
		{
			for(int j =0;j<=i;j++)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
		
	}
}