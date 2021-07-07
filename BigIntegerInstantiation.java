package javacodechecker;
import java.math.BigInteger;
import javax.net.ssl.SSLContext;
import java.io.*;  
import java.net.*;  
import org.apache.http.conn.ssl.SSLSocketFactory;
class BigIntegerInstantiation throws IllegalArgumentException{
	public static void main(String args[]){  
		// EMB-ISSUE: CodeIssueNames.BIG_INTEGER_INSTANTIATION
        BigInteger bigInteger = new BigInteger("1");  
     // EMB-ISSUE: CodeIssueNames.BIG_INTEGER_INSTANTIATION
        BigInteger bigInteger1 = new BigInteger(1);  	
     // EMB-ISSUE: CodeIssueNames.BIG_INTEGER_INSTANTIATION
		BigInteger bigInteger2 = new BigInteger("0"); 
		// EMB-ISSUE: CodeIssueNames.BIG_INTEGER_INSTANTIATION/no-detect
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
	}
	     SSLContext context1 = SSLContext.getInstance("SSL");
	     SSLContext context = SSLContext.getInstance("TLS");
	     Socket soc = new Socket("www.google.com",80);
	     Socket soc1 = SSLSocketFactory.getDefault().createSocket("www.google.com", 443);
	private static List<Integer> integers = new ArrayList<Integer>();
public static void addInteger(Integer value) throws IllegalArgumentException {
		if (integers.contains(value)) {
			 new IllegalArgumentException("Integer already added.");
		}
		integers.add(value);
	}
	
}

