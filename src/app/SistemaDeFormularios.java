/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import model.ConfiguracionGlobal;
import model.FormularioContacto;

/**
 *
 * @author Erika
 */
public class SistemaDeFormularios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Configuración global del sistema (Singleton)
        ConfiguracionGlobal config = ConfiguracionGlobal.getInstancia();
        config.setIdioma("Spanish");
        config.setLogo("Agrosuper");

        // Formulario base
        FormularioContacto plantilla = new FormularioContacto("Formulario Base");
        plantilla.personalizar("Formulario Base", "Nombre: Pelusa");
        plantilla.personalizar("Formulario Base", "Correo: pelusa@gmail.com");
        plantilla.personalizar("Formulario Base", "Sexo: Cuando se puede");
        

        // Clon 1
        FormularioContacto clon1 = plantilla.clone();
        clon1.personalizar("Inscripción Taller", "Telefono: +56931052705");

        // Clon 2
        FormularioContacto clon2 = plantilla.clone();
        clon2.personalizar("Encuesta Evento", "Opinion: Zapallo Zapallo Zapallo Zapallo Zapallo");
        clon2.personalizar("Encuesta Evento", "Nota: Sopaipilla Sopaipilla Sopaipilla Sopaipilla");

        // Mostrar
        plantilla.mostrar();
        clon1.mostrar();
        clon2.mostrar();
    }

}
