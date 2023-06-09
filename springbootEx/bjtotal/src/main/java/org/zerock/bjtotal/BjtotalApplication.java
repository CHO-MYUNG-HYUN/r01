package org.zerock.bjtotal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"org.zerock.bjtotal.mappers"})
public class BjtotalApplication {

	public static void main(String[] args) {
		SpringApplication.run(BjtotalApplication.class, args);
	}

}
