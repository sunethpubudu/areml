grammar AREML;            // Define a grammar called AREML
r  :  action object? connectionType? ARTICLE? object+ | object object? action connectionType? ARTICLE? object? lastLocation? |
person? action ARTICLE? object+ connectionType? ARTICLE? lastLocation? |person? object+ action connectionType? ARTICLE? lastLocation? |
action connectionType action | person? action+ ARTICLE? object? connectionType ARTICLE lastLocation |
person? action+ ARTICLE? object? connectionType? ARTICLE? object+ connectionType? ARTICLE? lastLocation? |
action+ connectionType? ARTICLE? object? ; // e.g.switch on the light

ARTICLE : 'the' | 'an' | 'a' ;
connectionType: 'on'|'in'|'under'|'next to'|'in front of'|'behind'|'with'|'into'|' in to'|'down'|'up'|'to'|'from';

person:STRING;
action: STRING|STRING'-'STRING;
object: STRING;	
lastLocation: STRING+;	

STRING:('a'..'z'|'A'..'Z')+;	
WS : [ \t\r\n]+ -> skip ;