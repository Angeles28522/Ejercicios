package restaurante;

public class ProductosAgregados extends ProductoBase {

    public ProductosAgregados(String Nombre, int ID, CategoriaProducto Categoria, double PrecioBase) {
        super(Nombre, ID, Categoria, PrecioBase);
        this.PrecioBase = PrecioBase;
    }

    @Override
    public String obtenerDescription() {
        return ("Agregados: " + Nombre + " | $ " + PrecioBase);
    }

    @Override
    public double CalcularTotal() {
        return PrecioBase;
    }

}
