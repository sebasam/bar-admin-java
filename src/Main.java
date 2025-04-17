//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        InventarioDAO dao = new InventarioDAO();

        dao.insertarProducto(new Producto(0, "Cerveza", 50, 3200.0));

        dao.obtenerProductos().forEach(p -> {
            System.out.println(p.getId() + " - " + p.getNombre() + " - " + p.getCantidad() + " unidades - $" + p.getPrecio());
        });

        dao.actualizarProducto(new Producto(1, "Cerveza Poker", 60, 3400.0));

        //dao.eliminarProducto(1);
    }
}