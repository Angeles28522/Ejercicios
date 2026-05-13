package restaurante;

public class ProductosAgregados extends ProductoBase {

    public double precio;

    public ProductosAgregados(String Nombre, int ID, CategoriaProducto Categoria, double PrecioBase) {
        super(Nombre, ID, Categoria, PrecioBase);
        this.precio = precio;
    }

    @Override
    public String obtenerDescription() {
        return ("Agregados: " + Nombre + " | $ " + precio);
    }

    @Override
    public double CalcularTotal() {
        return precio;
    }

}
