/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfirado;

import java.util.Scanner;

/**
 *
 * @author LA MARINA
 */
public class Cfirado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String aux[] = new String[1000];
        int newword[] = new int[1000];
        String palabra;
        String palabraactual;
        int count = 0;
        String letra[] = new String[400];
        System.out.print(": ");
        palabra = ent.nextLine();

        int i = 0;
        int js;

        js = palabra.length();

        double is2;
        is2 = Math.random() * (js) - (js / 3) + (js);

        int is = (int) Math.round(is2);

        for (i = 0; i <= js - 1; i++) {

            letra[i] = palabra.split("")[i + 1];

        }

        for (int j = 0; j < js; j++) {

            switch (letra[j]) {

                case "!": {

                    newword[j] = 31 + is;

                    break;
                }

                case "¿": {

                    newword[j] = 30 + is;
                    break;

                }

                case ".": {

                    newword[j] = 29 + is;
                    break;

                }

                case ",": {

                    newword[j] = 28 + is;
                    break;

                }

                case "?": {

                    newword[j] = 27 + is;
                    break;

                }

                case " ": {

                    newword[j] = 26 + is;
                    break;

                }

                case "a": {

                    newword[j] = 0 + is;

                    break;
                }
                case "b": {

                    newword[j] = 1 + is;
                    break;

                }
                case "c": {

                    newword[j] = 2 + is;

                    break;
                }
                case "d": {

                    newword[j] = 3 + is;
                    break;

                }
                case "e": {

                    newword[j] = 4 + is;
                    break;

                }
                case "f": {

                    newword[j] = 5 + is;
                    break;

                }
                case "g": {

                    newword[j] = 6 + is;
                    break;

                }
                case "h": {

                    newword[j] = 7 + is;

                    break;
                }
                case "i": {

                    newword[j] = 8 + is;

                    break;
                }
                case "j": {

                    newword[j] = 9 + is;

                    break;
                }
                case "k": {

                    newword[j] = 10 + is;

                    break;
                }
                case "l": {

                    newword[j] = 11 + is;

                    break;
                }
                case "m": {

                    newword[j] = 12 + is;

                    break;
                }
                case "n": {

                    newword[j] = 13 + is;
                    break;

                }
                case "o": {

                    newword[j] = 14 + is;

                    break;
                }
                case "p": {

                    newword[j] = 15 + is;

                    break;
                }
                case "q": {

                    newword[j] = 16 + is;
                    break;

                }
                case "r": {

                    newword[j] = 17 + is;

                    break;
                }
                case "s": {

                    newword[j] = 18 + is;

                    break;
                }
                case "t": {

                    newword[j] = 19 + is;

                    break;
                }
                case "u": {

                    newword[j] = 20 + is;
                    break;

                }
                case "v": {

                    newword[j] = 21 + is;

                    break;
                }
                case "w": {

                    newword[j] = 22 + is;
                    break;

                }
                case "x": {

                    newword[j] = 23 + is;

                    break;
                }
                case "y": {

                    newword[j] = 24 + is;

                    break;
                }
                case "z": {

                    newword[j] = 25 + is;
                    break;

                }

            }
        }

        for (int iterador = 0; iterador < js; iterador++) {

            newword[iterador] *= js;
            System.out.print((newword[iterador]) + "-");
            if (iterador + 1 == js) {
                System.out.print("@" + is + "\n");

            }
        }
        /*
         System.out.println(" :");
         String word=ent.nextLine();
         int contador=0;
         int eljs=0;
         int elis=0;
     
         int wordlen = word.length();
         String arraychar[] = new String[wordlen];
 
                
         for(int dasda=0;dasda<=wordlen-1;dasda++){
              
              
               
               
         arraychar[dasda]=word.split("")[dasda+1];
               
              
               
         }
         int dada=0;
         for(int dodo=0;dodo<wordlen-1;dodo++){
 
         if(arraychar[dodo]=="-"){
         contador++;
         }
           
       
         }
         String selis=word.split("@")[1];
       
       
         elis=Integer.parseInt(selis);
         String seljs=word.split("@")[1];
       
       
         eljs=Integer.parseInt(seljs);
       
         for(int oi=0;oi<contador;oi++){
         float nn = Integer.parseInt(word.split("-")[oi]);
               
         nn /=elis;
               
         nn = Math.round(nn);
               
         nn-=eljs;
               
         System.out.println(nn);
               
         }                
            
       
     
      
         
         
         */

    }
}
