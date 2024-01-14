package Service;

public interface Userservice {
	   BankResponse createAccount(UserRequest userRequest);
	    BankResponse balanceEnquiry(EnquiryRequest request);
	    String nameEnquiry(EnquiryRequest request);
	    BankResponse creditAccount(CreditDebitRequest request);
	    BankResponse debitAccount(CreditDebitRequest request);
	    BankResponse transfer(TransferRequest request);
}
