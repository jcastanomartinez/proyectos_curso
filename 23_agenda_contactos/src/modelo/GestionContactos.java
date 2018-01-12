package modelo;

import java.util.Collection;
import java.util.HashMap;

import beans.Contacto;

public class GestionContactos {

	Contacto contacto = new Contacto();
	HashMap<String,Contacto> contactos = new HashMap<>(); 
	
	public boolean anadirContacto(Contacto nuevoContacto) {
		if (!contactos.containsKey(nuevoContacto.getEmail())) {
			contactos.put(nuevoContacto.getEmail(),nuevoContacto);
			return true;
		}else {return false;}
		
	}
	
	public Contacto buscarContacto(String clave) {
		if (contactos.get(clave) != null) {
			return contactos.get(clave);
		}else {return null;}
	}
	
	public boolean eliminarContacto(String clave) {
		if (contactos.containsKey(clave)) {
			contactos.remove(clave);
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public HashMap<String,Contacto> mostrarContactos() {
		return contactos;
	}
}
