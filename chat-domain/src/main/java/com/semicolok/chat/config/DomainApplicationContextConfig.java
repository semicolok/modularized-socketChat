package com.semicolok.chat.config;

import com.semicolok.chat.domain.ChatDomains;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackageClasses = { ChatDomains.class })
public class DomainApplicationContextConfig implements TransactionManagementConfigurer {

	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		return null;
	}
}
