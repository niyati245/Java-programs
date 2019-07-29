class AnagramString{
public static void main(String args[])
{
	if(args.length!=2)
	{
		System.out.println("ERROR:::TOO FEW ARGUMENT");
		System.out.println("i.e. java AnagramString <String1> <String2>");
        System.out.println("string1 - Base String \n string2 - other string");
        System.exit(0);
	}
	String firstString=args[0];
	String secondString=args[1];
	int firstLength=firstString.length();
	int secondLength=secondString.length();
	int flag=0;
	int str1[]=new int[127];
	int str2[]=new int[127];
	if(firstLength==secondLength)
	{
		for(int i=0;i<firstLength;i++)
		{
			str1[firstString.codePointAt(i)]++;
		}
		for(int i=0;i<secondLength;i++)
		{
			str2[secondString.codePointAt(i)]++;
		}
		int strLength = str1.length;
		for(int i=0;i< strLength;i++)
		{
			if(str1[i]==str2[i])
				flag=1;
			else
			{
				flag=0;
				break;
			}
		}
		
	}
	if(flag==1)
		System.out.println("TWO STRINGS ARE ANAGRAM");
	else
		System.out.println("TWO STRINGS ARE NOT ANAGRAM");
	
}
}