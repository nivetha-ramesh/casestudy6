Feature: Title of your feature
  I want to use this template for my feature file

  @smoke
  Scenario: Login TestMeApp
    Given I Enters username
    And I Enters password
    When I Enters Login
    Then I validate the outcomes
   
  @smoke
  Scenario: AddToCart
    Given I Enters product name in the field
    And I Enters Add to Cart
    Then I proceeds to payment
    
    @UAT
  Scenario: Payment
    Given I Enters confirm
    And I Enters bank details
    When I Enters ok
    Then I clicks sign out

   @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
  