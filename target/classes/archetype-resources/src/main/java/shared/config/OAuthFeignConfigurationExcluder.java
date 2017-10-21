#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.shared.config;

import java.io.IOException;

import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;

import ${package}.shared.api.client.OAuth2InterceptedFeignConfiguration;

/**
 * Type filter which excludes {@link OAuth2InterceptedFeignConfiguration} 
 * from auto configuration.
 * 
 * @author pdigumarthi
 *
 * @see  TypeExcludeFilter
 */
public class OAuthFeignConfigurationExcluder extends TypeExcludeFilter {

	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		return metadataReader.getClassMetadata().getClassName()
				.equals(OAuth2InterceptedFeignConfiguration.class.getName());
	}

}
