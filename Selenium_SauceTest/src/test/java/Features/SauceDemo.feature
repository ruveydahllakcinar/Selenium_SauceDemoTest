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

          @FalsePassword
          Scenario Outline: Correct Username & False Password
            Given  User at login page
            When write Correct "<username>" for username field
            When  write False "<password>" for password field
            When Click login button
            Then Check "<error>" message about dont match password
            Examples:
            |username      |error                                                          |password    |
            |problem_user  |Username and password do not match any user in this service    |123456      |


            @FalseUsername
            Scenario Outline: Correct Password & False Username
              Given  User at login page
              When write False "<username>" for username field
              When write correct "<password>" for password field
              When Click login button
              Then Check "<error>" message about dont match username
              Examples:
                |username      |error                                                          |password    |
                |ruveyda       |Username and password do not match any user in this service    |secret_sauce      |


              @AllCorrect
              Scenario Outline: Username & password are correct
                Given  User at login page
                When write Correct "<username>" for username field
                When  write correct "<password>" for password field
                When Click login button
                Then Login is successful
                Examples:
                  |username      | password    |
                  |problem_user  |secret_sauce      |
