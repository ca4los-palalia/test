package com.cpl.mannager.app.vm;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

import com.cpl.mannager.app.vm.variables.IndexVariables;

public class IndexVM extends IndexVariables {

	
	private int count;
	

	@Init
	public void init() {
		count = 100;
		archivosDrive = utils.obtenerListArchivos();
	}

	@Command
	@NotifyChange("count")
	public void cmd() {
		++count;
	}

	public int getCount() {
		return count;
	}
	
}
