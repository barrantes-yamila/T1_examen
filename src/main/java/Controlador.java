
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yamila
 */
public class Controlador {
    public class AlumnoControlador {
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public boolean agregarAlumno(Alumno nuevoAlumno) {
        if (nuevoAlumno == null) {
            System.out.println("Error: el alumno no puede ser nulo.");
            return false;
        }
        if (buscarPorDocumento(nuevoAlumno.getNumeroDocumento()) != null) {
            System.out.println("Error: ya existe un alumno con el documento " + nuevoAlumno.getNumeroDocumento());
            return false;
        }
        listaAlumnos.add(nuevoAlumno);
        System.out.println("Alumno registrado correctamente.");
        return true;
    }

    public void listarAlumnos() {
        System.out.println("=== Lista de alumnos del Instituto Innova ===");
        if (listaAlumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }
        for (Alumno a : listaAlumnos) {
            a.verDatos();
            System.out.println("---------------------------------------------");
        }
        System.out.println("Total de alumnos: " + listaAlumnos.size());
    }

    public Alumno buscarPorDocumento(String numeroDocumento) {
        for (Alumno a : listaAlumnos) {
            if (a.getNumeroDocumento().equals(numeroDocumento)) {
                return a;
            }
        }
        return null;
    }

    public boolean eliminarAlumno(String numeroDocumento) {
        Alumno encontrado = buscarPorDocumento(numeroDocumento);
        if (encontrado == null) {
            System.out.println("Error: no se encontró alumno con documento " + numeroDocumento);
            return false;
        }
        listaAlumnos.remove(encontrado);
        System.out.println("Alumno eliminado correctamente.");
        return true;
    }
    }
}
