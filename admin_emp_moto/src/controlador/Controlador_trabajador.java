/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Consultas_Login;
import modelo.Modelo_user;
import vista.Vista_Panel_Trabajadores;
import vista.Vista_Ventana_Login;
import vista.Vista_Ventana_Trabajador;

/**
 *
 * @author Dgafecb
 */
public class Controlador_trabajador implements ActionListener {
    private Vista_Ventana_Trabajador view_trabajador;
    private Modelo_user model_user;
    private Vista_Ventana_Login view_login;
    private Consultas_Login consultas_login;
    private Controlador_login ctrl_login;
    
    
    public Controlador_trabajador(Vista_Ventana_Trabajador view_trabajador,  Modelo_user model_user) {// Falta instanciar las demas variables a usar
        this.view_trabajador = view_trabajador;
        this.model_user = model_user;
        view_trabajador.MenuTrabajador.profileUser.lblEditUser.setText(model_user.getEmail());
        if(model_user.getPrivilege()==0){
        view_trabajador.MenuTrabajador.profileUser.lblEditStatus.setText("Trabajador");
        }
        else if(model_user.getPrivilege()==1){
            view_trabajador.MenuTrabajador.profileUser.lblEditStatus.setText("Recepecionista");
        }
        this.callComp();
    }


    private void callComp() { 
        
        view_trabajador.MenuTrabajador.btnCerrarSesion.addActionListener(this);

    }

//    public void init() {
//        view_trabajador.setTitle("Administrador");
//    }

    @Override
    public void actionPerformed(ActionEvent e) { 
//        if (e.getSource() == view_admin.MenuAdmin.btnTrabajadores) {
//            panel_tr = new Vista_Panel_Trabajadores();
//            view_admin.administrarPanel(view_admin.jsContent, panel_tr);
//        }

        if(e.getSource() == view_trabajador.MenuTrabajador.btnCerrarSesion){ // Reinstancia la ventana de login, permitiendo otro inicio de sesion
            view_trabajador.setVisible(false);
            view_trabajador.dispose();
            view_login = new Vista_Ventana_Login();
            consultas_login = new Consultas_Login();
            Modelo_user new_user = new Modelo_user();
            view_login.setVisible(true);
            ctrl_login = new Controlador_login(view_login, new_user,consultas_login );            
        
        }

    }
}
