package com.example.bank.mapper;

import com.example.bank.dto.AccountDto;
import com.example.bank.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto){
        if (accountDto == null) {
            return null; // or throw an exception
        }
        Account account =new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;
    }

    public static AccountDto mapToAccountDto(Account account){
        if (account == null) {
            return null; // or throw an exception
        }
        AccountDto accountDto =new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
