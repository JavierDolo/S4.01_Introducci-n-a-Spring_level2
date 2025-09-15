package cat.itacademy.s04.t01.n02.s04t01n02.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    // Metodo 1 - RequestParam
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String nombre) {
        return "Hola, " + nombre + ". Esto esta funcionado";
    }

    // Metodo 2 - PathVariable
    @GetMapping({"/HelloWorld2", "/HelloWorld2/{nombre}"})
    public String saluda2(@PathVariable(required = false) String nombre) {
        if (nombre == null) {
            nombre = "UNKNOWN";
        }
        return "Hola, " + nombre + ". Esto esta funcionado tambien";
    }
}
