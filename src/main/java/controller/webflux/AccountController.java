package controller.webflux;

import model.mongo.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import repository.mongo.AccountRepository;

/**
 *  No SpringWebFlux, o retorno de collection é "Flux" e o retorno de um objeto é "Mono"
 *
 *
 */

@RestController
public class AccountController {

    private static final Logger log = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private AccountRepository repository;

    @GetMapping("/customer/{customer}")
    public Flux findByCustomer(@PathVariable("customer") String customerId) {
        log.info("findByCustomer: customerId={}", customerId);
        return repository.findByCustomerId(customerId);
    }

    @GetMapping
    public Flux findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Mono findById(@PathVariable("id") String id) {
        log.info("findById: id={}", id);
        return repository.findById(id);
    }

    @PostMapping
    public Mono create(@RequestBody Account account) {
        log.info("create: {}", account);
        return repository.save(account);
    }


}
