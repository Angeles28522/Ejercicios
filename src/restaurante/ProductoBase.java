package restaurante;

public abstract class ProductoBase implements ICalculable {

    public String Nombre;
    public int ID;
    public CategoriaProducto Categoria;
    public double PrecioBase;
    
    public ProductoBase(String Nombre, int ID, CategoriaProducto Categoria, double PrecioBase) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Categoria = Categoria;
        this.PrecioBase = PrecioBase;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int Id) {
        ID = Id;
    }

    public CategoriaProducto getCategoria() {
        return Categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        Categoria = categoria;
    }

    public double getPrecioBase() {
        return PrecioBase;
    }

    public void setPrecioBase(double precio) {
        PrecioBase = precio;
    }

    public abstract String obtenerDescription();
    public abstract double CalcularTotal();
}
