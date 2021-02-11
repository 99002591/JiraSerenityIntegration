package ListenerCustom;
import java.util.Map;

import net.thucydides.core.model.DataTable;
import net.thucydides.core.model.Story;
import net.thucydides.core.model.TestOutcome;
import net.thucydides.core.steps.*;

public class ListenAndTrigger implements StepListener{
	
	@Override
	public void testSuiteStarted(Class<?> storyClass) {
		System.out.println("HOLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
	}

	@Override
	public void testSuiteFinished() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testStarted(String description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testStarted(String description, String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testFinished(TestOutcome result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testRetried() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stepStarted(ExecutedStepDescription description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void skippedStepStarted(ExecutedStepDescription description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stepFailed(StepFailure failure) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lastStepFailed(StepFailure failure) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stepIgnored() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stepPending() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stepPending(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stepFinished() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testFailed(TestOutcome testOutcome, Throwable cause) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testIgnored() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testSkipped() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testPending() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testIsManual() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyScreenChange() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void useExamplesFrom(DataTable table) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewExamplesFrom(DataTable table) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exampleStarted(Map<String, String> data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exampleFinished() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assumptionViolated(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testRunFinished() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testSuiteStarted(Story story) {
		// TODO Auto-generated method stub
		
	}
}
