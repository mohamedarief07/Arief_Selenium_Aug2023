Feature: Merge Lead in Leaftaps

#  Background: 
#    Given A Chrome browser is launched
#    And Load the Leaftaps url
#    And Maximize the browser

@sanity
  Scenario: TC006 Merge Lead
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login Button
Then Welcome should be displayed
When Click on 'CRM/SFA' link
Then HomePage should be displayed
And Click on Leads Link
    When The Merge Leads link is clicked in the Leads Main Page
    Then The Merge Leads Page should be displayed
    And Click on the From Lead lookup image
    And Click on First Resulting Lead on the new window
    Then Window should be changed to default
    And Click on the To Lead lookup image
    And Click on Second Resulting Lead on the new window
    Then Window should be changed to default again
    When Clicked on Merge button
    When The Alert is accepted
    Then View Lead Page should be displayed


