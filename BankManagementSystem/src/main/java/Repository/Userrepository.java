package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public class Userrepository extends JpaRepository<User, Long> {
	 Boolean existsByEmail(String email);
	    Boolean existsByAccountNumber(String accountNumber);
	    User findByAccountNumber(String accountNumber);
}
