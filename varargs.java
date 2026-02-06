class varargs
{

    public static void Names(String... n) 
	{

        for (String i : n) 
		{
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
	{

        Names("hello", "java");
        Names("hello", "helloA", "helloB");
    }
}
