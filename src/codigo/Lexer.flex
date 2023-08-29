package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
Letra = [a-zA-Z]+
Digito = [0-9]+
Espacio = [ \t\f|\r|\n|\r\n]
Op = [\+\-\*\/\%\^]
Compar = [\>\<]
Dec = [0-9]+(\.[0-9]+)
Delimit = [\(\)\{\}\[\]]
Caden = [\"][^\"]*[\"]
Sig = [\,\'\;\.\?\¿\!\¡\#\$\-]
%{
    public String lexeme;
%}
%%
int | if | else | this | do | for | switch | break | void | import | main |
false | true | private | protected | class | try | catch | while | return {lexeme=yytext(); return Reservadas;}

"&&" | "||" | "&" | "|" {lexeme=yytext(); return Logico;}

"+=" | "-=" | "*=" | "/=" | "%=" | "^=" {lexeme=yytext(); return Combinado;}

{Espacio} {/*Ignore*/}

"//".* {/*Ignore*/}

"++" {lexeme=yytext(); return Incremento;}

"--" {lexeme=yytext(); return Decremento;}

"=" {lexeme=yytext(); return Asignacion;}

"==" | "<=" | ">=" | "<>" | "!=" | {Compar} {lexeme=yytext(); return Relacional;}

{Op} {lexeme=yytext(); return Operador;}

{Letra}({Letra}|{Digito})* {lexeme=yytext(); return Identificador;}

("(-"{Digito}+")")|{Digito}+ {lexeme=yytext(); return Entero;}

{Dec} {lexeme=yytext(); return Decimal;}

{Delimit} {lexeme=yytext(); return Delimitador;}

{Caden} {lexeme=yytext(); return Cadena;}

"_" | {Sig} {lexeme=yytext(); return Signo;}

 . {lexeme=yytext(); return ERROR;}
