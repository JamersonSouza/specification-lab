package tech.jamersondev.specification_lab.interfaces;

import org.springframework.data.jpa.domain.Specification;
import tech.jamersondev.specification_lab.model.Client;
import tech.jamersondev.specification_lab.records.ClientForm;

import java.util.List;

public interface ClientInterface {
    List<ClientForm> listAllClients(Specification<Client> specification);

    Client create(ClientForm client);

}
