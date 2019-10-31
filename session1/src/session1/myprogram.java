package session1;


public class myprogram {

	public static void main(String[] args) {
	/*	for(int i=0;i<=5;i++)
		{
			
			System.out.print("i is:" +i);
			System.out.print("  "); */
		
	/*	char a = 'R';
		char b = 'A';
		char c = 'M';
		char d = 'A';
		char e = 'N';
		{
			Syst[em.out.print(a);
			System.out.println(b+"   ");
			System.out.print(c);
			System.out.print(d);
			System.out.print(e);
		}*/
	
		/*int[] arr = new int[]{4, 2, 3, 6, 5,1};
		int min = arr[0];
		int max= arr[0];
		int minvalue= 0;
		int maxvalue= 0;
		
		
		for(int i=1; i<arr.length; i++)
			 
			
		{
			
		
			if(arr[i]< min){
				min= arr[i];
				minvalue= i;
				
			}
			{
				if(arr[i]> max)
					max = arr[i];
				    maxvalue= i;
				}
			}
		
		System.out.print("Minimum number is:  "+min);
		System.out.println();
        System.out.println("Maximum number is:  "+max);
        System.out.println();
        
		for(int elm : arr){
			System.out.print(elm+"  ");
		}
         System.out.println();
         arr[minvalue]=max;
         arr[maxvalue] = min;
                 for(int elm : arr){
 			System.out.print(elm+"  ");
 		}
       
   
			/*}
			{
				if(arr[i]> max){
					max= arr[i];
				}
				{
					System.out.println();
			System.out.println("Maximum  number is:  "+max);
			
				}
				
								}
			System.out.println("++++++++++++++++++++++++++");
			System.out.println();
			for(int m=0; m < arr.length; m++ )
			{
				System.out.println(arr[m]);
				
			}
			
			int temp = arr[5];
			arr[5]=arr[3];
			arr[3]= temp;
			for(int j=0; j < arr.length; j++ )
			{
				System.out.println(arr[j]);
			}
			
			
			
		}
		
		}*/
int[] arr = {64, 25, 5, 12, 22, 120, 11, 200, 3};
		
		// Find the minimum Element in Array arr
		
		// Let minimum number be arr of 0
		int min = arr[0]; 		// min contains 64
		
		int maxIdx = 0;		 	// max contains 0
		
		for(int i=0;i<arr.length;i++){
			
			// 1st Way -> Comparing Values
			if(arr[i] < min){
				min = arr[i];
			}
			
			
			
		}
		
		System.out.println("Minimum Element is "+min);
		System.out.println("Maximum Element is "+arr[maxIdx]);
              /*   int[] arr = {64, 25, 500, 12, 22, 120, 11, 200, 3};
         		
         		// Swap Element at 3(12) with Element at 5(120)
         		// {64, 25, 5, 120, 22, 12, 11, 200, 3};
         		System.out.println("==Before Swap==");
         		for(int elm : arr){
         			System.out.print(elm+"  ");
         		}
         		System.out.println();
         		
         		int temp = arr[3]; // temp -> 12
         		arr[3] = arr[5];   // arr[3] -> 120
         		arr[5] = temp;	   // arr[5] -> 12
         		
         		System.out.println();
         		
         		System.out.println("==After Swap==");
         		for(int elm : arr){
         			System.out.print(elm+"  ");*/
         		
	
		}
	}
		
	
	



