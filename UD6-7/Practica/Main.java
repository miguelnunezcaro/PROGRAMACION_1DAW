package com.company.Practica;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;

        TreeSet<Alumno> listSet = new TreeSet<Alumno>(new CompareAlumn());
        Map<String, Alumno> map = new HashMap<>();

        while (num != 6) {
            System.out.println("ELIGE UNA OPCION:");
            num = sc.nextInt();

            sc.nextLine();

            if (num == 1) {
                System.out.println("INSERTAR UN ALUMNO");

                System.out.println("Nombre:");

                String nombre = sc.nextLine();

                System.out.println("Apellidos:");

                String apellidos = sc.nextLine();

                System.out.println("Direccion:");

                String direccion = sc.nextLine();

                System.out.println("DNI:");

                String dni = sc.nextLine();

                System.out.println("Email:");

                String email = sc.nextLine();

                System.out.println("Curso:");

                String curso = sc.nextLine();

                System.out.println("Dual:");

                Boolean dual = sc.nextBoolean();

                Alumno a1 = new Alumno(nombre, apellidos, direccion, dni, email, curso, dual);

                if (!map.containsKey(dni)) {
                    listSet.add(a1);
                        map.put(dni, a1);
                } else {
                    System.out.println("Ese alumno ya existe.");
                }

            }
            if (num == 2) {
                System.out.println("BORRAR ALUMNO");

                System.out.println("Escriba el DNI del alumno:");

                String dni = sc.nextLine();

                if (map.containsKey(dni)) {

                    Alumno alumno = map.get(dni);
                    listSet.remove(alumno);
                    map.remove(dni);

                } else {
                    System.out.println("El alumno no existe.");
                }
            }
            if (num == 3) {
                System.out.println("MOSTRAR ALUMNOS");

                System.out.println(listSet);

            }
            if (num == 4) {
                System.out.println("MOSTRAR ALUMNOS DE UN CURSO");
                System.out.println("Introduzca un curso:");
                String curso = sc.nextLine();

                int numAlumns = 0;
                Iterator<Alumno> it = listSet.iterator();
                while (it.hasNext()) {
                    Alumno alumno = it.next();
                    if (alumno.getCurso().equals(curso)) {
                        System.out.println(alumno);
                        numAlumns++;
                    }
                }
                if (numAlumns == 0) {
                    System.out.println("NO HAY ALUMNOS DE ESE CURSO");
                }
            }
            if (num == 5) {
                System.out.println("MODIFICAR UN ALUMNO");
                System.out.println("Introduzca el DNI del alumno que quieres modificar:");
                String dni = sc.nextLine();
                if (map.containsKey(dni)) {

                    System.out.println("Introduce el nuevo nombre:");

                    String nombre = sc.nextLine();

                    System.out.println("Introduce el nuevo apellido:");

                    String apellidos = sc.nextLine();

                    System.out.println("Introduce la nueva direccion:");

                    String direccion = sc.nextLine();

                    System.out.println("Introduce el nuevo email:");

                    String email = sc.nextLine();

                    System.out.println("Introduce el nuevo curso:");

                    String curso = sc.nextLine();

                    System.out.println("¿Dual?");

                    Boolean dual = sc.nextBoolean();

                    Alumno alumno1 = new Alumno(nombre, apellidos, direccion, dni, email, curso, dual);

                    Alumno a1 = map.get(dni);

                    listSet.remove(a1);

                    listSet.add(alumno1);

                    map.put(dni, alumno1);
                } else {
                    System.out.println("NO EXISTE ALUMNO CON ESE DNI");
                }
            }
            if (num == 6) {
                System.out.println("SALIR");
            }
        }

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("alumnos.dat"));

            Collection<Alumno> lista = map.values();
            for (Alumno e : lista) {
                oos.writeObject(e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
