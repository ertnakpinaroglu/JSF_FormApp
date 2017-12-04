package com.ertanAkpinaroglu.ManagedBean;

import java.util.*;
import javax.faces.bean.*;

@ManagedBean
@RequestScoped
public class FormManagedBean {
	private String isimSoyisim;
	private String adres;
	private String il;
	private String parola;
	private List<String> cinsiyet = new ArrayList();
	private String ehliyetVarmi;
	private String mesaj;
	private boolean kabulEdildimi;

	// Setters
	public void setIsimSoyisim(String isimSoyisim) {
		this.isimSoyisim = isimSoyisim;
	}

	public void setKabulEdildimi(boolean kabulEdildimi) {
		this.kabulEdildimi = kabulEdildimi;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public void setIl(String il) {
		this.il = il;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public void setCinsiyet(List<String> cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public void setEhliyetVarmi(String ehliyetVarmi) {
		this.ehliyetVarmi = ehliyetVarmi;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

	// Getters
	public String getIsimSoyisim() {
		return isimSoyisim;
	}

	public boolean isKabulEdildimi() {
		return kabulEdildimi;
	}

	public String getAdres() {
		return adres;
	}

	public String getIl() {
		return il;
	}

	public String getParola() {
		return parola;
	}

	public List<String> getCinsiyet() {
		return cinsiyet;
	}

	public String getEhliyetVarmi() {
		return ehliyetVarmi;
	}

	public String getMesaj() {
		if (!kabulEdildimi) {
			mesaj = "Þartlarý kabul etmediniz";
		}
		else {
			mesaj = "Þartlarý kabul ettiniz";
		}
		return  mesaj;
	}
}
