SYNTAXDEF Code2D
FOR <http://www.utwente.nl/apc/Code2D>
START Game

TOKENS {
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER $('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT $('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
}


TOKENSTYLES {
	"model" COLOR #7F0055, BOLD;
	"entity" COLOR #7F0055, BOLD;
	"Game" COLOR #7F0055, BOLD;
}


RULES {
	Game ::= ("Game " Name[] " {}")*;
}

