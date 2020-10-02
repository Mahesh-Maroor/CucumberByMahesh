Feature: Background check example
Purpose is to check background function

Background:
Given open the browser 
Then launch the url
Then login to the app
@SmokeTest
@First
Scenario: Background test
 Adding Employee
 
 Given Click on Add Employee
 Then Give Hr User ID "Admin"
 Then Add Employee details like Name and SurName
 |Mahesh|Maroor|
 Then Save Employee Info
 @SmokeTest
 @Second
 Scenario: Delete Employee
  Given Go to Employee Tab
  Then Click on edit Employee
  Then Click on delete employee
  @RegressionTest
  Scenario Outline:
  Given User is on Employee Page
  Then Add further details of Employee like "<FirstName>" and "<LastName>"
  Then Add Employees personal details like "<MaritalStatus>" and "<Salary>"
  Then Save Employee details finally
  
  Examples:
  |FirstName|LastName|MaritalStatus|Salary|
  |Umesh|Marur|Married|45000|
  |Ravi|Ganga|Unmarried|20000|
  @EndToEndTest
 Scenario: Map Check
 Purpose is to check Map
 Given Click on Map
 Then Give Map ID "13"
 Then Map details like City and Pin
 |City|Pin|
 |Bidar|521|
 |Kalyan|897|
 Then Save Employee Info