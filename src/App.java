import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);
		//Variables:
		double seguidores;
		System.out.println("Introduce seguidores:");
		seguidores = entrada.nextDouble();
		
		//Mostrar formato:
		double mostrar_seguidores = seguidores / 1000;
		System.out.println(String.format("%.2f", mostrar_seguidores) + "k");
    }
}
