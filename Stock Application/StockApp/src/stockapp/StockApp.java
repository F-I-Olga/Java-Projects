package stockapp;

/**
 *
 * @author Olga Ingabire
 */
public class StockApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Main data = new Main();
        data.setVisible(true);
    }
    
}


/**
 * For new products use if condition like:
 * pst = con.prepareStatement("select form prdtline(ProductName)values");
 * pst.setString(1, PName); //PName is the Java-to-SQL text variable for ProductName
            
        
 **/