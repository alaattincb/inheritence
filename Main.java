package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividiualCustomer alaattin = new IndividiualCustomer();
		alaattin.customerNumber ="1234";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer(); 
		hepsiBurada.customerNumber = "1233";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber ="99999";

		CustomerManager customerManager = new CustomerManager();
		Customer[] customers = {alaattin,abc,hepsiBurada};
		
		customerManager.addMultiple(customers);
	}

}
