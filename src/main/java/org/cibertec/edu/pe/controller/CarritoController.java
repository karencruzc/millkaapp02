package org.cibertec.edu.pe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/*@Controller
@SessionAttributes({"lista"})*/
public class CarritoController {
	/*@ModelAttribute("lista")
	public List<carrito> getLista(){
		return new ArrayList<carrito>();
	}
	@GetMapping("/carrito")
	public String verCarrito() {
		return "carrito";
	}
	@GetMapping("/comprar") //http://localhost:8085/comprar/1/20
	public String comprar(@RequestParam("id") int id,
							@RequestParam("cant") int cant, 
						  Model modelo) {
		int contador = 0, suma = 0; boolean encontrado=false;
		List<carrito> miLista = (List<carrito>) modelo.getAttribute("lista");
		
		
		if(miLista.size()>0) {
			for(carrito Obj : miLista)
				if(Obj.getIdProducto()==id) {
					encontrado=true;
					Obj.setCantidad(Obj.getCantidad()+cant);
					break;
				}
			
		}
		if(!encontrado){		
		
		
		//Añadirlos a la Lista
		miLista.add(new carrito(id, cant));
		}
	     
		//recorred la lista de los prouctos adquiridos
		for(carrito Obj : miLista) {
			contador++;
			suma += Obj.getCantidad();
		}
		
		//Enviarlo a la vista
		modelo.addAttribute("num_prod", contador);
		modelo.addAttribute("sum_cant", suma);
		modelo.addAttribute("miLista", miLista);
		return "ver";		
	}*/

}
