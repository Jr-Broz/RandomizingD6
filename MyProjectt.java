package com.mycompany.myprojectt;
import java.util.Random;
import java.util.Scanner;

public class MyProjectt {

    public static void main(String[] args) {
        
    Random randomizar = new Random();
        
        System.out.println("Write how many times u want to roll dice");
        
        Scanner resposta  = new Scanner(System.in);
        
        System.out.println("=================");
       int resposta2 = resposta.nextInt();
        System.out.println("=================");
        for(int i = 0; i < resposta2;i++){
        
           
            int d7 = randomizar.nextInt(1, 7);
            System.out.println("The results are: " + d7);       
        } 
    }      
}
