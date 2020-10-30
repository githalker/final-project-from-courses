package LibraryFood.Controller;
import LibraryFood.DB.DBPostgreSQL;
import LibraryFood.Model.MilkModel;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Controller
public class Controller
{
    public static DBPostgreSQL dbPostgreSQL;
    public static List<MilkModel> milkList;

    static
    {
        dbPostgreSQL = new DBPostgreSQL();
        Controller.milkList = dbPostgreSQL.modelList;
}

    @GetMapping("/pagemilk")
    public String getMilk(Map<String, Object> model) throws Exception
    {
        model.put("milkList", milkList);
        return "pagemilk";
    }

}
