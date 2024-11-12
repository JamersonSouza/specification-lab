package tech.jamersondev.specification_lab.services;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import tech.jamersondev.specification_lab.interfaces.ClientInterface;
import tech.jamersondev.specification_lab.model.Client;
import tech.jamersondev.specification_lab.records.ClientForm;
import tech.jamersondev.specification_lab.repository.ClientRepository;

import java.util.List;

@Service
public class ClientService implements ClientInterface {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<ClientForm> listAllClients(Specification<Client> specification) {
        List<Client> allClients = this.clientRepository.findAll(specification);
        return allClients.stream().map(ClientForm::new).toList();
    }

    @Override
    public Client create(ClientForm clientform) {
        Client client = new Client(clientform.name(), clientform.email(),
                clientform.age());
        return this.clientRepository.save(client);
    }
}
