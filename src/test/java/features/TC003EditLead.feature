Feature: Edit Lead in Leaftaps


@functional @regression 
Scenario Outline: TC003 Edit Lead
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
When Clicked on Edit button
Then Edit Lead page should be displayed
And Edit the Important Note as <importantNote>
And Click on Update button
Then Then The Edited Lead should be displayed on the View Lead Page

Examples:
|companyname|firstname|lastname| importantNote|
|Arief International|Arief|Khan|sampleImportantNote1|
|Sharif International|Sharif|Khan|sampleImportantNote2|