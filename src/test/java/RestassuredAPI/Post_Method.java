package RestassuredAPI;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Method 
{
  
public static void main(String[]args)
  {
	  System.out.println("This is a post method automation");
	  postmethod();
  }
	public static void postmethod()
	{
		
		int i;
		for (i=0;i<5;i++)
		{
		RequestSpecification Resp = RestAssured.given();
		Resp.header("Content_Type","application/json");
		JSONObject sat= new JSONObject();
		
		Resp.header("php-auth-user","sathya");
		Resp.header("php-auth-pw","Engineer@1");
		
		
		Resp.params("AcctRecID","663038");
		Resp.params("OptionDate","2020-01-14");
		Resp.params("Priority","Medium");
		Resp.params("Notes","testing method");
		Resp.params("UserName","sathya");
		
		Response r = Resp.post("http://dev3.volateam.com/dchoi/acctapi/public/accounting/accrec/payments/addToQueue");
		int A = r.getStatusCode();
		System.out.println(A);
		String B = r.asString();
		System.out.println(B);
		}
	}
}
