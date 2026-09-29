package sv.edu.uees.programacion2;

public class Main {
    public static void main(String[] args) {
        String nombre = "Ruben";
        double ventasMes = 1000.0;

        EstrategiaComision estrategia = new ComisionPersonalizada();

        Vendedor vendedor = new Vendedor(nombre, ventasMes, estrategia);
        vendedor.mostrarDetalle();
    }
}
