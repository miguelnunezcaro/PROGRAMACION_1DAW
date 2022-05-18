package examen;

public class Main {

    public static void main(String[] args) {

        Consultas.getProductLines();
        System.out.println();
        System.out.println();
        System.out.println();
        Consultas.categoriaMasVendida();
        Transacciones.insertarOrder();
        Transacciones.insertarPedido();
    }
}
