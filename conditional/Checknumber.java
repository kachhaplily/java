package conditional;

import java.util.Scanner;

public class Checknumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a==b){
            System.out.println("a and b equal");
        }
        else if(a>b){
            System.out.println("a is grather then b");
        }
        else{
            System.out.println("b is grather then a");
        }
    }
}
