package it.ibm.progettoBanca.domain.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExampleException {
    public static void main(String[] args){
        System.out.println("inizio main");
        try {
            f1();
        } catch (FileNotFoundException e) {
            System.out.println("file non trovato");
        }
        System.out.println("fine main");
    }

    public static void f1() throws FileNotFoundException {
        System.out.println("inizio f1");
        try {
            f2();
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("fine f1");
    }
//    public static void f2(){
//        System.out.println("inizi<o f2");
//        int x;
//        try {
//            x = 10/0;
//        } catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//            x=100;
//        }
//        System.out.println("fine f2");
//    }

    public static void f2() throws FileNotFoundException {
        System.out.println("inizio f2");
        FileReader fr = new FileReader("non_esisto.txt");
        System.out.println("fine f2");
    }
}
