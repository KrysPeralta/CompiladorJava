package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
Letra = [a-zA-Z]+
Digito = [0-9]+
Espacio = [ \t\f|\r|\n|\r\n]
Caden = [\"][^\"]*[\"]
Dec = [0-9]+(\.[0-9]+)
Op = [\+\-\*\/\^]
Compar = [\>\<]
Delimit = [\(\)\{\}\[\]]
Sig = [\,\'\;\.\?\¿\!\¡\#\$\-]
%{
    public String lexeme;
%}
%%

"--#".*"--#" {/*Ignore*/}

{Espacio} {/*Ignore*/}

{Caden} {lexeme=yytext(); return Texto;}

("-"{Digito}+)|{Digito}+ {lexeme=yytext(); return Entero;}

{Dec} {lexeme=yytext(); return Decimal;}

true | false {lexeme=yytext(); return Booleano;}

"power on" | "switch on" | "show:" | read | check | probe | unlike | repeat | establish | 
until | fnc | class {lexeme=yytext(); return Reservadas;}

{Letra}({Letra}|{Digito})* ("_" {Letra}({Letra}|{Digito})*)* {lexeme=yytext(); return Variable;}

{Op} {lexeme=yytext(); return Operador;}

"INC" {lexeme=yytext(); return Incremento;}

"RED" {lexeme=yytext(); return Decremento;}

"NOT" {lexeme=yytext(); return Inversion;}

":=" {lexeme=yytext(); return Asignacion;}

"+|" | "-|" | "*|" | "/|" | "^|" {lexeme=yytext(); return Combinado;}

"=" | "<=" | ">=" | "!=" | {Compar} {lexeme=yytext(); return Relacional;}

"AND" | "OR" | "&" | "|" {lexeme=yytext(); return Logico;}

"%" {lexeme=yytext(); return Concatenacion;}

{Delimit} {lexeme=yytext(); return Delimitador;}

{Digito}* "<>" | "<" {Caden}+ (,(" ")*{Caden}+)* ">" | "<" {Digito}* ">" {lexeme=yytext(); return Arreglo;}

 . {lexeme=yytext(); return ERROR;}