package GestionInventarioProductos;
import java.util.Scanner;
public class Producto {
	
	private String nombre;
	private double precio;
	private int cantidadEnStock;
	
	
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto(String nombre, double precio, int cantidadEnStock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadEnStock = cantidadEnStock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadEnStock() {
		return cantidadEnStock;
	}

	public void setCantidadEnStock(int cantidadEnStock) {
		this.cantidadEnStock = cantidadEnStock;
	}
	
	public void vender() {
		Scanner sc = new Scanner(System.in);
		int cantidadComprar;
		double precioFinal;
		
		System.out.println("Ingrese la cantidad que quieres comprar :");
		cantidadComprar = sc.nextInt();
		
		this.cantidadEnStock = this.cantidadEnStock-cantidadComprar;
		System.out.println("El stock :"+this.cantidadEnStock);
		
		if(this.cantidadEnStock <0) {
			System.out.println("No queda stock para este producto.");
			System.out.println("Agotado.");
		}else {
			precioFinal = cantidadComprar * this.precio;
		System.out.println("El precio final de la compra es :"+precioFinal);
		if(cantidadComprar > 5) {
			System.out.println("Venta exitosa !!");
		}else {
			System.out.println("Venta no exitosa.");
		}
		}
		
		
		
		
		
		
		
		
		
		
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidadEnStock=" + cantidadEnStock + "]";
	}
	
	
	
	

}
