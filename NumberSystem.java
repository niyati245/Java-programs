class NumberSystem{
public static void main(String args[]){
	if(args.length!=2){
		System.out.println("ERROR:: Too few arguments");
		System.out.println("i.e java NumberSystem <conversion type> <number>");
		System.out.println("conversion type: \n1. Decimal to binary \n2. Binary to Decimal");
		System.exit(0);
	}
	int choice=Integer.parseInt(args[0]);
	int num=Integer.parseInt(args[1]);
	if(choice==1)
	{
		System.out.println("DECIMAL TO BINARY");
		int arr[]=new int[50];
		int i=0;
		while(num>0)
		{
			arr[i]=num%2;
			num=num/2;
			i++;
		}
		
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(arr[j]);
		}
	}
	else
	{
		System.out.println("BINARY TO DECIMAL");
		int num1,ans=0,base=1;
		while(num>0)
		{
			num1=num%10;
			num=num/10;
			if(num1!=0 || num1!=1)
			{
				System.out.println("INVALID NUMBER");
				System.exit(0);
			}
			ans=ans+num1*base;
			base=base*2;
		}
		System.out.println(ans);
	}
}
}
