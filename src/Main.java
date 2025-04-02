//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libro miLibro = new Libro("Maria", "Jorge Isaac", 54);
        miLibro.leerPagina();

        Estudiante alumno = new Estudiante("Andrea", 17, 11);
        alumno.estudiar();

        CuentaBancaria transaccion1 = new CuentaBancaria(23567, 500000, "Marcos Leal");
        transaccion1.depositar();

        CuentaBancaria transaccion2 = new CuentaBancaria(235967543, 300000, "Marcos Leal");
        transaccion2.retirar();

        Empleado colaborador = new Empleado("Blanca", "Ingeniera", 2500000);
        colaborador.trabajar();
    }
}