package entidades;

public class Estudiantes extends Persona {

    String asignatura;
    int nota;

    public Estudiantes(int id, String nombre, int edad, String asignatura, int nota ) {
        super(id, nombre, edad);
        this.nota = nota;
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                " ,asignatura: " + asignatura + '\'' +
                " ,nota: " + nota;
    }
}