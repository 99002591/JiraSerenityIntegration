package jiraAPIhandlers;

import java.util.Properties;
import org.apache.commons.logging.Log;

import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class authenticator {
	// Variable declaration
	public String baseURI = "https://dummy-jira-integration.atlassian.net";
	public String endpoint = "/rest/api/2/issue/{IssueKey}/comment";
	public RequestSpecification requestSpec;
	public ResponseSpecification responseSpec;
	public Properties prop;
	public Log logger;

	commentPOJO json_comment = new commentPOJO();

//	Initializing BasicAuthScheme object with username and password
	public void requestSetUp() {
		PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
		authScheme.setUserName("dasamit98@gmail.com");
		authScheme.setPassword("1w1pJRPdJdZnmTHF5yE0CACE");

		// Initializing the RequestSpecBuilder with common values for all api requests.
		requestSpec = new RequestSpecBuilder().setBaseUri(baseURI).setAuth(authScheme)
				.log(LogDetail.ALL).build();
	}

	public void addComment(String issueKey) {
		System.out.println(
				"*********************        ENTERING ADD COMMENT FUNCTION            ************************");
		String addComment = "Automated comment";
		json_comment.setBody(addComment);
		System.out.println(
				"*********************        COMMENT CONVERTED TO JSON FORMAT         ************************");
		requestSetUp();
		String response = given().spec(requestSpec).contentType(ContentType.JSON).body(json_comment).when()
				.post("https://dummy-jira-integration.atlassian.net/rest/api/2/issue/SJI-4/comment").then().extract().body()
				.asString();
		
		System.out.println("***************************");
		System.out.println(response);
		System.out.println("***************************");
	}
}
