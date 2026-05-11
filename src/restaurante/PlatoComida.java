package restaurante;

import java.util.ArrayList;

public abstract class PlatoComida extends ProductoBase{
    
    public PlatoComida(String nombre, String ID, String Categoria, int PrecioBase) {
        super(nombre, ID, Categoria, PrecioBase);
        
        ArrayList<CategoriaProducto> categoriaProducto = new ArrayList();
        
        categoriaProducto.add(CategoriaProducto.Entrada);
        categoriaProducto.add(CategoriaProducto.Plato_Fuerte);
        categoriaProducto.add(CategoriaProducto.Plato_Fuerte);
        categoriaProducto.add(CategoriaProducto.Bebida);
        categoriaProducto.add(CategoriaProducto.Bebida);
        categoriaProducto.add(CategoriaProducto.Postre);
        
        for(int i = 0; i < categoriaProducto.size(); i++){
         System.out.println();
        }
        
    }
}
