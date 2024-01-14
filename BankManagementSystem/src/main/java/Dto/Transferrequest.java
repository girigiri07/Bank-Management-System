package Dto;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Transferrequest {

	
	
	 private String sourceAccountNumber;
	    private String destinationAccountNumber;
	    private BigDecimal amount;
}
