/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Erika
 */
// Clase Singleton que representa una configuración global para todo el sistema
public class ConfiguracionGlobal {

    // Instancia única de la clase (Singleton)
    private static ConfiguracionGlobal instancia;

    // Atributos configurables globalmente
    private String idioma;
    private String logo;

    // Constructor privado para evitar que otros creen objetos directamente
    private ConfiguracionGlobal() {
    }

    // Método estático que devuelve la instancia única (lazy initialization)
    public static ConfiguracionGlobal getInstancia() {
        if (instancia == null) {
            // Si no existe aún, se crea
            instancia = new ConfiguracionGlobal();
        }
        // Se devuelve la misma instancia siempre
        return instancia;
    }

    // Getter del idioma
    public String getIdioma() {
        return idioma;
    }

    // Setter del idioma
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    // Getter del logo
    public String getLogo() {
        return logo;
    }

    // Setter del logo
    public void setLogo(String logo) {
        this.logo = logo;
    }
}
