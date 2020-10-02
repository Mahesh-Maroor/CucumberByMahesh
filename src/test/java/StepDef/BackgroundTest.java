package StepDef;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BackgroundTest {
	@Before()
	public void B()
	{
		System.out.println("Normal Before 1st");
	}
	@After()
	public void A()
	{
		System.out.println("Normal After 1st");
	}
	@Before(order=0)
	public void b1()
	{
		System.out.println("B1-0");
	}
	@Before(order=1)
	public void b2()
	{
		System.out.println("B2-0");
	}
	@After(order=0)
	public void A1()
	{
		System.out.println("A1-0");
	}
	@After(order=1)
	public void A2()
	{
		System.out.println("A2-0");
	}
	@Before("@First")
	public void f1()
	{
		System.out.println("Before-->Background test scenario");
	}
	@Before("@Second")
	public void S1()
	{
		System.out.println("Before-->Delete Employee scenario");
	}
	@After("@First")
	public void fa1()
	{
		System.out.println("After-->Background test scenario");
	}
	@After("@Second")
	public void fs1()
	{
		System.out.println("After-->Delete Employee scenario");
	}
	@BeforeStep
	public void s1()
	{
		System.out.println("Before every Step");
	}
	@AfterStep
	public void s2()
	{
		System.out.println("After every Step");
	}
	@Given("^open the browser$")
	public void open_the_browser() {
	    System.out.println("open the browser");
	}

	@Then("^launch the url$")
	public void launch_the_url() {
		System.out.println("launch the url");
	}

	@Then("^login to the app$")
	public void login_to_the_app() {
		System.out.println("login to the app");
	}

	@Given("^Click on Add Employee$")
	public void click_on_add_employee() {
		System.out.println("Click on Add Employee");
	}

	@Then("^Give Hr User ID \"(.*)\"$")
	public void give_hr_user_id(String HRUSERID) {
		System.out.println("Click on Add Employee and HRId by direct parameterization is"+HRUSERID);
	}

	@Then("^Add Employee details like Name and SurName$")
	public void add_employee_details_like_name_and_name(DataTable dataTable) {
	List<List<String>>data=dataTable.asLists();
		System.out.println("Name and Surname by dataTable is is:"+data.get(0).get(0)+ " "+data.get(0).get(1)); 
	}

	@Then("^Save Employee Info$")
	public void save_employee_info() {
		System.out.println("Save Employee Info");
	}

	@Given("^Go to Employee Tab$")
	public void go_to_employee_tab() {
		System.out.println("Go to Employee Tab");
	}

	@Then("^Click on edit Employee$")
	public void click_on_edit_employee() {
		System.out.println("Click on edit Employee");
	}

	@Then("Click on delete employee")
	public void click_on_delete_employee() {
		System.out.println("Click on delete employee");
	}

	@Given("^User is on Employee Page$")
	public void user_is_on_employee_page() {
		System.out.println("User is on Employee Pag");
	}

	@Then("^Add further details of Employee like \"(.*)\" and \"(.*)\"$")
	public void add_further_details_of_employee_like_and(String Firstname, String Lastname) {
		System.out.println("Add further details of Employee like Firstname and Lastname"+Firstname+ " "+Lastname);
	}

	@Then("^Add Employees personal details like \"(.*)\" and \"(.*)\"$")
	public void add_employees_personal_details_like_and(String Maritalstatus, String salary) {
		System.out.println("Add Employees personal details like Maritalstatus and salary");
	}

	@Then("^Save Employee details finally$")
	public void save_employee_details_finally() {
		System.out.println("Save Employee details finally");  
	}
	@Given("^Click on Map$")
	public void click_on_map() {
	    System.out.println("Click on map");
	}

	@Then("^Give Map ID \"(\\d+)\"$")
	public void give_map_id(int id) {
	    System.out.println("Map id is:"+id);
	}

	@Then("Map details like City and Pin")
	public void map_details_like_city_and_pin(DataTable dataTable) {
	for(Map<Object, Object> u:dataTable.asMaps(String.class, String.class))
	{
		System.out.println(u.get("City"));
		System.out.println(u.get("Pin"));
	}
	}

}
