package restaurante;

public abstract class ProductoBase implements ICalculable {

    public String Nombre;
    public String ID;
    public String Categoria;
    public int PrecioBase;
    
   
    public ProductoBase(String nombre, String ID, String Categoria, int PrecioBase) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Categoria = Categoria;
        this.PrecioBase = PrecioBase;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String Id) {
        this.ID = Id;
    }

    public String getCategoria() {
        return this.Categoria;
    }

    public void setCategoria(String categoria) {
        this.Categoria = categoria;
    }

    public int getPrecioBase() {
        return this.PrecioBase;
    }

    public void setPrecioBase(int precio) {
        this.PrecioBase = precio;
    }

    public abstract void ObtenerDescription();
    public abstract decimal CalcularDecimal();
}
