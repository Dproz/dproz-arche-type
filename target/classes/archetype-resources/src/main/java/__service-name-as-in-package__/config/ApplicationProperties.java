#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${service-name-as-in-package}.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to ${service-name-as-in-package}.
 * <p>
 * Properties are configured in the application.yml file.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

}
