#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${service-name-as-in-package}.adapter.datastore.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ${package}.${service-name-as-in-package}.domain.User;

@SuppressWarnings("unused")
@Repository
public interface UserRepostitory extends MongoRepository<User, String> {

}
