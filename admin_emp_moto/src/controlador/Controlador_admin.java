/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Consultas_Login;
import modelo.Consultas_Inventario;
import modelo.Consultas_Trabajadores;
import modelo.Modelo_inventario;
import modelo.Modelo_Trabajadores;
import modelo.Modelo_user;
import vista.Vista_Panel_Inventario;
import vista.Vista_Panel_Trabajadores;
import vista.Vista_Ventana_Admin;
import vista.Vista_Ventana_Login;

/**
 *
 * @author Dgafecb
 */
public class Controlador_admin implements ActionListener {

    private Vista_Ventana_Login view_login;
    private Vista_Ventana_Admin view_admin;
    private Modelo_Trabajadores model_tr;
    private Consultas_Trabajadores consultas_tr;
    private Modelo_inventario model_inventario;
    private Consultas_Inventario consultas_inventario;
    private Consultas_Login consultas_login;
    private Modelo_user model_user;
    private Vista_Panel_Trabajadores panel_tr;
    private Controlador_login ctrl_login;
    private Vista_Panel_Inventario panel_inventario;
    int btnActivo; // permite saber que variable usar para referenciar dinamicamente al panel anterior y quitarlo
    // mini parche a falta de un metodo dispose panel en vista_ventana_admin
    // por ahora 0 simboliza estado inicial, 1 btn Inventario usado, 2 btn trabajadores

    public Controlador_admin(Vista_Ventana_Admin view_admin, Modelo_user model_user) {// Falta instanciar las demas variables a usar
        this.view_admin = view_admin;
        this.model_user = model_user;
        this.btnActivo = 0;
        view_admin.MenuAdmin.profileUser.lblEditUser.setText(model_user.getEmail());
        view_admin.MenuAdmin.profileUser.lblEditStatus.setText("Administrador");
        this.callComp();

    }
//
//    Controlador_admin(Vista_Ventana_Admin viewAdmin, String user) {
//       
//    }

    private void callComp() {
        view_admin.MenuAdmin.btnAlmacen.addActionListener(this);
        view_admin.MenuAdmin.btnTrabajadores.addActionListener(this);
        view_admin.MenuAdmin.btnCerrarSesion.addActionListener(this);

    }

    public void init() {

        view_admin.setTitle("Administrador");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view_admin.MenuAdmin.btnTrabajadores) {
            if (btnActivo == 0) {
                panel_tr = new Vista_Panel_Trabajadores();

                view_admin.administrarPanel(view_admin.jsContent, panel_tr);
                this.btnActivo = 1;
            } else {
                view_admin.liberarPanel();
                panel_tr = new Vista_Panel_Trabajadores();

                view_admin.administrarPanel(view_admin.jsContent, panel_tr);
            }

        }
        if (e.getSource() == view_admin.MenuAdmin.btnAlmacen) { //boton almacen / inventario 2
            if (btnActivo == 0) {
                panel_inventario = new Vista_Panel_Inventario();
                view_admin.administrarPanel(view_admin.jsContent, panel_inventario);
                this.btnActivo = 1;

            } else {
                view_admin.liberarPanel();
                panel_inventario = new Vista_Panel_Inventario();
                view_admin.administrarPanel(view_admin.jsContent, panel_inventario);
            }
        }

        if (e.getSource() == view_admin.MenuAdmin.btnCerrarSesion) { // Reinstancia la ventana de login, permitiendo otro inicio de sesion
            view_admin.setVisible(false);
            view_admin.dispose();
            view_login = new Vista_Ventana_Login();
            consultas_login = new Consultas_Login();
            Modelo_user new_user = new Modelo_user();
            view_login.setVisible(true);
            ctrl_login = new Controlador_login(view_login, new_user, consultas_login);
        }

    }

}
