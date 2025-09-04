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
    CASE                = 6, // CASE
    CONST		= 7,
    DO			= 8,
    DOWNTO              = 9, //Part of FOR command
    ELSE		= 10,
    END			= 11,
    FOR                 = 12, //FOR command
    FUNC		= 13,
    IF			= 14,
    IN			= 15,
    LET			= 16,
    MATCH               = 17, // MATCH     
    OF			= 18, 
    OTHERWISE           = 19, //OTHERWISE
    PROC		= 20,
    RECORD		= 21,
    REPEAT              = 22, //Repeat command
    THEN		= 23,
    TO                  = 24, //Part of FOR command
    TYPE		= 25,
    UNTIL               = 26, //Part of REPEAT command
    VAR			= 27,
    WHILE		= 28,

    // punctuation...
    DOT			= 29,
    COLON		= 30,
    SEMICOLON	= 31,
    COMMA		= 32,
    BECOMES		= 33,
    IS			= 34,

    // brackets...
    LPAREN		= 35,
    RPAREN		= 36,
    LBRACKET	= 37,
    RBRACKET	= 38,
    LCURLY		= 39,
    RCURLY		= 40,

    // special tokens...
    EOT			= 41,
    ERROR		= 42;

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
