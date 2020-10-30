package LibraryFood.DB;

import LibraryFood.Model.MilkModel;
import LibraryFood.Table.Table;

import java.util.ArrayList;
import java.util.List;

public abstract class DB implements IDB
{

    public List<MilkModel> modelList = new ArrayList<>();
    public List<Table> tableList = new ArrayList<>();

    public DB()
    {
    }

    public DB(List<MilkModel> modelList, List<Table> tableList)
    {
        this.modelList = modelList;
        this.tableList = tableList;
    }
}
