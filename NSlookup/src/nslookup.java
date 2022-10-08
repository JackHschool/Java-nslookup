import java.net.InetAddress;
import java.net.UnknownHostException;

public class nslookup {

	public static void main(String[] args) {
		byte[] address= {127,0,0,1};
		byte[] anotheraddress= {8,8,8,8};
		
		
		//Here is the answer for part One
		try {
			InetAddress intaddress=InetAddress.getLocalHost();
			System.out.println("Here is my local host name and adress: "+intaddress);
			//System.out.println(intaddress.getCanonicalHostName());
		}catch(UnknownHostException e){
			e.printStackTrace();
		}
		//here is the answer for question 2
		System.out.println("Here below is Question two");
		System.out.println("xxxxxxxxxxxxxxxxxx");
		InetAddress[] yahoo;
		try {
			yahoo = InetAddress.getAllByName("yahoo.com");
			System.out.println("Here are the list of adresses for Yahoo.com");
			for (InetAddress addr : yahoo) {
				
			    System.out.println(addr.getHostAddress());
			}
			System.out.println("xxxxxxxxxxxxxxxx");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InetAddress[] mortorola;
		try {
			System.out.println("Here are the list of adresses for Motorola.com");
			mortorola = InetAddress.getAllByName("mortorola.com");
			for (InetAddress addr : mortorola) {
			    System.out.println(addr.getHostAddress());
			}
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InetAddress[] opendn;
		try {
			System.out.println("Here are the adresses for opendns.com");
			opendn = InetAddress.getAllByName("opendns.com");
			for (InetAddress addr : opendn) {
			    System.out.println(addr.getHostAddress());
			}
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InetAddress[] mit;
		try {
			System.out.println("Here are the adresses for opendns.com");
			mit = InetAddress.getAllByName("mit.edu");
			for (InetAddress addr : mit) {
			    System.out.println(addr.getHostAddress());
			}
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InetAddress[] akamai;
		try {
			System.out.println("Here are the adresses for akamai.com");
			akamai= InetAddress.getAllByName("akamai.com");
			for (InetAddress addr :akamai ) {
			    System.out.println(addr.getHostAddress());
			}
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Here are the answers to questions 3
	
			try {
				InetAddress address2 = InetAddress.getByName("8.8.8.8");
				
				System.out.println(address2.getHostName());

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				InetAddress address2 = InetAddress.getByName("75.75.75.75");
				
				System.out.println(address2.getHostName());
				
			}catch(Exception e ){
				
			}
			
		}
	
		
	       
	}


