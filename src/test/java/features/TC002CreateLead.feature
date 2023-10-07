Feature: Create Lead of LeafTabs

@functional @regression 
Scenario Outline: TC002 Create Lead with mandatory fields


Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login Button
Then Welcome should be displayed
When Click on 'CRM/SFA' link
Then HomePage should be displayed
And Click on Leads Link
And Click on Create Leads Link
Given Enter the companyName as <companyname>
And Enter the firstName as <firstname>
And Enter the lastName as <lastname> 
When click on Subit Button
Then ViewLeadsPage should be displayed

Examples:
|companyname|firstname|lastname| 
|Arief International|Arief|Khan|
|Sharif International|Sharif|Khan|

