package com.tecsup.lab01.view;
import java.util.Scanner;
import com.tecsup.lab01.model.User;

public class UserView {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        User us=new User();
        
        System.out.println("Nombre: ");
        String nombre =sc.nextLine();
        
        System.out.println("Apellido: ");
        String ape=sc.nextLine();
        
        System.out.println("Edad :");
        int edad=sc.nextInt();
        
        
        System.out.println(nombre +" "+ape+"  "+edad+" años");
       
        
        
    }
    
}
