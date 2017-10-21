#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${service-name-as-in-package}.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import ${package}.${service-name-as-in-package}.adapter.datastore.mongo.UserRepostitory;
import ${package}.${service-name-as-in-package}.domain.User;
import ${package}.${service-name-as-in-package}.domain.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepostitory userRepository;
	
	public UserServiceImpl(UserRepostitory userRepostitory) {
		this.userRepository = userRepostitory;	
	}
	

	@Override
	public Optional<User> getUser(String id) {
		return userRepository.findById(id);
	}

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

}
