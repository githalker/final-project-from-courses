package LibraryFood.Model;

public class MilkModel implements IModel
{
    public int id;
    public String name;
    public float price;

    public MilkModel()
    {
    }

    public MilkModel(int id, String name, float price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getModel()
    {
        return "MilkModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
