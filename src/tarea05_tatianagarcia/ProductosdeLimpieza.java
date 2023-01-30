package tarea05_tatianagarcia;

/**
 *
 * @author tatig
 */
public class ProductosdeLimpieza {
    private String tipo; //Tipo -> liquido, polvo
    private String marca; 
    private String codigo; 
    private double precio;
    private int cant_inventario;
    private String proveedor; 
    private String producto;//nombre del producto

    public ProductosdeLimpieza(){}
    public ProductosdeLimpieza(String tipo, String marca, String codigo, double precio, int cantidad_inventario, String proveedor, String nombre_producto){
        this.tipo= tipo;
        this.marca= marca;
        this.codigo= codigo; 
        this.precio=precio;
        cant_inventario = cantidad_inventario;
        this.proveedor = proveedor;
        producto = nombre_producto;
        
    }
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCant_inventario() {
        return cant_inventario;
    }

    public void setCant_inventario(int cant_inventario) {
        this.cant_inventario = cant_inventario;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Productos de Limpieza:\nTipo: " + tipo + 
                "\nMarca: " + marca + 
                "\nCodigo: " + codigo + 
                "\nPrecio: " + precio + 
                "\nCantidad en inventario: " + cant_inventario + 
                "\nProveedor: " + proveedor + 
                "\nNombre del Producto: " + producto ;
    }
    
    
    
}
