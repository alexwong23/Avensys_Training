package Day04_19012021;
//package Day4_19012021;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//
//class TestHotel {
//
//	@Test
//	void testCustomer() {
//		Customer alex = new Customer("Alex", "alexwong@gmail.com");
//		assertEquals(alex.getName(), "Alex");
//		assertEquals(alex.getEmail(), "alexwong@gmail.com");
//	}
//	
//	@Test
//	void testItem() {
//		Item fries = new Item("Fries", 3);
//		assertEquals(fries.getName(), "Fries");
//		assertEquals(fries.getPrice(), 3);
//		Item iceCream = new Item("Ice cream", 1.8);
//		assertEquals(iceCream.getName(), "Ice cream");
//		assertEquals(iceCream.getPrice(), 1.8);
//	}
//	
//	@Test
//	void testBill() {
//		Customer alex = new Customer("Alex", "alexwong@gmail.com");
//		Bill alexBill = new Bill(alex);
//		assertEquals(alexBill.getTotal(), 0);
//		Item fries = new Item("Fries", 3);
//		Item iceCream = new Item("Ice cream", 1.8);
//		assertEquals(alexBill.getItemQuantity(fries), 0);
//		assertEquals(alexBill.getItemQuantity(iceCream), 0);
//		alexBill.purchaseItem(fries, 3);
//		assertEquals(alexBill.getTotal(), 3 * 3);
//		assertEquals(alexBill.getItemQuantity(fries), 3);
//		alexBill.purchaseItem(iceCream, 2);
//		assertEquals(alexBill.getTotal(), 3 * 3 + 1.8 * 2);
//		assertEquals(alexBill.getItemQuantity(iceCream), 2);
//	}
//	
//	@Test
//	void testHotel() {
//		Hotel hm = new Hotel();
//		assertTrue(hm.validGood("coffee"));
//		assertTrue(hm.validGood("toast"));
//		assertTrue(hm.validGood("eggs"));
//		assertFalse(hm.validGood("Coffee"));
//		assertFalse(hm.validGood("egg"));
//		
//		Customer alex = new Customer("Alex", "alexwong@gmail.com");
//		assertTrue(hm.addCustomer(alex));
//		assertFalse(hm.addCustomer(alex));
//				
//		hm.transaction(alex, "coffee", 1);
//		hm.transaction(alex, "toast", 1);
//		hm.transaction(alex, "eggs", 3);
//		hm.transaction(alex, "coffee", 1);
//	}
//
//}
