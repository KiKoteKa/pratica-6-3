package Actividad_3;

import javax.swing.JOptionPane;

public class Fabrica {

	public static void main(String[] args) {
		
		Coche car1 = new Coche();
		
		car1.setMatricula("1234-DF");
		car1.setModelo("Toledo");
		car1.setColor("azul");
		car1.setKilometros(200);
		
		
		Coche car2 = new Coche("5678-AG");
		
		car2.setMarca("Fiat");
		car2.setModelo("Uno");
		car2.setColor("rojo");
		car2.setTechoSolar(true);
		car2.setKilometros(300);
		car2.setNumPlazas(2);
		
		
		Coche car3 = new Coche(5, 5);
		
		car3.setMatricula("9012-HH");
		car3.setMarca("BMW");
		car3.setModelo("850");
		car3.setColor("gris");
		car3.setKilometros(400);
		
		
		Coche car4 = new Coche("VW", "Caddy", "blanco");
		
		car4.setMatricula("3456-XS");
		car4.setTechoSolar(true);
		car4.setKilometros(500);
		car4.setNumPuertas(5);
		car4.setNumPlazas(7);
		
		
		
		Coche [] coches = new Coche[4]; 
		
		coches[0] = car1;
		coches[1] = car2;
		coches[2] = car3;
		coches[3] = car4;
		
		
		for(int i=0; i<coches.length; i++ ) {
			
			JOptionPane.showMessageDialog(null, caracteristicas(coches[i]));
			System.out.println(caracteristicas(coches[i]));
			
		}
		
		
	}

	
	public static String caracteristicas(Coche car) {
		
		String resultado = "";
		
		resultado = "Matricula: " + car.getMatricula() + "\n";
		resultado += "Marca: " + car.getMarca() + "\n";
		resultado += "Modelo: " + car.getModelo() + "\n";		
		resultado += "Color: " + car.getColor() + "\n";		
		
		if(car.isTechoSolar()) {
			
			resultado += "Tiene Techo Solar  \n";
			
		}else {
			
			resultado += "No Tiene Techo Solar  \n";
		}
		
		resultado += "Kilometros: " + car.getKilometros() + "\n";
		resultado += "Numero de Puertas: " + car.getNumPuertas() + "\n";
		resultado += "Numero de Plazas: " + car.getNumPlazas() + "\n";		  
		
		return resultado;
		
	}
	
}
