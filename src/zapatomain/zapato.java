package zapatomain;

public class zapato {
    public String tipo, color;
    public int numero;
    private int cantidad, precio;
    public boolean liquidacion;

    public zapato(String tipo, String color, int numero, int cantidad, int precio, boolean liquidacion){
        this.tipo = tipo;
        this.color = color;
        this.numero = numero;
        this.cantidad = cantidad;
        this.precio = precio;
        this.liquidacion = liquidacion;
    }
    public zapato(){

    }
    public int getCantidad(){
        return this.cantidad;
    }
    public int getPrecio(){
        return this.precio;
    }
}
