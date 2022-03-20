import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean quit = false;
		int option = 0;

		while (!quit) {

			System.out.println("1.Agregar producto a coleccion" + "\n2.Mostrar categoria de producto"
					+ "\n3.Mostrar coleccion de usuario" + "\n4.Mostrar coleccion de inventario" + "\n5.Salir");

			option = input.nextInt();
			switch (option) {
			case 1:
				System.out.println("Agregar");
				break;
			case 2:
				System.out.println("Mostrar");
				break;
			case 3:
				System.out.println("1. Sin ordenar 2. Ordenada por tipo");
				break;
			case 4:
				System.out.println("1. Sin ordenar 2. Ordenada por tipo");
				break;
			case 5:
				System.out.println("1. Sin ordenar 2. Ordenada por tipo");
				break;

			}

		}

	}
}
