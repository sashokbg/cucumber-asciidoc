Feature: Calculator

image::images/img1.png[]

  Rule: Mltiplication should work
    Example: Two times Four
      #{}
      Given I have the following numbers
        | test | dsfds |
        | 1    | 2     |
      When I sum the numbers
      Then I should have 8 as result
  
  Scenario: Adding numbers with cucumber
    You can use *asciidoc markup* in _feature_ #description#.

    image::images/img1.png[]

    NOTE: This is a very important feature!


    #{IMPORTANT: Asciidoc markup inside *steps* must be surrounded by *curly brackets*.}
    Given I have numbers 1 and 2

    # {NOTE: Steps comments are placed *before* each steps so this comment is for the *WHEN* step.}

    When I sum the numbers

    # {* this is a list of itens inside a feature step}
    # {* there is no multiline comment in gherkin}
    # {** second level list item}
    Then I should have 3 as result