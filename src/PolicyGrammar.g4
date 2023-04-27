grammar PolicyGrammar;

// Símbolos terminais
POLICY: 'Policy Name = ';
TARGET: 'Target = ';
POLICY_RULE: 'Rule Name = ';
CONDITION_KEY: 'Condition Key = ';
STRING: [a-zA-Z0-9 /:.]+;

ESPACO: [ \t\n\r]+ -> skip ;

// Símbolos não terminais
program
    : exp*
    ;

exp
    : policy target policyRule*
    | TARGET STRING
    | policyRule
    | CONDITION_KEY STRING CONDITION_VALUE STRING
    ;

policy
    : POLICY STRING
    ;

target
    : TARGET STRING
    ;

policyRule
    : POLICY_RULE STRING condition
    ;

condition
    : CONDITION_KEY STRING
    ;