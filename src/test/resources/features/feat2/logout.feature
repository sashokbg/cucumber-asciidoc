Feature: Logout

  Rule: Multiplication should work
    Example: Two times Four
      #{}
      Given I have the following numbers
        | 1    | 2     |
      When I sum the numbers
      Then I should have 3 as result
