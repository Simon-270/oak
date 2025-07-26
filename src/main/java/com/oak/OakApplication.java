package com.oak;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OakApplication {

	public static void main(String[] args) {
		//SpringApplication.run(OakApplication.class, args);


		Grade grade = new Grade();
		grade.addGrade("A+");
		grade.addGrade("A+");
		grade.addGrade("C+");
		System.out.println(grade.getGpa());

		grade.resultSummary();
		System.out.println();
		grade.getResults().forEach(System.out::println);


	}

}
