#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${service-name-as-in-package}.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;

@Getter
@Document(collection = "user")
public class User implements Serializable {

	private static final long serialVersionUID = -1353329736543106750L;

	@Id
	private String id;

	@NotNull
	@Field("name")
	private String name;

	@Field("password")
	private String password;

}
