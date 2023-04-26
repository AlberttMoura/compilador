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
    :policy_name target policyRule condition action
    ;

policy_name
    : POLICY STRING
    ;

target
    : TARGET STRING
    ;

policyRule
    : POLICY_RULE STRING
    ;

condition
    : CONDITION_KEY STRING
    ;

action
    : ACTION STRING
    ;