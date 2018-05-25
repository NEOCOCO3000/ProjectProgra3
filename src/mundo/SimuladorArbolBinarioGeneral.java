

package mundo;
import util.ArbolB;
import java.util.Iterator;
import javax.swing.JPanel;
/**
 *
 * @author User
 */
public class SimuladorArbolBinarioGeneral<T> {
    
    ArbolB<T> miArbol=new ArbolB<T>();

    public ArbolB<T> getMiArbol() {
        return miArbol;
    }
    
    
    public SimuladorArbolBinarioGeneral() {
        
    }
    
    public void insertar(T Pre[], T In[])
    {

       this.miArbol.setRaiz(new ArbolB<T>().crearArbol(Pre, In).getRaiz());
        if(this.miArbol.esVacio())
            System.out.println("Es vacio");
        else
            System.out.println("No Es vacio");

    }
    
   
    public String preOrden()
    {
    Iterator<T> it=this.miArbol.preOrden();
    return (recorrido(it, "Recorrido PreOrden"));
    }
    
    public String inOrden()
    {
    Iterator<T> it=this.miArbol.inOrden();
    return (recorrido(it, "Recorrido InOrden"));
    }
    
    public String posOrden()
    {
    Iterator<T> it=this.miArbol.posOrden();
    return (recorrido(it, "Recorrido PosOrden"));
    }
    
    public String imprimirPorNiveles()
    {
    Iterator<T> it=this.miArbol.impNiveles();
    return (recorrido(it, "Imprimir Por niveles"));
    }
    
    public String darHojas()
    {
    Iterator<T> it=this.miArbol.getHojas();
    return (recorrido(it, "Hojas del Arbol"));
    }
    
    public String darPadre(T hijo)
    {
    if(this.miArbol.getRaiz().getInfo().equals(hijo))
        return ("La raiz no tiene padre");
    T padre=this.miArbol.padre(hijo);
    if (padre==null)
        return ("No existe el Dato :"+hijo.toString());
    return ("El padre de:"+hijo+"\n es :"+padre.toString());
    }
    
    public String esta(T dato)
    {
    boolean siEsta=this.miArbol.esta(dato);
    String r="El dato:"+dato.toString()+"\n";
    r+=siEsta?"Si se encuentra en el arbol":"No se encuentra en el arbol";
    return (r);
    }
    
    
    private String recorrido(Iterator<T> it, String msg)
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
