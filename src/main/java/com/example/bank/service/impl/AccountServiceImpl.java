package com.example.bank.service.impl;

import com.example.bank.dto.AccountDto;
import com.example.bank.entity.Account;
import com.example.bank.mapper.AccountMapper;
import com.example.bank.repository.AccountRepository;
import com.example.bank.service.AccountService;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
