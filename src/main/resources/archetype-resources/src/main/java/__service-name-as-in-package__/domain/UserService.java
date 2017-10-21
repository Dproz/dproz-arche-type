#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${service-name-as-in-package}.domain;

import java.util.Optional;

public interface UserService {
	
	Optional<User> getUser(String id);
	
	User addUser(User user);

}
