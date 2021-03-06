/**
 * 
 */
package dsl;

/*
 * Token Name           Token Value   Keep Token Value?
------------------   -----------   -----------------
SEMICOLON            ;             no
COLON                :             no
COMMA                ,             no
LET_EXP              let           no
IN_EXP               in            no
IF_EXP               if            no
THEN_EXP             then          no
ELSE_EXP             else          no
ID                   many          yes
ASSIGN               =             no
INT_VAL              many          yes
STRING_VAL           many          yes
FLOAT_VAL            many          yes
PLUS_OP              +             no
MINUS_OP             -             no
TIMES_OP             *             no
DIVIDE_OP            /             no
EQUAL                ==            no
LESS_THAN            <             no
GREATER_THAN         >             no
LESS_THAN_EQUAL      <=            no
GREATER_THAN_EQUAL   >=            no
NOT_EQUAL            !=            no
SREAD                sread         no
IREAD                iread         no
FREAD                fread         no
LPAREN               (             no
RPAREN               )             no
ERROR                none          no
EOS                  none          no
 */

/**
 * @author nfischer3
 *
 */
public class Token {
	
	public enum TokenType{
		SEMICOLON(";"),
		COLON(":"),
		COMMA(","),
		LET_EXP("let"),
		IN_EXP("in"),
		IF_EXP("if"),
		THEN_EXP("then"),
		ELSE_EXP("else"),
		ID(""),
		ASSIGN("="),
		INT_VAL(""),
		STRING_VAL(""),
		FLOAT_VAL(""),
		PLUS_OP("+"),
		MINUS_OP("-"),
		TIMES_OP("*"),
		DIVIDE_OP("/"),
		EQUAL("=="),
		LESS_THAN("<"),
		GREATER_THAN(">"),
		LESS_THAN_EQUAL("<="),
		GREATER_THAN_EQUAL(">="),
		NOT_EQUAL("!="),
		SREAD("sread"),
		IREAD("iread"),
		FREAD("fread"),
		LPAREN("("),
		RPAREN(")"),
		ERROR(""),
		WHILE("while"),
		EOS("");
		private String idString;
		TokenType(String idString){
			this.idString = idString;
		}
		public String getIdString(){
			return idString;
		}
	}
	
	private TokenType tokenType;
	private int tokenLine;
	private int tokenColumn;
	private String tokenLexeme;
	
	public Token(TokenType tokenType, int tokenLine, int tokenColumn,
			String tokenLexeme) {
		this.tokenType = tokenType;
		this.tokenLine = tokenLine;
		this.tokenColumn = tokenColumn;
		this.tokenLexeme = tokenLexeme;
	}

	public TokenType getTokenType() {
		return tokenType;
	}

	public int getTokenLine() {
		return tokenLine;
	}

	public int getTokenColumn() {
		return tokenColumn;
	}

	public String getTokenLexeme() {
		return tokenLexeme;
	}

	@Override
	public String toString() {
		return "Token [tokenType=" + tokenType + ", tokenLine=" + tokenLine
				+ ", tokenColumn=" + tokenColumn + ", tokenLexeme="
				+ tokenLexeme + "]";
	}
}
