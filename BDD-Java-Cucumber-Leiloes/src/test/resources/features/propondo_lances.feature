# language: pt

Funcionalidade: Propondo lances

Cenario: Propondo um unico lance valido
	Dado um lance valido
	Quando propoe ao lance
	Entao o lance e aceito

Cenario: Propondo varios lances validos
	Dado um lance de 10.0 reais pelo o usuario "fulano"
	E um lance de 15.0 reais pelo o usuario "beltrano"
	Quando propoe varios lances ao leilao
	Entao os lances sao aceitos

Esquema do Cenario: Propondo um lance invalido
	Dado um lance invalido de <valor> reais e do usuario '<nomeUsuario>'
	Quando propoe ao lance
	Entao os lances não é aceito

Exemplos:
	| valor | nomeUsuario |
	| 0     | beltrano    |
	| -1    | cigano      |


Cenario: Propondo uma sequencia de lances
	Dado dois lances
		| valor | nomeUsuario |
		| 10    | beltrano    |
		| 15    | beltrano    |
	Quando propoe varios lances ao leilao
	Entao o segundo lance não e aceito








