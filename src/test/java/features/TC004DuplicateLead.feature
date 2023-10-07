Feature: Duplicate Lead in Leaftaps

#Background:
#Given A Chrome browser is launched
#And Load the Leaftaps url
#And Maximize the browser

 @regression @smoke  @sanity
Scenario Outline: TC004 Duplicate Lead
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
When Clicked on Duplicate Lead button
Then Duplicate Lead page should be displayed
And Edit the Company Name as <companyNameDup>
And Edit the First Name as <firstNameDup>
And Click on Create Lead button
Then Then The Created Lead should be displayed on the View Lead Page

Examples:
|companyname|firstname|lastname|companyNameDup|firstNameDup|
|Arief International|Arief|Khan|Changepond|Sharif Khan|
