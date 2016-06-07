package holaMundo;

public class RecepcionistaClasico extends Recepcionista{
	@Override
	protected String armarSaludo (Nombrable nombrable){
		return "hola " + nombrable.getNombre();
	}
}
