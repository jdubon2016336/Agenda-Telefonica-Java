public class Persona{
	String nombre;
	String apellido;
	int edad;
	int codigo;
	
	public Persona(String nombre,String apellido,int edad,int codigo){
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.codigo=codigo;
	}

	public void setNombre(String nombre){
			this.nombre=nombre;
	}
	public String getNombre(){
			return nombre;
	}
	
	public void setApellido(String apellido){
			this.apellido=apellido;
	}
	public String getApellido(){
			return apellido;
	}
	public void setEdad(int edad){
			this.edad=edad;
	}
	public int getEdad(){
			return edad;	
	}
	public void setCodigo(int codigo){
			this.codigo=codigo;
	}
	public int getCodigo(){
			return codigo;	
	}
	
}