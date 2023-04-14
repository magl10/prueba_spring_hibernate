package com.example.prueba.organizarYincana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrganizadorEquipos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el numero de equipos a participar");
        int numero = scanner.nextInt();



        List<String> equipo = new ArrayList<String>();

        for (int i = 0; i < numero; i++) {
            setEquipo(equipo, i);
        }
        scanner.close();


        System.out.println("Los nombres introducidos son:");
        for (String nombre : equipo) {
            System.out.println(nombre);
        }


        List<String> equiposEmparejados = new ArrayList<String>();

        configParOrImpar(numero,equipo);

        emparejarEquipos(equiposEmparejados, equipo);

        System.out.println("Lista de emparejamiento:");

        for (String emparejado : equiposEmparejados) {
            System.out.println(emparejado);
        }



    }

    public static void setEquipo(List<String> equipo, int i){

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce el nombre del equipo #" + i + ":");
            String nombre = scanner.nextLine();
            equipo.add(nombre);
            scanner.close();
        } catch (Exception e) {
            System.out.println("Hubo un error al leer la cadena.");

        }

    }

    public static void emparejarEquipos(List<String> equiposEmparejados, List<String> equipo){
        for (int i = 0; i < equipo.size(); i++) {

            for (int j = i + 1; j < equipo.size(); j++) {

                String emparejado = "[" + equipo.get(i) + " , " + equipo.get(j) + "]";

                equiposEmparejados.add(emparejado);
            }
        }
    }

    public static void configParOrImpar(int numero, List<String>equipo){

        if (!(numero % 2 == 0))
            equipo.add("Descansa");

    }
}
