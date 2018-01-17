package modelo;

import java.util.Collection;
import java.util.HashMap;

import beans.Contacto;

public class GestionContactos {

	Contacto contacto = new Contacto();
	HashMap<String,Contacto> contactos = new HashMap<>(); 
	boolean res;
	
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

	public boolean buscarPorTelefono(int tel) {
		//String telefono=Integer.toString(tel);
		//contactos.computeIfPresent(tel,(x,y)->{if (x.equals(Long.toString(y.getTelefono()))) {};
		res=false;
		contactos.forEach((k,v) -> {if (v.getTelefono() == tel) res=true;});
		return res;
		
	} 
	
	public void cambiarDominio(String nuevoDominio) {		
		contactos.replaceAll((k,v) -> {
			String emailNuevo=v.getEmail().split("@")[0]+"@"+nuevoDominio;
			//String emailNuevo = v.getEmail().substring(0, v.getEmail().)
			v.setEmail(emailNuevo);
			return v;
		});
	}
}
