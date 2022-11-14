package zapatomain;

public class zapatomain {
    public static void main(String[] args) {
        zapato par1 = new zapato("Náutico", "Azul",42,10,40,false);
        zapato par2 = new zapato("De Salón", "Rojo", 38, 3, 25, true);

        System.out.println("Tipo:" + par1.tipo + "  Color:" + par1.color + "  Número:" + par1.numero +
                 "    En liquidación:" + par1.liquidacion + "  Cantidad en Almacén:" + par1.getCantidad() + "  Precio:" + par1.getPrecio());

        System.out.println("Tipo:" + par2.tipo + "  Color:" + par2.color + "  Número:" + par2.numero +
                "   En liquidación:" + par2.liquidacion + "   Cantidad en Almacén:" + par2.getCantidad() + "   Precio:" + par2.getPrecio());

    }
}
