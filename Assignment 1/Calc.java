class Calc
{
    public static void main(String args[])
    {
        if(args.length!=3)
        {
           System.out.println("ERROR::: TOO FEW ARGUMENTS");
           System.out.println("i.e. java BasicCalc <Ammount 1> <Operation to perform> <Ammount 2>");
           System.out.println("<Ammount 1> - first operator on which you want to perform opration");
           System.out.println("<operation to perform> - \n+ \n- \n* \n/");
           System.out.println("<Ammount 2> - second operator on which you want to perform opration");
           System.exit(0);
        }           
        int amt1 = Integer.parseInt(args[0]);
        int sign = Integer.parseInt(args[1]);
        int amt2 = Integer.parseInt(args[2]);
        double result = 0;
        switch(sign)
        {
            case 1: result = amt1 + amt2;
                      break;
            case 2: result = amt1 - amt2;
                      break;
            case 3: result = amt1 * amt2;
                      break;
            case 4: result = amt1 / amt2;
                      break;
            default: System.out.println("Invalid Choice!");
        }
        System.out.println("Ans: "+result);

    }
}