
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package hoc;

import java_cup.runtime.*;
import java.io.FileReader;
import hoc.IDE;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class AnalizadorSintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return AnalizadorSintacticoSym.class;
}

  /** Default constructor. */
  @Deprecated
  public AnalizadorSintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public AnalizadorSintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\020\000\002\002\004\000\002\002\004\000\002\002" +
    "\005\000\002\003\005\000\002\004\003\000\002\004\003" +
    "\000\002\004\003\000\002\004\003\000\002\004\005\000" +
    "\002\004\005\000\002\004\005\000\002\004\005\000\002" +
    "\004\005\000\002\004\006\000\002\004\004\000\002\004" +
    "\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\040\000\016\006\007\013\014\015\004\016\010\017" +
    "\006\020\013\001\002\000\020\004\ufffd\005\ufffd\006\ufffd" +
    "\007\ufffd\010\ufffd\012\ufffd\014\ufffd\001\002\000\020\004" +
    "\ufffa\005\ufffa\006\ufffa\007\ufffa\010\ufffa\012\ufffa\014\ufffa" +
    "\001\002\000\020\004\ufffb\005\ufffb\006\ufffb\007\ufffb\010" +
    "\ufffb\012\ufffb\014\ufffb\001\002\000\016\006\007\013\014" +
    "\015\004\016\010\017\006\020\013\001\002\000\022\004" +
    "\ufffc\005\ufffc\006\ufffc\007\ufffc\010\ufffc\011\040\012\ufffc" +
    "\014\ufffc\001\002\000\020\002\035\006\007\013\014\015" +
    "\004\016\010\017\006\020\013\001\002\000\016\004\034" +
    "\005\020\006\022\007\021\010\016\012\017\001\002\000" +
    "\004\013\031\001\002\000\016\006\007\013\014\015\004" +
    "\016\010\017\006\020\013\001\002\000\016\005\020\006" +
    "\022\007\021\010\016\012\017\014\023\001\002\000\016" +
    "\006\007\013\014\015\004\016\010\017\006\020\013\001" +
    "\002\000\016\006\007\013\014\015\004\016\010\017\006" +
    "\020\013\001\002\000\016\006\007\013\014\015\004\016" +
    "\010\017\006\020\013\001\002\000\016\006\007\013\014" +
    "\015\004\016\010\017\006\020\013\001\002\000\016\006" +
    "\007\013\014\015\004\016\010\017\006\020\013\001\002" +
    "\000\020\004\ufff5\005\ufff5\006\ufff5\007\ufff5\010\ufff5\012" +
    "\ufff5\014\ufff5\001\002\000\020\004\ufff8\005\ufff8\006\ufff8" +
    "\007\021\010\016\012\017\014\ufff8\001\002\000\020\004" +
    "\ufff7\005\ufff7\006\ufff7\007\ufff7\010\ufff7\012\017\014\ufff7" +
    "\001\002\000\020\004\ufff9\005\ufff9\006\ufff9\007\021\010" +
    "\016\012\017\014\ufff9\001\002\000\020\004\ufff2\005\ufff2" +
    "\006\ufff2\007\ufff2\010\ufff2\012\017\014\ufff2\001\002\000" +
    "\020\004\ufff6\005\ufff6\006\ufff6\007\ufff6\010\ufff6\012\017" +
    "\014\ufff6\001\002\000\016\006\007\013\014\015\004\016" +
    "\010\017\006\020\013\001\002\000\016\005\020\006\022" +
    "\007\021\010\016\012\017\014\033\001\002\000\020\004" +
    "\ufff4\005\ufff4\006\ufff4\007\ufff4\010\ufff4\012\ufff4\014\ufff4" +
    "\001\002\000\020\002\001\006\001\013\001\015\001\016" +
    "\001\017\001\020\001\001\002\000\004\002\000\001\002" +
    "\000\016\004\037\005\020\006\022\007\021\010\016\012" +
    "\017\001\002\000\020\002\uffff\006\uffff\013\uffff\015\uffff" +
    "\016\uffff\017\uffff\020\uffff\001\002\000\016\006\007\013" +
    "\014\015\004\016\010\017\006\020\013\001\002\000\020" +
    "\004\ufffe\005\020\006\022\007\021\010\016\012\017\014" +
    "\ufffe\001\002\000\020\004\ufff3\005\ufff3\006\ufff3\007\ufff3" +
    "\010\ufff3\012\017\014\ufff3\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\040\000\010\002\010\003\004\004\011\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\003\004\004\041\001\001\000\002\001\001\000\006\003" +
    "\004\004\035\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\003\004\004\014\001\001\000\002\001\001\000" +
    "\006\003\004\004\027\001\001\000\006\003\004\004\026" +
    "\001\001\000\006\003\004\004\025\001\001\000\006\003" +
    "\004\004\024\001\001\000\006\003\004\004\023\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\003\004\004\031\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\003\004\004\040\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalizadorSintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalizadorSintactico$actions(this);
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
    return action_obj.CUP$AnalizadorSintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    IDE frmInterfaz;

    public void setIDE(IDE gui) {
        frmInterfaz = gui;
    }

    // Muestra un error con la info de línea y columna (no cierra el programa)
    public void report_error(String mensaje, Object info) {
        StringBuilder m = new StringBuilder("Error");
        if (info instanceof java_cup.runtime.Symbol) {
            java_cup.runtime.Symbol s = (java_cup.runtime.Symbol) info;

            if (s.left >= 0) {  // Modificado de >= 0 a >= -1
                m.append(" En la linea ").append(s.left + 1);
                if (s.right >= 0) {  // Modificado de >= 0 a >= -1
                    m.append(", columna ").append(s.right + 1);
                }
            }
            m.append(" : ").append(mensaje);

            // Mostrar en consola
            System.err.println(m);

            // Mostrar en jtaCompile si tenemos referencia al IDE
            if (frmInterfaz != null) {
                frmInterfaz.jtaCompile.append(m.toString() + "\n");
            }

            // Mostrar el token actual (opcional, para más información)
            m.append(" (token: ").append(s.value).append(")"); 
        }
    }
    // Evita cerrar la aplicación al encontrar un error fatal
    public void report_fatal_error(String message, Object info) {
        // Se muestra la info igual que report_error
        report_error(message, info);

        // Se comenta o elimina la línea que cierra la aplicación
        // System.exit(1);

        // Opcionalmente, podrías lanzar excepción para detener parse() 
        // de inmediato, pero sin matar toda la app:
        // throw new RuntimeException("Error fatal de sintaxis");
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$AnalizadorSintactico$actions {
  private final AnalizadorSintactico parser;

  /** Constructor */
  CUP$AnalizadorSintactico$actions(AnalizadorSintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintactico$do_action_part00000000(
    int                        CUP$AnalizadorSintactico$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintactico$parser,
    java.util.Stack            CUP$AnalizadorSintactico$stack,
    int                        CUP$AnalizadorSintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalizadorSintactico$result;

      /* select the action based on the action number */
      switch (CUP$AnalizadorSintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // list ::= expr SEMIC 
            {
              Object RESULT =null;
		int valExprleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int valExprright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Float valExpr = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		
            if (frmInterfaz != null) {
                frmInterfaz.jtaCompile.append("Resultado: " + valExpr + "\n");
            }
        
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("list",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= list EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		RESULT = start_val;
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$AnalizadorSintactico$parser.done_parsing();
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // list ::= list expr SEMIC 
            {
              Object RESULT =null;
		int valExprleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int valExprright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Float valExpr = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		
            if (frmInterfaz != null) {
                frmInterfaz.jtaCompile.append("Resultado: " + valExpr + "\n");
            }
        
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("list",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // asgn ::= VAR OpAsig expr 
            {
              Float RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).right;
		SymbolHoc v = (SymbolHoc)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int valExprleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int valExprright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Float valExpr = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
            v.val = valExpr;
            RESULT = valExpr;
        
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("asgn",1, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= NUM 
            {
              Float RESULT =null;
		int valNumleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int valNumright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Float valNum = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
            RESULT = valNum;
        
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= VAR 
            {
              Float RESULT =null;
		int refVarleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int refVarright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		SymbolHoc refVar = (SymbolHoc)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
            RESULT = refVar.val;
        
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= CONST_PREDEF 
            {
              Float RESULT =null;
		int refConstPredefleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int refConstPredefright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		SymbolHoc refConstPredef = (SymbolHoc)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
            RESULT = refConstPredef.val;
        
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= asgn 
            {
              Float RESULT =null;
		int valAsignleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int valAsignright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Float valAsign = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
            RESULT = valAsign;
        
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= expr OpSuma expr 
            {
              Float RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).right;
		Float val1 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Float val2 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
            RESULT = val1 + val2;
        
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= expr OpResta expr 
            {
              Float RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).right;
		Float val1 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Float val2 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
            RESULT = val1 - val2;
        
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= expr OpProd expr 
            {
              Float RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).right;
		Float val1 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Float val2 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
            RESULT = val1 * val2;
        
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= expr OpDiv expr 
            {
              Float RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).right;
		Float val1 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Float val2 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
            RESULT = val1 / val2;
        
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= ParIzq expr ParDer 
            {
              Float RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Float val1 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		
            RESULT = val1;
        
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= BLTIN ParIzq expr ParDer 
            {
              Float RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)).right;
		SymbolHoc v = (SymbolHoc)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)).value;
		int val1left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Float val1 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		
            switch(v.FuncPredef) {
                case SIN:
                    RESULT = (float)Math.sin(val1);
                    break;
                case COS:
                    RESULT = (float)Math.cos(val1);
                    break;
                case ATAN:
                    RESULT = (float)Math.atan(val1);
                    break;
                case LOG:
                    RESULT = (float)Math.log(val1);
                    break;
                case LOG10:
                    RESULT = (float)Math.log10(val1);
                    break;
                case EXP:
                    RESULT = (float)Math.exp(val1);
                    break;
                case SQRT:
                    RESULT = (float)Math.sqrt(val1);
                    break;
                case INT:
                    RESULT = (float)Math.floor(val1);
                    break;
                case ABS:
                    RESULT = (float)Math.abs(val1);
                    break;
            }
        
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= OpResta expr 
            {
              Float RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Float val1 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		 
            RESULT = -val1;
        
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= expr OpPotencia expr 
            {
              Float RESULT =null;
		int baseleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).left;
		int baseright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).right;
		Float base = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int exponenteleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int exponenteright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Float exponente = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		
            RESULT = (float)Math.pow(base, exponente);
        
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$AnalizadorSintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintactico$do_action(
    int                        CUP$AnalizadorSintactico$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintactico$parser,
    java.util.Stack            CUP$AnalizadorSintactico$stack,
    int                        CUP$AnalizadorSintactico$top)
    throws java.lang.Exception
    {
              return CUP$AnalizadorSintactico$do_action_part00000000(
                               CUP$AnalizadorSintactico$act_num,
                               CUP$AnalizadorSintactico$parser,
                               CUP$AnalizadorSintactico$stack,
                               CUP$AnalizadorSintactico$top);
    }
}

}