
package vehiculo;

/**
 * 
 * @author Usuario
 * @version 1.0
 * @since 26/04/24
 */
public class VehiculoAGG2324 {

    protected String nombre;
    protected double precio;
    protected double precioIVA;
    protected int stock;

    /* Constructor sin argumentos */
    public VehiculoAGG2324 ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    
    /**
     * Constructor con parámetros
     * @param nom nombre del vehículo
     * @param precio precio de venta del vehículo
     * @param stock número de unidades en stock
     */
    public VehiculoAGG2324 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
    /**
     * Método para asignar el nombre del vehículo
     * @param nom 
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    /**
     * Método para obtener nombre del vehículo
     * @return 
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método para obtener el stock de un vehículo
     * @return 
     */
     public int obtenerStock ()
    {
        return getStock();
    }

    /**
     * 
     * @param cantidad
     * @throws Exception 
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }

    /**
     * 
     * @param cantidad
     * @throws Exception 
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }

    /**
     * Método de selección del atributo nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método de acceso del atributo nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the precioIVA
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * @param precioIVA the precioIVA to set
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
}  
   
    

