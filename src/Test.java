import TDA.Calificaciones;

public class Test {
    public static void main(String[] args) throws Exception {
        Calificaciones calificaciones = new Calificaciones();
        
        System.out.println(calificaciones.agregaCalificacion(9.80));

        System.out.println(calificaciones.agregaCalificacion(80));
        System.out.println(calificaciones.agregaCalificacion(7.76));

        System.out.println(calificaciones.eliminaCalificacion(1));

        System.out.println(calificaciones.agregaCalificacion(5));

        System.out.println(calificaciones.actualizaCalificacion(2, 10));

        calificaciones.mostarCalificaciones();

        System.out.println(calificaciones.mostrarAlumnos());

        System.out.println(calificaciones.promedioGrupo());

    }
}
