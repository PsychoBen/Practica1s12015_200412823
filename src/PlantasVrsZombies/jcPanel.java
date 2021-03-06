package PlantasVrsZombies;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 * @web http://www.jc-mouse.net
 * @author Mouse
 */
public class jcPanel extends JPanel implements ActionListener {

    private int index = 1;
    //Nos sirve para almacenar a los objetos creados
    private Map nota = new HashMap();

    public jcPanel()
    {
        this.setSize(620, 750);
        this.setVisible(true);
        this.setBorder(BorderFactory.createLineBorder( Color.BLACK ));
        this.setLayout( new FlowLayout() );
    }

    public void Mi_Componente()
    {        
        //instancia nueva a componente
        jpComponente jpc = new jpComponente(index);
        jpc.btn.addActionListener(this);//escucha eventos
        this.add(jpc);//se añade al jpanel
        this.validate();
        //se añade al MAP
        this.nota.put("key_" + index, jpc );
        //se incrementa contador de componentes
        index++;
    }
    
    public void Mi_Componente(String puntoAta, String TipoAta, String puntoDefen)
    {        
        //instancia nueva a componente
        jpComponente jpc = new jpComponente(index, puntoAta, TipoAta ,puntoDefen);
        jpc.btn.addActionListener(this);//escucha eventos
        this.add(jpc);//se añade al jpanel
        this.validate();
        //se añade al MAP
        this.nota.put("key_" + index, jpc );
        //se incrementa contador de componentes
        index++;
    }

    public void Mi_Componente(String nombre, String imagen, String puntoAta, String TipoAta, String puntoDefen)
    {        
        //instancia nueva a componente
        jpComponente jpc = new jpComponente(index,nombre,imagen, puntoAta, TipoAta ,puntoDefen);
        jpc.btn.addActionListener(this);//escucha eventos
        imagen = "C:\\Users\\Ben\\Dropbox\\Mis docs\\EDD\\15\\Practicas\\Practica1s12015_200412823\\src\\imagenes\\planta.jpg";
        jpc.lblImagen.setSize(new java.awt.Dimension(50, 50));
        jpc.ponerImagenLabel(imagen, jpc.lblImagen);
        this.add(jpc);//se añade al jpanel
        this.validate();
        //se añade al MAP
        this.nota.put("key_" + index, jpc );
        //se incrementa contador de componentes
        index++;
    }
    
    public void actionPerformed(ActionEvent e) {
        //se obtiene el comando ejecutado
        String comando = e.getActionCommand();
        //se recorre el MAP
        Iterator it = nota.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            //se obtiene el KEY -> identificador unico
            String itm = entry.getKey().toString();
            //si comando de componente es igual a comando pulsado
            if( itm.equals(comando))
            {
                //se recupera el contenido del JTextfield
                String name = ((jpComponente) entry.getValue()).txtName.getText();
                //mostramos resultado
                JOptionPane.showMessageDialog(null, "Se presiono boton " + itm + " \n Hola " + name);
            }
        }
    }

}
