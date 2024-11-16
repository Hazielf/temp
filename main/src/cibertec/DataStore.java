package cibertec;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
	private static DataStore instance; //Patron SINGLETON
	
	//Declaramos Variables
	private List <Tela> telas;
	
	private double porcentaje1 = 4.0;
    private double porcentaje2 = 5.5;
    private double porcentaje3 = 7.0;
    private double porcentaje4 = 8.5;
    private int cantidadTotalOptima = 50;
    private int cantidadObsequiable = 20;
    private String obsequio = "USB";
    private int numeroClienteSorpresa = 5;
    private String premioSorpresa = "Una agenda";
    
    //Generamos una instancia SOLO si no se ha creado aun
    public static DataStore getInstance() {
        if (instance == null) {
            instance = new DataStore();
        }
        return instance;
    }
    
    private void inicializarTelas() {
        telas.add(new Tela("TF0", "Pinstripe Suit 1", "98%Algodón, 2%Elastán", 160.0, 220.0, 9.4));
        telas.add(new Tela("TF1", "Gabardina Oslo 5", "60%Algodón, 37%Poliéster", 145.0, 300.0, 11.3));
        telas.add(new Tela("TF2", "Sarga 2", "50%Poliéster, 50%Poliacril", 145.0, 425.0, 31.8));
        telas.add(new Tela("TF3", "Leni 1", "50%Poliéster, 50%Poliacril", 145.0, 410.0, 37.2));
        telas.add(new Tela("TF4", "Laurent 3", "100%Poliamida", 150.0, 140.0, 18.8));
    }
    
    //Sobrecarga De Constructores
    private DataStore() {
        telas = new ArrayList<>();
        inicializarTelas();
    }
    
    //Getters
    public List<Tela> getTelas() {
        return telas;
    }
    public double getPorcentaje1() {
        return porcentaje1;
    }
    public double getPorcentaje2() {
        return porcentaje2;
    }
    public double getPorcentaje3() {
        return porcentaje3;
    }
    public double getPorcentaje4() {
        return porcentaje4;
    }
    public int getCantidadTotalOptima() {
        return cantidadTotalOptima;
    }
    public int getCantidadObsequiable() {
        return cantidadObsequiable;
    }
    public String getObsequio() {
        return obsequio;
    }
    public int getNumeroClienteSorpresa() {
        return numeroClienteSorpresa;
    }
    public String getPremioSorpresa() {
        return premioSorpresa;
    }
    
    //Setter
    public void setPorcentaje1(double porcentaje1) {
        this.porcentaje1 = porcentaje1;
    }

    public void setPorcentaje2(double porcentaje2) {
        this.porcentaje2 = porcentaje2;
    }

    public void setPorcentaje3(double porcentaje3) {
        this.porcentaje3 = porcentaje3;
    }

    public void setPorcentaje4(double porcentaje4) {
        this.porcentaje4 = porcentaje4;
    }

    public void setCantidadTotalOptima(int cantidadTotalOptima) {
        this.cantidadTotalOptima = cantidadTotalOptima;
    }

    public void setCantidadObsequiable(int cantidadObsequiable) {
        this.cantidadObsequiable = cantidadObsequiable;
    }

    public void setObsequio(String obsequio) {
        this.obsequio = obsequio;
    }

    public void setNumeroClienteSorpresa(int numeroClienteSorpresa) {
        this.numeroClienteSorpresa = numeroClienteSorpresa;
    }

    public void setPremioSorpresa(String premioSorpresa) {
        this.premioSorpresa = premioSorpresa;
    }
}
