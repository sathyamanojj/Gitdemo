package RestassuredAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete_Method {

	public static void main(String[] args)
	{
		 System.out.println("This is a delete method");
		 deletemethod();

	}
    public static void deletemethod()
    {
    	
    	RequestSpecification Resp=RestAssured.given();
    	
    	Resp.header("php-auth-user","sathya");
    	Resp.header("php-auth-pw","Engineer@1");
    	   Response r = Resp.delete("http://dev3.volateam.com/dchoi/acctapi/public/accounting/accrec/payments/deleteQueue/8280");
    	   int A = r.getStatusCode();
    	   System.out.println(A);
    	   String B= r.asString();
    	   System.out.println(B);
    }
}
