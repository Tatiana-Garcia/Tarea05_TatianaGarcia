package tarea05_tatianagarcia;

/**
 *
 * @author tatig
 */
public class CarnesyEmbutidos {
    private String lugar; //lugar de procedencia
    private int inventario; //cantidad en inventario
    private String tipo; //tipo->res,carne blanca,cerdo
    private double precio;
    
    public CarnesyEmbutidos(){}
    public CarnesyEmbutidos(String lugar_procedencia, int inventario, String tipo, double precio){
        lugar = lugar_procedencia;
        this.inventario=inventario;
        this.tipo=tipo;
        this.precio=precio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Carnes y Embutidos:\nLugar: " + lugar + 
                "\nInventario: " + inventario + 
                "\nTipo: " + tipo + 
                "\nPrecio: " + precio;
    }
    
}
