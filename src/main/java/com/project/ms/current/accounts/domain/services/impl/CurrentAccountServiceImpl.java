package com.project.ms.current.accounts.domain.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ms.current.accounts.domain.entities.CurrentAccount;
import com.project.ms.current.accounts.domain.services.CurrentAccountService;
import com.project.ms.current.accounts.infrastructure.repositories.CurrentAccountRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CurrentAccountServiceImpl implements CurrentAccountService {

    @Autowired
    private CurrentAccountRepository currentAccountDao;

    @Override
    public Flux<CurrentAccount> findAll() {
        return currentAccountDao.findAll();
    }
    
    @Override
    public Mono<CurrentAccount> findById(String id) {
        return currentAccountDao.findById(id);
    }
    
    @Override
    public Mono<CurrentAccount> save(CurrentAccount currentAccount) {
        return currentAccountDao.save(currentAccount);
    }
    
    @Override
    public Mono<Void> deleteById(String id) {
        return currentAccountDao.deleteById(id);
    }

}
