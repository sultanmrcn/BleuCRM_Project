@wip
Feature:Bleu CRM user login feature
  User Story:
  As a user, I should be able to login with correct credentials

  Acceptance Criteria:
  1-All users can log in with valid credentials
  (We have 3 types of users such as HR user, Marketing user, Helpdesk user).

  Background:
    Given user is on login page of Bleu CRM

  Scenario Outline: User should be able to log in with valid credentials as HR User
    When user enters username "<userName>"
    And user enters password "<password>"
    And user clicks to login button
    Then user sees profile name contains user's name "<profileName>"

    Examples:HR User Valid Credentials
      | userName                 | password | profileName |
      | hr1@cybertekschool.com   | UserUser | hr           |
      | hr50@cybertekschool.com  | UserUser | hr           |
      | hr100@cybertekschool.com | UserUser | hr           |

  Scenario Outline: User should be able to log in with valid credentials as Marketing User
    When user enters username "<userName>"
    And user enters password "<password>"
    And user clicks to login button
    Then user sees profile name contains user's name "<profileName>"

    Examples: Marketing User Valid Credentials
      | userName                        | password | profileName |
      | marketing1@cybertekschool.com   | UserUser | marketing    |
      | marketing50@cybertekschool.com  | UserUser | marketing    |
      | marketing100@cybertekschool.com | UserUser | marketing    |

  Scenario Outline: User should be able to log in with valid credentials as Helpdesk User
    When user enters username "<userName>"
    And user enters password "<password>"
    And user clicks to login button
    Then user sees profile name contains user's name "<profileName>"

    Examples: Helpdesk Valid Credentials
      | userName                       | password | profileName |
      | helpdesk1@cybertekschool.com   | UserUser | helpdesk    |
      | helpdesk50@cybertekschool.com  | UserUser | helpdesk    |
      | helpdesk100@cybertekschool.com | UserUser | helpdesk    |

  Scenario Outline: User sees error message after entering invalid Credentials
    When user enters username "<userName>"
    And user enters password "<password>"
    And user clicks to login button
    Then user sees Incorrect login or password message

    Examples:Valid username - invalid password Credentials
    Valid username - invalid password Credentials
    invalid username - invalid password Credentials

      | userName                 | password    |
      | hr1@cybertekschool.com   | User000User |
      | HR@cybertekschool.com    | UserUser    |
      | hr106@cybertekschool.com | @UserUser   |

  Scenario: User sees error message after not entering any credentials
    When user leaves username field empty
    When user leaves password field empty
    And user clicks to login button
    Then user sees Please fill out this field message
