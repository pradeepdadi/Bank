Feature: BankRegistration
@Bank
Scenario: Registering for Bank
Given User Click on "Register" in home page
And User enter "Pradeep" in "First Name"
And User enter "Dadi" in "Last Name"
And User enter "KPHB" in "Address"
And User enter "Hyderabad" in "City"
And User enter "Telangana" in "State"
And user enter random 10 number into "Zip Code"
And user enter random 10 number into "Phone"
And User enter "456678" in "SSN"

  