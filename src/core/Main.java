package core;
import entidades.Estudiantes;
import input.Input;
import output.Output;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {
    final static int crear = 1;
    final static int modificar = 2;
    final static int eliminar = 3;
    final static int listar = 4;
    final static int salir = 5;
    static List<Estudiantes> estudiante = new ArrayList<>();
    static int opcion;
    static boolean usuarioQuiereSalir = false;


    public static void main(String[] args) {
        Output.bienvenido();
        menu();
    }

    private static void menu() {
        do {
            Output.menu();
            opcion = Input.getNumber();
            switch (opcion) {
                case crear: crear();
                    break;
                case modificar: modificar();
                    break;
                case eliminar: eliminar();
                    break;
                case listar: listar();
                    break;
                case salir:
                    usuarioQuiereSalir = true;
                    break;
            }
        } while (!usuarioQuiereSalir);
    }

    private static void crear() {
        Output.introducirId();
        int id = Input.getNumber();
        Input.getString();
        Output.introducirNombre();
        String nombre = Input.getString();
        Output.introducirEdad();
        int edad = Input.getNumber();
        Output.introducirAsignatura();
        Input.getString();
        String asignatura = Input.getString();
        Output.introducirNota();
        int nota = Input.getNumber();

gi
       estudiante.add(new Estudiantes(id, nombre, edad, asignatura,nota));
    }

    private static void modificar() {
        Output.introducirId();
        int buscar = Input.getNumber();
        Iterator<Estudiantes> iterator = estudiante.iterator();
        while (iterator.hasNext()) {
            Estudiantes encontrado = iterator.next();
            if (encontrado.getId() == buscar) {
                Output.nuevoNombre();
                Input.getString();
                String nuevoNombre = Input.getString();
                Output.nuevoEdad();
                int nuevoEdad = Input.getNumber();
                Output.nuevoAsignatura();
                Input.getString();
                String nuevoAsignatura = Input.getString();
                Output.nuevoNota();
                int nuevoNotaDeLaAsignatura = Input.getNumber();
                encontrado.setNombre(nuevoNombre);
                encontrado.setEdad(nuevoEdad);
                encontrado.setAsignatura(nuevoAsignatura);
                encontrado.setNota(nuevoNotaDeLaAsignatura);
                Output.modificado();
                System.out.println(encontrado);
            }

        }

    }

    private static void eliminar() {
        Output.introducirId();
        int id = Input.getNumber();
        Iterator<Estudiantes> iterator = estudiante.iterator();
        while (iterator.hasNext()) {
            Estudiantes encontrado = iterator.next();
            if (encontrado.getId() == id) {
                iterator.remove();
                Output.eliminado();
            }
        }
    }

    private static void listar() {
        Iterator<Estudiantes> iterator = estudiante.iterator();
        while (iterator.hasNext()) {
            Estudiantes encontrado = iterator.next();
            System.out.println(encontrado);
        }
    }
}
