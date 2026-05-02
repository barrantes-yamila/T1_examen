
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yamila
 */
public class Sistemaalumno {
    /*    import java.util.Scanner;*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlumnoControlador control = new AlumnoControlador();
        String rpta = "s";

        while (rpta.equals("s")) {
            System.out.println("=== Registro de alumno ===");

            System.out.println("Ingrese nombre completo:");
            String nombre = sc.nextLine();

            System.out.println("Tipo de documento (DNI / CE):");
            String tipoDoc = sc.nextLine().toUpperCase();

            System.out.println("Ingrese numero de documento:");
            String numDoc = sc.nextLine();

            System.out.println("Nivel socioeconomico (A / B / C):");
            char nivel = sc.nextLine().toUpperCase().charAt(0);

            alumno a = new Alumno(nombre, tipoDoc, numDoc, nivel);

            System.out.println("Tiene beca? (s/n):");
            String tieneBeca = sc.nextLine();
            if (tieneBeca.equals("s")) {
                System.out.println("Tipo de beca:");
                String tipoBeca = sc.nextLine();
                System.out.println("Porcentaje de beca (ej: 25 para 25%):");
                float porcentaje = Float.parseFloat(sc.nextLine());
                a.setPorcentajeBeca(tipoBeca, porcentaje);
            }

            System.out.println("\nDatos del alumno registrado:");
            a.verDatos();
            control.agregarAlumno(a);

            System.out.println("\nDesea agregar otro alumno? (s/n):");
            rpta = sc.nextLine().toLowerCase();
        }

        System.out.println("\n");
        control.listarAlumnos();
        sc.close();
    }
}
}
