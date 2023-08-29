
package codigo;
import static codigo.Tokens.*;


class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\46\1\0\2\3\22\0\1\3\1\50\1\10\2\11"+
    "\1\4\1\41\1\11\1\51\1\52\1\4\1\43\1\11\1\12\1\6"+
    "\1\45\12\2\1\0\1\11\1\47\1\44\1\5\1\11\1\0\32\1"+
    "\1\7\1\0\1\7\1\4\1\11\1\0\1\31\1\30\1\27\1\23"+
    "\1\17\1\16\1\1\1\22\1\13\1\1\1\32\1\20\1\34\1\14"+
    "\1\24\1\35\1\1\1\25\1\21\1\15\1\37\1\33\1\26\1\36"+
    "\1\40\1\1\1\7\1\42\1\7\43\0\1\11\35\0\1\11\uff40\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\1\1\5\15\2\2\11\1\5\1\12\1\5"+
    "\1\6\1\7\1\10\1\0\1\13\1\6\1\0\1\14"+
    "\1\15\1\2\1\16\20\2\1\11\1\17\1\4\1\0"+
    "\1\20\15\2\1\0\7\2\1\3\7\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[90];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\53\0\126\0\201\0\53\0\254\0\327\0\53"+
    "\0\53\0\u0102\0\u012d\0\u0158\0\u0183\0\u01ae\0\u01d9\0\u0204"+
    "\0\u022f\0\u025a\0\u0285\0\u02b0\0\u02db\0\u0306\0\u0331\0\u035c"+
    "\0\u0387\0\u03b2\0\u03dd\0\327\0\u0408\0\u0433\0\327\0\u045e"+
    "\0\u0489\0\53\0\53\0\u0102\0\53\0\53\0\u04b4\0\126"+
    "\0\u04df\0\u050a\0\u0535\0\u0560\0\u058b\0\u05b6\0\u05e1\0\u060c"+
    "\0\u0637\0\u0662\0\u068d\0\u06b8\0\u06e3\0\u070e\0\u0739\0\u0764"+
    "\0\53\0\53\0\u078f\0\u07ba\0\u0489\0\u07e5\0\u0810\0\u083b"+
    "\0\u0866\0\u0891\0\u08bc\0\u08e7\0\u0912\0\u093d\0\u0968\0\u0993"+
    "\0\u09be\0\u09e9\0\u0a14\0\u0a3f\0\u0a6a\0\u0a95\0\u0ac0\0\u0aeb"+
    "\0\u0b16\0\u0b41\0\53\0\u0b6c\0\u0b97\0\u0bc2\0\u0bed\0\u0c18"+
    "\0\u0c43\0\u0c6e";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[90];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\10\1\13\1\14\1\3\1\15\1\16\1\17"+
    "\1\3\1\20\1\3\1\21\1\3\1\22\1\23\1\24"+
    "\1\25\2\3\1\26\1\27\1\30\3\3\1\31\1\32"+
    "\1\33\1\34\1\35\1\5\1\36\1\37\1\40\1\11"+
    "\54\0\2\3\10\0\26\3\14\0\1\4\3\0\1\41"+
    "\110\0\1\42\52\0\1\43\6\0\10\44\1\45\42\44"+
    "\12\0\1\46\31\0\1\42\7\0\2\3\10\0\1\3"+
    "\1\47\1\3\1\50\15\3\1\51\4\3\13\0\2\3"+
    "\10\0\7\3\1\52\2\3\1\53\13\3\13\0\2\3"+
    "\10\0\11\3\1\54\4\3\1\55\7\3\13\0\2\3"+
    "\10\0\5\3\1\56\15\3\1\57\2\3\13\0\2\3"+
    "\10\0\13\3\1\60\12\3\13\0\2\3\10\0\11\3"+
    "\1\50\14\3\13\0\2\3\10\0\4\3\1\61\21\3"+
    "\13\0\2\3\10\0\7\3\1\62\16\3\13\0\2\3"+
    "\10\0\5\3\1\63\10\3\1\64\7\3\13\0\2\3"+
    "\10\0\12\3\1\65\13\3\13\0\2\3\10\0\11\3"+
    "\1\66\14\3\13\0\2\3\10\0\16\3\1\67\7\3"+
    "\13\0\2\3\10\0\12\3\1\70\13\3\53\0\1\71"+
    "\53\0\1\71\53\0\1\72\1\42\52\0\1\42\1\73"+
    "\12\0\1\43\36\0\1\43\20\0\1\74\42\0\1\75"+
    "\51\0\2\3\10\0\2\3\1\50\23\3\13\0\2\3"+
    "\10\0\22\3\1\76\3\3\13\0\2\3\10\0\1\77"+
    "\25\3\13\0\2\3\10\0\24\3\1\100\1\50\13\0"+
    "\2\3\10\0\12\3\1\50\13\3\13\0\2\3\10\0"+
    "\5\3\1\56\20\3\13\0\2\3\10\0\6\3\1\100"+
    "\17\3\13\0\2\3\10\0\14\3\1\101\11\3\13\0"+
    "\2\3\10\0\1\64\25\3\13\0\2\3\10\0\2\3"+
    "\1\102\23\3\13\0\2\3\10\0\1\103\25\3\13\0"+
    "\2\3\10\0\16\3\1\104\7\3\13\0\2\3\10\0"+
    "\2\3\1\105\23\3\13\0\2\3\10\0\4\3\1\106"+
    "\21\3\13\0\2\3\10\0\1\107\25\3\13\0\2\3"+
    "\10\0\1\110\25\3\13\0\2\3\10\0\1\111\10\3"+
    "\1\112\14\3\12\0\46\73\1\0\4\73\2\0\1\113"+
    "\51\0\2\3\10\0\11\3\1\114\14\3\13\0\2\3"+
    "\10\0\6\3\1\50\17\3\13\0\2\3\10\0\4\3"+
    "\1\50\21\3\13\0\2\3\10\0\4\3\1\115\21\3"+
    "\13\0\2\3\10\0\24\3\1\116\1\3\13\0\2\3"+
    "\10\0\5\3\1\100\20\3\13\0\2\3\10\0\6\3"+
    "\1\77\17\3\13\0\2\3\10\0\14\3\1\117\11\3"+
    "\13\0\2\3\10\0\16\3\1\120\7\3\13\0\2\3"+
    "\10\0\10\3\1\50\15\3\13\0\2\3\10\0\1\3"+
    "\1\50\24\3\13\0\2\3\10\0\20\3\1\121\5\3"+
    "\13\0\2\3\10\0\2\3\1\122\23\3\14\0\1\113"+
    "\47\0\1\123\1\0\2\3\10\0\12\3\1\47\13\3"+
    "\13\0\2\3\10\0\22\3\1\124\3\3\13\0\2\3"+
    "\10\0\12\3\1\110\13\3\13\0\2\3\10\0\7\3"+
    "\1\50\16\3\13\0\2\3\10\0\17\3\1\50\6\3"+
    "\13\0\2\3\10\0\16\3\1\125\7\3\13\0\2\3"+
    "\10\0\4\3\1\126\21\3\13\0\2\3\10\0\2\3"+
    "\1\127\23\3\13\0\2\3\10\0\2\3\1\100\23\3"+
    "\13\0\2\3\10\0\14\3\1\130\11\3\13\0\2\3"+
    "\10\0\1\131\25\3\13\0\2\3\10\0\2\3\1\132"+
    "\23\3\13\0\2\3\10\0\11\3\1\110\14\3\13\0"+
    "\2\3\10\0\4\3\1\107\21\3\12\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3225];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\2\1\2\11\27\1\1\0"+
    "\2\11\1\0\2\11\22\1\2\11\1\1\1\0\16\1"+
    "\1\0\7\1\1\11\7\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[90];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 140) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 5: 
          { lexeme=yytext(); return Operador;
          }
        case 17: break;
        case 11: 
          { lexeme=yytext(); return Combinado;
          }
        case 18: break;
        case 3: 
          { lexeme=yytext(); return Entero;
          }
        case 19: break;
        case 14: 
          { lexeme=yytext(); return Reservadas;
          }
        case 20: break;
        case 1: 
          { lexeme=yytext(); return ERROR;
          }
        case 21: break;
        case 13: 
          { lexeme=yytext(); return Decremento;
          }
        case 22: break;
        case 6: 
          { lexeme=yytext(); return Relacional;
          }
        case 23: break;
        case 12: 
          { lexeme=yytext(); return Cadena;
          }
        case 24: break;
        case 10: 
          { lexeme=yytext(); return Asignacion;
          }
        case 25: break;
        case 8: 
          { lexeme=yytext(); return Delimitador;
          }
        case 26: break;
        case 4: 
          { /*Ignore*/
          }
        case 27: break;
        case 16: 
          { lexeme=yytext(); return Decimal;
          }
        case 28: break;
        case 15: 
          { lexeme=yytext(); return Incremento;
          }
        case 29: break;
        case 7: 
          { lexeme=yytext(); return Signo;
          }
        case 30: break;
        case 9: 
          { lexeme=yytext(); return Logico;
          }
        case 31: break;
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 32: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
