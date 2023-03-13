package com.mycompany.proxectoerros;

/**
 *
 * @author Nicolás Míguez Ramos <a22nicolasmr at iessanclemente.net>
 */
import java.util.Scanner;
public class ProxectoErros {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //int num=789;
        int resto;
         int numInvertido = 0;
        
        while(num!=0){
            resto=num%10;
            numInvertido=(numInvertido)*10+resto;
            num/=10;
        }
        System.out.println("O numero invertido e "+numInvertido);
    }
}
