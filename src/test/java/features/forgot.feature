Feature: ForgotPassword
@Reset
Scenario: Reset Password
Given User Click on "Forgot login info?" in home page
And user enter random 10 char into "First Name"
And user enter random 10 char into "Last Name"
And user enter random 10 char into "Address"
And user enter random 10 char into "City"
And user enter random 10 char into "State"
And user enter random 10 number into "Zip Code"
And user enter random 9 number into "SSN"
And User Click on "Find My Login Info" button