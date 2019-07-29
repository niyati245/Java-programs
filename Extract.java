class Extract{
public static void main(String args[])
{
	if(args.length!=1)
	{
		System.out.println("ERROR:::TOO FEW ARGUMENT");
		System.out.println("i.e. java Extract <html_code>");
        System.out.println("<html_code> - some html code");
		System.exit(0);
	}
	String htmlCode=args[0];
	int htmlLength=htmlCode.length();
	char code[]=htmlCode.toCharArray();
	int flag = 0;
	for(int i=0;i<code.length;i++)
	{
		if(code[i] == '<')
		{
			flag = 0;
		}
		else if(code[i] == '>')
		{
			flag = 1;
		}
		else if(flag == 1)
		{
			System.out.print(code[i]);
		}
	}
}
}