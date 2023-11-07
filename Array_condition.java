package project;

public class Array_condition {
	public static void main(String[] args) {
		

		int sum[]=new int[5];
		int arr[]= {49,36,8,10,12};
		
	    for(int i=0;i<arr.length;i++) {
	    int sqr=(int)Math.sqrt(arr[i]);
	    
	    if(arr[i]==sqr*sqr) {
	    sum[i]+=5;
	    }
	    if(arr[i]%4==0&&arr[i]%6==0) {
	    sum[i]+=4;
	    }
	    if(arr[i]%2==0) {
	    sum[i]+=3;
	    }
	    
	    
	    
	            
	        
	        }  
	    for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (sum[i] < sum[j]) {
					int temp = sum[i];
					sum[i] = sum[j];
					sum[j] = temp;
					
					
					int tempValue = arr[i];
					arr[i] = arr[j];
					arr[j] = tempValue;
					
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.print("<" + arr[i] + ", " + sum[i] + "> ");
		}
	}
	
}