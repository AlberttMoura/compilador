grammar PolicyGrammar;

// Símbolos terminais
POLICY: 'Policy Name = ';
TARGET: 'Target = ';
POLICY_RULE: 'Rule Name = ';
CONDITION_KEY: 'Condition Key = ';
CONDITION_VALUE: 'Condition Value = ';
ACTION: 'Action = ';
STRING: [a-zA-Z0-9 /:.]+;

ESPACO: [ \t\n\r]+ -> skip ;

// Símbolos não terminais
program
    : exp*
    ;

exp
    : POLICY STRING target policyRule* ACTION STRING
    | TARGET STRING
    | policyRule
    | CONDITION_KEY STRING CONDITION_VALUE STRING
    | ACTION STRING
    ;

target
    : TARGET STRING
    ;

policyRule
    : POLICY_RULE STRING condition action
    ;

condition
    : CONDITION_KEY STRING
    ;

action
    : ACTION STRING
    ;