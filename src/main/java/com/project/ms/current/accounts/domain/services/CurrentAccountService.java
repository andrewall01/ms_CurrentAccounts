package com.project.ms.current.accounts.domain.services;

import com.project.ms.current.accounts.domain.entities.CurrentAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CurrentAccountService {

    public Flux<CurrentAccount> findAll();
    
    public Mono<CurrentAccount> findById(String id);
    
    public Mono<CurrentAccount> save(CurrentAccount currentAccount);
    
    public Mono<Void> deleteById(String id);
}
