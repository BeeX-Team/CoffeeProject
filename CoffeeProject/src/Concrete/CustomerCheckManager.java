package Concrete;

import Abstract.CustomerCheckService;

import Entities.Customer;
import sun.security.util.ECKeySizeParameterSpec;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		MernisServiceReferance.KPSPublicSoapClient client = new KPSPublicSoapClient();
		
		return True;
	}

	
}
