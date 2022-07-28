
@tag
Feature: Check the Functionality of OS
  
@tag
  Scenario: OS Functionality
    Given Tap on the OS button
    When click on message
    And enter the receipient name "Pihu" 
    And enter the message body "Hello, How are You"
    Then Click on the send 
  
 @tag 
   Scenario Outline: OS Functionality
   Given Tap on the OS button
    When click on message
    And enter the receipient "<name>" 
    And enter the message "<body>"
    Then Click on the send 
   
    Examples: 
     | name   | body     | 
     | Panchi | Hii      |
     |Janvi   | Hey      |