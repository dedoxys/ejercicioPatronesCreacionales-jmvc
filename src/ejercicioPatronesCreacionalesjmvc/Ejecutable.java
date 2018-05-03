package ejercicioPatronesCreacionalesjmvc;

import java.io.IOException;

public class Ejecutable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonaBuilder pb = new PersonaBuilder();
		Persona p;
		String linea = "";
		try {
			linea = Persona.leerFicheroTxt();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String []separado = linea.split("#");
		
		
		for (int i = 0; i < separado.length; i++) {
			String []propiedad = separado[i].split(":");
			if(propiedad[0].equals("colorOjos")) {
				pb.setColorOjos(propiedad[1]);
			}else if(propiedad[0].equals("colorPelo")) {
				pb.setColorPelo(propiedad[1]);
			}else if(propiedad[0].equals("tipoPelo")) {
				pb.setTipoPelo(propiedad[1]);
			}else if(propiedad[0].equals("tipoOjos")) {
				pb.setTipoOjos(propiedad[1]);
			}else if(propiedad[0].equals("nombre")) {
				pb.setNombre(propiedad[1]);
			}else if(propiedad[0].equals("edad")) {
				pb.setEdad(Integer.valueOf(propiedad[1]));
			}else  if(propiedad[0].equals("ciudad")) {
				pb.setCiudad(propiedad[1]);
			}else  if(propiedad[0].equals("peso")) {
				pb.setPeso(Integer.valueOf(propiedad[1]));
			}else  if(propiedad[0].equals("altura")) {
				pb.setAltura(Integer.valueOf(propiedad[1]));
			}
			
			
			
		}
		p = pb.construir();
		System.out.println(p);
	}

}
