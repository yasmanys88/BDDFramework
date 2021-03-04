Feature: Login Test Feature 

Scenario: Login Test 

	Given Usuario abre el navegador 
	When Usuario nevega a "http://newtours.demoaut.com/" 
	Then Usuario teclea username a "mercury" and password as "mercury" 
	And Click en Login BTN 
	Then El titulo de la pagina es "Find a Flight: Mercury Tours:" 
	When Usuario da clic en SIGN-OFF link 
	Then el titulo de la pagina debe ser "Sign-on: Mercury Tours" 
	And Cierro el navegador