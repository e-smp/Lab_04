package com.mycompany.recursividad;

import java.util.Scanner;

public class Funciones {
    public void Menu() {

        Scanner l = new Scanner(System.in);

            System.out.println("\nMenú, Ingrese palabra para validar si es palindrome:");
         String op = l.nextLine();
         validarPalindrome(op);

             }
    public void validarPalindrome(String palabra){
      if (palabra.length()==0 || palabra.length()==1){
          System.out.println("Esta palabra es palindrome");
      }else if (palabra.charAt(0)==palabra.charAt(palabra.length()-1)){
            validarPalindrome(palabra.substring(1 ,palabra.length()-1));
            
        }else{
            System.out.println("Esta palabra no es palindrome");
        } 
        
      }   
    }

    