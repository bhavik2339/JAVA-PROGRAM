/*java porgram to the value to get from user */

import java.util.Scanner;//define class from scanner creating to the object with

class bhavik// that is a class of bhavik
{
    public static void main(String args[])/*that is a main part to the java and main function*/
    {
        Scanner sc = new Scanner(System.in);//import to the class and with proper object
        System.out.println("enter your name");
        String name= sc.nextLine();
        System.out.println(name);/*work to the mainly print message in to run time*/

        System.out.println("enter your interger number");
        int a=sc.nextInt();
        System.out.println(a);
        sc.close();
    } 
}
