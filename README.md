# NuaPay REST Client

### Requirements

Java 6 or later.

### Dependencies

* Apache Commons IO
* Apache Commons Codec
* Apache HttpComponents
* Jackson
* slf4j
* log4j


### Using 
    
* Download source project
* Generate `jar` file using `mvn clean package` command, then  
* Ensure the `jar` is on your classpath
* Ensure you have the dependency `jar`s on your classpath

### Tips

* If for debug purposes you need to print content of HTTP requests / responses, then you can set following loggin level: 

```properties
log4j.logger.org.apache.http=DEBUG
```

### Example

Simple code to create mandate:

```java

import com.sentenial.rest.client.api.common.dto.Account;
import com.sentenial.rest.client.api.common.dto.Address;
import com.sentenial.rest.client.api.common.service.SentenialException;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.mandate.MandateService;
import com.sentenial.rest.client.api.mandate.MandateServiceDefault;
import com.sentenial.rest.client.api.mandate.dto.CreateMandateRequest;
import com.sentenial.rest.client.api.mandate.dto.CreateMandateResponse;
import com.sentenial.rest.client.api.mandate.dto.Debtor;
import com.sentenial.rest.client.api.mandate.dto.Mandate;
import com.sentenial.rest.client.api.mandate.dto.MandateInfo;
import com.sentenial.rest.client.api.mandate.dto.MandateType;
import com.sentenial.rest.client.utils.DateUtils;

public class RestClientSampleApp {

	public static void main(String[] args) {
		
		ServiceConfiguration serviceConfiguration = new ServiceConfiguration();
		serviceConfiguration.setApiKey("Your-APIKEY-here");

		MandateService mandateService = new MandateServiceDefault(serviceConfiguration);
		
		CreateMandateRequest createMandateRequest = 
				new CreateMandateRequest()
					.withMandate(
						new Mandate()
							.withDebtor(
									new Debtor()
										.withName("Debtor Name")
										.withAddress(
												new Address()
													.withLine1("Debtor Address Line1")
													.withLine2("Debtor Address Line2")
													.withTown("Debtor Town")
													.withPostCode("123123")
													.withState("Debtor State")
													.withCountry("IE")
												)
										.withLanguage("fr_BE")
										.withEmail("debtor@email.com")
										.withPhoneNumber("0360123123123")
										.withMobileNumber("0360321312312")
										)
							.withMandateInfo(
									new MandateInfo()
										.withMandateId("1234567899")
										.withContractReference("Contract Reference")
										.withSignatureLocation("Signature Location")
										.withSignatureDate(DateUtils.toDate("2015-07-21"))
										.withMandateType(MandateType.RCUR)
										)
							.withDebtorAccount(
									new Account()
										.withIban("GB94SELN00999976543215")
									)
							.withCreditorAccount(
									new Account()
										.withIban("GB47SELN00999912345678")
									)
						);

		try{
			CreateMandateResponse createMandateResponse = 
						mandateService.createMandate("ybo8lg392q", createMandateRequest, null);
			System.out.println(createMandateResponse.getData());
		} catch (SentenialException ex){
			ex.printStackTrace();
		}
	}
```

For more details refer to the [documentation](https://docs.nuapay.com/v1).
