package Triangle.SyntacticAnalyzer;

final class Token extends Object {

  protected int kind;
  protected String spelling;
  protected SourcePosition position;

  public Token(int kind, String spelling, SourcePosition position) {

    if (kind == Token.IDENTIFIER) {
      int currentKind = firstReservedWord;
      boolean searching = true;

      while (searching) {
        int comparison = tokenTable[currentKind].compareTo(spelling);
        if (comparison == 0) {
          this.kind = currentKind;
          searching = false;
        } else if (comparison > 0 || currentKind == lastReservedWord) {
          this.kind = Token.IDENTIFIER;
          searching = false;
        } else {
          currentKind ++;
        }
      }
    } else
      this.kind = kind;

    this.spelling = spelling;
    this.position = position;

  }

  public static String spell (int kind) {
    return tokenTable[kind];
  }

  public String toString() {
    return "Kind=" + kind + ", spelling=" + spelling +
      ", position=" + position;
  }

  // Token classes...

  public static final int

    // literals, identifiers, operators...
    INTLITERAL	= 0,
    CHARLITERAL	= 1,
    IDENTIFIER	= 2,
    OPERATOR	= 3,

    // reserved words - must be in alphabetical order...
    ARRAY		= 4,
    BEGIN		= 5,
    CASE		= 6, // CASE
    CONST		= 7,
    DO			= 8,
    DOWNTO		= 9, //Part of FOR command
    ELSE		= 10,
    END			= 11,
    FOR		= 12, //FOR command
    FUNC		= 13,
    FUN		= 14,
    IF			= 15,
    IN			= 16,
    LET			= 17,
    MATCH		= 18, // MATCH
    OF			= 19,
    OTHERWISE	= 20, //OTHERWISE
    PROC		= 21,
    RECORD		= 22,
    REPEAT		= 23, //Repeat command
    THEN		= 24,
    TO			= 25, //Part of FOR command
    TYPE		= 26,
    UNTIL		= 27, //Part of REPEAT command
    VAR		= 28,
    WHILE		= 29,

    // punctuation...
    DOT			= 30,
    COLON			= 31,
    SEMICOLON	= 32,
    COMMA		= 33,
    BECOMES		= 34,
    IS			= 35,

    // brackets...
    LPAREN		= 36,
    RPAREN		= 37,
    LBRACKET	= 38,
    RBRACKET	= 39,
    LCURLY		= 40,
    RCURLY		= 41,

    // special tokens...
    EOT			= 42,
    ERROR		= 43;

  private static String[] tokenTable = new String[] {
    "<int>",
    "<char>",
    "<identifier>",
    "<operator>",
    "array",
    "begin",
    "case", // case
    "const",
    "do",
    "downto", //Part of FOR command
    "else",
    "end",
    "for", //FOR command
    "func",
    "fun",
    "if",
    "in",
    "let",
    "match", // match
    "of",
    "otherwise", // otherwise
    "proc",
    "record",
    "repeat", //Repeat command
    "then",
    "to", //Part of FOR command
    "type",
    "until", //Part of REPEAT command
    "var",
    "while",
    ".",
    ":",
    ";",
    ",",
    ":=",
    "~",
    "(",
    ")",
    "[",
    "]",
    "{",
    "}",
    "",
    "<error>",
  };

  private final static int	firstReservedWord = Token.ARRAY,
                  lastReservedWord  = Token.WHILE;
}
