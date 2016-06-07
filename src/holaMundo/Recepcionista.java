package holaMundo;

public abstract class Recepcionista { //no se puede instanciar ningun objeto recepcionista directamente

	public void saludar (Nombrable nombrable){ // no solo para Mundo mundo, sino para personas tambien
	//System.out.println("hola " + mundo.getNombre()); lo que quedo viejo del paso 1
	System.out.println(this.armarSaludo(nombrable)); //el receptor del metodo es el mismo objeto
	}
	protected abstract String armarSaludo (Nombrable nombrable);
}
