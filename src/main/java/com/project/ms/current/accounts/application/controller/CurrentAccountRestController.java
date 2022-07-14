package com.project.ms.current.accounts.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ms.current.accounts.domain.entities.CurrentAccount;
import com.project.ms.current.accounts.domain.services.CurrentAccountService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/current-accounts")
public class CurrentAccountRestController {
	
	@Autowired
    private CurrentAccountService currentAccountService;

    @GetMapping("/")
    public Flux<CurrentAccount> getAll() {
        return currentAccountService.findAll();
    }
    
    @GetMapping("/{id}")
    public Mono<CurrentAccount> get(@PathVariable String id) {
        return currentAccountService.findById(id);
    }

    @PostMapping("/save")
    public Mono<CurrentAccount> save(@RequestBody CurrentAccount currentAccount) {
        return currentAccountService.save(currentAccount);
    }
    
    @DeleteMapping("/delete/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return currentAccountService.deleteById(id);
    }

}
