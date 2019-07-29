class Sort
{
	public static void main(String args[])
	{
		int numLength = args.length;
		int num[] = new int[numLength];
		for( int i=0;i<numLength;i++)
		{
			num[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<numLength;i++)
		{
			for(int j=0;j<numLength-i-1;j++)
			{
				if(num[j]>num[j+1])
				{
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted aray is:");
		for(int i=0;i<numLength;i++)
		{
			System.out.println(num[i]);
		}
	}
}