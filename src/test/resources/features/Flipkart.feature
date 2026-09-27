Feature: To Validate the Flipkart Application 
Background:

Given Launch the Flipkart application 
When  close the popup 
Then It should navigates to the Flipkart 

@tc001 @regression
Scenario: To validate the search functionality 

Given user enter the text in the search field 
When cliks the search button
Then It should navigate to the search result page and display the relevent detailes
And Select Minium and Maximum Amount 
And Select the Brand 
And Select the Ram 
And Select the Battery Capacity 
Then it should display the Relevent result   

@tc002 @regression 
Scenario Outline: To validate the search funcationality 

Given Enter the "<searchtext>" in the field 
When  click the search button 
Then It should navigates to the next page and display the corresponding page 

Examples:
|searchtext|
|Mobile|
|TV|
|Speaker|
|Shirt| 

@tc003 @regression
Scenario: to validate Addcart funcationlity 

Given search for any product 
When  select one product 
And  add the product in to cart 
Then validate the cart funcationality 

@tc004 @regression 
Scenario: to test the search functionality with excel sheet 

Given Enter serach Text In the Search Field 
When click search Icon 
Then It should Display the Relevent result 















 