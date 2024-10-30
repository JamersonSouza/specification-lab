package tech.jamersondev.specification_lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.jamersondev.specification_lab.model.Client;

import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {
}
