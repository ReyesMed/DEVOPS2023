package mx.tecnm.itlp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hellocontroller {
    
    @GetMapping("/hola")
    public String saludar(){
        return "Hola backend";
    }

    @GetMapping("/saludar")
    public String saludar(@RequestParam String nombre){
        return "Sin llorar... "+nombre;
    }


    @GetMapping("/eco")
    public String eco(@RequestParam String mensaje,@RequestParam int repeticiones){
        int i = 0;
        String eco = "";
        while(i < repeticiones) 
        {
         eco += ""+mensaje+" <br>";
         i++;
       }
       return eco;
        }
    }
    
    




