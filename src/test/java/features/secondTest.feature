
Feature: Application Login

#Sec5
Background:
When Learnch the browser from config variables
And Hit the home page url of banking site
#//Before > Background > Scenario > After


@SanityTest @NetBanking
Scenario: User Page default login

Given User is on Netbanking landing page
When User login to application with user1 and password 1234 	//Multiple data types
Then Home page is displayed
And Cards are displayed


@SmokeTest @RegressionTest @Mortgage
Scenario Outline: Mortgage User Page default login
Given User is on Netbanking landing page
When User login to application with "<Username>" and password "<Password>"
Then Home page is displayed
And Cards are displayed

Examples:
| Username   | Password |
| Debituser  | 22222    |
| Credituser | 33333    |



