package holaMundo;

public class Test {

	public static void main(String[] args){
		RecepcionistaClasico recepcionistaClasico = new RecepcionistaClasico();
		//RecepcionistaFormal recepcionistaFormal = new RecepcionistaFormal();
		//Mundo mundo= new Mundo();
		//recepcionistaClasico.saludar(mundo); //new RecepcionistaClasico().saludar(mundo); 
		//recepcionistaFormal.saludar(mundo); //new RecepcionistaFormal().saludar(mundo); 
		// Quedo viejo: new Recepcionista().saludar(new Mundo()); porque las variables no se vuelven a usar
		Nombrable nombrable = new Mundo();
		recepcionistaClasico.saludar(nombrable);
		nombrable = new Persona("Jose");
		recepcionistaClasico.saludar(nombrable);
	}
}
