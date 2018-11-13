package maquina_de_moore;

public class Estado {
	
	private String id; //Idealmente el formato es q[0...n]
	
	public Estado(String id) {
		this.id = id; 
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
