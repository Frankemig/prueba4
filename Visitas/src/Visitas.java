import java.util.ArrayList;
import java.util.List;

public class Visitas {

	public static void main(String[] args) {
				
/*List<Integer>listaVisitas= new ArrayList();

for (String visitas : args) {
	listaVisitas.add(Integer.parseInt(visitas));
}
System.out.println(promedio(listaVisitas));
	}

	
	private static float promedio(List<Integer>listaVisitas) {
		int suma = 0;
		float resultado = 0;
		for (int visita : listaVisitas) {
			suma+=visita;
		resultado = suma / listaVisitas.size();	
		}
		
		
		return resultado;*/
		
		ArrayList <Integer> nums = new ArrayList <Integer>();

		for(int i=0;i<args.length;i++) {
			nums.add(Integer.parseInt(args[i]));
		}
		
		if(nums.size() > 0)
			System.out.println(promedio(nums));
		else
			System.out.println("No hay datos\n");
		
		
	}
	 static Integer promedio(ArrayList<Integer> numeros) {
		 
		 int suma=0;
		 
		 for( int i : numeros) {
			 suma += i;
		 }
		 
		 return suma/numeros.size();
		
	}
}
