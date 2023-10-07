Feature: Login Functionality of Leaftaps Application

#Background:
#Given Launch the browser
#And Load the url 'http://leaftaps.com/opentaps/control/main'

@functional @smoke 
Scenario Outline: TC001 Login with valid credentials
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login Button
Then Welcome should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

Scenario Outline: TC002 Login with invalid credentials

Given Enter the username as <username>
And Enter the password as <password>
When Click on Login Button
But Error Message should be displyed

Examples:
|username|password|
|'Demosalesmanagedr'|'crmsfa@123'|
|'Arief'|'Sadered'|