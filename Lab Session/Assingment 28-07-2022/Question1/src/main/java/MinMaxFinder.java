
public class MinMaxFinder {
	
public String findMinMax(int []arr) {			
		int minn = arr[0];
		int maxx = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<minn)
				minn = arr[i];
			else if(arr[i]>maxx)
				maxx = arr[i];
		}
		
		String str = "";		
		str += Integer.toString(minn)+Integer.toString(maxx);		
		return str;
		
	}

public static void main(String [] aa) {
	MinMaxFinder mm = new MinMaxFinder();
//	String f = "1,2,3,4,5,6";
//	int i=Integer.parseInt(f); 
	int i[]= {1,5,3,6,4,8};
	mm.findMinMax(i);
	System.out.println(mm.findMinMax(i));
}
}
