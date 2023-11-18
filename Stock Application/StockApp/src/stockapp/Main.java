package stockapp;

import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Olga Ingabire
 */
public class Main extends javax.swing.JFrame {

    //Creates Main form
    public Main() {
        initComponents();
        Connect();
        loadprdtline();
        loadacthistory();
        addSearchbarplaceholder(CreateSearchBar);
        addSearchbarplaceholder (EditSearchBar);
        
        ProductID.setEditable(false);
    }
    
    Connection con;
    PreparedStatement pst, psthist, p, pPrdtLine, pActHist;
    
    // Method to connect to database
    public void Connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockmgmt", "root",""); 
             
            
        } catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }
    }
    
    //Method to load data into the prdtline Jtable
    public void loadprdtline(){
        DefaultTableModel df;
        int a;
        
        try {
            pst = con.prepareStatement("select * from prdtline");
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel)PrdtLine.getModel();
            df.setRowCount(0);
            
            while (rs.next()){
                Vector v2 = new Vector();
                for(int i=1; i<=a; i++ ){
                    v2.add(rs.getString("ProductID"));
                    v2.add(rs.getString("ProductName"));
                    v2.add(rs.getString("CurrentStock"));
                    v2.add(rs.getString("Price"));
                    
                }  
                df.addRow(v2);     
            }      
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    //Method to load acthistory JTable
    public void loadacthistory(){
        
        DefaultTableModel df;
        int a;
        
        try {
            psthist = con.prepareStatement("select * from acthistory"); 
            ResultSet rs = psthist.executeQuery();
            
            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel)ActHistory.getModel();
            df.setRowCount(0);
            
            while (rs.next()){
                Vector v2 = new Vector();
                for(int i=1; i<=a; i++ ){
                    v2.add(rs.getString("Status"));
                    v2.add(rs.getString("PrdtName"));
                    v2.add(rs.getString("PrdtPrice"));
                    v2.add(rs.getString("QtyEntered"));   
                    v2.add(rs.getString("QtyIn")); 
                    v2.add(rs.getString("QtyOut")); 
                    v2.add(rs.getString("Notes")); 
                    v2.add(rs.getString("TimeStamp")); 
                }  
                df.addRow(v2);     
            }      
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    
    //Method to load place holder for search bar
    public void addSearchbarplaceholder (JTextField text){
        Font Italicfont = text.getFont();
        Italicfont = Italicfont.deriveFont(Font.ITALIC);
        text.setFont(Italicfont);
        text.setForeground(Color.gray);
    }
    
    //Method to remove place holder for search bar
    public void removeSearchbarplaceholder (JTextField text){
        Font Normalfont = text.getFont();
        Normalfont = Normalfont.deriveFont(Font.PLAIN);
        text.setFont(Normalfont);
        text.setForeground(Color.black);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AppScrollPane = new javax.swing.JScrollPane();
        AppPanel = new javax.swing.JPanel();
        CreatePrdtPanel = new javax.swing.JPanel();
        PrdtLineScrollPane = new javax.swing.JScrollPane();
        PrdtLine = new javax.swing.JTable();
        EnterCreatePrdt = new javax.swing.JPanel();
        CreatePrdtTitle = new javax.swing.JLabel();
        CreateNameLabel = new javax.swing.JLabel();
        ProductName = new javax.swing.JTextField();
        CreateQtyLabel = new javax.swing.JLabel();
        CurrentStock = new javax.swing.JTextField();
        CreatePriceLabel = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        CreateRecord = new javax.swing.JButton();
        CreateUpdate = new javax.swing.JButton();
        CreateID = new javax.swing.JLabel();
        ProductID = new javax.swing.JTextField();
        ProductIDWarningLabel = new javax.swing.JLabel();
        CreateSearchBar = new javax.swing.JTextField();
        EditPrdtPanel = new javax.swing.JPanel();
        ActHistoryScrollPane = new javax.swing.JScrollPane();
        ActHistory = new javax.swing.JTable();
        EnterEditPrdtLabel = new javax.swing.JPanel();
        EditTitleLabel = new javax.swing.JLabel();
        EditNameLabel = new javax.swing.JLabel();
        PrdtName = new javax.swing.JTextField();
        EditQtyLabel = new javax.swing.JLabel();
        PrdtQty = new javax.swing.JTextField();
        EditPriceLabel = new javax.swing.JLabel();
        PrdtPrice = new javax.swing.JTextField();
        EditNameLabel3 = new javax.swing.JLabel();
        PrdtAction = new javax.swing.JComboBox<>();
        EditNotesLabel = new javax.swing.JLabel();
        EditRecord = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PrdtNotes = new javax.swing.JTextArea();
        EditSearchBar = new javax.swing.JTextField();
        EditPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stock Management App");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(AppPanel.getVisibleRect());
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        AppScrollPane.setBackground(new java.awt.Color(0, 0, 0));
        AppScrollPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        AppScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        AppScrollPane.setAutoscrolls(true);
        AppScrollPane.setMaximumSize(new java.awt.Dimension(32767, 2147483647));

        AppPanel.setBackground(new java.awt.Color(204, 204, 204));
        AppPanel.setAutoscrolls(true);
        AppPanel.setMaximumSize(new java.awt.Dimension(32767, 2147483647));

        CreatePrdtPanel.setBackground(new java.awt.Color(153, 153, 153));
        CreatePrdtPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CreatePrdtPanel.setForeground(new java.awt.Color(153, 153, 153));
        CreatePrdtPanel.setMaximumSize(new java.awt.Dimension(32767, 2147483647));

        PrdtLine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "Product Name", "Current Stock", "Product Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        PrdtLine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrdtLineMouseClicked(evt);
            }
        });
        PrdtLineScrollPane.setViewportView(PrdtLine);

        EnterCreatePrdt.setPreferredSize(new java.awt.Dimension(631, 264));

        CreatePrdtTitle.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        CreatePrdtTitle.setText("Create Product");

        CreateNameLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CreateNameLabel.setText("Product Name:");

        CreateQtyLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CreateQtyLabel.setText("Current Stock:");

        CreatePriceLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CreatePriceLabel.setText("Price:");

        CreateRecord.setText("Record");
        CreateRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateRecordActionPerformed(evt);
            }
        });

        CreateUpdate.setText("Update");
        CreateUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateUpdateActionPerformed(evt);
            }
        });

        CreateID.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CreateID.setText("Product ID:");

        ProductIDWarningLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProductIDWarningLabel.setText("Verify Product ID matches table record before updating");

        CreateSearchBar.setText("Enter Text to Search...");
        CreateSearchBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CreateSearchBarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CreateSearchBarFocusLost(evt);
            }
        });
        CreateSearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CreateSearchBarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout EnterCreatePrdtLayout = new javax.swing.GroupLayout(EnterCreatePrdt);
        EnterCreatePrdt.setLayout(EnterCreatePrdtLayout);
        EnterCreatePrdtLayout.setHorizontalGroup(
            EnterCreatePrdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterCreatePrdtLayout.createSequentialGroup()
                .addGroup(EnterCreatePrdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnterCreatePrdtLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(CreatePrdtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EnterCreatePrdtLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(EnterCreatePrdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CreateNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CreateQtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CreatePriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(EnterCreatePrdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Price, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(CurrentStock)
                            .addComponent(ProductName))
                        .addGroup(EnterCreatePrdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EnterCreatePrdtLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(CreateID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ProductIDWarningLabel)
                            .addGroup(EnterCreatePrdtLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CreateRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(CreateUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(EnterCreatePrdtLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CreateSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        EnterCreatePrdtLayout.setVerticalGroup(
            EnterCreatePrdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterCreatePrdtLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(CreatePrdtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(EnterCreatePrdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreateID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EnterCreatePrdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateQtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CurrentStock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductIDWarningLabel))
                .addGap(15, 15, 15)
                .addGroup(EnterCreatePrdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreatePriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreateRecord)
                    .addComponent(CreateUpdate))
                .addGap(18, 18, 18)
                .addComponent(CreateSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CreatePrdtPanelLayout = new javax.swing.GroupLayout(CreatePrdtPanel);
        CreatePrdtPanel.setLayout(CreatePrdtPanelLayout);
        CreatePrdtPanelLayout.setHorizontalGroup(
            CreatePrdtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrdtLineScrollPane)
            .addComponent(EnterCreatePrdt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );
        CreatePrdtPanelLayout.setVerticalGroup(
            CreatePrdtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreatePrdtPanelLayout.createSequentialGroup()
                .addComponent(EnterCreatePrdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PrdtLineScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        EditPrdtPanel.setBackground(new java.awt.Color(153, 153, 153));
        EditPrdtPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EditPrdtPanel.setForeground(new java.awt.Color(255, 255, 255));
        EditPrdtPanel.setMaximumSize(new java.awt.Dimension(32767, 2147483647));

        ActHistoryScrollPane.setToolTipText("");
        ActHistoryScrollPane.setAutoscrolls(true);

        ActHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Product Name", "Price", "Qty Entered", "PurchaseQty", "SaleQty", "Notes", "TimeStamp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ActHistory.setAutoResizeMode(0);

        ActHistoryScrollPane.setViewportView(ActHistory);

        EnterEditPrdtLabel.setPreferredSize(new java.awt.Dimension(1152, 264));
        EnterEditPrdtLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EnterEditPrdtLabelFocusGained(evt);
            }
        });

        EditTitleLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        EditTitleLabel.setText("Edit Product");

        EditNameLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        EditNameLabel.setText("Product Name:");

        EditQtyLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        EditQtyLabel.setText("Product Qty:");

        EditPriceLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        EditPriceLabel.setText("Product Price:");

        EditNameLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        EditNameLabel3.setText("Action:");

        PrdtAction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Purchase", "Sale" }));
        
        EditNotesLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        EditNotesLabel.setText("Notes:");

        EditRecord.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EditRecord.setText("Record");
        EditRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditRecordActionPerformed(evt);
            }
        });

        PrdtNotes.setColumns(20);
        PrdtNotes.setRows(5);
        jScrollPane1.setViewportView(PrdtNotes);

        EditSearchBar.setText("Enter Text to Search...");
        EditSearchBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EditSearchBarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EditSearchBarFocusLost(evt);
            }
        });
        
        EditSearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EditSearchBarKeyReleased(evt);
            }
        });

        EditPrint.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EditPrint.setText("Pdf Print");
        EditPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EnterEditPrdtLabelLayout = new javax.swing.GroupLayout(EnterEditPrdtLabel);
        EnterEditPrdtLabel.setLayout(EnterEditPrdtLabelLayout);
        EnterEditPrdtLabelLayout.setHorizontalGroup(
            EnterEditPrdtLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterEditPrdtLabelLayout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(EditTitleLabel)
                .addGap(15, 730, Short.MAX_VALUE))
            .addGroup(EnterEditPrdtLabelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(EnterEditPrdtLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EditNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditQtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(EnterEditPrdtLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrdtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrdtName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrdtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(EnterEditPrdtLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnterEditPrdtLabelLayout.createSequentialGroup()
                        .addComponent(EditNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PrdtAction, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EnterEditPrdtLabelLayout.createSequentialGroup()
                        .addComponent(EditNotesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(EnterEditPrdtLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnterEditPrdtLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(403, 403, 403))
        );
        EnterEditPrdtLabelLayout.setVerticalGroup(
            EnterEditPrdtLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterEditPrdtLabelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(EditTitleLabel)
                .addGap(10, 10, 10)
                .addGroup(EnterEditPrdtLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrdtName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrdtAction, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(EnterEditPrdtLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnterEditPrdtLabelLayout.createSequentialGroup()
                        .addGroup(EnterEditPrdtLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EnterEditPrdtLabelLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(EnterEditPrdtLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EditQtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PrdtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(EnterEditPrdtLabelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(EditNotesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(EnterEditPrdtLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrdtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(EnterEditPrdtLabelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EnterEditPrdtLabelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(EditPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(EditSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout EditPrdtPanelLayout = new javax.swing.GroupLayout(EditPrdtPanel);
        EditPrdtPanel.setLayout(EditPrdtPanelLayout);
        EditPrdtPanelLayout.setHorizontalGroup(
            EditPrdtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditPrdtPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(EditPrdtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnterEditPrdtLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ActHistoryScrollPane))
                .addGap(0, 0, 0))
        );
        EditPrdtPanelLayout.setVerticalGroup(
            EditPrdtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditPrdtPanelLayout.createSequentialGroup()
                .addComponent(EnterEditPrdtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ActHistoryScrollPane)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout AppPanelLayout = new javax.swing.GroupLayout(AppPanel);
        AppPanel.setLayout(AppPanelLayout);
        AppPanelLayout.setHorizontalGroup(
            AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppPanelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(CreatePrdtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(EditPrdtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        AppPanelLayout.setVerticalGroup(
            AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(AppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CreatePrdtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditPrdtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        AppScrollPane.setViewportView(AppPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(AppScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1788, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Create new product and populate details into prdtline and acthistory.
    private void CreateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateRecordActionPerformed
        
        if (ProductName.getText().isEmpty() || CurrentStock.getText().isEmpty() || Price.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "There is Data missing. Please fill all fields!!");
        }
        else{
            try {
               
                String PName = ProductName.getText();
                String PStock = CurrentStock.getText();
                String PPrice = Price.getText();
                String PrdtIDcmd = "SELECT MAX(ProductID) FROM prdtline";
                
                p = con.prepareStatement(PrdtIDcmd);
                ResultSet rs = p.executeQuery();
                
                if(rs.next()){
     
                    int id = Integer.parseInt(rs.getString("MAX(ProductID)")) + 1;

                    String prdtlinecmd = "INSERT INTO prdtline(ProductID, ProductName, CurrentStock, Price) VALUES (?,?,?,?)";

                    pst = con.prepareStatement(prdtlinecmd);
                    pst.setString(1, Integer.toString(id));
                    pst.setString(2, PName);
                    pst.setString(3,PStock);
                    pst.setString(4, PPrice);
                    pst.executeUpdate();
                    pst.close();

                    psthist = con.prepareStatement("INSERT INTO acthistory (Status, ProductID, PrdtName, PrdtPrice, QtyEntered, QtyIn, Notes) VALUES(?,?,?,?,?,?,?)");
                    psthist.setString(1, "New Product");
                    psthist.setString(2, Integer.toString(id));
                    psthist.setString(3, ProductName.getText());
                    psthist.setString(4, Price.getText());
                    psthist.setString(5, CurrentStock.getText());
                    psthist.setString(6, CurrentStock.getText());
                    psthist.setString(7, "New product created!");
                    psthist.executeUpdate();
                    psthist.close();

                    ProductName.setText(""); 
                    CurrentStock.setText("");
                    Price.setText("");
                    JOptionPane.showMessageDialog(this, "Product created successfully!!");
                    ProductName.requestFocus();
                    loadprdtline();
                    loadacthistory();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Data entered incorrectly, Please try again!!");
            }
        }
    }//GEN-LAST:event_CreateRecordActionPerformed

    // Select prdtline row items when clicked on.
    int Key = 0;
    private void PrdtLineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrdtLineMouseClicked

        DefaultTableModel model = (DefaultTableModel) PrdtLine.getModel();
        int a = PrdtLine.getSelectedRow();
        
        ProductID.setText(model.getValueAt(a, 0).toString());
        ProductName.setText(model.getValueAt(a, 1).toString());
        CurrentStock.setText(model.getValueAt(a, 2).toString());
        Price.setText(model.getValueAt(a, 3).toString());   
        
        if (ProductName.getText().isEmpty()){
            Key = 0;
        }
        else{
            Key = Integer.parseInt(ProductID.getText());
        }
        
        CurrentStock.setEditable(false);
        CreateRecord.setEnabled(false);
    }//GEN-LAST:event_PrdtLineMouseClicked

    
    // Update existing products and populate details into prdtline and acthistory.
    private void CreateUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateUpdateActionPerformed

        if (ProductName.getText().isEmpty() || Price.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "There is Data missing. Please fill all fields!!");
        }
        else{
            try {   
                
                pst = con.prepareStatement("UPDATE prdtline SET ProductName = ?, Price = ? WHERE ProductID = ?");
                pst.setString(3, ProductID.getText());
                pst.setString(1, ProductName.getText());
                pst.setString(2, Price.getText());
                pst.executeUpdate();
                pst.close();
                
                psthist = con.prepareStatement("INSERT INTO acthistory (Status, ProductID, PrdtName, PrdtPrice, QtyEntered, Notes) VALUES(?,?,?,?,?,?)");
                psthist.setString(1, "Product Update");
                psthist.setString(2, ProductID.getText());
                psthist.setString(3, ProductName.getText());
                psthist.setString(4, Price.getText());
                psthist.setString(5, CurrentStock.getText());
                psthist.setString(6,ProductName.getText()+" Updated!");
                psthist.executeUpdate();
                psthist.close();
            
                ProductName.setText("");
                CurrentStock.setText("");
                Price.setText("");
                JOptionPane.showMessageDialog(this, "Product details updated!!");
                ProductName.requestFocus();
                loadprdtline();
                loadacthistory();
                CreateRecord.setEnabled(true);
                CurrentStock.setEditable(true);
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Data entered incorrectly, Please try again!!");
            } 
        }
    }//GEN-LAST:event_CreateUpdateActionPerformed

    // Edit existing product details by sale or purchase action. Then populate details into prdtline and acthistory.
    private void EditRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditRecordActionPerformed

        if (PrdtName.getText().isEmpty() || PrdtPrice.getText().isEmpty() || PrdtQty.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "There is Data missing. Please fill all fields!!");
        }
        else{
            try {
               
                int NewStock;
                String PName = PrdtName.getText();
                String PStock = PrdtQty.getText();
                //String PAction = (String) PrdtAction.getSelectedItem();
                
                //String SearchTxt = PName;
                pst = con.prepareStatement("select * from prdtline WHERE ProductName LIKE '"+PName+"'");
                ResultSet rs = pst.executeQuery();
                
                while (rs.next()){
                   String SearchTxt = rs.getString("ProductName");
                   int id = rs.getInt("ProductID");
                   int stock = rs.getInt("CurrentStock");
                   
                   if (PrdtAction.getSelectedItem() == "Sale"){
                       
                       NewStock = stock - Integer.parseInt(PStock);
                       
                       String notes = PrdtNotes.getText()+ " Previous Total Stock = "+stock+", New Stock Total = "+NewStock;
                       
                       String PrdtlineUpdate = "UPDATE prdtline SET CurrentStock = ? WHERE ProductID = ?";
                       pPrdtLine = con.prepareStatement(PrdtlineUpdate);
                       pPrdtLine.setString(2, Integer.toString(id));
                       pPrdtLine.setString(1, Integer.toString(NewStock));
                       pPrdtLine.executeUpdate();
                       pPrdtLine.close();
                       
                       String ActhistoryUpdate = "INSERT INTO acthistory (Status, ProductID, PrdtName, PrdtPrice, QtyEntered, QtyOut, Notes) VALUES(?,?,?,?,?,?,?)";
                       pActHist = con.prepareStatement(ActhistoryUpdate); 
                       pActHist.setString(1, "Sale");
                       pActHist.setString(2, Integer.toString(id));
                       pActHist.setString(3, SearchTxt);
                       pActHist.setString(4, PrdtPrice.getText());
                       pActHist.setString(5, PrdtQty.getText());
                       pActHist.setString(6, Integer.toString(NewStock));
                       pActHist.setString(7, notes);
                       pActHist.executeUpdate();
                       pActHist.close();
                       
                       PrdtName.setText(""); 
                       PrdtQty.setText("");
                       PrdtPrice.setText("");
                       PrdtNotes.setText("");
                       
                       JOptionPane.showMessageDialog(this, "Sale of "+SearchTxt+" recorded!");
                       ProductName.requestFocus();
                       loadprdtline();
                       loadacthistory();
                   }
                   else if (PrdtAction.getSelectedItem() == "Purchase"){
                       
                       NewStock = stock + Integer.parseInt(PStock);
                       
                       String notes = PrdtNotes.getText()+ " Previous Total Stock = "+stock+", New Stock Total = "+NewStock;
                       
                       String PrdtlineUpdate = "UPDATE prdtline SET CurrentStock = ? WHERE ProductID = ?";
                       pPrdtLine = con.prepareStatement(PrdtlineUpdate);
                       pPrdtLine.setString(2, Integer.toString(id));
                       pPrdtLine.setString(1, Integer.toString(NewStock));
                       pPrdtLine.executeUpdate();
                       pPrdtLine.close();
                       
                       String ActhistoryUpdate = "INSERT INTO acthistory (Status, ProductID, PrdtName, PrdtPrice, QtyEntered, QtyOut, Notes) VALUES(?,?,?,?,?,?,?)";
                       pActHist = con.prepareStatement(ActhistoryUpdate); 
                       pActHist.setString(1, "Purchase");
                       pActHist.setString(2, Integer.toString(id));
                       pActHist.setString(3, SearchTxt);
                       pActHist.setString(4, PrdtPrice.getText());
                       pActHist.setString(5, PrdtQty.getText());
                       pActHist.setString(6, Integer.toString(NewStock));
                       pActHist.setString(7, notes);
                       pActHist.executeUpdate();
                       pActHist.close();
                       
                       PrdtName.setText(""); 
                       PrdtQty.setText("");
                       PrdtPrice.setText("");
                       PrdtNotes.setText("");
                       
                       JOptionPane.showMessageDialog(this, "Purchase of "+SearchTxt+" recorded!");
                       ProductName.requestFocus();
                       loadprdtline();
                       loadacthistory();
                   }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Data entered incorrectly, Please try again!!");
            }
        }
    }//GEN-LAST:event_EditRecordActionPerformed

    //Populate search bar for the Product Line table
    private void CreateSearchBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CreateSearchBarFocusGained
        // TODO add your handling code here:
        
        if (CreateSearchBar.getText().equals("Enter Text to Search...")){
            CreateSearchBar.setText(null);
            CreateSearchBar.requestFocus();
            removeSearchbarplaceholder(CreateSearchBar);
        }
        
    }//GEN-LAST:event_CreateSearchBarFocusGained
    
    //Re-populate search bar after user finds what they're looking for
    private void CreateSearchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CreateSearchBarFocusLost
        // TODO add your handling code here:
        
        if(CreateSearchBar.getText().length() == 0){
            addSearchbarplaceholder (CreateSearchBar);
            CreateSearchBar.setText("Enter Text to Search...");
        }
        
    }//GEN-LAST:event_CreateSearchBarFocusLost

    //Search for products from the Product Line table
    private void CreateSearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CreateSearchBarKeyReleased
      
        DefaultTableModel df;
        int a;
        
        try {
            String SearchText = CreateSearchBar.getText()+"%";
            pst = con.prepareStatement("select * from prdtline WHERE ProductName LIKE '"+SearchText+"'");
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel)PrdtLine.getModel();
            df.setRowCount(0);
            
            while (rs.next()){
                Vector v2 = new Vector();
                for(int i=1; i<=a; i++ ){
                    v2.add(rs.getString("ProductID"));
                    v2.add(rs.getString("ProductName"));
                    v2.add(rs.getString("CurrentStock"));
                    v2.add(rs.getString("Price"));
                    
                }  
                df.addRow(v2);     
            }      
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_CreateSearchBarKeyReleased

    //Populate search bar for the Activity History table
    private void EditSearchBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditSearchBarFocusGained
        // TODO add your handling code here:
         if (EditSearchBar.getText().equals("Enter Text to Search...")){
            EditSearchBar.setText(null);
            EditSearchBar.requestFocus();
            removeSearchbarplaceholder(EditSearchBar);
        }
    }//GEN-LAST:event_EditSearchBarFocusGained

    //Re-populate search bar after user finds what they're looking for
    private void EditSearchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditSearchBarFocusLost
        // TODO add your handling code here:
        if(EditSearchBar.getText().length() == 0){
            addSearchbarplaceholder (EditSearchBar);
            EditSearchBar.setText("Enter Text to Search...");
        }
    }//GEN-LAST:event_EditSearchBarFocusLost

    //Search for products from the Activity History table
    private void EditSearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EditSearchBarKeyReleased
       DefaultTableModel df;
        int a;
        
        try {
            String SearchText = EditSearchBar.getText()+"%";
            psthist = con.prepareStatement("select * from acthistory WHERE PrdtName LIKE '"+SearchText+"'");
            ResultSet rs = psthist.executeQuery();
            
            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel)ActHistory.getModel();
            df.setRowCount(0);
            
            while (rs.next()){
                Vector v2 = new Vector();
                for(int i=1; i<=a; i++ ){
                    v2.add(rs.getString("Status"));
                    v2.add(rs.getString("PrdtName"));
                    v2.add(rs.getString("PrdtPrice"));
                    v2.add(rs.getString("QtyEntered"));
                    v2.add(rs.getString("QtyIn"));
                    v2.add(rs.getString("QtyOut"));
                    v2.add(rs.getString("Notes"));
                    v2.add(rs.getString("TimeStamp"));
                }  
                df.addRow(v2);     
            }      
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EditSearchBarKeyReleased

    //Button to print Activity History table
    private void EditPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPrintActionPerformed
        
       MessageFormat header = new MessageFormat("Print Page");
       MessageFormat footer = new MessageFormat("Page (0, number, integer");
       
       try{
           ActHistory.print(JTable.PrintMode.NORMAL,header,footer);
       }catch(PrinterException e){
           JOptionPane.showMessageDialog(null, e);
       }
        
    }//GEN-LAST:event_EditPrintActionPerformed

    private void EnterEditPrdtLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EnterEditPrdtLabelFocusGained
        // TODO add your handling code here:
        CreateRecord.setEnabled(true);
        CurrentStock.setEditable(true);
    }//GEN-LAST:event_EnterEditPrdtLabelFocusGained

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://downloadprdtline.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ActHistory;
    private javax.swing.JScrollPane ActHistoryScrollPane;
    private javax.swing.JPanel AppPanel;
    private javax.swing.JScrollPane AppScrollPane;
    private javax.swing.JLabel CreateID;
    private javax.swing.JLabel CreateNameLabel;
    private javax.swing.JPanel CreatePrdtPanel;
    private javax.swing.JLabel CreatePrdtTitle;
    private javax.swing.JLabel CreatePriceLabel;
    private javax.swing.JLabel CreateQtyLabel;
    private javax.swing.JButton CreateRecord;
    private javax.swing.JTextField CreateSearchBar;
    private javax.swing.JButton CreateUpdate;
    private javax.swing.JTextField CurrentStock;
    private javax.swing.JLabel EditNameLabel;
    private javax.swing.JLabel EditNameLabel3;
    private javax.swing.JLabel EditNotesLabel;
    private javax.swing.JPanel EditPrdtPanel;
    private javax.swing.JLabel EditPriceLabel;
    private javax.swing.JButton EditPrint;
    private javax.swing.JLabel EditQtyLabel;
    private javax.swing.JButton EditRecord;
    private javax.swing.JTextField EditSearchBar;
    private javax.swing.JLabel EditTitleLabel;
    private javax.swing.JPanel EnterCreatePrdt;
    private javax.swing.JPanel EnterEditPrdtLabel;
    private javax.swing.JComboBox<String> PrdtAction;
    private javax.swing.JTable PrdtLine;
    private javax.swing.JScrollPane PrdtLineScrollPane;
    private javax.swing.JTextField PrdtName;
    private javax.swing.JTextArea PrdtNotes;
    private javax.swing.JTextField PrdtPrice;
    private javax.swing.JTextField PrdtQty;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField ProductID;
    private javax.swing.JLabel ProductIDWarningLabel;
    private javax.swing.JTextField ProductName;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

