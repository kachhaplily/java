package conditional;

import java.util.Scanner;

public class Driving {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Your Age");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Give a licance");

        }
        else{
            System.out.println("Not a adult");
        }
        
    }
    
}
