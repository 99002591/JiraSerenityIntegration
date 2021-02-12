package listeners;
import java.util.Map;

import jiraAPIhandlers.authenticator;
import net.thucydides.core.model.DataTable;
import net.thucydides.core.model.Story;
import net.thucydides.core.model.TestOutcome;
import net.thucydides.core.steps.*;
public class ListenAndTrigger implements StepListener{
	authenticator auth_obj = new authenticator();
	
	@Override
	public void testSuiteStarted(Class<?> storyClass) {
		System.out.println("testSuiteStarted: " + storyClass);
	}

	@Override
	public void testSuiteFinished() {
		// TODO Auto-generated method stub
		System.out.println("testSuiteFinished");
	}

	@Override
	public void testStarted(String description) {
		// TODO Auto-generated method stub
		System.out.println("testStarted: " + description);
	}

	@Override
	public void testStarted(String description, String id) {
		// TODO Auto-generated method stub
		System.out.println("testStarted----> " + description + "  id---->" + id);
	}

	@Override
	public void testFinished(TestOutcome result) {
		// TODO Auto-generated method stub
		System.out.println("testFinished: " + result);
	}

	@Override
	public void testRetried() {
		// TODO Auto-generated method stub
		System.out.println("testRetried");
	}

	@Override
	public void stepStarted(ExecutedStepDescription description) {
		// TODO Auto-generated method stub
		System.out.println("stepStarted: " + description);
	}

	@Override
	public void skippedStepStarted(ExecutedStepDescription description) {
		// TODO Auto-generated method stub
		System.out.println("skippedStepStarted: " + description);
	}

	@Override
	public void stepFailed(StepFailure failure) {
		// TODO Auto-generated method stub
		System.out.println("stepFailed: " + failure);
	}

	@Override
	public void lastStepFailed(StepFailure failure) {
		// TODO Auto-generated method stub
		System.out.println("lastStepFailed----> " + failure);
	}

	@Override
	public void stepIgnored() {
		// TODO Auto-generated method stub
		System.out.println("stepIgnored");
	}

	@Override
	public void stepPending() {
		// TODO Auto-generated method stub
		System.out.println("stepPending");
	}

	@Override
	public void stepPending(String message) {
		// TODO Auto-generated method stub
		System.out.println("stepPending message: " + message);
	}

	@Override
	public void stepFinished() {
		// TODO Auto-generated method stub
		System.out.println("stepFinished");
	}

	@Override
	public void testFailed(TestOutcome testOutcome, Throwable cause) {
		// TODO Auto-generated method stub
		System.out.println("testFailed" + "testOutcome----> " + testOutcome + "    cause------> " + cause);
	}

	@Override
	public void testIgnored() {
		// TODO Auto-generated method stub
		System.out.println("testIgnored");
	}

	@Override
	public void testSkipped() {
		// TODO Auto-generated method stub
		System.out.println("testSkipped");
	}

	@Override
	public void testPending() {
		// TODO Auto-generated method stub
		System.out.println("testPending");
	}

	@Override
	public void testIsManual() {
		// TODO Auto-generated method stub
		System.out.println("testIsManual");
	}

	@Override
	public void notifyScreenChange() {
		// TODO Auto-generated method stub
		System.out.println("notifyScreenChange: ");
	}

	@Override
	public void useExamplesFrom(DataTable table) {
		// TODO Auto-generated method stub
		System.out.println("useExamplesFrom: " + table);
	}

	@Override
	public void addNewExamplesFrom(DataTable table) {
		// TODO Auto-generated method stub
		System.out.println("addNewExamplesFrom: " + table);
	}

	@Override
	public void exampleStarted(Map<String, String> data) {
		// TODO Auto-generated method stub
		System.out.println("exampleStarted-------->" + data);
		auth_obj.addComment("SJI-4");
		//dummy-jira-integration.atlassian.net/rest/api/2/issue/SJI-4/comment
//		SerenityRest.given().contentType("application/json").body(data).post("dummy-jira-integration.atlassian.net/rest/api/2/issue/SJI-4/comment");
		
		
	}

	@Override
	public void exampleFinished() {
		// TODO Auto-generated method stub
		System.out.println("exampleFinished");
	}

	@Override
	public void assumptionViolated(String message) {
		// TODO Auto-generated method stub
		System.out.println("assumptionViolated: " + message);
	}

	@Override
	public void testRunFinished() {
		// TODO Auto-generated method stub
		System.out.println("testRunFinished");
	}

	@Override
	public void testSuiteStarted(Story story) {
		// TODO Auto-generated method stub
		System.out.println("testSuiteStarted story: " + story);
	}
}
