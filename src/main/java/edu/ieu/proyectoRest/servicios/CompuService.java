package edu.ieu.proyectoRest.servicios;

import java.util.List;

import edu.ieu.proyectoRest.entities.Compu;

public interface CompuService {
	Compu findById(Integer id);
	Compu findByModelo(String modelo);
    List<Compu> findAll(); 
    boolean isCompuExist(Compu comp);
    
    //Crea nuevo producto
    void saveCompu(Compu comp);
    
     //Actualiza algun producto
    void updateCompu(Compu comp);
    
    //Borra un producto
    void deleteCompuById(Integer id);
}
