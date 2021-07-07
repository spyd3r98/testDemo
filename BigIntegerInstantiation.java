
import java.math.BigInteger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import java.io.*;  
import java.net.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.lang.IllegalArgumentException;

class BigIntegerInstantiation{
	private static List<Integer> integers = new ArrayList<Integer>();

	public static void main(String args[]){  
		
        BigInteger bigInteger = new BigInteger("1");  
		BigInteger bigInteger2 = new BigInteger("0"); 
		BigInteger bigInteger3 = BigInteger.ONE;
        int n=4;  
        for (int i = 2; i <=n ; i++){
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));  
        }  
        System.out.println("Factorial of 4 : "+bigInteger);  
    	try {
			addInteger(1);
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
		}
    	 try {
			SSLContext context1 = SSLContext.getInstance("SSL");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     try {
			SSLContext context = SSLContext.getInstance("TLS");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     try {
			Socket soc = new Socket("www.google.com",80);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     try {
			Socket soc1 = SSLSocketFactory.getDefault().createSocket("www.google.com", 443);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	    
public static void addInteger(Integer value) throws IllegalArgumentException {
		if (integers.contains(value)) {
			 new IllegalArgumentException("Integer already added.");
		}
		integers.add(value);
	}
	
}

