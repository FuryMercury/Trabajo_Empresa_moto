package admin_emp_moto;

import controlador.Controlador_admin;
import controlador.Controlador_login;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import modelo.Consultas_Login;
import modelo.Consultas_Trabajadores;
import modelo.Modelo_Trabajadores;
import modelo.Modelo_user;
import vista.Vista_Ventana_Login;

public class Admin_emp_moto {

    public static void main(String[] args) {

        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel(ch.randelshofer.quaqua.QuaquaManager.getLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Modelo_user user = new Modelo_user();
        Consultas_Login consultas = new Consultas_Login();
        Vista_Ventana_Login view = new Vista_Ventana_Login();
        Controlador_login ctrl = new Controlador_login(view, user, consultas);

        view.setVisible(true);
        
    }

}
