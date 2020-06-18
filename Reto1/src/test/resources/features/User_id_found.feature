
@tag
Feature: Check the api users

  Scenario Outline: Check the user id
    Given I have the headers <headerKey> with value <headerValue>
    When I make a request get to the api <urlAPI>
    Then I should see the user id <userId>

    Examples: 
      | headerKey  | headerValue | urlAPI  | userId |
      |Authorization |Bearer VkeQaYE3gOr-sGffJms-4O-qoKwemq4cjKf7| https://gorest.co.in/public-api/users | 1798|
