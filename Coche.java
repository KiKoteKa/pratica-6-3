package Actividad_3;

public class Coche {

	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private boolean techoSolar;
	private double kilometros;
	private int numPuertas;
	private int numPlazas;
	
	public Coche(String matricula) {
		this.matricula = matricula;
		this.marca = "Seat";
		this.modelo = "Altea";
		this.color = "blanco";
		this.techoSolar = false;
		this.kilometros = 0;
		this.numPuertas = 3;
		this.numPlazas = 5;
		
	}
	
	public Coche(int numPuertas, int numPlazas) {
		
		this.marca = "Seat";
		this.modelo = "Altea";
		this.color = "blanco";
		this.techoSolar = false;
		this.kilometros = 0;
		
		this.setNumPuertas(numPuertas);
		this.setNumPlazas(numPlazas);
		
	}
	
	public Coche(String marca, String modelo, String color) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.techoSolar = false;
		this.kilometros = 0;
		this.numPuertas = 3;
		this.numPlazas = 5;
		
	}
	
	public Coche() {
		
		this.marca = "Seat";
		this.modelo = "Altea";
		this.color = "blanco";
		this.techoSolar = false;
		this.kilometros = 0;
		this.numPuertas = 3;
		this.numPlazas = 5;
		
	}
	
	
	
	public void avanzar(double kilometros) {
		
		System.out.println("Kilometros Originales: " + this.kilometros + "Añadidos: " + kilometros);
		this.kilometros += kilometros;
		System.out.println("Suma Total: " + this.kilometros);
		
	}
	
	
	public void tunear() {
		
		this.kilometros = 0;
		
		this.techoSolar = true;
		
		System.out.println("Coche Tuneado");
		
	}
	
	
	public void tunear(String color) {
		
		this.color = color;
		
		this.tunear();
		
	}
	
	
	public void matricular(String matricula) {
	
		this.matricula = matricula;
		
	}
	
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isTechoSolar() {
		return techoSolar;
	}
	public void setTechoSolar(boolean techoSolar) {
		this.techoSolar = techoSolar;
	}
	public double getKilometros() {
		return kilometros;
	}
	public void setKilometros(double kilometros) {
		
		if(kilometros>0) {
		
			this.kilometros = kilometros;
		}
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		
	
		if(numPuertas<=5 && numPuertas>0) {
		
			this.numPuertas = numPuertas;	
		}	
	}
	public int getNumPlazas() {
		return numPlazas;
	}
	public void setNumPlazas(int numPlazas) {
		
		if(numPlazas<=7 && numPlazas > 0) {
			this.numPlazas = numPlazas;
		}
	}
	
}
