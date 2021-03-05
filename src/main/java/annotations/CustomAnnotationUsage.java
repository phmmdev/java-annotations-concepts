package annotations;

public class CustomAnnotationUsage
{
    @CustomAnnotation(message = "custom message here", cost=10)
    private String type;
    private String item;

    @CustomAnnotation(cost=100)
    public CustomAnnotationUsage(String type, String item)
    {
        this.type = type;
        this.item = item;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getItem()
    {
        return item;
    }

    public void setItem(String item)
    {
        this.item = item;
    }
}
