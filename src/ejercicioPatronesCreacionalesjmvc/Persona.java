package ejercicioPatronesCreacionalesjmvc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Persona {

	private String colorOjos;
	private String colorPelo;
	private String tipoPelo;
	private String tipoOjos;
	private String nombre;
	private int edad;
	private String ciudad;
	private int peso;
	private int altura;

	public Persona(PersonaBuilder personaBuilder) {
		this.colorOjos = personaBuilder.getColorOjos();
		this.colorPelo = personaBuilder.getColorPelo();
		this.tipoPelo = personaBuilder.getTipoPelo();
		this.tipoOjos = personaBuilder.getTipoOjos();
		this.nombre = personaBuilder.getNombre();
		this.edad = personaBuilder.getEdad();
		this.ciudad = personaBuilder.getCiudad();
		this.peso = personaBuilder.getPeso();
		this.altura = personaBuilder.getAltura();
	}

	public String getColorOjos() {
		return this.colorOjos;
	}

	public String getColorPelo() {
		return this.colorPelo;
	}

	public String getTipoPelo() {
		return this.tipoPelo;
	}

	public String getTipoOjos() {
		return this.tipoOjos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public int getPeso() {
		return this.peso;
	}

	public int getAltura() {
		return this.altura;
	}

	public static String leerFicheroTxt() throws IOException {
		File file = new File("archivo.txt");
		String linea = "";
		String cadena = "";
		FileReader fr = new FileReader(file.getName());
		BufferedReader br = new BufferedReader(fr);
		while ((cadena = br.readLine()) != null) {
			linea += cadena;
			linea += "#";
		}

		br.close();
		fr.close();
		return linea;
	}

	public String toString() {
		String cadena = "";

		cadena += "colorOjos: " + this.colorOjos + " colorPelo: " + this.colorPelo + " tipoPelo: " + this.tipoPelo
				+ " tipoOjos: " + this.tipoOjos + " nombre: " + this.nombre + " edad: " + this.edad + " ciudad: "
				+ this.ciudad + " peso: " + this.peso + " altura: " + this.altura;

		return cadena;
	}

}
