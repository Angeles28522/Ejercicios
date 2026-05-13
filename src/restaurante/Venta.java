package restaurante;

import java.util.ArrayList;

public class Venta implements ICalculable {

    private int idVenta;
    private ArrayList<ProductoBase> productos;
    private EstadoPedido estado;

    public Venta(int idVenta) {

        this.idVenta = idVenta;
        productos = new ArrayList<>();
        estado = EstadoPedido.Pendiente;
    }

    public void agregarProducto(ProductoBase producto) {
        productos.add(producto);
    }

    public void cambiarEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    @Override
    public double CalcularTotal() {
        double total = 0;
        for (ProductoBase p : productos) {
            total += p.CalcularTotal();
        }
        return total;
    }
    
    public void mostrarVenta(){
        System.out.println("==== Factura ====");
        
        for(ProductoBase p : productos){
            System.out.println(p.obtenerDescription());
        }
        
        System.out.println("Estado: " + estado);
        System.out.println("Total: $" + this.CalcularTotal());
    }
}
