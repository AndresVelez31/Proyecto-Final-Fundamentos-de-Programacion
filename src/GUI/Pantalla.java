package GUI;

import Main.Jugadores;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.io.IOException;

public class Pantalla extends javax.swing.JFrame {

    static ArrayList<Jugadores> jugadores = new ArrayList<>();
    private static javax.swing.JTextArea AreaMainText;
    private static javax.swing.JButton buscar_boton;
    private static javax.swing.JButton edit_boton;
    private static javax.swing.JButton eliminar_boton;
    private static javax.swing.JButton guardar_boton;
    private static javax.swing.JTextField id_area;
    private static javax.swing.JLabel id_text;
    private static javax.swing.JLabel jLabel6;
    private static javax.swing.JPanel jPanel1;
    private static javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTextArea jTextArea1;
    private static javax.swing.JTextField juego_area;
    private static javax.swing.JLabel juego_text;
    private static javax.swing.JTextField nivel_area;
    private static javax.swing.JLabel nivel_text;
    private static javax.swing.JTextField nombre_area;
    private static javax.swing.JLabel nombre_text;
    private static javax.swing.JLabel playerscrud_text;
    private static javax.swing.JButton salir_boton;
    private static javax.swing.JTextField score_area;
    private static javax.swing.JLabel score_text;
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        playerscrud_text = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaMainText = new javax.swing.JTextArea();
        salir_boton = new javax.swing.JButton();
        guardar_boton = new javax.swing.JButton();
        edit_boton = new javax.swing.JButton();
        eliminar_boton = new javax.swing.JButton();
        buscar_boton = new javax.swing.JButton();
        id_area = new javax.swing.JTextField();
        id_text = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        score_text = new javax.swing.JLabel();
        score_area = new javax.swing.JTextField();
        nivel_area = new javax.swing.JTextField();
        nivel_text = new javax.swing.JLabel();
        juego_text = new javax.swing.JLabel();
        nombre_text = new javax.swing.JLabel();
        nombre_area = new javax.swing.JTextField();
        juego_area = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        playerscrud_text.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        playerscrud_text.setText("PLAYERS CRUD");

        jPanel1.setBackground(new java.awt.Color(167, 228, 207));

        AreaMainText.setEditable(false);
        AreaMainText.setColumns(20);
        AreaMainText.setFont(new java.awt.Font("Inter", 0, 12));
        AreaMainText.setRows(5);
        jScrollPane1.setViewportView(AreaMainText);

        salir_boton.setFont(new java.awt.Font("Montserrat Medium", 0, 22)); // NOI18N
        salir_boton.setForeground(new java.awt.Color(153, 51, 0));
        salir_boton.setText("Salir");
        salir_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_botonActionPerformed(evt);
            }
        });

        guardar_boton.setFont(new java.awt.Font("Montserrat Medium", 0, 22)); // NOI18N
        guardar_boton.setForeground(new java.awt.Color(204, 102, 0));
        guardar_boton.setText("Guardar");
        guardar_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_botonActionPerformed(evt);
            }
        });

        edit_boton.setFont(new java.awt.Font("Montserrat Medium", 0, 22)); // NOI18N
        edit_boton.setForeground(new java.awt.Color(204, 204, 0));
        edit_boton.setText("Editar");
        edit_boton.setToolTipText("");
        edit_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_botonActionPerformed(evt);
            }
        });

        eliminar_boton.setFont(new java.awt.Font("Montserrat Medium", 0, 22)); // NOI18N
        eliminar_boton.setForeground(new java.awt.Color(255, 51, 51));
        eliminar_boton.setText("Eliminar");
        eliminar_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_botonActionPerformed(evt);
            }
        });

        buscar_boton.setFont(new java.awt.Font("Montserrat Medium", 0, 22)); // NOI18N
        buscar_boton.setForeground(new java.awt.Color(204, 102, 255));
        buscar_boton.setText("Buscar");
        buscar_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_botonActionPerformed(evt);
            }
        });

        id_area.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        id_area.setForeground(new java.awt.Color(204, 204, 204));
        id_area.setText("1");
        id_area.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                id_areaMousePressed(evt);
            }
        });
        id_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_areaActionPerformed(evt);
            }
        });

        id_text.setFont(new java.awt.Font("Montserrat SemiBold", 1, 36)); // NOI18N
        id_text.setText("ID:");

        score_text.setFont(new java.awt.Font("Montserrat SemiBold", 1, 22)); // NOI18N
        score_text.setText("Score:");

        score_area.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        score_area.setForeground(new java.awt.Color(204, 204, 204));
        score_area.setText("2500");
        score_area.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                score_areaMousePressed(evt);
            }
        });
        score_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score_areaActionPerformed(evt);
            }
        });

        nivel_area.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        nivel_area.setForeground(new java.awt.Color(204, 204, 204));
        nivel_area.setText("A");
        nivel_area.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nivel_areaMousePressed(evt);
            }
        });
        nivel_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivel_areaActionPerformed(evt);
            }
        });

        nivel_text.setFont(new java.awt.Font("Montserrat SemiBold", 1, 22)); // NOI18N
        nivel_text.setText("Nivel: ");

        juego_text.setFont(new java.awt.Font("Montserrat SemiBold", 1, 22)); // NOI18N
        juego_text.setText("Juego Favorito:");

        nombre_text.setFont(new java.awt.Font("Montserrat SemiBold", 1, 22)); // NOI18N
        nombre_text.setText("Nombre del Jugador: ");

        nombre_area.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        nombre_area.setForeground(new java.awt.Color(204, 204, 204));
        nombre_area.setText("Pepito Perez");
        nombre_area.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombre_areaMousePressed(evt);
            }
        });
        nombre_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_areaActionPerformed(evt);
            }
        });

        juego_area.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        juego_area.setForeground(new java.awt.Color(204, 204, 204));
        juego_area.setText("Minecraft");
        juego_area.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                juego_areaMousePressed(evt);
            }
        });
        juego_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juego_areaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(guardar_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(204, 204, 204))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(nivel_text)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nivel_area, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(64, 64, 64)
                                            .addComponent(score_text)
                                            .addGap(28, 28, 28)
                                            .addComponent(score_area, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(74, 74, 74))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(buscar_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(20, 20, 20)
                                                    .addComponent(edit_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(20, 20, 20)
                                                    .addComponent(eliminar_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(80, 80, 80)
                                                    .addComponent(id_text)
                                                    .addGap(7, 7, 7)
                                                    .addComponent(id_area, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(20, 20, 20)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(nombre_text)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nombre_area, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(juego_text)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(juego_area)))
                                .addGap(20, 20, 20)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(salir_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre_area, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_text))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(juego_area, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(juego_text))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nivel_area, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nivel_text)
                            .addComponent(score_text)
                            .addComponent(score_area, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(guardar_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_text)
                            .addComponent(id_area, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscar_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminar_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salir_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playerscrud_text)
                .addGap(310, 310, 310))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(playerscrud_text)
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }
    
    public Pantalla() {
        initComponents();
    }

    private void nivel_areaActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                          

    private void juego_areaActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                          

    private void score_areaActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                          

    private void nombre_areaActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           

    private void id_areaActionPerformed(java.awt.event.ActionEvent evt) {                                        

    }                                       

    private void guardar_botonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        addJugador();
    }

    private void buscar_botonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        buscarJugador();
    }                                            

    private void eliminar_botonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        eliminarJugador();
    }                                              

    private void edit_botonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        editarJugador();
    }                                          

    private void id_areaMousePressed(java.awt.event.MouseEvent evt) {                                     
        if (id_area.getText().equals("1")){
            id_area.setText("");
            id_area.setForeground(Color.black);
        }  
    } 
    
    private void nombre_areaMousePressed(java.awt.event.MouseEvent evt) {          
        if (nombre_area.getText().equals("Pepito Perez")){
            nombre_area.setText("");
            nombre_area.setForeground(Color.black);
        }                          
        
        if (String.valueOf(juego_area.getText()).isEmpty()){
            juego_area.setText("Minecraft");
            juego_area.setForeground(Color.gray);

        }

        if (String.valueOf(nivel_area.getText()).isEmpty()){
            nivel_area.setText("A");
            nivel_area.setForeground(Color.gray);

        }
        if (String.valueOf(score_area.getText()).isEmpty()){
            score_area.setText("2500");
            score_area.setForeground(Color.gray);
        }

        if (String.valueOf(id_area.getText()).isEmpty()){
            id_area.setText("1");
            id_area.setForeground(Color.gray);
        }
    }                                        

    private void juego_areaMousePressed(java.awt.event.MouseEvent evt) {     
        
        if (juego_area.getText().equals("Minecraft")){
            juego_area.setText("");
            juego_area.setForeground(Color.black);
        }                          
        
        if (String.valueOf(nombre_area.getText()).isEmpty()){
            nombre_area.setText("Pepito Perez");
            nombre_area.setForeground(Color.gray);
        }
        if (String.valueOf(nivel_area.getText()).isEmpty()){
            nivel_area.setText("A");
            nivel_area.setForeground(Color.gray);
        }
        if (String.valueOf(score_area.getText()).isEmpty()){
            score_area.setText("2500");
            score_area.setForeground(Color.gray);
        }

        if (String.valueOf(id_area.getText()).isEmpty()){
            id_area.setText("1");
            id_area.setForeground(Color.gray);
        }
    }                                       

    private void nivel_areaMousePressed(java.awt.event.MouseEvent evt) {    
        if (nivel_area.getText().equals("A")){
            nivel_area.setText("");
            nivel_area.setForeground(Color.black);
        }                          
        
        if (String.valueOf(nombre_area.getText()).isEmpty()){
            nombre_area.setText("Pepito Perez");
            nombre_area.setForeground(Color.gray);
        }
        if (String.valueOf(juego_area.getText()).isEmpty()){
            juego_area.setText("Minecraft");
            juego_area.setForeground(Color.gray);
        }
        if (String.valueOf(score_area.getText()).isEmpty()){
            score_area.setText("2500");
            score_area.setForeground(Color.gray);
        }
        if (String.valueOf(id_area.getText()).isEmpty()){
            id_area.setText("1");
            id_area.setForeground(Color.gray);
        }
    }                                       

    private void score_areaMousePressed(java.awt.event.MouseEvent evt) {     
        

        if (score_area.getText().equals("2500")){
            score_area.setText("");
            score_area.setForeground(Color.black);
        }                          
        
        if (String.valueOf(nombre_area.getText()).isEmpty()){
            nombre_area.setText("Pepito Perez");
            nombre_area.setForeground(Color.gray);
        }
        if (String.valueOf(juego_area.getText()).isEmpty()){
            juego_area.setText("Minecraft");
            juego_area.setForeground(Color.gray);
        }
        if (String.valueOf(nivel_area.getText()).isEmpty()){
            nivel_area.setText("A");
            nivel_area.setForeground(Color.gray);
        }
        if (String.valueOf(id_area.getText()).isEmpty()){
            id_area.setText("1");
            id_area.setForeground(Color.gray);
        }
    
    }                               

    private void salir_botonActionPerformed(java.awt.event.ActionEvent evt) {      
        JOptionPane.showMessageDialog(null, "Hasta luego, gracias por utilizar el programa :)", "Salir", JOptionPane.INFORMATION_MESSAGE);     
        dispose();                                 
    } 
    
    public static void limpiarCasillas() {
        nombre_area.setText("");
        nivel_area.setText("");
        juego_area.setText("");
        score_area.setText("");
    }

    public static void addJugador() {
        String nombre = nombre_area.getText();

        for (Jugadores jugador : jugadores) {
            if (jugador.getNombre().equals(nombre)) {
                JOptionPane.showMessageDialog(null, "Ya existe un jugador con ese nombre", "Jugador Repetido", JOptionPane.INFORMATION_MESSAGE);
                nombre_area.setText("");
                return;
            }
        }
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre para el jugador", "Nombre Vacio", JOptionPane.INFORMATION_MESSAGE);
            limpiarCasillas();
            return;
        }

        Jugadores jugador = new Jugadores(nombre, juego_area.getText(), nivel_area.getText().charAt(0), Integer.parseInt(score_area.getText()));
        jugadores.add(jugador);

        limpiarCasillas();
        listarJugadores();

        try {
            Archivo.guardarJugadores(jugadores);
            JOptionPane.showMessageDialog(null, "Jugadores guardados exitosamente", "Guardar Jugadores", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Hubo un error al guardar los jugadores", "Guardar Jugadores", JOptionPane.ERROR_MESSAGE);
        }

        
    }
   
    public static void listarJugadores(){
        AreaMainText.setText("");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("------------------Listado de Jugadores------------------\n");

        for(Jugadores jugador: jugadores){
            stringBuilder.append("\nId: ").append(jugador.getId()).append(" ||  Nombre del Jugador: ").append(jugador.getNombre()).append(" ||  Puntaje: ").append(jugador.getScore()).append("\n");
            AreaMainText.setText(stringBuilder.toString());
        }
    }
    
    public static void buscarJugador() {
        int id = Integer.parseInt(id_area.getText());

        boolean jugadorencontrado = false;

        for (Jugadores jugador : jugadores) {
            if (jugador.getId() == id) {
                nombre_area.setText(jugador.getNombre());
                juego_area.setText(jugador.getJuegoFavorito());
                score_area.setText(String.valueOf(jugador.getScore()));
                nivel_area.setText(Character.toString(jugador.getNivel()));
                jugadorencontrado = true;
                break;
            } 
        }

        if (!jugadorencontrado){
            JOptionPane.showMessageDialog(null, "No se encontro ningun jugador con ese ID", "Jugador No encontrado", JOptionPane.ERROR_MESSAGE);
            id_area.setText("");
            limpiarCasillas();
            return;
        }
    }
    
    public static void eliminarJugador() {
        int id = Integer.parseInt(id_area.getText());
        boolean jugadorencontrado = false;
    
        for (Jugadores jugador : jugadores) {
            if (jugador.getId() == id) {
                Object[] opciones = {"Si", "No"};
                int confirmacion = JOptionPane.showOptionDialog(null, "¿Está seguro de eliminar al jugador con ID: " + jugador.getId() + "?", "Eliminar jugador", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);

                if (confirmacion == JOptionPane.YES_OPTION) {
                    jugadores.remove(jugador);
                    try {
                        listarJugadores();
                        Archivo.guardarJugadores(jugadores);
                        JOptionPane.showMessageDialog(null, "Se ha eliminado el jugador con ID: " + jugador.getId(), "Eliminar jugador", JOptionPane.INFORMATION_MESSAGE);
                        id_area.setText("");
                        jugadorencontrado = true;
                        break;
                    } catch (IOException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error al guardar los jugadores", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                } else if (confirmacion == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Eliminación cancelada", "Eliminar jugador", JOptionPane.INFORMATION_MESSAGE);
                    jugadorencontrado = true;
                }
            }
        }
    
        if (!jugadorencontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró ningún jugador con ese ID", "Jugador no encontrado", JOptionPane.ERROR_MESSAGE);
            id_area.setText("");
        }
    
        listarJugadores();
    }
    
    public static void editarJugador() {
        int id = Integer.parseInt(id_area.getText());
        boolean jugadorencontrado = false;
        for (Jugadores jugador : jugadores) {
            if (jugador.getId() == id) {
                try {
                    jugadorencontrado = true;
                    jugador.setNombre(nombre_area.getText());
                    jugador.setNivel(nivel_area.getText().charAt(0));
                    jugador.setJuegoFavorito(juego_area.getText());
                    jugador.setScore(Integer.parseInt(score_area.getText()));
                
                    limpiarCasillas();
                    listarJugadores();
                    Archivo.guardarJugadores(jugadores);
                    JOptionPane.showMessageDialog(null, "Se ha editado y guardado el jugador con ID: " + jugador.getId() + " exitosamente", "Editar Jugador", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Hubo un error al guardar los cambios del jugador", "Editar Jugador", JOptionPane.ERROR_MESSAGE);
                }
                return;
            }
        }

        if (!jugadorencontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró ningún jugador con ese ID", "Jugador no encontrado", JOptionPane.ERROR_MESSAGE);
            id_area.setText("");
        }
    }                        
                                                                    
    public void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pantalla Pantalla = new Pantalla();
                Pantalla.setVisible(true);
                Pantalla.requestFocusInWindow();
            }
        });
    }                 
    
               
}