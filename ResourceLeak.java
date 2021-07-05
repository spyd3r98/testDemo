import org.springframework.boot.SpringApplication;
import javax.net.ssl.SSLContext;
import java.io.*;  
import java.net.*; 
import org.apache.http.conn.ssl.SSLSocketFactory;
@ComponentScan(exclude=Book.class,scanBasePackages={"net.javabeat"})
@SpringBootApplication
public class ResourceLeak {
private int x ,y ,z,apiCount;
		
	 public static void main(String args[]) throws Exception {  
	     SpringApplication.run(SpringBootApplicationAndComponentScanNotBeUsedInDefaultPackage.class, args);
	     System.out.println("Hello"); 
	     StringBuffer sb = new StringBuffer("Hi ");
	     SSLContext context1 = SSLContext.getInstance("SSL");
	     SSLContext context1 = SSLContext.getInstance("TLS");
	     Socket soc = new Socket("www.google.com",80);
	     Socket soc1 = SSLSocketFactory.getDefault().createSocket("www.google.com", 443);
             sb.append("i");
   	     System.out.println(sb);
	     String s = "" + 123;
		 
		 
	private int c = 0;
    	public synchronized void increment() {
        c++;
    }
	    } 
 
	private boolean active;
	
	 
	public void setX(int val) {
		//this is for test
		this.y = val;
	}
	
	public int getAPISize()
	{
	return apiCount;
	
	}

	
	public int getY() {
		return this.x;
	}

	
	  public boolean isActive()
		  {
		    return x;
		  }

	  		
		  public void setActive(boolean b)
		  {
		    this.y = b;
		  }
		  
		  
		  public int getName() {	
			  System.out.println(" ");
			  return this.x;
			}
	

  
		  
			
		  	public void setName(int val) {
			    System.out.println(" ");
				this.y = val;
			}
		  	
		
			public void setZ(int val) {
				this.z = val;
			}
			
			public int getZ(int val) {
				
				return x;
			}
			
}
