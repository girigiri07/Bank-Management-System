package Dto;




import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
public class Bankresponse {

	
	

    private String responseCode;
    private String responseMessage;
    private AccountInfo accountInfo;
}
