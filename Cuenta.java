package com.ipartek.formacion.ejecicios;

public class Cuenta {
	
	private String nomCli;
	private String numCuen;
	private double interes;
	private double saldo;
	
	
	public Cuenta(String nomCli, String numCuen, double interes, double saldo) {
		super();
		this.nomCli = nomCli;
		this.numCuen = numCuen;
		this.interes = interes;
		this.saldo = saldo;
	}
	public Cuenta() {
		
	}
	public String getNomCli() {
		return nomCli;
	}
	public void setNomCli(String nomCli) {
		this.nomCli = nomCli;
	}
	public String getNumCuen() {
		return numCuen;
	}
	public void setNumCuen(String numCuen) {
		this.numCuen = numCuen;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
