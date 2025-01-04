/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoc;

/**
 *
 * @author Eduardo Alonso
 */
public class SymbolHoc{
    public String name;
    public EnumTipoSymbol tipoSymbol;
    public float val;
    public EnumBLTIN FuncPredef;

    public SymbolHoc(){
        name = "";
        val = 0; 
    }

    public SymbolHoc(String name, EnumTipoSymbol tipoSymbol, float val){
        this.name = name;
        this.tipoSymbol = tipoSymbol;
        this.val = val;
    }

    public SymbolHoc(String name, EnumTipoSymbol tipoSymbol, EnumBLTIN FuncPredef){
        this.name = name;
        this.tipoSymbol = tipoSymbol;
        this.FuncPredef = FuncPredef;
    }

    public void setSymbol(String name, EnumTipoSymbol tipoSymbol, float val){
        this.name = name;
        this.tipoSymbol = tipoSymbol;
        this.val = val;
    }

    public void setSymbol(String name, EnumTipoSymbol tipoSymbol, EnumBLTIN FuncPredef){
        this.name = name;
        this.tipoSymbol = tipoSymbol;
        this.FuncPredef = FuncPredef;
    }
    
    @Override
    public String toString() {
        return this.name;  // o lo que quieras mostrar
    }
}

