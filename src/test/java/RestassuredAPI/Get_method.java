package RestassuredAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_method 
{
	public static void main(String[] args)
	{
		System.out.println("This is API Testing");
		
		getmethod();
    }
    public static  void getmethod() 
    {
	System.out.println("THis is a method");
	
	
    RequestSpecification Resp=RestAssured.given();
	
	Resp.header("php-auth-user","sathya");
	Resp.header("php-auth-pw","Engineer@1");
	Response R= Resp.get("http://dev3.volateam.com/dchoi/acctapi/public/accounting/accrec/payments/getFOPs");
	int A=R.getStatusCode(); 
	System.out.println(A);
	
	String B = R.asString();
	System.out.println(B);
   }	
}
/* Status code 200 - created successfully*/