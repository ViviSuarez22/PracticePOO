public class Empleado {
    String nombre;
    String puesto;
    int salario;

    public Empleado (String nombre, String puesto, int salario){
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void trabajar(){
        System.out.println(nombre + " esta trabajando en el cargo de " + puesto);
    }
}
