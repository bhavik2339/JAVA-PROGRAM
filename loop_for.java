import java.util.Scanner;
class loop_for
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b;
        for(b=a;b<=100;b++){
            System.out.println(b);
        }
        sc.close();
    }
}