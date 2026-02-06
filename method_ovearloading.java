class method_ovearloading
{
    public int multiply(int a, int b) 
	{
        int prod = a * b;
        return prod;
    }

    public int multiply(int a, int b, int c) 
	{
        int prod = a * b * c;
        return prod;
    }

    public static void main(String[] args) 
	{

        Product ob = new Product();

        // Calling method to multiply 2 numbers
        int prod1 = ob.multiply(1, 2);

        System.out.println("Product of two numbers: " + prod1);

        // Calling method to multiply 3 numbers
        int prod2 = ob.multiply(1, 2, 3);

        System.out.println("Product of three numbers: " + prod2);
    }
}
