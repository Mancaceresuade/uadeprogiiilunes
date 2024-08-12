package clase1;

import java.util.ArrayList;

public class EjemploMaps {
    public static void main(String[] args) {
        ArrayList<Factura> facturas = new ArrayList<>();
        facturas.add(new Factura(1,1,10000.0));
        facturas.add(new Factura(1,2,20000.0));
        facturas.add(new Factura(1,1,10000.0));

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(1,"Carlos"));
        clientes.add(new Cliente(2,"Juana"));

        System.out.println("hola mundo");
    }
}

class Cliente {
    private int idCliente;
    private String nombre;
    Cliente(int idCliente,String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
    }
    public int getIdCliente() {
        return this.idCliente;
    }
    public String getNombre() {
        return this.nombre;
    }
    @Override
    public String toString() {
        return this.nombre + " " + this.idCliente;
    }
}

class Factura {
    private int idFactrua;
    private int idCliente;
    private double importe;
    public Factura(int idFactrua,int idCliente,double importe) {
        this.idFactrua = idFactrua;
        this.idCliente = idCliente;
        this.importe = importe;
    }   
    public int getIdFactura() {
        return this.idFactrua;
    }
    public int getIdCliente() {
        return this.idFactrua;
    }
    public double getImporte() {
        return this.importe;
    }
}