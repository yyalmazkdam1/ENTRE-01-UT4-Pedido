
/**
 * @author Yumurdzhan Yalmaz
 *  Clase para probar el resto de clases
 *  
 */
public class TestPedido
{
    private Pedido pedido1; 
    private Pedido pedido2;
    /**
     * Constructor  
     */
    public TestPedido()    {
        Producto producto1,producto2,producto3,producto4;
        Fecha fecha1,fecha2;
        Cliente cliente1,cliente2;
        LineaPedido linea1,linea2, linea3, linea4;
        // crear pedido1
    
        producto1 = new Producto("Rotulador fosforescente",6.7);
        producto2 = new Producto("Memoria USB 64GB", 14.8);
        fecha1 = new Fecha(4,9,2019);
        cliente1 = new Cliente("Juan Soto", "Avda. Pio XII", "Pamplona", "Navarra");
        linea1 = new LineaPedido(producto1,20);
        linea2 = new LineaPedido(producto2,10);
        pedido1 = new Pedido(fecha1,cliente1,linea1,linea2);
        

        // crear pedido2
        producto3 = new Producto("Sacapuntas manual",16.64);
        producto4 = new Producto("Corrector tippex", 5.99);
        fecha2 = new Fecha(8,10,2019);
        cliente2 = new Cliente("Elisa Nuin", "C/ Río Alzania 7", "Pamplona", "Navarra");
        linea3 = new LineaPedido(producto3,8);
        linea4 = new LineaPedido(producto4,20);
        pedido2 = new Pedido(fecha2,cliente2,linea3,linea4);
        

    }
    /**
     * Muestra la información de los dos pedidos (ver enunciado)
     */
    public void mostrarPedidos() {
        System.out.println("Pedido 1" + "\n-------------------" + "\n" + pedido1.toString()
        + "Pedido 2" + "\n-------------------" + "\n" + pedido2.toString());
  
        
        
    }
}
