package mx.tecnm.itlp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.tecnm.itlp.dao.AlumnoJDBC;
import mx.tecnm.itlp.models.Alumno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoREST {
    @Autowired
    AlumnoJDBC repo;

    @GetMapping
    public List<Alumno> getAlumno() {
        
        return repo.consultar();
    }
    // en workbench agregar una columna llamada activo 
    // aqui empieza el desmadre
  //  @GetMapping("/{id}")
  
//@DeleteMapping("/{id}")
//public void desactivarAlumno(@PathVariable int id){
//repo.desactivar (id);  
//}




//@PutMapping
//public void actualizarAlumno(@RequestBody Alumno alumno){
// repo.actualizar(alumno)
//}


  
  
  // @PostMapping
  //public void insertarAlumno(@RequestBody Alumno alumno){
//  repo.insertar(Alumno);
  //} 
    

}
