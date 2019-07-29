class EmailValidate
{
	public static void main(String args[])
	{
		if(args.length!=1)
		{
			System.out.println("ERROR:::TOO FEW ARGUMENT");
			System.out.println("i.e. java EmailValidate <email>");
            System.out.println("<email> - Email address");
            System.exit(0);
		}
		int flag=1;
		String email=args[0];
		String emailParts[]=email.split("@");
		int nameLength=emailParts[0].length();
		int fLetter=email.codePointAt(0);
		if((fLetter >= 97 && fLetter <= 122) || (fLetter >=48 && fLetter <=57))
		{
			if(nameLength >= 8 && nameLength <= 20)
			{
				for(int i=0;i<nameLength;i++)
				{
					int charUnicode=emailParts[0].codePointAt(i);
					if(!((charUnicode == 46) || (charUnicode == 95) || (charUnicode >= 48 && charUnicode <=57) || (charUnicode >= 97 && charUnicode <= 122) || (charUnicode >= 65 && charUnicode <= 90)))
					{
						flag=0;
					}
				}
				if(flag==1)
				{
					int atPosition=email.indexOf('@');
					int dotPosition=email.indexOf('.');
					if(atPosition != -1)
					{
						if(dotPosition != -1)
						{
							if((dotPosition - atPosition) > 2)
							{
								System.out.println("Valid");
							}
							else
							{
								System.out.println("Invalid!");
								System.out.println("1");
							}
						}
						else
						{
							System.out.println("Invalid!");
							System.out.println("2");
						}
					}
					else
					{
						System.out.println("Invalid!");
						System.out.println("3");
					}
				}
				else
				{
					System.out.println("Invalid!");
					System.out.println("4");
				}
			}
			else
			{
				System.out.println("Invalid!");
				System.out.println("5");
			}
		}
		else
		{
			System.out.println("Invalid!");
			System.out.println("6");
		}
	}
}