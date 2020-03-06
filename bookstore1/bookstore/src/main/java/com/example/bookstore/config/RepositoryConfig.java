package com.example.bookstore.config;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import javax.persistence.metamodel.Type;

import com.example.bookstore.entity.Book;
import com.example.bookstore.entity.BookCategory;



@Configuration
public class RepositoryConfig  implements RepositoryRestConfigurer{
	@Autowired
	private EntityManager entityManager;
	
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
		

		config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream()
				.map(Type::getJavaType).toArray(Class[]::new));
		config.exposeIdsFor(BookCategory.class);
	}
	
	

}
