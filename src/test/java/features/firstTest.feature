
Feature: Application Login

#Sec5
Background:
Given Setup the entries in database
When Learnch the browser from config variables
And Hit the home page url of banking site

@RegressionTest
Scenario: Admin Page default login

Given User is on Netbanking landing page
When User login to application with "Admin" and password "1111"
Then Home page is displayed
And Cards are displayed


#Reuasablity

#Reusing same code with multiple scenrios Sec4
@SanityTest
Scenario: User Page default login

Given User is on Netbanking landing page
When User login to application with user1 and password 1234 	//Multiple data types
Then Home page is displayed
And Cards are displayed

#This is for using same code with multiple data || Sec4
@SmokeTest @RegressionTest
Scenario Outline: Morgage User Page default login
Given User is on Netbanking landing page
When User login to application with "<Username>" and password "<Password>"
Then Home page is displayed
And Cards are displayed

Examples:
| Username   | Password |
| Debituser  | 22222    |
| Credituser | 33333    |


#Data Drivien testing | Sec5
#Multiple data insert to the page in single test

@SmokeTest
Scenario: User Page default Sign up

Given User is on Practice landing page
When User Signup into application 
	| Shihara |
	| Wickrama |
	| shihara@gamil.com |
	| 0772233443 |
Then Home page is displayed
And Cards are displayed
