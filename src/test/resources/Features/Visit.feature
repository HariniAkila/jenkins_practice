Feature: visit the page

@HappyPath
Scenario: happy path
	Given the site of the url "https://www.saucedemo.com/"
	When i visit the page
	Then the title should be "Swag Labs"
	
@UnhappyPath
Scenario: happy path
	Given the site of the url "https://www.saucedemo.com/"
	When i visit the page
	Then the title will not be "Swag Labs1"
	
@Smoke
Scenario: happy path
	Given the site of the url "https://www.saucedemo.com/"
	When i visit the page
	Then the title will not be "Swag Labs1"