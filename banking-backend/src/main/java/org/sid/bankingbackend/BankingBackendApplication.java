package org.sid.bankingbackend;

import org.sid.bankingbackend.dtos.BankAccountDTO;
import org.sid.bankingbackend.dtos.CurrentBankAccountDTO;
import org.sid.bankingbackend.dtos.CustomerDTO;
import org.sid.bankingbackend.dtos.SavingBankAccountDTO;
import org.sid.bankingbackend.entities.*;
import org.sid.bankingbackend.enums.AccountStatus;
import org.sid.bankingbackend.enums.OperationType;
import org.sid.bankingbackend.exceptions.BalanceNotSufficientException;
import org.sid.bankingbackend.exceptions.BankAccountFoundException;
import org.sid.bankingbackend.exceptions.CustomerNotFoundException;
import org.sid.bankingbackend.repositories.AccountOperationRepository;
import org.sid.bankingbackend.repositories.BankAccountRepository;
import org.sid.bankingbackend.repositories.CustomerRepository;
import org.sid.bankingbackend.services.BankAccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.xml.namespace.QName;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class BankingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingBackendApplication.class, args);
	}

}
