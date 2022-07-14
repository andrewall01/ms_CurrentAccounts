package com.project.ms.current.accounts.domain.entities;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("current_account")
public class CurrentAccount {

    @Id
    private String id;

    @Field("account_number")
    private String accountNumber;

    @Field("bank_account_code")
    private String bankAccountCode;

    @Field("currency")
    private String currency;

    @Field("available_balance")
    private double availableBalance;

    @Field("holder_name")
    private String holderName;

    @Field("holder_last_name")
    private String holderLastName;

    @Field("signer_name")
    private String signerName;

    @Field("signer_last_name")
    private String signerLastName;

    @Field("created_at")
    @CreatedDate
    private Date createdAt;

}
