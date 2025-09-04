/*
 * @(#)Token.java                        2.1 2003/10/07
 *
 * Copyright (C) 1999, 2003 D.A. Watt and D.F. Brown
 * Dept. of Computing Science, University of Glasgow, Glasgow G12 8QQ Scotland
 * and School of Computer and Math Sciences, The Robert Gordon University,
 * St. Andrew Street, Aberdeen AB25 1HG, Scotland.
 * All rights reserved.
 *
 * This software is provided free for educational use only. It may
 * not be used for commercial purposes without the prior written permission
 * of the authors.
 */

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
    CASE    = 6,
    CONST		= 7,
    DO			= 8,
    
    // Token para dirección descendente en comandos FOR
    DOWNTO  = 9,
    ELSE		= 10,
    END			= 11,

    // Token que inicia un comando FOR para iteración controlada
    FOR     = 12, 
    FUNC		= 13,
    IF			= 14,
    IN			= 15,
    LET			= 16,
    OF			= 17, 
    OTHERWISE			= 18, 
    PROC		= 19,
    RECORD		= 20,

    // Token que inicia un comando REPEAT para repetición con condición al final
    REPEAT  = 21, 
    THEN		= 22,

    // Token para dirección ascendente en comandos FOR (for i := 1 to 10)
    TO      = 23, 
    TYPE		= 24,

    // Token que indica condición de parada en comandos REPEAT (until condition)
    UNTIL   = 25, 
    VAR			= 26,
    WHILE		= 27,

    // punctuation...
    DOT			= 28,
    COLON		= 29,
    SEMICOLON	= 30,
    COMMA		= 31,
    BECOMES		= 32,
    IS			= 33,

    // brackets...
    LPAREN		= 34,
    RPAREN		= 35,
    LBRACKET	= 36,
    RBRACKET	= 37,
    LCURLY		= 38,
    RCURLY		= 39,

    // special tokens...
    EOT			= 40,
    ERROR		= 41;

  private static String[] tokenTable = new String[] {
    "<int>",
    "<char>",
    "<identifier>",
    "<operator>",
    "array",
    "begin",
    "case", 
    "const",
    "do",
    "downto", 
    "else",
    "end",
    "for", 
    "func",
    "if",
    "in",
    "let",
    "of",
    "otherwise", 
    "proc",
    "record",
    "repeat", 
    "then",
    "to", 
    "type",
    "until", 
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
