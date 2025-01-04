/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Eduardo Alonso
 */
public class TablaSimbolos{
    List<SymbolHoc> ListaSimbolos;

    public TablaSimbolos(){
        ListaSimbolos = new LinkedList<>();
        this.init();
    }

    public SymbolHoc lookup(String name){
        SymbolHoc s;
        Iterator<SymbolHoc> it = ListaSimbolos.iterator();
        while(it.hasNext()){
            s=(SymbolHoc) it.next();
            if(s.name.equals(name)){
                return s;
            }
        }
        return null;
    }

    public SymbolHoc install(String name, EnumTipoSymbol type, float val){
        SymbolHoc s;
        s = new SymbolHoc();
        s.setSymbol(name, type, val);
        ListaSimbolos.add(s);
        return s;
    }

    public SymbolHoc install(String name, EnumTipoSymbol type, EnumBLTIN FuncPredef){
        SymbolHoc s;
        s = new SymbolHoc();
        s.setSymbol(name, type, FuncPredef);
        ListaSimbolos.add(s);
        return s;
    }

    private void init(){
        ListaSimbolos.clear();
        InitConstPredef();
        InitFuncPredef();   
    }

    private void InitConstPredef(){
        SymbolHoc s;
        float val;

        s = new SymbolHoc();
        val = (float)3.141592653589;
        s.setSymbol("PI",EnumTipoSymbol.CONST_PREDEF, val);
        ListaSimbolos.add(s);

        s = new SymbolHoc();
        val = (float)2.718281828459;
        s.setSymbol("E", EnumTipoSymbol.CONST_PREDEF, val);
        ListaSimbolos.add(s);

        s = new SymbolHoc();
        val = (float)0.577215664901;
        s.setSymbol("GAMMA", EnumTipoSymbol.CONST_PREDEF, val);
        ListaSimbolos.add(s);

        s = new SymbolHoc();
        val = (float)57.2957795130;
        s.setSymbol("DEG", EnumTipoSymbol.CONST_PREDEF, val);
        ListaSimbolos.add(s);

        s = new SymbolHoc();
        val = (float)1.618033498;
        s.setSymbol("PHI", EnumTipoSymbol.CONST_PREDEF, val);
        ListaSimbolos.add(s);
    }

    private void InitFuncPredef(){
        SymbolHoc s;
         
        s = new SymbolHoc();
        s.setSymbol("sin", EnumTipoSymbol.BLTIN, EnumBLTIN.SIN);
        ListaSimbolos.add(s);

        s = new SymbolHoc();
        s.setSymbol("cos", EnumTipoSymbol.BLTIN, EnumBLTIN.COS);
        ListaSimbolos.add(s);

        s = new SymbolHoc();
        s.setSymbol("atan", EnumTipoSymbol.BLTIN, EnumBLTIN.ATAN);
        ListaSimbolos.add(s);

        s = new SymbolHoc();
        s.setSymbol("log", EnumTipoSymbol.BLTIN, EnumBLTIN.LOG);
        ListaSimbolos.add(s);

        s = new SymbolHoc();
        s.setSymbol("log10", EnumTipoSymbol.BLTIN, EnumBLTIN.LOG10);
        ListaSimbolos.add(s);

        s = new SymbolHoc();
        s.setSymbol("exp", EnumTipoSymbol.BLTIN, EnumBLTIN.EXP);
        ListaSimbolos.add(s);

        s = new SymbolHoc();
        s.setSymbol("sqrt", EnumTipoSymbol.BLTIN, EnumBLTIN.SQRT);
        ListaSimbolos.add(s);

        s = new SymbolHoc();
        s.setSymbol("int", EnumTipoSymbol.BLTIN, EnumBLTIN.INT);
        ListaSimbolos.add(s);
    
        s = new SymbolHoc();
        s.setSymbol("abs", EnumTipoSymbol.BLTIN, EnumBLTIN.ABS);
        ListaSimbolos.add(s);
    }
}
