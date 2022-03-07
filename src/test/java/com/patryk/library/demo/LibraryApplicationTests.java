package com.patryk.library.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.assertj.core.api.Assertions;

@SpringBootTest
class LibraryApplicationTests {

	@Test
	void customerShouldBeSavedToFile() {
		String firstNameToTest = "Patryk";
		String lastNameToTest = "Mech";
		String personalIdToTest = "12345";
		CustomerHandler ch = new CustomerHandler();
		Customer customer = ch.createNewCustomer(firstNameToTest,lastNameToTest,personalIdToTest);

		Assertions.assertThat(ch.saveCustomerToFile(customer)).isEqualTo(1);
	}

}
