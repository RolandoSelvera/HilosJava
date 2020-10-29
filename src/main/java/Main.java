import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        // Crea una ventana con un botón:
        Boton ventana = new Boton();
        ventana.setBounds(500, 250, 300, 250);
        ventana.setVisible(true);
        ventana.setResizable(false);

    }

    public static class Boton extends JFrame implements ActionListener {
        JButton boton;
        JLabel texto;

        public Boton() {
            setLayout(null);
            boton = new JButton("Crear Hilo");
            boton.setBounds(100, 150, 100, 30);
            boton.addActionListener(this);
            add(boton);
            texto = new JLabel("Crea hilo en consola");
            texto.setBounds(50, 50, 220, 40);
            add(texto);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            // Acción al presionar el botón:
            if (e.getSource() == boton) {

                // Crea nuevo hilo al presionar el botón:
                Hilo hilo = new Hilo();
                new Thread(hilo).start();

                // Identificador de cada hilo:
                System.out.println("Soy un nuevo hilo y este es mi ID: " + hilo.hashCode());
            }
        }
    }
}
