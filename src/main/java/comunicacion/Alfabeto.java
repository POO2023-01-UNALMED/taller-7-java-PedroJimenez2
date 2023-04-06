package comunicacion;


public class Alfabeto extends Pictograma {
	private static String letras[];
	private String interpretacion;
	
	public Alfabeto(String origen,String[] letras,String interpretacion){
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public static String[] getLetras() {
		return letras;
	}

	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public int cantidadLetras() {
		return Alfabeto.letras.length;
		
	}
	public String interpretacion(){
		return interpretacion;
		
	}
	public String toString() {
		String abc = "";
		for (String letra: letras) {
			abc = abc + letra + ", ";
		}
		String abecedario = abc.substring(0, abc.length() - 2);
		return abecedario;
	}
}
