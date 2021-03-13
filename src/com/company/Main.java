package com.company;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Scrie un program printr-o metoda care returneaza caracterul din mijloc a unui sir . Daca sir par -va afisa 2 caracatere din mijloc.

        Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti sirul dorit");
        String sir=scan.nextLine();
        mijlocSir(sir);
    }

    public static void mijlocSir(String sir){

        if(sir.length()%2==0) {
            System.out.println(String.valueOf((sir.charAt(sir.length() / 2 - 1)))+String.valueOf((sir.charAt(sir.length() / 2))));
        }else
            System.out.println(sir.charAt(sir.length() / 2 ));

    }
}



