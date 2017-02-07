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

### Usage

Released versions of the library is accessible through Maven Central, so you can easily include in your building scripts.

E.g. for maven:

```xml
<dependency>
    <groupId>com.sentenial</groupId>
    <artifactId>nuapay-rest-client</artifactId>
    <version>[VERSION].RELEASE</version>
</dependency>
```

### Building from sources 
    
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
						mandateService.createMandate("ybo8lg392q", createMandateRequest);
			System.out.println(createMandateResponse.getData());
		} catch (SentenialException ex){
			ex.printStackTrace();
		}
	}
```
### Example with Proxy

Simple code to list creditor schemes:

```java

package com.sentenial.core.processing.enrichment.credittransfer;

import com.sentenial.rest.client.api.common.dto.BasicAccount;
import com.sentenial.rest.client.api.common.service.SentenialException;
import com.sentenial.rest.client.api.common.service.ServiceConfiguration;
import com.sentenial.rest.client.api.creditorscheme.CreditorSchemeService;
import com.sentenial.rest.client.api.creditorscheme.CreditorSchemeServiceDefault;
import com.sentenial.rest.client.api.creditorscheme.dto.ListCreditorSchemesResponse;
import com.sentenial.rest.client.api.mandate.dto.CreateMandateRequest;
import com.sentenial.rest.client.api.mandate.dto.Debtor;
import com.sentenial.rest.client.api.mandate.dto.Mandate;

public class MandatesEndpoint2 {

    public static void main(String[] args) {

        ServiceConfiguration serviceConfiguration = new ServiceConfiguration();
        serviceConfiguration.setApiKey("c1cd4d8e450789634a4e656a6341e2da106066bfd8a7f4ab3a13f24c9167cc27");
        // proxy configuration, set all 3 values
        serviceConfiguration.setProxyHost("sent-int-prx-vip");
        serviceConfiguration.setProxyPort(3128);        
        serviceConfiguration.setProxyScheme("http");

        CreditorSchemeService csService = new CreditorSchemeServiceDefault(serviceConfiguration);
      
        CreateMandateRequest createMandateRequest = 
                new CreateMandateRequest()
                    .withMandate(
                        new Mandate()
                            .withDebtor(
                                    new Debtor()
                                        .withName("Debtor Name")                                       
                                        )                            
                            .withDebtorAccount(
                                    new BasicAccount()
                                        .withIban("IE44BOFI90387502070002")
                                    )
                            
                        );

        try{         
        	ListCreditorSchemesResponse createMandateResponse = csService.listCreditorSchemes();
            System.out.println(createMandateResponse.getData());
        } catch (SentenialException ex){
            ex.printStackTrace();
        }
    }
}


For more details refer to the [documentation](https://docs.nuapay.com/api).
