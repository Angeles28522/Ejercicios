package restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ingredientes masa = new Ingredientes("Masa", 8, UnidadMedida.uni, 1);
        Ingredientes queso = new Ingredientes("Queso", 12, UnidadMedida.g, 2.5);
        Ingredientes salsa = new Ingredientes("Salsa", 10, UnidadMedida.ml, 0.5);

        PlatoComida pizza = new PlatoComida("Pizza", 1, CategoriaProducto.Plato_Fuerte, 12, 0.25);

        pizza.agregarIngrediente(queso);
        pizza.agregarIngrediente(masa);
        pizza.agregarIngrediente(salsa);

        Ingredientes pan = new Ingredientes("Pan", 16, UnidadMedida.uni, 2);
        Ingredientes carne = new Ingredientes("Carne", 8, UnidadMedida.uni, 1);

        PlatoComida hamburguesa = new PlatoComida("Hamburguesa", 2, CategoriaProducto.Plato_Fuerte, 16, 0.25);

        hamburguesa.agregarIngrediente(pan);
        hamburguesa.agregarIngrediente(carne);
        hamburguesa.agregarIngrediente(queso);

        Ingredientes lechuga = new Ingredientes("Lechuga", 16, UnidadMedida.uni, 0.5);
        Ingredientes tomates = new Ingredientes("Tomates", 12, UnidadMedida.uni, 1);
        Ingredientes pepinos = new Ingredientes("Pepinos", 8, UnidadMedida.uni, 0.5);

        PlatoComida ensalada = new PlatoComida("Ensalda", 1, CategoriaProducto.Entrada, 7.25, 0.25);

        ensalada.agregarIngrediente(lechuga);
        ensalada.agregarIngrediente(tomates);
        ensalada.agregarIngrediente(pepinos);

        ProductosAgregados vino = new ProductosAgregados("Vino 1998", 1, CategoriaProducto.Bebida, 8.78);
        ProductosAgregados soda = new ProductosAgregados("Pepsi", 1, CategoriaProducto.Bebida, 1.25);
        ProductosAgregados tiramisu = new ProductosAgregados("Tiramisú", 1, CategoriaProducto.Postre, 4.10);

        ArrayList<ProductoBase> menu = new ArrayList<>();

        menu.add(pizza);
        menu.add(vino);
        menu.add(hamburguesa);
        menu.add(soda);
        menu.add(tiramisu);
        
        ArrayList<Venta> ventasDelDia = new ArrayList<>();
        double ingresosTotales = 0;
        int contadorVentas = 1;

        while (true) {
            System.out.println("====- Restaurante Seventeen -====");

            System.out.println("1.Ver menu");
            System.out.println("2.Inventario");
            System.out.println("3.Nueva venta");
            System.out.println("4.Reporte");
            System.out.println("5.Salir");

            int opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    
                    System.out.println("Menu: ");

                    for (int i = 0; i < menu.size(); i++) {
                        
                        System.out.println((i + 1) + ". " + menu.get(i).obtenerDescription());
                    }
                    System.out.println("Seleccione producto: ");
                    
                    int op = sc.nextInt();
                    
                    System.out.println("Elegiste: " + menu.get(op - 1));
                    
                    break;

                case 2:

                    System.out.println("Inventario:");

                    System.out.println(pan);
                    System.out.println(carne);
                    System.out.println(queso);
                    System.out.println(masa);
                    System.out.println(salsa);
                    System.out.println(queso);
                    System.out.println(ensalada);
                    System.out.println(tomates);
                    System.out.println(pepinos);

                    break;

                case 3:

                    Venta venta = new Venta(contadorVentas);
                    contadorVentas++;
                    
                    int opcionProducto;
                    
                    do{
                        System.out.println("Nueva venta hecha...");
                        
                        for (int i = 0; i< menu.size(); i++){
                            
                            System.out.println((i + 1) + ". " + menu.get(i).obtenerDescription());
                        }
                        System.out.println("Finalizar compra...");
                        System.out.println("Seleccione un producto: ");
                        opcionProducto = sc.nextInt();
                        
                        if (opcionProducto == 0){
                            break;
                        }
                        
                        if (opcionProducto < 1 || opcionProducto > menu.size()){
                            System.out.println("Opción invalida, Elija una opción valida...");
                            
                            continue;
                        }
                        
                        ProductoBase productoSeleccionado = menu.get(opcionProducto - 1);
                        venta.agregarProducto(productoSeleccionado);
                        
                        if(productoSeleccionado instanceof PlatoComida){
                            PlatoComida platoComida = (PlatoComida) productoSeleccionado;
                            
                            platoComida.consumirIngrediente();
                        }
                        
                        System.out.println(productoSeleccionado.getNombre() + " se ha agregado a la venta.");
                    } while(true);

                    venta.cambiarEstado(EstadoPedido.Pagado);

                    venta.mostrarVenta();

                    ingresosTotales += venta.CalcularTotal();
                    
                    ventasDelDia.add(venta);

                    break;

                case 4:
                    System.out.println("Reporte del día.");

                    System.out.println("Cantidad de ventas: " + ventasDelDia.size());

                    System.out.println("Ingresos totales: $" + ingresosTotales);

                    System.out.println("Detalles de venta");

                    for(int i = 0;
                        i < ventasDelDia.size(); i++) {

                        System.out.println("Venta #" + (i + 1));

                        ventasDelDia.get(i).mostrarVenta();
                    }

                    if(!ventasDelDia.isEmpty()) {

                        double promedio = ingresosTotales / ventasDelDia.size();

                        System.out.println("Ticket promedio: $" + promedio );
                    }

                    break;

                case 5:
                    System.out.println("Saliendo del menu...");
                    return;

                default:
                    System.out.println("Opcion invalida");

            }

        }
    }

}
