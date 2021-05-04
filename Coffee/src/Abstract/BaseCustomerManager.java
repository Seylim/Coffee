package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerManager{

	@Override
	public void Save(Customer customer) throws Exception{
		System.out.println("Saved to db: " + customer.getFirstName());
		
	}
	

}
