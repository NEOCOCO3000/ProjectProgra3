
package mundo;
import util.ArbolBB;
import java.util.Iterator;
import javax.swing.JPanel;
/**
 *
 * @author User
 */
public class SimuladorArbolBinario {
    
    ArbolBB<Integer> miArbol=new ArbolBB<Integer>();
    
    
    public SimuladorArbolBinario() {
        
    }
    
    public boolean insertar(Integer dato)
    {
        return (this.miArbol.insertar(dato));
    }
    
    public String borrar(Integer dato)
    {
        Integer x=this.miArbol.borrar(dato);
        if (x==null)
            return ("No existe el dato en el arbol");
       return ("Borrado el dato: "+x.toString());
    }
    
    public String preOrden()
    {
    Iterator<Integer> it=this.miArbol.preOrden();
    return (recorrido(it, "Recorrido PreOrden"));
    }
    
    public String inOrden()
    {
    Iterator<Integer> it=this.miArbol.inOrden();
    return (recorrido(it, "Recorrido InOrden"));
    }
    
    public String posOrden()
    {
    Iterator<Integer> it=this.miArbol.posOrden();
    return (recorrido(it, "Recorrido PosOrden"));
    }
    
    public String imprimirPorNiveles()
    {
    Iterator<Integer> it=this.miArbol.impNiveles();
    return (recorrido(it, "Imprimir Por niveles"));
    }
    
    public String darHojas()
    {
    Iterator<Integer> it=this.miArbol.getHojas();
    return (recorrido(it, "Hojas del Arbol"));
    }
    
    public String darPadre(Integer hijo)
    {
    if(this.miArbol.getRaiz().getInfo().equals(hijo))
        return ("La raiz no tiene padre");
    Integer padre=this.miArbol.padre(hijo);
    if (padre==null)
        return ("No existe el Dato: "+hijo.toString());
    return ("El padre de: "+hijo+"\n es : "+padre.toString());
    }
    
    public String esta(Integer dato)
    {
    boolean siEsta=this.miArbol.buscar(dato);
    String r="El dato:"+dato.toString()+"\n";
    r+=siEsta?"Si se encuentra en el arbol":"No se encuentra en el arbol";
    return (r);
    }
    
    
    private String recorrido(Iterator<Integer> it, String msg)
    {
    String r=msg+"\n";
    while(it.hasNext())
        r+="\t"+it.next().toString()+"\n";
    return(r);
    }
    
    public void podarArbol()
    {
        this.miArbol.podar();
    }
    
    public javax.swing.JTree darTree()
    {
        return (this.miArbol.darJTree());
    }
    
    public JPanel getDibujo() {
        return this.miArbol.getDibujo();                
    }
    
}
