package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Comentario JavaDoc en la clase Contacto
 */
class Persona {
    private String name;
    private List<String> phones;

    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    public String getName() {
        return this.name;
    }

    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}