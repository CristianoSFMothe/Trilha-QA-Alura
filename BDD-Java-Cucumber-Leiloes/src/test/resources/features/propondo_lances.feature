# language: pt

Funcionalidade: : Propondo lances

Cenario: : Propondo um unico lance valido
	Dado um lance valido
	Quando propoe ao lance
	Entao o lance e aceito

Cenario: : Propondo varios laces validos
	Dado um lance de 10.0 reais pelo o usuario "fulano"
	E um lance de 15.0 reais pelo o usuario "beltrano"
	Quando propoe varios lances ao leilao
	Entao os lances sao aceitos

