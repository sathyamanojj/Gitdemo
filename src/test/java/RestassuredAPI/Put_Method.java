package RestassuredAPI;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put_Method {

	public static void main(String[] args)
	{
		System.out.println("This is a put method");
		putmethod();

	}
    public static void putmethod()
    {
    	    RequestSpecification Resp = RestAssured.given();
    	    Resp.header("Content_Type","application/json");
    	    JSONObject sat = new JSONObject();
    	    Resp.header("php-auth-user","sathya");
    		Resp.header("php-auth-pw","Engineer@1");
    		Resp.params("QueueID","8280");
    		Resp.params("OptionDate","2020-01-14");
    		Resp.params("Priority","Medium");
    		Resp.params("Notes","update method");
    		Resp.params("UserName","sathya");
    		Response r = Resp.post("http://dev3.volateam.com/dchoi/acctapi/public/accounting/accrec/payments/updateQueue");
    		/* need to enter "put" instead of post in the case of 
    		  update but since denny method is post for update in this case i am writing it as Resp.put 
    		*/
    		int A = r.getStatusCode();
    		System.out.println(A);
    		
    		String B= r.asString();
    		System.out.println(B);
    	    
    }
}
