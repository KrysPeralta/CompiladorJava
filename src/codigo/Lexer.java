/* The following code was generated by JFlex 1.4.3 on 23/10/23 0:35 */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 23/10/23 0:35 from the specification file
 * <tt>C:/Users/kryst/Documents/NetBeans_Java/AnalisisLexico/src/codigo/Lexer.flex</tt>
 */
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
    "\11\0\1\3\1\13\1\0\2\3\22\0\1\27\1\44\1\4\1\12"+
    "\1\0\1\46\1\45\1\0\2\10\1\6\1\6\1\47\1\11\1\5"+
    "\1\6\12\2\1\34\1\0\1\43\1\41\1\7\1\0\1\0\1\1"+
    "\1\1\1\1\1\1\1\1\3\1\1\1\4\1\1\1\1\1\2\1"+
    "\1\1\1\1\1\1\6\1\1\10\1\0\1\10\1\6\1\40\1\0"+
    "\1\21\1\37\1\32\1\35\1\17\1\20\1\1\1\33\1\31\1\1"+
    "\1\36\1\22\1\1\1\30\1\25\1\24\1\1\1\15\1\23\1\14"+
    "\1\16\1\1\1\26\3\1\1\10\1\42\1\10\43\0\1\0\35\0"+
    "\1\0\uff40\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\1\5\1\6"+
    "\1\7\1\5\10\2\1\1\2\6\1\1\1\10\1\11"+
    "\4\0\1\12\1\13\1\3\1\0\14\2\1\14\2\0"+
    "\1\15\1\16\1\0\7\2\1\17\6\2\2\0\1\20"+
    "\12\2\2\0\3\2\1\17\1\2\1\4\1\2\1\0"+
    "\1\2\1\0\1\2";

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
    "\0\0\0\50\0\120\0\170\0\50\0\240\0\310\0\360"+
    "\0\50\0\u0118\0\u0140\0\u0168\0\u0190\0\u01b8\0\u01e0\0\u0208"+
    "\0\u0230\0\u0258\0\u0280\0\50\0\u02a8\0\360\0\50\0\50"+
    "\0\u02d0\0\u02f8\0\u0320\0\240\0\50\0\50\0\u0348\0\u0370"+
    "\0\u0398\0\u03c0\0\u03e8\0\u0410\0\u0438\0\u0460\0\u0488\0\u04b0"+
    "\0\u04d8\0\u0500\0\u0528\0\u0550\0\50\0\u0578\0\u05a0\0\50"+
    "\0\u02f8\0\u05c8\0\u05f0\0\u0618\0\u0640\0\u0668\0\u0690\0\u06b8"+
    "\0\u06e0\0\120\0\u0708\0\u0730\0\u0758\0\u0780\0\u07a8\0\u07d0"+
    "\0\u07f8\0\u0820\0\120\0\u0848\0\u0870\0\u0898\0\u08c0\0\u08e8"+
    "\0\u0910\0\u0938\0\u0960\0\u0988\0\u09b0\0\u09d8\0\u0a00\0\u0a28"+
    "\0\u0a50\0\u0a78\0\50\0\u0aa0\0\u05c8\0\u0ac8\0\u0af0\0\u0b18"+
    "\0\u0b40\0\u0b68";

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
    "\1\2\1\3\1\4\1\5\1\6\1\2\1\7\1\10"+
    "\1\11\1\12\1\2\1\5\1\13\1\14\1\15\1\16"+
    "\1\17\2\3\1\20\1\21\2\3\1\5\2\3\1\22"+
    "\1\3\1\23\3\3\1\2\1\24\1\5\1\25\1\26"+
    "\1\27\1\30\1\2\51\0\2\3\11\0\13\3\1\0"+
    "\4\3\1\0\3\3\1\31\11\0\1\4\2\0\1\32"+
    "\35\0\1\33\4\0\4\34\1\35\43\34\42\0\1\36"+
    "\46\0\1\24\10\0\1\37\6\0\1\40\30\0\1\36"+
    "\6\0\2\3\11\0\1\3\1\41\11\3\1\0\4\3"+
    "\1\0\3\3\1\31\10\0\2\3\11\0\3\3\1\42"+
    "\7\3\1\0\4\3\1\0\3\3\1\31\10\0\2\3"+
    "\11\0\13\3\1\0\1\43\3\3\1\0\3\3\1\31"+
    "\10\0\2\3\11\0\7\3\1\44\3\3\1\0\4\3"+
    "\1\0\3\3\1\31\10\0\2\3\11\0\5\3\1\45"+
    "\5\3\1\0\1\46\3\3\1\0\3\3\1\31\10\0"+
    "\2\3\11\0\12\3\1\47\1\0\3\3\1\50\1\0"+
    "\3\3\1\31\10\0\2\3\11\0\1\3\1\51\7\3"+
    "\1\52\1\3\1\0\4\3\1\0\3\3\1\31\10\0"+
    "\2\3\11\0\6\3\1\53\4\3\1\0\3\3\1\54"+
    "\1\0\3\3\1\31\50\0\1\55\10\0\1\56\1\0"+
    "\1\57\2\0\1\60\31\0\1\24\7\0\1\3\12\0"+
    "\13\3\1\0\4\3\1\0\3\3\12\0\1\61\54\0"+
    "\1\60\42\0\1\37\57\0\1\62\36\0\2\3\11\0"+
    "\2\3\1\63\10\3\1\0\4\3\1\0\3\3\1\31"+
    "\10\0\2\3\11\0\5\3\1\64\2\3\1\65\2\3"+
    "\1\0\4\3\1\0\3\3\1\31\10\0\2\3\11\0"+
    "\1\66\5\3\1\67\4\3\1\0\4\3\1\0\3\3"+
    "\1\31\10\0\2\3\11\0\1\70\12\3\1\0\4\3"+
    "\1\0\3\3\1\31\10\0\2\3\11\0\6\3\1\71"+
    "\4\3\1\0\4\3\1\0\3\3\1\31\10\0\2\3"+
    "\11\0\13\3\1\0\2\3\1\72\1\3\1\0\3\3"+
    "\1\31\10\0\2\3\11\0\13\3\1\0\1\3\1\73"+
    "\2\3\1\0\3\3\1\31\10\0\2\3\11\0\11\3"+
    "\1\74\1\3\1\0\4\3\1\0\3\3\1\31\10\0"+
    "\2\3\11\0\11\3\1\75\1\3\1\0\4\3\1\0"+
    "\3\3\1\31\10\0\2\3\11\0\12\3\1\76\1\0"+
    "\4\3\1\0\3\3\1\31\10\0\2\3\11\0\5\3"+
    "\1\77\5\3\1\0\4\3\1\0\3\3\1\31\10\0"+
    "\2\3\11\0\3\3\1\100\7\3\1\0\4\3\1\0"+
    "\3\3\1\31\11\0\1\56\4\0\1\60\40\0\4\57"+
    "\1\101\43\57\11\62\1\102\1\62\1\0\34\62\1\0"+
    "\2\3\11\0\3\3\1\103\7\3\1\0\4\3\1\0"+
    "\3\3\1\31\10\0\2\3\11\0\13\3\1\0\4\3"+
    "\1\0\1\72\2\3\1\31\10\0\2\3\11\0\3\3"+
    "\1\104\7\3\1\0\4\3\1\0\3\3\1\31\10\0"+
    "\2\3\11\0\13\3\1\0\1\3\1\105\2\3\1\0"+
    "\3\3\1\31\10\0\2\3\11\0\13\3\1\0\1\3"+
    "\1\106\2\3\1\0\3\3\1\31\10\0\2\3\11\0"+
    "\5\3\1\107\5\3\1\0\4\3\1\0\3\3\1\31"+
    "\10\0\2\3\11\0\7\3\1\63\3\3\1\0\4\3"+
    "\1\0\3\3\1\31\10\0\2\3\11\0\1\110\12\3"+
    "\1\0\4\3\1\0\3\3\1\31\10\0\2\3\11\0"+
    "\12\3\1\111\1\0\4\3\1\0\3\3\1\31\10\0"+
    "\2\3\11\0\13\3\1\0\4\3\1\0\2\3\1\112"+
    "\1\31\10\0\2\3\11\0\3\3\1\113\7\3\1\0"+
    "\4\3\1\0\3\3\1\31\10\0\2\3\11\0\7\3"+
    "\1\114\3\3\1\0\4\3\1\0\3\3\1\31\10\0"+
    "\2\3\11\0\13\3\1\0\2\3\1\115\1\3\1\0"+
    "\3\3\1\31\13\0\1\57\2\0\1\60\37\0\1\116"+
    "\11\62\1\117\1\62\1\0\34\62\1\0\2\3\11\0"+
    "\5\3\1\120\5\3\1\0\4\3\1\0\3\3\1\31"+
    "\10\0\2\3\11\0\6\3\1\72\4\3\1\0\4\3"+
    "\1\0\3\3\1\31\10\0\2\3\11\0\13\3\1\0"+
    "\4\3\1\0\1\3\1\112\1\3\1\31\10\0\2\3"+
    "\11\0\13\3\1\0\4\3\1\0\2\3\1\121\1\31"+
    "\10\0\2\3\11\0\13\3\1\0\2\3\1\122\1\3"+
    "\1\0\3\3\1\31\10\0\2\3\11\0\13\3\1\0"+
    "\4\3\1\123\3\3\1\31\10\0\2\3\11\0\3\3"+
    "\1\72\7\3\1\0\4\3\1\0\3\3\1\31\10\0"+
    "\2\3\11\0\1\3\1\124\11\3\1\0\4\3\1\0"+
    "\3\3\1\31\10\0\2\3\11\0\7\3\1\72\3\3"+
    "\1\0\4\3\1\0\3\3\1\31\10\0\2\3\11\0"+
    "\13\3\1\0\4\3\1\0\1\3\1\72\1\3\1\31"+
    "\13\0\1\57\22\0\1\116\20\0\11\62\1\117\1\125"+
    "\1\0\34\62\1\0\2\3\11\0\1\72\12\3\1\0"+
    "\4\3\1\0\3\3\1\31\10\0\2\3\11\0\6\3"+
    "\1\126\4\3\1\0\4\3\1\0\3\3\1\31\10\0"+
    "\2\3\11\0\13\3\1\0\3\3\1\124\1\0\3\3"+
    "\1\31\10\0\2\3\11\0\13\3\1\127\4\3\1\0"+
    "\3\3\1\31\10\0\2\3\11\0\13\3\1\0\1\3"+
    "\1\130\2\3\1\0\3\3\1\31\34\0\1\131\23\0"+
    "\2\3\11\0\7\3\1\132\3\3\1\0\4\3\1\0"+
    "\3\3\1\31\37\0\1\123\20\0\2\3\11\0\13\3"+
    "\1\0\3\3\1\72\1\0\3\3\1\31\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2960];
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
    "\1\0\1\11\2\1\1\11\3\1\1\11\12\1\1\11"+
    "\2\1\2\11\4\0\2\11\1\1\1\0\14\1\1\11"+
    "\2\0\1\11\1\1\1\0\16\1\2\0\13\1\2\0"+
    "\3\1\1\11\3\1\1\0\1\1\1\0\1\1";

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
    while (i < 164) {
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
        case 13: 
          { lexeme=yytext(); return Arreglo;
          }
        case 20: break;
        case 9: 
          { lexeme=yytext(); return Concatenacion;
          }
        case 21: break;
        case 16: 
          { lexeme=yytext(); return Booleano;
          }
        case 22: break;
        case 15: 
          { lexeme=yytext(); return Reservadas;
          }
        case 23: break;
        case 10: 
          { lexeme=yytext(); return Texto;
          }
        case 24: break;
        case 2: 
          { lexeme=yytext(); return Variable;
          }
        case 25: break;
        case 1: 
          { lexeme=yytext(); return ERROR;
          }
        case 26: break;
        case 6: 
          { lexeme=yytext(); return Relacional;
          }
        case 27: break;
        case 12: 
          { lexeme=yytext(); return Asignacion;
          }
        case 28: break;
        case 7: 
          { lexeme=yytext(); return Delimitador;
          }
        case 29: break;
        case 4: 
          { /*Ignore*/
          }
        case 30: break;
        case 14: 
          { lexeme=yytext(); return Decimal;
          }
        case 31: break;
        case 8: 
          { lexeme=yytext(); return Logico;
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
