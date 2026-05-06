package restaurante;

import java.util.ArrayList;

public abstract class PlatoComida extends ProductoBase{
    
    public PlatoComida(String nombre, String ID, String Categoria, int PrecioBase) {
        super(nombre, ID, Categoria, PrecioBase);
        
        ArrayList<CategoriaProducto> categoriaProducto = new ArrayList();
        
        categoriaProducto.add(CategoriaProducto.Entrada);
        categoriaProducto.add(CategoriaProducto.Entrada);
        categoriaProducto.add(CategoriaProducto.Plato_Fuerte);
        categoriaProducto.add(CategoriaProducto.Plato_Fuerte);
        categoriaProducto.add(CategoriaProducto.Bebida);
        categoriaProducto.add(CategoriaProducto.Bebida);
        categoriaProducto.add(CategoriaProducto.Postre);
        
        for (int i = 0; categoriaProductos.size() >= i; i++){
            
        }
        System.out.println();
    }
    
    private static class Ingredientes {

        public Ingredientes() {
            
        }
    }

    private static class categoriaProductos {

        private static int size() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public categoriaProductos() {
        }
    }
    
}
