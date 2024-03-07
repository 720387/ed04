package org.example;

public class initAgenda {
    static Agenda initAgenda() {
        // Crear una nueva agenda.
        Agenda agendaContactos = new Agenda();

        // Añadir contactos a la agenda.
        agendaContactos.addContact("John Doe", "1234567890");
        agendaContactos.addContact("Jane Doe", "9876543210");
        agendaContactos.addContact("Mary Jane", "1122334455");
        return agendaContactos;
    }
}