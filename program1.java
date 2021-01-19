class program1
{
	public static void main(String[] args)
	 {
	 	int index;
	 	
	
	    double avg=0.0;
		double sum=0.0;
		int[] values={20,10,20,31};

		for(   index=0; index<=3; index++)
		{
			System.out.println(values[index]);
		}
		for(   index =0; index<=3; index++)
		{
			sum=sum+values[index];
		}
		avg=sum/4;
		System.out.println(avg);
	}
	 
}