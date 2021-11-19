package Level_3.lvl_3_task_6;

import java.util.HashMap;
import java.util.Map;

public class RealBean {
    protected final int id;
    protected final String name;

    protected Map<String, Object> additionalMap = new HashMap<>();

    @JsonCreator
    public RealBean(@JsonProperty("id") int id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalMap() {
        return additionalMap;
    }

    @JsonAnySetter
    public void setAdditionalMap(String name, Object value) {
        additionalMap.put(name, value);
    }
}
