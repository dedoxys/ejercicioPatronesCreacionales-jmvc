package ejercicioPatronesCreacionalesjmvc;

public class PersonaBuilder {

	private String colorOjos;
	private String colorPelo;
	private String tipoPelo;
	private String tipoOjos;
	private String nombre;
	private int edad;
	private String ciudad;
	private int peso;
	private int altura;

	public Persona construir() {
		return new Persona(this);
	}

	public String getColorOjos() {
		return this.colorOjos;
	}

	public void setColorOjos(String _colorOjos) {
		this.colorOjos = _colorOjos;
	}

	public String getColorPelo() {
		return this.colorPelo;
	}

	public void setColorPelo(String _colorPelo) {
		this.colorPelo = _colorPelo;
	}

	public String getTipoPelo() {
		return this.tipoPelo;
	}

	public void setTipoPelo(String _tipoPelo) {
		this.tipoPelo = _tipoPelo;
	}

	public String getTipoOjos() {
		return this.tipoOjos;
	}

	public void setTipoOjos(String _tipoOjos) {
		this.tipoOjos = _tipoOjos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String _nombre) {
		this.nombre = _nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int _edad) {
		this.edad = _edad;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String _ciudad) {
		this.ciudad = _ciudad;
	}

	public int getPeso() {
		return this.peso;
	}

	public void setPeso(int _peso) {
		this.peso = _peso;
	}

	public int getAltura() {
		return this.altura;
	}

	public void setAltura(int _altura) {
		this.altura = _altura;
	}
}
