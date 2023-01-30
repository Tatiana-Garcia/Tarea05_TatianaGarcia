package tarea05_tatianagarcia;

import java.util.Date;

/**
 *
 * @author tatig
 */
public class Liquidos {
    private String categoria; //categoria -> lacteos, gaseosas, jugos, agua
    private String empaque;//forma de empaque->botella/bote, caja, lata
    private String tam; //tamaño->pequeño, mediano, grande
    private String producto; //nombre de producto
    private double precio; 
    private int inventario;
    private Date fecha; //Fecha de vencimiento
    
    public Liquidos(){}
    public Liquidos(String categoria, String empaque, String tamaño, String nombre_producto, double precio, Date fechadevencimiento, int inventario){
        this.categoria=categoria;
        this.empaque = empaque; 
        tam = tamaño;
        producto=nombre_producto;
        this.precio = precio;
        fecha = fechadevencimiento;
        this.inventario = inventario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEmpaque() {
        return empaque;
    }

    public void setEmpaque(String empaque) {
        this.empaque = empaque;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Liquidos: \nCategoria: " + categoria + 
                "\nEmpaque: " + empaque + 
                "\nTamaño: " + tam + 
                "\nProducto: " + producto + 
                "\nPrecio: " + precio + 
                "\nFecha: " + fecha+
                "\nCantidad en inventario: " + inventario;
    }

   
    
    
}
