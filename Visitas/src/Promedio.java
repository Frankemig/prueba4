import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		for (String numero : args) {
			numeros.add(Integer.parseInt(numero));
		}
		List<Integer> numerosFiltrados = numeros.parallelStream().filter(x -> x % 3 == 0).collect(Collectors.toList());
		System.out.println(numerosFiltrados);
		System.out.println(suma(numerosFiltrados));
		System.out.println(promedio(numerosFiltrados));
	}

	public static int suma(List<Integer> numerosFiltrados) {
		int acumulador = 0;
		for (int numero : numerosFiltrados) {
			acumulador += numero;
		}

		return acumulador;

	}

	public static float promedio(List<Integer> numerosFiltrados) {
		int acumulador = 0;
		for (int numero : numerosFiltrados) {

			acumulador += numero;
		}

		return acumulador / numerosFiltrados.size();

	}
}