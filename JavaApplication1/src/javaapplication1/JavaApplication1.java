/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                System.out.println("Please متن :");
        Scanner s = new Scanner(new InputStreamReader(System.in,Charset.forName("UTF-8")));
        String next = s.nextLine();
                        System.out.println("Fingilish Is : "+next);
                        

    }
    
}
