import java.util.ArrayList;

public class SmartWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> pasos = new ArrayList<Integer> ();
		for (String paso : args) {
			pasos.add(Integer.parseInt(paso));
		}
		ArrayList<Integer> nuevalista =clearSteps(pasos);
		float resultado = promedio(nuevalista);
		System.out.println(resultado);
	}
	
	static ArrayList<Integer> clearSteps(ArrayList<Integer> pasos) {
		
		ArrayList<Integer> pasosfiltrados = new ArrayList<Integer> ();
		
		for (Integer paso : pasos) {
			if (paso >=200 && paso <=100000){
				pasosfiltrados.add(paso);
			}
		}
		
		return pasosfiltrados;
		

	}
	public static float promedio(ArrayList<Integer> lista) {
		float resultado;
		float acumulador = 0;
		for (int x : lista) {
			acumulador += x;
		}
		resultado = acumulador / lista.size();
		return resultado;
	}

}
