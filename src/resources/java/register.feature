Feature: Register functionality
 
@Registeration
Scenario: User Registeration
   
    Given Home page should be open
   When Enter the valid username as "lailaa4"
    And Enter the firstname as "user" and last name as "alex"
    And Enter the password as "pass1234"
    And Enter the confirm password as "pass1234"
    And Click the gender as male
    And Enter the email address as "user@gmail.com"
    And Enter the mobile number as "9876543210"
    And Enter the dob as "16/01/1996"
    And Enter the address as "Chennai, India"
    And Select the security question
    And Enter the answer as "blue" and click on submit
    
    Then Registeration is successfull
    
@Login

  Scenario Outline: User Login
    Given Sign-in page should be open
    When Enter the username "<user>" and password "<password>"
    Then Login is successfull
    
Examples:
|user||password|
|lalitha||password123|
|lalit||password123|

  @Search
   Scenario: User searches the product without typing the whole product name
   Given User is already logged in
   When User types the first four characters of the product 
   Then User gets all appropriate results to purchase
