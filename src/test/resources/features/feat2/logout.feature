Feature: Logout

  Rule: Mltiplication should work
    Example: Two times Four
      #{}
      Given I have the following numbers
        | test | dsfds |
        | 1    | 2     |
      When I sum the numbers
      Then I should have 8 as result
