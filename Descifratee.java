    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descifratee;


import java.io.FileNotFoundException;

import java.util.Scanner;

/**
 *
 * @author LA MARINA
 */
public class Descifratee {

    public static int arlen = 0;
    public static String out = "";

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        String array[] = new String[70780];
        String[] arre = null;

        boolean rdd;

        Scanner ent = new Scanner(System.in);
        System.out.println(" :");
        String word = ent.nextLine();

        int contador = 0;
        int eljs = 0;
        int elis = 0;

        int wordlen = word.length();
        String arraychar[] = new String[wordlen];

        for (int dasda = 0; dasda <= wordlen - 1; dasda++) {

            arraychar[dasda] = word.split("")[dasda + 1];

        }

        elis = Integer.parseInt(word.split("@")[1]);

        for (int i = 0; i < word.length(); i++) {
            // Si el carácter en [i] es un espacio (' ') aumentamos el contador 
            if (word.charAt(i) == '-') {
                contador++;
            }
        }
        eljs = contador;

        String finalword = "";

        for (int oi = 0; oi < contador; oi++) {
            float nn = Integer.parseInt(word.split("-")[oi]);

            nn /= eljs;

            nn = Math.round(nn);

            nn -= elis;

            String nn2 = nn + "";

            switch (nn2) {
                case "0.0": {

                    System.out.print("a");

                    break;
                }
                case "1.0": {

                    System.out.print("b");

                    break;
                }
                case "2.0": {

                    System.out.print("c");

                    break;
                }
                case "3.0": {

                    System.out.print("d");

                    break;
                }
                case "4.0": {

                    System.out.print("e");
                    break;
                }
                case "5.0": {

                    System.out.print("f");
                    break;
                }
                case "6.0": {

                    System.out.print("g");
                    break;
                }
                case "7.0": {

                    System.out.print("h");
                    break;
                }
                case "8.0": {

                    System.out.print("i");
                    break;
                }
                case "9.0": {

                    System.out.print("j");
                    break;
                }
                case "10.0": {

                    System.out.print("k");
                    break;
                }
                case "11.0": {

                    System.out.print("l");
                    break;
                }
                case "12.0": {

                    System.out.print("m");
                    break;
                }
                case "13.0": {

                    System.out.print("n");
                    break;
                }

                case "14.0": {

                    System.out.print("o");
                    break;
                }
                case "15.0": {

                    System.out.print("p");
                    break;
                }
                case "16.0": {

                    System.out.print("q");
                    break;
                }
                case "17.0": {

                    System.out.print("r");
                    break;

                }
                case "18.0": {

                    System.out.print("s");
                    break;
                }
                case "19.0": {

                    System.out.print("t");
                    break;
                }
                case "20.0": {

                    System.out.print("u");
                    break;
                }
                case "21.0": {

                    System.out.print("v");
                    break;
                }
                case "22.0": {

                    System.out.print("w");
                    break;
                }
                case "23.0": {

                    System.out.print("x");
                    break;
                }
                case "24.0": {

                    System.out.print("y");
                    break;
                }
                case "25.0": {

                    System.out.println("z");
                    break;
                }
                case "30.0": {

                    System.out.print("¿");
                    break;

                }

                case "29.0": {

                    System.out.print(".");
                    break;

                }

                case "28.0": {

                    System.out.print(",");
                    break;

                }

                case "27.0": {

                    System.out.print("?");
                    break;

                }

                case "26.0": {

                    System.out.print(" ");
                    break;
                }
                case "31.0": {
                    System.out.println("!");

                    break;
                }

            }

            if (oi == contador - 1) {
                System.out.print("\n");
            }
        }

    }

}
