import java.util.Scanner;
class loop_whille{
    public static void main(String args[]){
        Scanner b=new Scanner(System.in);
        int c=b.nextInt();

        while (c<=10) {
            System.out.println(c); 
            c++;           
        }
    }
}