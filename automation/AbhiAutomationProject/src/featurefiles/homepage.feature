 
@Smoke    
Feature: Test case for Fake API call scenarios
   I want to use this template for my feature file

@APIendpointStatus
Scenario: Test service status of the API endpoint (only one in this case)
    Given As a user i should be able to lauch the TODO App And When Service is called with "Fake API Call" Then  I should be able to check the Status of the service
    
@category
Scenario: Find how many tasks do not have category assigned
    Given To identify tasks without categories 
    When  TODO App is launched verify the categories assigned for tasks 
    Then  Verify the tasks without any categories assinged to them
  
@tasknames
 Scenario: Aggregate and print only "task names"
    Given To Aggregate and print only "task names" 
    When  TODO App is launched verify the task names and print them by aggregatting it 
    Then  Verify the tasks without any categories assinged to them
    
  @duedate
 Scenario: Read API response and print tasks in descending "due date" order
    Given To print tasks in due date descending order 
        
    
  @ToalTasks
 Scenario: Count and validate the number of tasks
    Given To verify the total Number of tasks
    When  TODO App is launched Then verify the total Number of tasks 
    