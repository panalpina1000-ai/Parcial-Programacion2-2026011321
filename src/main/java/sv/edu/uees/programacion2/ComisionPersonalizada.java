package sv.edu.uees.programacion2;

public class ComisionPersonalizada implements EstrategiaComision {

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * 0.10;
    }
}