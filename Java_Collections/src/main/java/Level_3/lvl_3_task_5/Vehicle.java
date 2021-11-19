package Level_3.lvl_3_task_5;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = As.PROPERTY, property = "className")
public class Vehicle {
    protected String name;
    protected String owner;
    protected int age;
}
