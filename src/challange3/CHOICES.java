package challange3;

import  java.util.Scanner;
public class CHOICES {
    public  static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int number=input.nextInt();

        if(number<100){
            System.out.println("you can get the percentage");
        }else{
            System.out.println("error percentage should be out of 100");
        }

    }

}
