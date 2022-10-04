package org.sid.bankingbackend.repositories;

import org.sid.bankingbackend.entities.BankAccount;
import org.sid.bankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
