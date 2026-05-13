package restaurante;

public interface IGestionableStock {
    
    void reducirStock (double cantidad);
    boolean verificarDisponibilidad (double cantidad);
 
}
