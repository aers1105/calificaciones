package TDA;

public class Calificaciones {

    private double[] calificaciones;

    public Calificaciones() {
        calificaciones = new double[40];
    }

    public String agregaCalificacion(double calificacion) {

        for (int i = 0; i <= calificaciones.length; i++) {
            if (calificaciones[i] == 0) {
                calificaciones[i] = calificacion;

                return "Calificación agregada correctamente";

            }
        }

        return "No se pudo agregar";

    }

    public String eliminaCalificacion(int posicion) {

        if (estaVacia()) {
            return "La lista está vacía";
        }
        if (calificaciones[posicion - 1] != 0) {

            calificaciones[posicion - 1] = 0;
            return "Calificación eliminada correctamente";

        } else {

            return "No se pudo eliminar, verifica la posición";

        }

    }

    public String actualizaCalificacion(int posicion, double valor) {
        if (estaVacia()) {
            return "La lista está vacía";
        }
        if (calificaciones[posicion - 1] == 0) {
            return "No se puede actualizar un campo sin calificación";
        }

        calificaciones[posicion - 1] = valor;
        return "Actualizada correctamente";

    }

    public void mostarCalificaciones() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
        }
        System.out.println("Calificaciones:");
        for (double cal : calificaciones) {
            System.out.println("|" + cal + "|");
        }

    }

    public String mostrarAlumnos() {
        int totalAlumnos = 0;
        if (estaVacia()) {
            return "La lista está vacia";
        }
        for (double cal : calificaciones) {
            if (cal != 0) {
                totalAlumnos++;
            }
        }
        return "El total de alumnos es: " + totalAlumnos;
    }

    public String promedioGrupo() {
        int totalAlumnos = 0;
        double sumaCalificaciones = 0;

        if (estaVacia()) {
            return "La lista está vacía";
        }

        for (double cal : calificaciones) {
            if (cal != 0) {
                sumaCalificaciones += cal;
                totalAlumnos ++;
            }

        }
        
        return "El promedio del grupo es de: " + sumaCalificaciones / totalAlumnos;
        
    }

    boolean estaVacia() {
        int contador = 0;

        for (int i = 0; i <= calificaciones.length - 1; i++) {

            if (contador == calificaciones.length) {
                return true;
            }

            if (calificaciones[i] == 0) {

                contador++;

            }

        }
        return false;
    }
}
