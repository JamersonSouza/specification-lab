package tech.jamersondev.specification_lab.records;

import tech.jamersondev.specification_lab.model.Client;

public record ClientForm(String name, String email, int age) {
    public ClientForm(Client client) {
        this(client.getName(), client.getEmail(),
                client.getAge());
    }
}
