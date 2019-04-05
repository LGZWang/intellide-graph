package cn.edu.pku.sei.intellide.graph.qa.nl_query.mapping;

import lombok.Getter;
import lombok.Setter;
import org.json.JSONException;
import org.json.JSONObject;

@Getter
@Setter
public class Atom {

    public static final String CLASS = "Class";
    public static final String METHOD = "Method";
    public static final String INTERFACE = "Interface";


    public static final String EXTEND = "extend";
    public static final String IMPLEMENT = "implement";
    public static final String HAVE_METHOD = "haveMethod";
    public static final String CALL = "call";

    public static final String JOIN = "join";
    public static final String AND = "and";
    public static final String OR = "or";

    protected String name;
    protected String type;
    protected int order;


    public boolean isUnary(){
        return false;
    }
    public boolean isBinary(){
        return false;
    }
    public boolean isOperation(){
        return false;
    }

    @Override
    public String toString(){
        return String.format("{%s}:{%s}", name, type);
    }


}
