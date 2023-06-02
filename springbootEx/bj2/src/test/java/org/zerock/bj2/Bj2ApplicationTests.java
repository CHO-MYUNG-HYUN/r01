package org.zerock.bj2;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.bj2.mappers.TimeMapper;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
class Bj2ApplicationTests {

	@Autowired
	DataSource dataSource;

	@Autowired
	TimeMapper mapper;



	@Test
	void timeChk(){
		log.info(mapper.getTime());
	}

	@Test
	void contextLoads() {
		log.info("contextLoad....");
	}

	@Test
	void conctest(){

		try {
			Connection conn = dataSource.getConnection();
			log.info(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
