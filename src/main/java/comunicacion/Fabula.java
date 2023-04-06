package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas,String ensenanza,String interpretacion){
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public int palabrasTotales(int palPagi){
		return this.getPaginas() * palPagi * 1;
		
	}
	public String interpretacion(){
		return interpretacion;
	}
	public String toString(){
		String valorAtributos = super.getOrigen() + "\n";
		valorAtributos += super.getTitulo() + "\n";
		valorAtributos += super.getAutor() + "\n";
		valorAtributos += super.getPaginas() + "\n";
		valorAtributos += this.ensenanza;
		return valorAtributos;
		
	}

}
