/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2so;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author victoriadepalma
 */
public class Interfaz extends javax.swing.JFrame {
    
  
   
    
    public static String[] namesZ=new String[10];
    public static String[] namesST=new String[10];
    public static String[] listaGanadores=new String[150];
    public Personaje[] personajesZ= new Personaje[30];
    public Personaje[] personajesST = new Personaje[30];
    public int tiempo;
    
    int contadorIdZ=0;
    int contadorIdSF=0;
    
  
    
    Cola cola1Z = new Cola();
    Cola cola2Z = new Cola();
    Cola cola3Z = new Cola();
    Cola cola1SF = new Cola();
    Cola cola2SF = new Cola();
    Cola cola3SF = new Cola();
    Cola colaRZ = new Cola();
    Cola colaRSF = new Cola();
    Cola colaPersonajesZelda=new Cola();
    Cola colaPersonajesSF=new Cola();
    Cola colaGanadoresSF=new Cola();
    Cola colaGanadoresZelda=new Cola();
    //hola
    
    
        Admin admin = new Admin(this);
        Inteligencia inteligencia = new Inteligencia(this, this.cola1Z, this.cola2Z, this.cola3Z, this.cola1SF, this.cola2SF, this.cola3SF, this.colaRZ, this.colaRSF, admin);
   
    

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        namesZ[0]="Link";
        namesZ[1]="Princesa Zelda";
        namesZ[2]="Ganondorf";
        namesZ[3]="Impa";
        namesZ[4]="Darunia";
        namesZ[5]="Tingle";
        namesZ[6]="Navi";
        namesZ[7]="Sheik";
        namesZ[8]="Epona";
        namesZ[9]="Rauru";
        
        namesST[0]="Ryu";
        namesST[1]="M.Bison";
        namesST[2]="Zangief";
        namesST[3]="Akuma";
        namesST[4]="Guile";
        namesST[5]="Gouken";
        namesST[6]="Chun-Li";
        namesST[7]="Menat";
        namesST[8]="Juni";
        namesST[9]="Blanka";
        
        this.tiempo=10;
        setBtnIniciarEnabled(true);
        
    
        
    }
    public void inicializarPersonaje(int iteracionesTotales){
//        int contadorIteracionesZ=0;
//        int contadorIteracionesSF=0;
        for (int i=0;i<iteracionesTotales;i++){
        Random randomGenerator= new Random();
        int idRandom=randomGenerator.nextInt(10);
        colaPersonajesZelda.addPersonaje(contadorIdZ, namesZ[idRandom],0,0);
        this.contadorIdZ++;
        
//        contadorIteracionesZ++;
//        if (i==namesZ.length-1){
////            contadorIteracionesZ=0;
//            i=0;
//        }else{

//            
//        }
        }
        //holaaa1
        
        for (int u=0;u<iteracionesTotales;u++){
        Random randomGenerator= new Random();
        int idRandom=randomGenerator.nextInt(10);
        colaPersonajesSF.addPersonaje(contadorIdSF, namesST[idRandom],0,0);
        this.contadorIdSF++;
//        this.contadorIdSF++;
//        if (u==namesST.length-1){
//           
//            u=0;
//        }else{
//            
//        }

    }
    }
     
    
//    public void inicializarPersonaje(){
//        for (int i=0;i< personajesZ.length;i++){
//            Random randomGenerator= new Random();
//            int idRandom=randomGenerator.nextInt(10);
//            
//            personajesZ[i] = new Personaje(contadorIdZ, namesZ[idRandom], null,0,0); //lista de objetos personajes Zelda
//            
//            this.contadorIdZ++;
//            System.out.println("se hizo bien");
// 
//        }
//          for (int i=0;i<personajesST.length;i++){
//              Random randomGenerator= new Random();
//            int idRandom=randomGenerator.nextInt(10);
//
//            personajesST[i]=new Personaje(contadorIdSF, namesST[idRandom], null,0,0); //lista de objetos personajes Street Fighter
//            this.contadorIdSF++;
//            
//           
//        }
//
//    }
//    
    public void visualizarColas(){
           String cola1z = cola1Z.imprimirColaZelda();
           String cola1sf = cola1SF.imprimirColaSF();
           String cola2z = cola2Z.imprimirColaZelda();
           String cola2sf = cola2SF.imprimirColaSF();
           String cola3z = cola3Z.imprimirColaZelda();
           String cola3sf = cola3SF.imprimirColaSF();
           String colarz = colaRZ.imprimirColaZelda();
           String colarsf = colaRSF.imprimirColaSF();
           
           txtNivel1Z.setText(cola1z);
           txtNivel2Z.setText(cola2z);
           txtNivel3Z.setText(cola3z);
           txtRZ.setText(colarz);
           txtNivel1SF.setText(cola1sf);
           txtNivel2SF.setText(cola2sf);
           txtNivel3SF.setText(cola3sf);
           txtRSF.setText(colarsf);
        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIdZ = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNombreZelda = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Iniciar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCombatesGanadosZelda = new javax.swing.JTextField();
        txtCombatesGanadosSF = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtIdSF = new javax.swing.JTextField();
        txtNombreSF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        imagenZelda = new javax.swing.JLabel();
        txtEstadoIA = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRSF = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNivel1Z = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        imagenStreetFighter = new javax.swing.JLabel();
        aumentar = new javax.swing.JButton();
        disminuir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNivel2Z = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtNivel3Z = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtRZ = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtNivel1SF = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtNivel2SF = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtNivel3SF = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(940, 624));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 255, 255));
        jLabel27.setText("Refuerzo");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 290, -1, -1));

        jLabel25.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        jLabel25.setText("Refuerzo");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 290, -1, -1));

        jLabel13.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 255, 255));
        jLabel13.setText("Refuerzo");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 290, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 102));
        jLabel4.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText("Nivel 1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("Nivel 2 ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 51));
        jLabel6.setText("Nivel 3");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 243, -1, -1));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, -1, -1));

        jLabel9.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        jLabel9.setText("Refuerzo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 51));
        jLabel10.setText("ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 30, -1));

        txtIdZ.setBackground(new java.awt.Color(0, 51, 102));
        txtIdZ.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        txtIdZ.setForeground(new java.awt.Color(255, 255, 255));
        txtIdZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdZActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 100, 23));

        jLabel11.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 51));
        jLabel11.setText("Nombre");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 102, 60, 16));

        txtNombreZelda.setBackground(new java.awt.Color(0, 51, 102));
        txtNombreZelda.setFont(new java.awt.Font("Silom", 1, 10)); // NOI18N
        txtNombreZelda.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreZelda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreZeldaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreZelda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 100, 23));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        Iniciar.setBackground(new java.awt.Color(204, 0, 51));
        Iniciar.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        Iniciar.setText("INICIAR");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        jPanel1.add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 90, -1));

        jLabel14.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 51));
        jLabel14.setText("Resultado");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 102, 90, 16));

        txtResultado.setBackground(new java.awt.Color(0, 51, 102));
        txtResultado.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(153, 0, 51));
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 100, 150, 23));

        jLabel17.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 102, 51));
        jLabel17.setText("Control de Tiempo");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 560, -1, -1));

        jLabel18.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 102, 51));
        jLabel18.setText("Combates ganados: ");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 560, 140, -1));

        jLabel19.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 102, 51));
        jLabel19.setText("Combates ganados: ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 150, -1));

        txtCombatesGanadosZelda.setBackground(new java.awt.Color(0, 51, 102));
        txtCombatesGanadosZelda.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        txtCombatesGanadosZelda.setForeground(new java.awt.Color(0, 204, 255));
        txtCombatesGanadosZelda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCombatesGanadosZeldaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCombatesGanadosZelda, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 556, 90, 23));

        txtCombatesGanadosSF.setBackground(new java.awt.Color(0, 51, 102));
        txtCombatesGanadosSF.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        txtCombatesGanadosSF.setForeground(new java.awt.Color(0, 204, 255));
        jPanel1.add(txtCombatesGanadosSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(829, 556, 90, 23));

        jLabel21.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 102, 51));
        jLabel21.setText("ID");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 30, -1));

        jLabel22.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 102, 51));
        jLabel22.setText("Nombre");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 102, 60, -1));

        txtIdSF.setBackground(new java.awt.Color(0, 51, 102));
        txtIdSF.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        txtIdSF.setForeground(new java.awt.Color(255, 255, 255));
        txtIdSF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdSFActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 100, 23));

        txtNombreSF.setBackground(new java.awt.Color(0, 51, 102));
        txtNombreSF.setFont(new java.awt.Font("Silom", 1, 10)); // NOI18N
        txtNombreSF.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNombreSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 100, 23));

        jLabel15.setBackground(new java.awt.Color(0, 0, 102));
        jLabel15.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 51));
        jLabel15.setText("Nivel 1");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        txtTiempo.setBackground(new java.awt.Color(0, 51, 102));
        txtTiempo.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        txtTiempo.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(txtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 555, 50, 23));

        jLabel24.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 102, 51));
        jLabel24.setText("Estado IA");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 60, 80, 20));

        jLabel20.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 102, 51));
        jLabel20.setText("Nivel 3");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));
        jPanel1.add(imagenZelda, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 230, 228));

        txtEstadoIA.setBackground(new java.awt.Color(0, 51, 102));
        txtEstadoIA.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        txtEstadoIA.setForeground(new java.awt.Color(255, 255, 255));
        txtEstadoIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoIAActionPerformed(evt);
            }
        });
        jPanel1.add(txtEstadoIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 60, 150, 23));

        txtRSF.setBackground(new java.awt.Color(0, 51, 102));
        txtRSF.setColumns(20);
        txtRSF.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        txtRSF.setForeground(new java.awt.Color(0, 204, 255));
        txtRSF.setRows(5);
        jScrollPane1.setViewportView(txtRSF);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 300, 40));

        txtNivel1Z.setBackground(new java.awt.Color(0, 51, 102));
        txtNivel1Z.setColumns(20);
        txtNivel1Z.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        txtNivel1Z.setForeground(new java.awt.Color(0, 204, 255));
        txtNivel1Z.setRows(5);
        jScrollPane2.setViewportView(txtNivel1Z);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 300, 40));

        jLabel16.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 102, 51));
        jLabel16.setText("Nivel 2 ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));
        jPanel1.add(imagenStreetFighter, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 230, 228));

        aumentar.setBackground(new java.awt.Color(102, 255, 255));
        aumentar.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        aumentar.setText("+");
        aumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentarActionPerformed(evt);
            }
        });
        jPanel1.add(aumentar, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 555, 20, 23));

        disminuir.setBackground(new java.awt.Color(102, 255, 255));
        disminuir.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        disminuir.setText("-");
        disminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disminuirActionPerformed(evt);
            }
        });
        jPanel1.add(disminuir, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 555, 20, 23));

        txtNivel2Z.setBackground(new java.awt.Color(0, 51, 102));
        txtNivel2Z.setColumns(20);
        txtNivel2Z.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        txtNivel2Z.setForeground(new java.awt.Color(0, 204, 255));
        txtNivel2Z.setRows(5);
        jScrollPane3.setViewportView(txtNivel2Z);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 300, 40));

        txtNivel3Z.setBackground(new java.awt.Color(0, 51, 102));
        txtNivel3Z.setColumns(20);
        txtNivel3Z.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        txtNivel3Z.setForeground(new java.awt.Color(0, 204, 255));
        txtNivel3Z.setRows(5);
        jScrollPane4.setViewportView(txtNivel3Z);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 300, 40));

        txtRZ.setBackground(new java.awt.Color(0, 51, 102));
        txtRZ.setColumns(20);
        txtRZ.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        txtRZ.setForeground(new java.awt.Color(0, 204, 255));
        txtRZ.setRows(5);
        jScrollPane5.setViewportView(txtRZ);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 300, 40));

        txtNivel1SF.setBackground(new java.awt.Color(0, 51, 102));
        txtNivel1SF.setColumns(20);
        txtNivel1SF.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        txtNivel1SF.setForeground(new java.awt.Color(0, 204, 255));
        txtNivel1SF.setRows(5);
        jScrollPane6.setViewportView(txtNivel1SF);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 300, 40));

        txtNivel2SF.setBackground(new java.awt.Color(0, 51, 102));
        txtNivel2SF.setColumns(20);
        txtNivel2SF.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        txtNivel2SF.setForeground(new java.awt.Color(0, 204, 255));
        txtNivel2SF.setRows(5);
        jScrollPane7.setViewportView(txtNivel2SF);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 300, 40));

        txtNivel3SF.setBackground(new java.awt.Color(0, 51, 102));
        txtNivel3SF.setColumns(20);
        txtNivel3SF.setFont(new java.awt.Font("Silom", 1, 12)); // NOI18N
        txtNivel3SF.setForeground(new java.awt.Color(0, 204, 255));
        txtNivel3SF.setRows(5);
        jScrollPane8.setViewportView(txtNivel3SF);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 300, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2so/images/background.png"))); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(940, 624));
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreZeldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreZeldaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreZeldaActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        // TODO add your handling code here:
        setBtnIniciarEnabled(false);
        SoundHandler.RunMusic("/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/audio/music.wav");
        this.inicializarPersonaje(10);
        this.visualizarColas();
        
        
 
        this.txtTiempo.setText(Integer.toString(this.tiempo));
        this.txtEstadoIA.setText("Esperando");
        admin.asignarColasNiveles(this.cola1Z, this.cola2Z, this.cola3Z, this.cola1SF, this.cola2SF, this.cola3SF);
        inteligencia.start();
        
        
//       
        
    }//GEN-LAST:event_IniciarActionPerformed
public void setBtnIniciarEnabled(boolean enabled) {
        Iniciar.setEnabled(enabled);
    }

    private void txtCombatesGanadosZeldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCombatesGanadosZeldaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCombatesGanadosZeldaActionPerformed

    private void txtIdSFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdSFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSFActionPerformed

    private void txtEstadoIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoIAActionPerformed

    private void txtIdZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdZActionPerformed

    private void disminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disminuirActionPerformed
        if (this.tiempo != 1){
             this.tiempo = this.tiempo - 1;
        
        this.txtTiempo.setText(Integer.toString(this.tiempo)); 
        }

    }//GEN-LAST:event_disminuirActionPerformed

    private void aumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentarActionPerformed
        // TODO add your handling code here:
        this.tiempo = this.tiempo + 1;
        
        this.txtTiempo.setText(Integer.toString(this.tiempo)); 
    }//GEN-LAST:event_aumentarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar;
    private javax.swing.JButton aumentar;
    private javax.swing.JLabel background;
    private javax.swing.JButton disminuir;
    public javax.swing.JLabel imagenStreetFighter;
    public javax.swing.JLabel imagenZelda;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    public static javax.swing.JTextField txtCombatesGanadosSF;
    public static javax.swing.JTextField txtCombatesGanadosZelda;
    public static javax.swing.JTextField txtEstadoIA;
    public javax.swing.JTextField txtIdSF;
    public javax.swing.JTextField txtIdZ;
    private javax.swing.JTextArea txtNivel1SF;
    private javax.swing.JTextArea txtNivel1Z;
    private javax.swing.JTextArea txtNivel2SF;
    private javax.swing.JTextArea txtNivel2Z;
    private javax.swing.JTextArea txtNivel3SF;
    private javax.swing.JTextArea txtNivel3Z;
    public javax.swing.JTextField txtNombreSF;
    public javax.swing.JTextField txtNombreZelda;
    private javax.swing.JTextArea txtRSF;
    private javax.swing.JTextArea txtRZ;
    public static javax.swing.JTextField txtResultado;
    public javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
