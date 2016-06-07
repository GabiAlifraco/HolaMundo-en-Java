package holaMundo;

public class RecepcionistaFormal extends Recepcionista{
	@Override
	protected String armarSaludo (Nombrable nombrable){
		return "Buen dia estimado " + nombrable.getNombre();
	}
}
