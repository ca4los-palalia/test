package com.cpl.mannager.app.beans;

import java.io.Serializable;

import com.google.api.services.drive.model.File;

public class ArchivoLeido implements Serializable {

	private static final long serialVersionUID = -8176198935851091232L;
	private File file;
	private String extension;
	private String tamanio;
	private String icono;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

}
