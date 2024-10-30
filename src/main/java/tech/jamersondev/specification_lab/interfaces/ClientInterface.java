package tech.jamersondev.specification_lab.interfaces;

import tech.jamersondev.specification_lab.model.Client;
import tech.jamersondev.specification_lab.records.ClientForm;

import java.util.List;

public interface ClientInterface {
    List<ClientForm> listAllClients();

    Client create(ClientForm client);

}
