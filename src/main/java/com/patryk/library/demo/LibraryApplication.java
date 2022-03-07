package com.patryk.library.demo;

/*Program ma wspierać bibliotekę w procesie obsługi czytelników. Powinna być możliwość wypożyczenia książki, jej zwrotu oraz sprawdzenia czy książka jest dostępna
\w danej chwili do wypożyczenia. Dla poszczególnych czytelników powinna być przechowywana informacja o książkach aktualnie wypożyczonych, czasie w którym książkę
należy zwrócić oraz ew. karze naliczonej za opóźnienie w zwrocie książki. Informacje o użytkownikach oraz książkach w plikach.*/

/*Write a program that helps handle customers in library. It should allow user to borrow a book, return it and check if book is available at the moment.
* For each customer information about their borrowed books and return date should be stored and additionally penalty for delay. Information about customer
* should be stored in files.*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

}
