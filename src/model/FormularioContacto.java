/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DaddyChary
 */

// La clase representa un formulario de contacto y permite clonarlo
public class FormularioContacto implements Cloneable {

    // Título del formulario
    private String titulo;

    // Lista de campos del formulario (por ejemplo: nombre, correo, etc.)
    private List<String> campos;

    // Constructor que inicializa el título y la lista de campos vacía
    public FormularioContacto(String titulo) {
        this.titulo = titulo;
        this.campos = new ArrayList<>();
    }

    // Método para personalizar el formulario: cambia el título y agrega un campo
    public void personalizar(String titulo, String campo) {
        this.titulo = titulo;
        this.campos.add(campo);
    }

    // Muestra el contenido del formulario en consola
    public void mostrar() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Campos:");
        for (String campo : campos) {
            System.out.println("- " + campo);
        }
        // Muestra configuraciones globales como idioma y logo, usando una clase Singleton
        System.out.println("Idioma: " + ConfiguracionGlobal.getInstancia().getIdioma());
        System.out.println("Logo: " + ConfiguracionGlobal.getInstancia().getLogo());
        System.out.println("-------------------------------");
    }

    // Método sobrescrito para clonar el objeto (patrón Prototype)
    @Override
    public FormularioContacto clone() {
        try {
            // Clona el objeto base
            FormularioContacto clon = (FormularioContacto) super.clone();
            // Crea una nueva lista copiando los campos (para evitar referencias compartidas)
            clon.campos = new ArrayList<>(this.campos);
            return clon;
        } catch (CloneNotSupportedException e) {
            // Excepción que solo ocurre si la clase no implementa Cloneable (no debería pasar aquí)
            throw new AssertionError("Clonación no soportada");
        }
    }
}
