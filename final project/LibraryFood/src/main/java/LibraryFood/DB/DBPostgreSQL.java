package LibraryFood.DB;
import LibraryFood.Model.MilkModel;
import java.sql.*;

public class DBPostgreSQL extends DB
{

    private String url = "jdbc:postgresql://localhost:5432/foodbase";
    private String login = "postgres";
    private String password = "1";

    public DBPostgreSQL()
    {
        System.out.println("DB");
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, login, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM milktable");
            while (resultSet.next())
            {
                this.modelList.add(new MilkModel(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getFloat(3)));
            }
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public IDB showIDB()
    {
        return this;
    }
}
