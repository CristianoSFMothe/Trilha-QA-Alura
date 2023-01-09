# language: pt

Funcionalidade: : Propondo lances

Cenario: : Propondo um unico lance valido
	Dado um lance valido
	Quando propoe ao lance
	Entao o lance e aceito

Cenario: : Propondo varios laces validos
	Dado varios lances validos
	Quando propoe varios lances ao leilao
	Entao os lances sao aceitos

