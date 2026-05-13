package restaurante;

public class Ingredientes implements IGestionableStock {

    private String nombre;
    private double stock;
    private UnidadMedida unidad;
    private double precioCosto;

    public Ingredientes(String nombre, double stock, UnidadMedida unidad, double precioCosto) {

        this.nombre = nombre;
        this.stock = stock;
        this.unidad = unidad;
        this.precioCosto = precioCosto;

    }

    public String getNombre() {
        return nombre;
    }

    public double getStock() {
        return stock;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    @Override
    public void reducirStock(double cantidad) {
        if (verificarDisponibilidad(cantidad)) {
            stock -= cantidad;
        } else {
            System.out.println("Stocks insuficientes");
        }
    }

    @Override
    public boolean verificarDisponibilidad(double cantidad) {
        return stock >= cantidad;
    }

    @Override
    public String toString() {
        return (nombre + " Stock: " + stock + " " + unidad);
    }

}
