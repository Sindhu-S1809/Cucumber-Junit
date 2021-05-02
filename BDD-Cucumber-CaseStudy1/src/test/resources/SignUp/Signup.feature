Feature: Login details
This feature includes scenarios that would validate the following feature.
1) Signup to the application
1) Verify the login
3) Send mail from the registered mail id

#Background:


@Register
Scenario: Signup into the application
Given Iam able to navigate to login page
When I click on signup
And I enter the First name as "AditiSreeD"
And I enter the Last name as "DS"
And I enter the e-mail as "sindhu_siva09@yahoo.com"
And I enter the username as "AditiSreeD"
And I enter the pass as "Friends@1809"
And I enter the Confirm password as "Friends@1809"
And I Click on the Register button
And I click on the profile photo
And I click on compose message icon
And I enter the send to as "Sindhu"
And I enter the subject as "Test Mail"
#And I enter the Message as "Hi Mrs. Sindhu, Welcome to happy Learning Form, Sindhu"
And I click on Send message
Then I verify the acknowledgement by clicking on outbox.