Feature: Propondo lances

Scenario: Propondo um unico lance valido
	Given Dado um lance valid
	When Quand propoe um lance 
	Then Entao o lance e aceito