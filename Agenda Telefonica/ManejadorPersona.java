public class ManejadorPersona{
	static Persona[] persona=new Persona[5];

	public void ingresoPersona(String nombre,String apellido,int edad, int codigo){
		
		persona[0]=new Persona(nombre,apellido,edad,codigo);
		
		
	}
	
	

}