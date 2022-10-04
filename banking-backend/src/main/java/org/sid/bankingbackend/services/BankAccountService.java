package org.sid.bankingbackend.services;

import org.sid.bankingbackend.dtos.*;
import org.sid.bankingbackend.entities.BankAccount;
import org.sid.bankingbackend.entities.CurrentAccount;
import org.sid.bankingbackend.entities.Customer;
import org.sid.bankingbackend.entities.SavingAccount;
import org.sid.bankingbackend.exceptions.BalanceNotSufficientException;
import org.sid.bankingbackend.exceptions.BankAccountFoundException;
import org.sid.bankingbackend.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {
    public CustomerDTO saveCustomer(CustomerDTO customerDTO);;

    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
    List<CustomerDTO> listCustomer();
    BankAccountDTO getBankAccount(String accountId) throws BankAccountFoundException;
    void debit(String accountId, double amount, String description) throws BankAccountFoundException, BalanceNotSufficientException;
    void credit(String accountId, double amount, String description) throws BankAccountFoundException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountFoundException, BalanceNotSufficientException;

    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);

    List<AccountOperationDTO> accountHistory(String accountId);

    AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws BankAccountFoundException;

    List<CustomerDTO> searchCustomers(String keyword);
}
