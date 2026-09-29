package sv.edu.uees.programacion2;

public class Main {

    public static void main(String[] args) {

        EstrategiaComision estrategia = new ComisionEstandar();

        Vendedor vendedor = new Vendedor(
                "Ruben",
                1000.00,
                estrategia
        );

        vendedor.mostrarDetalle();
    }
}