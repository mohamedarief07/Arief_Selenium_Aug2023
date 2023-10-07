Feature: Delete Lead in Leaftaps
#
#  Background: 
#    Given A Chrome browser is launched
#    And Load the Leaftaps url
#    And Maximize the browser


  Scenario Outline: TC005 Delete Lead
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login Button
Then Welcome should be displayed
When Click on 'CRM/SFA' link
Then HomePage should be displayed
And Click on Leads Link
    When The Find Lead link is clicked in the Leads Main Page
    Then The Find Lead Page should be displayed
    And Click on the Phone tab under the Find By Section
    And Enter the Phone Number as <phoneNumber>
    And Click on Find Leads button
    Then Select The First result from Lead list
    When Clicked on Delete button
    Then Find Lead page should be displayed
    Then Click on Find Leads button
    And Enter the Lead ID captured from the Lead list before deletion
    And Click on Find Leads Search button
    Then No records should be displayed

    Examples: 
| phoneNumber  |
|  1 |
|  99 |
