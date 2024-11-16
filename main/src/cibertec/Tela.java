package cibertec;

public class Tela {
	
	/*Inicializamos todas las variables de la tela
	 *Ejemplo:
	 * public static String codigo0 = "TF0";
	 * public static String descripcion0 = "Pinstripe Suit 1";
	 * public static String material0 = "98%Algodón, 2%Elastán";
	 * public static double ancho0 = 160.0;
	 * public static double peso0 = 220.0;
	 * public static double precio0 = 9.4;
	*/
	
	private String codigo;
	private String descripcion;
	private String material;
	private double ancho;
	private double peso;
	private double precio;
	//Las hacemos todas private para que solo puedan inicializadas/modificadas con getts y/o setters
	//En java se inicializan los atributos de una clase automaticamente

	//Constructor
	public Tela (String codigo, String descripcion, String material, double ancho, double peso, double precio) {
		
	this.codigo = codigo;
	this.descripcion = descripcion;
	this.material = material;
	this.ancho = ancho;
	this.peso = peso;
	this.precio = precio;
	}
	
	//getters:
	public String getCodigo() {
		return this.codigo;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
	public String getMaterial() {
		return this.material;
	}
	public double getAncho() {
		return this.ancho;
	}
	public double getPeso() {
		return this.peso;
	}
	public double getPrecio() {
		return this.precio;
	}
	
	//setters:
	public void setCodigo(String nuevoCodigo) {
		this.codigo = nuevoCodigo;
	}
	public void setDescripcion(String nuevoDescripcion) {
		this.descripcion = nuevoDescripcion;
	}
	public void setMaterial(String nuevoMaterial) {
		this.material = nuevoMaterial;
	}
	public void setAncho(double nuevoAncho) {
		this.ancho = nuevoAncho;
	}
	public void setPeso(double nuevoPeso) {
		this.peso = nuevoPeso;
	}
	public void setPrecio(double nuevoPrecio) {
		this.precio = nuevoPrecio;
	}

	@Override //El override es para aclarar que modificamos el metodo toString() de la superclase String.
    public String toString() {
        return "Codigo \t\t\t: " + codigo + "\n" +
                "Descripcion \t: " + descripcion + "\n" +
                "Material \t\t: " + material + "\n" +
                "Ancho \t\t\t: " + ancho + " cm\n" +
                "Peso \t\t\t: " + peso + " g/m²\n" +
                "Precio \t\t\t: S/ " + precio + "\n";
    }

}
