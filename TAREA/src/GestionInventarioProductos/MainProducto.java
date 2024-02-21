package GestionInventarioProductos;
import java.util.Scanner;
public class MainProducto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		 Producto[] productos = new Producto[5];

	        
	        productos[0] = new Producto("Lavadora", 90, 20);
	        productos[1] = new Producto("Armario", 70, 3);
	        productos[2] = new Producto("Lampara", 40, 15);
	        productos[3] = new Producto("Microondas", 30, 40);
	        productos[4] = new Producto("Television", 100, 25);
		
		for(Producto producto : productos) {
			mostrarInformacionProductos(producto);
		}
		
		do {
			System.out.println("1. Lavadora.");
			System.out.println("2. Armario.");
			System.out.println("3. Lampara.");
			System.out.println("4. Microondas.");
			System.out.println("5. Television.");
			System.out.println("6. Salir :");
			System.out.println("Ingrese una opcion :");
			opcion =sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				System.out.println("Lavadora :");
				productos[0].vender();
				break;
				
			case 2:
				System.out.println("Armario :");
				productos[1].vender();
				break;
				
			case 3:
				System.out.println("Lampara :");
				productos[2].vender();
				break;
				
			case 4:
				System.out.println("Microondas :");
				productos[3].vender();
				break;
				
			case 5:
				System.out.println("Television :");
				productos[4].vender();
				break;
				
			case 6:
				System.out.println("FIN PROGRAMA");
				break;
				
			default:
				System.out.println("Opcion incorrecta, vuelva a intentarlo.");
				break;
						}
			System.out.println();
		}while(opcion != 6);
		
		
		
	}
	
	public static void mostrarInformacionProductos(Producto producto) {
		System.out.println("Nombre :"+producto.getNombre());
		System.out.println("Precio :"+producto.getPrecio());
		System.out.println("Stock :"+producto.getCantidadEnStock());
		System.out.println();
	}
	
	

}
