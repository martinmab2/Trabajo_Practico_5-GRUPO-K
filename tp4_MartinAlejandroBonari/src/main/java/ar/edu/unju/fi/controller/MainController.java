package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/inicio")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/carrera")
    public String getCarrerasPage() {
        return "redirect:/carrera/listado";
    }

    @GetMapping("/alumno")
    public String getAlumnosPage() {
        return "redirect:/alumno/listado";
    }

    @GetMapping("/docente")
    public String getDocentesPage() {
        return "redirect:/docente/listado";
    }

    @GetMapping("/materia")
    public String getMateriasPage() {
        return "redirect:/materia/listado";
    }

    @GetMapping("/nuevo")
    public String getAddCarreraPage() {
        return "carrera";
    }
}
