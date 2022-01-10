import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NegativosPositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		for (String numero : args) {
			numeros.add(Integer.parseInt(numero));
		}
		List<Integer> numerosPositivos = numeros.stream().filter(x -> x > 0).collect(Collectors.toList());
		List<Integer> numerosNegativos = numeros.stream().filter(x -> x < 0).collect(Collectors.toList());
		List<Integer> numerosCeros = numeros.stream().filter(x -> x==0).collect(Collectors.toList());
		System.out.println(numerosPositivos);
		System.out.println(contador(numerosPositivos));
		System.out.println(numerosNegativos);
		System.out.println(contador(numerosNegativos));
		System.out.println(numerosCeros);
		System.out.println(contador(numerosCeros));
	}
private static int contador(List<Integer>numerosFiltrados) {
	int i = 0;
	for (int  integer : numerosFiltrados) {
		i++;
		
	}
	return i;
}
}
