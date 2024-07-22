package br.com.fiap.controleacesso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "br.com.fiap.controleacesso.repository")
@SpringBootApplication//(exclude = {org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class})
public class ControleacessoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleacessoApplication.class, args);
	}

}
