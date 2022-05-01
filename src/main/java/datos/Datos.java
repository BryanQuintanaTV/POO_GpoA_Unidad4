package datos;

/*
 * Bryan Quintana
 */
public class Datos {

    public static void main(String[] args) {
        Informacion info = new Informacion("JGS","Sistemas",21550295);
        //Encapsulamiento 
        String NumCon = info.getNombre()+" "+info.getCarrera()+" "+info.getSemestre();
        System.out.println("\nDatos generales alumno(a): "+NumCon);
        System.out.println("Hola");
    }
}