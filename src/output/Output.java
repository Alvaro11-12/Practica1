package output;

public class Output {


    public static void bienvenido() {
        System.out.println("Bienvenido al CRUD");

    }

    public static void menu() {
        System.out.println("""
                Que quieres hacer?
                1. Crear
                2. Modificar
                3. Eliminar
                4. Listar
                5. Salir
                """);

    }


    public static void introducirId() {
    System.out.println("Introduce un ID");
}

    public static void introducirNombre() {
        System.out.println("Introduce un Nombre");
    }

    public static void introducirEdad() {
        System.out.println("Introduce la edad");
    }

    public static void introducirAsignatura() {
        System.out.println("Introduce una asignatura");
    }
    public static void introducirNota() {
        System.out.println("Introduce la nota de la asignatura");
    }

    public static void nuevoNombre() {
        System.out.println("Introduce nuevo Nombre");
    }

    public static void nuevoEdad() {
        System.out.println("Introduce nuevo edad");
    }

    public static void nuevoAsignatura() {
        System.out.println("Introduce nuevo asignatura");
    }
    public static void nuevoNota() {
        System.out.println("Introduce nuevo nota de la asignatura");
    }

    public static void modificado() {
        System.out.println("Estudiante modificado");
    }

    public static void eliminado() {
        System.out.println("Estudiante eliminado");
    }

}
