package tarea05_tatianagarcia;

/**
 *
 * @author tatig
 */
public class FrutasVerduras {
    private double precio; 
    private int cant_inve;//cantidad a inventariar
    private String categoria; //categoria fruta->citricos, tropical, de grano o rica en fibra
    //categoria verdura->tuberculos, legumbres, de hojas
    
    public FrutasVerduras(){}
    public FrutasVerduras(double precio, int cantidad_inventario, String categoria){
        this.precio=precio;
        cant_inve = cantidad_inventario;
        this.categoria=categoria;
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCant_inve() {
        return cant_inve;
    }

    public void setCant_inve(int cant_inve) {
        this.cant_inve = cant_inve;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Frutas/Verduras:\nPrecio: " + precio + 
                "\nCantidad en inventario: " + cant_inve + 
                "\nCategoria: " + categoria;
    }
    
}
