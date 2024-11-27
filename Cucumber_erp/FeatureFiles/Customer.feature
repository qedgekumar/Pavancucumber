Feature:
As an admin user validating customer module
@Customer
Scenario Outline:
Validating add Customer module with multiple data
When Launch Browser
When Launch Url in Browser "http://webapp.qedgetech.com/"
When Wait For username with "name" and "username" and "10"
When Enter username with "name" and "username" and "admin"
When Enter password with "name" and "password" and "master"
When Click Login with "id" and "btnsubmit"
When Wait For customers link with "xpath" and "(//a[contains(.,'Customers')])[2]" and "10"
When Click On customers link with "xpath" and "(//a[contains(.,'Customers')])[2]"
When Wait For Add icon with "xpath" and "(//a[@data-caption='Add'])[1]" and "10"
When Click On Add icon with "xpath" and "(//a[@data-caption='Add'])[1]"
When Wait For Customer Number with "name" and "x_Customer_Number" and "10"
When Capture Customer Number with "name" and "x_Customer_Number"
When Enter Customer Name in "<cname>" with "xpath" and "//input[@id='x_Customer_Name']"
When Enter Address in "<address>" with "xpath" and "//textarea[@id='x_Address']"
When Enter City in "<city>" with "xpath" and "//input[@id='x_City']"
When Enter Country in "<country>" with "xpath" and "//input[@id='x_Country']"
When Enter Contact Person in "<cperson>" with "xpath" and "//input[@id='x_Contact_Person']"
When Enter Phone Number in "<pnumber>" with "xpath" and "//input[@id='x_Phone_Number']"
When Enter Email in "<email>" with "xpath" and "//input[@id='x__Email']"
When Enter Mobile Number in "<mnumber>" with "xpath" and "//input[@id='x_Mobile_Number']"
When Enter Notes in "<notes>" with "xpath" and "//input[@id='x_Notes']"
When Click On Add button with "id" and "btnAction"
When Wait For Confirm Ok button with "xpath" and "//button[normalize-space()='OK!']" and "10"
When Click On Confirm Ok button with "xpath" and "//button[normalize-space()='OK!']"
When Wait For Alert Ok button with "xpath" and "(//button[.='OK'])[6]" and "10"
When Click On Alert Ok button with "xpath" and "(//button[.='OK'])[6]"
Then User Validate with Customer Table
When Click On Logout link with "xpath" and "(//a[.=' Logout'])[2]"
When User Closes the Browser
Examples:
|cname|address|city|country|cperson|pnumber|email|mnumber|notes|
|pradeep|kphb|Hyderabad|India|siva|1234567891|pavan.arisetti@gmail.com|7382157977| i am purchasing led tvs|
|satish|krpuram|banglore|India|bharat|9441757670|test@gmail.com|7702248408|i am purchasing mobiles|


