package br.com.fiap.gestaoitens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "br.com.fiap.gestaoitens.repository")
@SpringBootApplication//(exclude = {org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class})
public class GestaoitensApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoitensApplication.class, args);
	}

}
