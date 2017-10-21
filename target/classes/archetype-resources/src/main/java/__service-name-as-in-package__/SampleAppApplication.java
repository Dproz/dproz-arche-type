#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${service-name-as-in-package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "${package}")
@EnableDiscoveryClient
public class SampleAppApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SampleAppApplication.class, args);
	}
}
