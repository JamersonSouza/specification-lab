package tech.jamersondev.specification_lab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import tech.jamersondev.specification_lab.model.Client;
import tech.jamersondev.specification_lab.records.ClientForm;
import tech.jamersondev.specification_lab.services.ClientService;
import tech.jamersondev.specification_lab.specifications.SpecificationClientTemplate;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public ResponseEntity<List<ClientForm>> listClients(SpecificationClientTemplate.ISpecificationClientTemplate specification){
        List<ClientForm> clients = this.clientService.listAllClients(specification);
        if(clients.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(clients);
    }
    @PostMapping
    @Transactional
    public ResponseEntity<ClientForm> create(@RequestBody ClientForm clientDTO, UriComponentsBuilder uriComponentsBuilder){
        Client client = this.clientService.create(clientDTO);
        URI uri = uriComponentsBuilder.path("client/{clientId}").buildAndExpand(client.getClientId()).toUri();
        return ResponseEntity.created(uri).body(new ClientForm(client));
    }
}
