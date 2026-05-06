package restaurante;

public interface ICalculable {

    decimal CalcularTotal();

    public static class decimal {

        public decimal() {
        }
    }

    public interface IGestionableStock {

        void ReducirStock(int cantidad);

        int VarificarDisponibilidad();
    }
}
