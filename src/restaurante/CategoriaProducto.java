package restaurante;

public enum CategoriaProducto {
    Entrada("Ensalada"),
    Plato_Fuerte("Pizza,Hamburguesas"),
    Postre("Tiramisú"),
    Bebida("Vino,Sodas");

    private final String desc;

    CategoriaProducto(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
