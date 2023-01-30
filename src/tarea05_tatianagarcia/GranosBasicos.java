package tarea05_tatianagarcia;

/**
 *
 * @author tatig
 */
public class GranosBasicos {
    private String nombre; 
    private int cant_quintales;
    private double precio; 
    private String medida; //Unidad de medida -> libra, medida, kilo
    private String lugar; 
    
    public GranosBasicos(){
    }
    public GranosBasicos(String nombre, int cantidad_quintales, double precio, String unidad_medida, String lugar_procedencia){
        this.nombre=nombre;
        cant_quintales = cantidad_quintales;
        this.precio=precio;
        medida=unidad_medida;
        lugar = lugar_procedencia;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCant_quintales() {
        return cant_quintales;
    }
    public void setCant_quintales(int cant_quintales) {
        this.cant_quintales = cant_quintales;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getMedida() {
        return medida;
    }
    public void setMedida(String medida) {
        this.medida = medida;
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Granos Basicos:\nNombre:" + nombre + 
                "\nCantidad de quintales: " + cant_quintales + 
                "\nPrecio: " + precio + 
                "\nMedida: " + medida + 
                "\nLugar: " + lugar ;
    }
    
}
