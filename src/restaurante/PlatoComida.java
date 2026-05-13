package restaurante;

import java.util.ArrayList;

public class PlatoComida extends ProductoBase {
    
    public ArrayList<Ingredientes> ingredientes;
    private double margenGanancias;

    public PlatoComida(String Nombre, int ID, CategoriaProducto Categoria, double PrecioBase, double margenGanancias) {
        super(Nombre, ID, Categoria, PrecioBase);
        
        this.margenGanancias = margenGanancias;
        ingredientes = new ArrayList<>();
        
    }
    
    public void agregarIngrediente(Ingredientes ingrediente){
        ingredientes.add(ingrediente);
    }

    @Override
    public String obtenerDescription() {
        return ("Plato de comida " + Nombre + " | $" + this.CalcularTotal());
    }
    
    @Override
    public double CalcularTotal() {
        double precioCosto = 0;
        for (Ingredientes ing : ingredientes) {
            precioCosto += ing.getPrecioCosto();
        }
        return (precioCosto + (precioCosto * this.margenGanancias));
    }
    
    public void consumirIngrediente() {
        for (Ingredientes ing : ingredientes) {
            ing.reducirStock(1);
        }
    }
    
}
