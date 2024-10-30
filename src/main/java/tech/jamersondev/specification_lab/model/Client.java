package tech.jamersondev.specification_lab.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "tb_client")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID clientId;
    private String name;
    private String email;
    private int age;

    public Client() {
    }

    public Client(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
