package com.cpl.mannager.utils;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.cpl.mannager.app.beans.ArchivoLeido;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;

public class MannagerUtils {

	public List<ArchivoLeido> obtenerListArchivos() {
		List<ArchivoLeido> archivos = null;
		try {
			InputStream in = MannagerUtils.class
					.getResourceAsStream(MannagerConstants.PATH_ID_CARLOS_PALALIA);
			GoogleDriveToolConection gdToolConection = new GoogleDriveToolConection(in);

			Drive service = gdToolConection.getDriveService();
			FileList result = service.files().list()//;.setMaxResults(10)
					.execute();
			List<File> files = result.getItems();
			if (files == null || files.size() == 0) {
				System.out.println("No files found.");
			} else {
				System.out.println("Files:");
				archivos = new ArrayList<ArchivoLeido>();
				for (File file : files) {
					ArchivoLeido newFile = new ArchivoLeido();
					newFile.setFile(file);
					newFile.setExtension(getExtension(file.getMimeType()));
					//newFile.setTamanio();
					System.err.println(file.getMimeType() + "--> " + file.getTitle() + " ("+ file.getId() + ")");
					archivos.add(newFile);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return archivos;
	}
	
	private String getExtension(String mimeType){
		String extension = "";
		if(mimeType.contains(".")){
			mimeType = mimeType.replace(".", "_");
			String [] array = mimeType.split("_");
			extension = array[array.length - 1];
		}else{
			String [] array = mimeType.split("/");
			extension = array[array.length - 1];
		}
		return extension;
	}
	
}
