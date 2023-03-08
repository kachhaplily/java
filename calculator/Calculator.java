package calculator;
import java.util.*;
public class Calculator {
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a");
        int a=sc.nextInt();
        System.out.println("enter value of b");
        int b=sc.nextInt();
        System.out.println("1:add 2:sub 3:multi 4:division 5:modulo");
        int oprator=sc.nextInt();



        switch(oprator){
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:System.out.println(a*b);
            break;
            case 4:System.out.println(a/b);
            break;
            case 5:System.out.println(a%b);
            break;
            default:System.out.println("invalid selcet");
        }


        
    }

}
