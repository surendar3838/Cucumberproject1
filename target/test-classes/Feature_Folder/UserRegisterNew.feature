Feature: User Register Funtion Test

Scenario Outline: User Test Login Credential

Given user launch chrome browser
And user enter url
When user enter "<UserName>" and "<PassWord>"
Then user click login button
And user validate test

Examples:
|UserName			|PassWord		|
|surendar3838@gmail.com	|Saransuren@123	|
|Raj12				|shshj754^&	|
|Rameshshs		|xnk25%$%@	|
