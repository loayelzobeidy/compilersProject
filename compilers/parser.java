
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import java.util.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\021\000\002\002\004\000\002\002\004\000\002\002" +
    "\002\000\002\004\003\000\002\004\005\000\002\005\006" +
    "\000\002\005\006\000\002\005\005\000\002\005\006\000" +
    "\002\005\006\000\002\003\005\000\002\003\005\000\002" +
    "\003\005\000\002\003\005\000\002\003\005\000\002\003" +
    "\003\000\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\034\000\012\002\uffff\003\uffff\016\uffff\024\uffff\001" +
    "\002\000\012\002\012\003\006\016\007\024\011\001\002" +
    "\000\012\002\ufff2\003\ufff2\016\ufff2\024\ufff2\001\002\000" +
    "\012\002\ufff1\003\ufff1\016\ufff1\024\ufff1\001\002\000\004" +
    "\042\032\001\002\000\012\002\001\003\001\016\001\024" +
    "\001\001\002\000\006\004\014\042\013\001\002\000\004" +
    "\002\000\001\002\000\010\024\026\027\025\043\027\001" +
    "\002\000\014\006\017\024\020\026\015\027\016\045\022" +
    "\001\002\000\012\002\ufff7\003\ufff7\016\ufff7\024\ufff7\001" +
    "\002\000\012\002\ufff6\003\ufff6\016\ufff6\024\ufff6\001\002" +
    "\000\012\002\ufff3\003\ufff3\016\ufff3\024\ufff3\001\002\000" +
    "\014\002\ufffe\003\ufffe\016\ufffe\024\ufffe\044\023\001\002" +
    "\000\012\002\ufff4\003\ufff4\016\ufff4\024\ufff4\001\002\000" +
    "\012\002\ufff5\003\ufff5\016\ufff5\024\ufff5\001\002\000\004" +
    "\024\020\001\002\000\012\002\ufffd\003\ufffd\016\ufffd\024" +
    "\ufffd\001\002\000\004\043\031\001\002\000\004\043\030" +
    "\001\002\000\012\002\ufffa\003\ufffa\016\ufffa\024\ufffa\001" +
    "\002\000\012\002\ufff9\003\ufff9\016\ufff9\024\ufff9\001\002" +
    "\000\012\002\ufff8\003\ufff8\016\ufff8\024\ufff8\001\002\000" +
    "\006\024\034\027\033\001\002\000\004\043\036\001\002" +
    "\000\004\043\035\001\002\000\012\002\ufffc\003\ufffc\016" +
    "\ufffc\024\ufffc\001\002\000\012\002\ufffb\003\ufffb\016\ufffb" +
    "\024\ufffb\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\034\000\004\002\003\001\001\000\006\003\007\005" +
    "\004\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\020\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\004\023" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= program statement 
            {
              Boolean RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Boolean p = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean e = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = p && e;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Boolean start_val = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // program ::= 
            {
              Boolean RESULT =null;
		RESULT = true;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // list ::= IDwithUnder 
            {
              Boolean RESULT =null;
		RESULT = true;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("list",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // list ::= IDwithUnder FA list 
            {
              Boolean RESULT =null;
		RESULT = true;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("list",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // function ::= Func LP IDwithUnder RB 
            {
              Boolean RESULT =null;
		RESULT = true;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("function",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // function ::= Func LP STRING RB 
            {
              Boolean RESULT =null;
		RESULT = true;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("function",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // function ::= IDwithUnder LP RB 
            {
              Boolean RESULT =null;
		RESULT = true;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("function",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // function ::= IDwithUnder LP IDwithUnder RB 
            {
              Boolean RESULT =null;
		RESULT = true;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("function",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // function ::= IDwithUnder LP STRING RB 
            {
              Boolean RESULT =null;
		RESULT = true;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("function",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // statement ::= IDwithUnder AO INTEGER 
            {
              Boolean RESULT =null;
		RESULT = true;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // statement ::= IDwithUnder AO STRING 
            {
              Boolean RESULT =null;
		RESULT = true;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // statement ::= IDwithUnder AO AA 
            {
              Boolean RESULT =null;
		RESULT = true;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // statement ::= IDwithUnder AO list 
            {
              Boolean RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean l = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = true && l;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // statement ::= IDwithUnder AO BOOL 
            {
              Boolean RESULT =null;
		RESULT = true;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // statement ::= function 
            {
              Boolean RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean f = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=f; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // statement ::= error 
            {
              Boolean RESULT =null;
		RESULT = false;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
