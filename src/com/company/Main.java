package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String semilla, subSemilla, resultado;
        int respuesta=1;

        System.out.print("Ingrese un numero: ");
        semilla = scanner.next();
        System.out.println("string ingresado: "+semilla);

        while(respuesta!=2){

            /*if(semilla.length()<8){
                StringBuilder semillaModificada = new StringBuilder(semilla);
                semillaModificada.setLength(8);
                semilla=semillaModificada.toString();

                Stack<Character> stack = new Stack<Character>();

                char[] arrayString=semilla.toCharArray();

                for(int i=0; i<semilla.length(); i++){
                    stack.push(arrayString[i]);
                }

                int j=0;

                while(!stack.empty()){
                    arrayString[j++]=stack.pop();
                }

                System.out.println(String.copyValueOf(arrayString));

            }*/

            int middleString = semilla.length()/2;

            semilla = subStringer(semilla, middleString);

            System.out.println(semilla);

            System.out.println("otra iteracion?:\n1- SI\n2- NO");
            respuesta = scanner.nextInt();

        }
    }

    public static String subStringer(String subSemilla, int mitad){

        long resultado=0;
        String resultadoString;
        subSemilla=subSemilla.substring(mitad-2, mitad+2);
        int semillaOperar = Integer.parseInt(subSemilla);

        resultado=(long)Math.pow(semillaOperar, 2);

        resultadoString = Long.toString(resultado);


        return resultadoString;
    }
}
