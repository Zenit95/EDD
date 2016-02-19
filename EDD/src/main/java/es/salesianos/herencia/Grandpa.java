package es.salesianos.herencia;

public class Grandpa {

	private String name;

	public String getName(){
		return name;
	}

	private void setName(String name){
		this.name=name;
	}

	public void imprimir(){
		System.out.println(name);
	}

}
