public class Login {
	String usuario;
	String clave;
	ObtenerTexto oT=new ObtenerTexto();
	ManejadorUsuario mU=new ManejadorUsuario();
	
public void login(){
	System.out.println("Ingresar nombre de Usuario");
	usuario=oT.texto();
	System.out.println("Ingresar Clave");
	clave=oT.texto();
	
	mU.autentificar(usuario, clave);
	
}	
	
	
	
	
	
}