package com.example.reethu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


@SpringBootApplication
public class ReethuApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReethuApplication.class, args);
	}

	@Query
			("SELECT a FROM Janani a WHERE a.name LIKE %:name%")
	<Username>
	List<Username> searchByNameLike(@Param("Name") String name) {
		return null;


	}
}
