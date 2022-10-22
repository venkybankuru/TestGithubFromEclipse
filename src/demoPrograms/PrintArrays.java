package demoPrograms;

public class PrintArrays {
public static void main(String[] args) throws InterruptedException {
	
	/*int[] aa= {10,45,3,6,7,8};
	
	for(int hi:aa)
	{
		System.out.println(hi);
	}
	for(int i=0;i<aa.length;i++) {
		System.out.println(aa[i]);
	}
	int a = 10;
	int b= 0;
	try {
		
	
	int c = a/b;
	System.out.println(c);
	}catch(Exception e)
	{
		System.out.println(e);
	}
	
	System.out.println("hiii");
	
	System.out.println("sem");*/
	String str[] = {"java","selenium","cucumber","ava","elenium"};
	boolean flag = false;
	for(int i=0;i<str.length;i++)
	{
		for(int j=i+1;j<str.length;j++)
		{
			if(str[i]==str[j])
			{
				System.out.println("duplicate elements:"+str[i]);
				flag = true;
			}
		 
			
		}
	}if(flag==false)
	{
		System.out.println("duplicate element not found");
	}
	
	/*int[] arr =  {1, 2, 3, 4, 2, 7, 8, 8, 3};  
	String arr[] = {"java","selenium","cucumber","java"};
    
    System.out.println("Duplicate elements in given array: ");  
    //Searches for duplicate element  
    for(int i = 0; i < arr.length; i++) {  
        for(int j = i + 1; j < arr.length; j++) {  
            if(arr[i] == arr[j])  
                System.out.println(arr[j]);  
        }  
    } */ 
	
	
}
}
