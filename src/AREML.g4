grammar AREML;            // Define a grammar called Hello
r  : person? action ARTICLE? object connectionType? ARTICLE? lastLocation?| action connectionType? ARTICLE? object | person? action; // e.g.switch on the light
ARTICLE : 'the' | 'an' | 'a' ;
connectionType: 'on'|'in'|'under'|'next to'|'in front of'|'behind'|'with'|'into';	
person:STRING;
action: STRING;	
object: STRING;	
lastLocation: STRING+;	

STRING:('a'..'z'|'A'..'Z')+;	
WS : [ \t\r\n]+ -> skip ;