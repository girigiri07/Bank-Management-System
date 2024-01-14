package Service;

import jakarta.transaction.Transaction;

@Component

public class Transactionserviceimplement implements TransactionService{
	   @Autowired
	    TransactionRepository transactionRepository;

	    @Override
	    public void saveTransaction(TransactionDto transactionDto) {
	        Transaction transaction = Transaction.builder()
	                .transactionType(transactionDto.getTransactionType())
	                .accountNumber(transactionDto.getAccountNumber())
	                .amount(transactionDto.getAmount())
	                .status("SUCCESS")
	                .build();
	        transactionRepository.save(transaction);
	        System.out.println("Transaction saved successfully");
	    }
}
