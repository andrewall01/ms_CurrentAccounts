package com.project.ms.current.accounts.infrastructure.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.project.ms.current.accounts.domain.entities.CurrentAccount;

@Repository
public interface CurrentAccountRepository extends ReactiveMongoRepository<CurrentAccount, String> {

}
