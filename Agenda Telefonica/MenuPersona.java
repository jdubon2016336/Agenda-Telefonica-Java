public class MenuPersona{
	int opcion;
	ObtenerTexto oT=new ObtenerTexto();
	String nombre;
	String apellido;
	int edad;
	
	int codigo;
		
	public void menuPrincipal(){
	System.out.println("1....Ingreso de persona");
	System.out.println("2....Modificacion de persona");
	System.out.println("3....Eliminacion de persona");
	System.out.println("4....Reporte");
	opcion=oT.textoEntero();
	
	switch(opcion){
		case 1:
		codigo++;
		System.out.println("\nIngrese el nombre");
		nombre=oT.texto();
		System.out.println("\nIngrese el apellido");
		apellido=oT.texto();
		System.out.println("\nIngrese el edad");
		edad=oT.textoEntero();
		
		System.out.println("Su codigo personal es: 20190" + codigo);
		break;
		
		case 2:
	}
	
	
	
	}

}