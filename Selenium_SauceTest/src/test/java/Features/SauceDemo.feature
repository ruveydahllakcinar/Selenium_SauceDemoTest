@SauceDemo
  Feature: SauceDemo Check Test Cases

    @AllEmpty
    Scenario Outline: Empty Username& Empty Password
      Given User at login page
      When Click login button
      Then Check "<error>" message about username
      Examples:
      |error                    |
      |Username is required     |

      @EmptyPassword
     Scenario Outline: Empty Password
        Given User at login page
        When Write "<username>" for username field
        When  Click login button
        Then  Check "<error>" message about password
        Examples:
        |username | error                 |
        |Ruveyda  | Password is required  |

        @EmptyUsername
        Scenario Outline: Empty Username
          Given User at login page
          When Write "<password>" for password field
          When Click login button
          Then  Check "<error>" message about username
          Examples:
          |password | error |
          |123456   | Username is required |

