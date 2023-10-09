import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.util.Map;
import java.util.HashMap;

public class DatabaseConnection {
    private Connection connection;
    private Statement statement;
    private String tableName = "im1";
    private String dbName = "mydatabase";
    private String url = "jdbc:mysql://localhost:3306/";
    private String username = "root"; 
    private String password = "";
    public Pair<Boolean, String> status;
    
    DatabaseConnection() {
        try {
            this.connection = DriverManager.getConnection(url + dbName, username, password);
            this.statement = connection.createStatement();

            createDatabase();
            if(checkTableExistence()){
                status = new Pair<>(true, "Database and table initialized successfully.");
            }else{
                status = new Pair<>(true, "Database initialized successfully.");
            }
            
        } catch (SQLException e) {
            status = new Pair<>(false, "Error initializing database and table: " + e.getMessage());
        }
    }
    
    private boolean checkTableExistence() throws SQLException {
        DatabaseMetaData meta = connection.getMetaData();
        ResultSet resultSet = meta.getTables(dbName, null, tableName, new String[]{"TABLE"});
        if (resultSet.next()) {
            return true;
        }
        return false;
    }    
    
    public boolean createDatabase() {
        boolean databaseCreated = false;
        try {
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getCatalogs();
            boolean databaseExists = false;
            while (resultSet.next()) {
                String databaseName = resultSet.getString(1);
                if (databaseName.equalsIgnoreCase(dbName)) {
                    databaseExists = true;
                    break;
                }
            }
            resultSet.close();

            if (!databaseExists) {
                statement.executeUpdate("CREATE DATABASE " + dbName);
                databaseCreated = true;
            }
        } catch (SQLException e) {
            System.out.println("Error creating database: " + e.getMessage());
        }
        return databaseCreated;
    }


    public void createTable() {
        try {
            connection.setCatalog(dbName);

            DatabaseMetaData dbMetaData = connection.getMetaData();
            ResultSet tableResultSet = dbMetaData.getTables(null, null, tableName, null);
            boolean tableExists = tableResultSet.next();
            tableResultSet.close();

            if (!tableExists) {
                String createTableSQL = "CREATE TABLE " + tableName + " (" +
                        "`id` INT NOT NULL AUTO_INCREMENT, " +
                        "`FirstName` VARCHAR(45) NOT NULL, " +
                        "`LastName` VARCHAR(45) NOT NULL, " +
                        "`Department` VARCHAR(45) NOT NULL, " +
                        "`Program` VARCHAR(45) NOT NULL, " +
                        "PRIMARY KEY (`id`));";
                statement.executeUpdate(createTableSQL);
            }
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }
    
    public DefaultTableModel getAllRecord(){
        String query = "SELECT * FROM "+tableName;
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID","First Name", "Last Name", "Department", "Program"});
        
        try{
            ResultSet result = statement.executeQuery(query);
            
            while(result.next()){
                int id = result.getInt("id");
                String firstName = result.getString("FirstName");
                String lastName = result.getString("LastName");
                String department = result.getString("Department");
                String program = result.getString("Program");
                
                model.addRow(new Object[]{id, firstName, lastName, department, program});
            }
            
            result.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return model;
    }
       
    public DefaultTableModel getOnlyNames(){
        String query = "SELECT FirstName,LastName FROM "+tableName;
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"First Name", "Last Name"});
        
        try{
            ResultSet result = statement.executeQuery(query);
            
            while(result.next()){
                String firstName = result.getString("FirstName");
                String lastName = result.getString("LastName");
                
                model.addRow(new Object[]{firstName, lastName});
            }
            
            result.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return model;
    }


    public DefaultTableModel getOnly(String col){
        String query = "SELECT "+col+" FROM "+tableName;
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{col});
        
        try{
            ResultSet result = statement.executeQuery(query);
            
            while(result.next()){
                model.addRow(new Object[]{result.getString(col)});
            }
            
            result.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return model;
    }     
    
    public int addRecord(String fname, String lname, String department, String program){
        int returnVal = 0;
        String query = "INSERT INTO "+tableName+" (FirstName, LastName, Department, Program) VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, fname);
            statement.setString(2, lname);
            statement.setString(3, department);
            statement.setString(4, program);
            
            returnVal = statement.executeUpdate();
            statement.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return returnVal;
    }
    
    public int updateCol(String new_f_name, int id, String column){
        int returnVal = 0;
        String query = "UPDATE "+tableName+" SET "+column+" = ? WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, new_f_name);
            preparedStatement.setInt(2, id);
            returnVal = preparedStatement.executeUpdate();
            
            preparedStatement.close();
        }catch(SQLException e){
            e.printStackTrace();
        } 
        return returnVal;
    }    
    
    public void resetTable(){
        String query = "TRUNCATE TABLE "+tableName;
        try{
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public int deleteRecord(String column,String val){
        int returnVal = 0;
        String query = "DELETE FROM "+tableName+" WHERE "+column+" = ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, val);
            
            returnVal = preparedStatement.executeUpdate();
            
            preparedStatement.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return returnVal;
    }    
    
    public int deleteRecordByID(int id){
        int returnVal = 0;
        String query = "DELETE FROM "+tableName+" WHERE id = ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            
            returnVal = preparedStatement.executeUpdate();
            
            preparedStatement.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return returnVal;
    }     
}

class Pair<A, B> {
    private A first;
    private B second;
    
    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }
    
    public A getFirst() {
        return first;
    }
    
    public B getSecond() {
        return second;
    }
}
