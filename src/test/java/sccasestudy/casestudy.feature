
Feature: casestudy
  I want to use this template for my feature file

  @tag1
  Scenario: Admin Login
    Given I Enters username
    And I Enters password
    Then I Enters Login
    Then I clicks on Add New Poduct
    And I Enters details
    And I Enters Add product
    
  @smoke
  Scenario: Login TestMeApp
    Given I Enters username
    And I Enters password
    When I Enters Login
    Then I adds product to the cart
    
  @smoke
  Scenario: Login TestMeApp
    Given I Enters username
    And I Enters password
    When I Enters Login
    Then I Enters Add category name as "Electronics"
    Then I Enters sub category  as "Head Phone"
    Then I Enters product name as "Jabra 11"
    Then I Enters price as "$300"
    Then I Enters quantity as "10"
    Then I Enters Brand as "Jabra"
     Then I Enters Descrption as "Head phone suitable for office"
     And I clicks on Add product
    
    
    
    
  

 