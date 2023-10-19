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

"establish " {Letra}({Letra}|{Digito})* ("_" {Letra}({Letra}|{Digito})*)* {lexeme=yytext().substring(10); return Variable;}

"establish" | "establish " {Letra}({Letra}|{Digito})* {lexeme=yytext().split(" ")[0]; return Reservadas;}

"power on" | "switch on" | "show:" | read | check | probe | unlike | repeat | 
until {lexeme=yytext(); return Reservadas;}

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