package stepDefiniation;

import commonFunctions.FunctionLibrary;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerSteps {
	@When("^Launch Browser$")
	public void launch_Browser() throws Throwable {
		FunctionLibrary.startBrowser();

	}

	@When("^Launch Url in Browser \"([^\"]*)\"$")
	public void launch_Url_in_Browser(String arg1) throws Throwable {
		FunctionLibrary.openUrl(arg1);
	}

	@When("^Wait For username with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_username_with_and_and(String Locator_Type, String Locator_Value, String Test_Data) throws Throwable {
		FunctionLibrary.WaitForElement(Locator_Type, Locator_Value, Test_Data);
	}

	@When("^Enter username with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_username_with_and_and(String Locator_Type, String Locator_Value, String Test_Data) throws Throwable {
		FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);
	}

	@When("^Enter password with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_password_with_and_and(String Locator_Type, String Locator_Value, String Test_Data) throws Throwable {
		FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);


	}

	@When("^Click Login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_Login_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.clickAction(Locator_Type, Locator_Value);

	}

	@When("^Wait For customers link with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_customers_link_with_and_and(String Locator_Type, String Locator_Value, String Test_Data) throws Throwable {
		FunctionLibrary.WaitForElement(Locator_Type, Locator_Value, Test_Data);
	}

	@When("^Click On customers link with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_customers_link_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.clickAction(Locator_Type, Locator_Value);
	}

	@When("^Wait For Add icon with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_Add_icon_with_and_and(String Locator_Type, String Locator_Value, String Test_Data) throws Throwable {
		FunctionLibrary.WaitForElement(Locator_Type, Locator_Value, Test_Data);
	}

	@When("^Click On Add icon with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Add_icon_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.clickAction(Locator_Type, Locator_Value);
	}

	@When("^Wait For Customer Number with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_Customer_Number_with_and_and(String Locator_Type, String Locator_Value, String Test_Data) throws Throwable {
		FunctionLibrary.WaitForElement(Locator_Type, Locator_Value, Test_Data);
	}

	@When("^Capture Customer Number with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void capture_Customer_Number_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.captureCustomer(Locator_Type, Locator_Value);
	}

	@When("^Enter Customer Name in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Customer_Name_in_with_and(String Test_Data, String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);
	}

	@When("^Enter Address in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Address_in_with_and(String Test_Data, String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);

	}

	@When("^Enter City in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_City_in_with_and(String Test_Data, String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);

	}

	@When("^Enter Country in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Country_in_with_and(String Test_Data, String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);

	}

	@When("^Enter Contact Person in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Contact_Person_in_with_and(String Test_Data, String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);
	}

	@When("^Enter Phone Number in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Phone_Number_in_with_and(String Test_Data, String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);
	}

	@When("^Enter Email in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Email_in_with_and(String Test_Data, String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);
	}

	@When("^Enter Mobile Number in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Mobile_Number_in_with_and(String Test_Data, String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);
	}

	@When("^Enter Notes in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Notes_in_with_and(String Test_Data, String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.typeAction(Locator_Type, Locator_Value, Test_Data);


	}

	@When("^Click On Add button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Add_button_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.clickAction(Locator_Type, Locator_Value);

	}


	@When("^Wait For Confirm Ok button with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_Confirm_Ok_button_with_and_and(String Locator_Type, String Locator_Value, String Test_Data) throws Throwable {
		FunctionLibrary.WaitForElement(Locator_Type, Locator_Value, Test_Data);
	}

	@When("^Click On Confirm Ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Confirm_Ok_button_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.clickAction(Locator_Type, Locator_Value);

	}

	@When("^Wait For Alert Ok button with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_Alert_Ok_button_with_and_and(String Locator_Type, String Locator_Value, String Test_Data) throws Throwable {
		FunctionLibrary.WaitForElement(Locator_Type, Locator_Value, Test_Data);
	}

	@When("^Click On Alert Ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Alert_Ok_button_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.clickAction(Locator_Type, Locator_Value);
	}

	@Then("^User Validate with Customer Table$")
	public void user_Validate_with_Customer_Table() throws Throwable {
		FunctionLibrary.customerTable();

	}

	@When("^Click On Logout link with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Logout_link_with_and(String Locator_Type, String Locator_Value) throws Throwable {
		FunctionLibrary.closeBrowser();

	}

	@When("^User Closes the Browser$")
	public void user_Closes_the_Browser() throws Throwable {

	}



}
