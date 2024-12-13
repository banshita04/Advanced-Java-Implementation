package com.cg.beans;

import org.springframework.context.annotation.Bean;

public class SpringConfig {
@Bean("service")
public AccountService getAccService() {
return new AccountServiceImpl();

}
@Bean
public SavingsAccDao getSavings() {
	return new SavingsAccDaoImpl();
	
}
}

