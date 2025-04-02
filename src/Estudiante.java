public class Estudiante {
    String nombre;
    int edad;
    int grado;

    public Estudiante (String nombre, int edad, int grado){
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }
    public void estudiar(){
        System.out.println( nombre + " esta estudiando en " + grado);
    }
}
