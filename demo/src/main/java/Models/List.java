package Models;

import java.util.ArrayList;


public class List {
    static List instance;
    private ArrayList<String> list = new ArrayList<>();
    public List(){
    }
    public static List getInstance() {
        if(instance == null){
            instance = new List();
        }
        return instance;
    }

    public ArrayList<String> getList() {
        return list;
    }
}
