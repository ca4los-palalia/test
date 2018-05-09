package com.cpl.mannager.app.vm.variables;

import java.util.List;

import com.cpl.mannager.app.beans.ArchivoLeido;
import com.cpl.mannager.app.layers.MannagerVariablesGlobales;

public class IndexVariables extends MannagerVariablesGlobales{

	protected List<ArchivoLeido> archivosDrive;

	public List<ArchivoLeido> getArchivosDrive() {
		return archivosDrive;
	}

	public void setArchivosDrive(List<ArchivoLeido> archivosDrive) {
		this.archivosDrive = archivosDrive;
	}

	
}
