package MernisAdapter;

import Abstract.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisService implements UserCheckService{

	public MernisService() {
		
	}

	@Override
	public boolean checkIfRealPerson(User user) {
		KPSPublicSoapProxy client= new KPSPublicSoapProxy();
		boolean result=false;
		
		try {
			
			result=true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println("Kimlik do�rulama : "+(result?" ba�ar�l�":"ba�ar�s�z"));
		return result;
	}

}
