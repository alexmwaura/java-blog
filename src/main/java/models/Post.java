package models;

import java.util.ArrayList;

public class Post {
    private static ArrayList<Post> instances = new ArrayList<>();
    private String content;
    public Post(String content){
        this.content = content;
        instances.add(this);
    }
    public String getContent(){
        return content;
    }
    public static ArrayList<Post> getAll(){
        return instances;
    }
    public static void clearAllPost(){
        instances.clear();
    }
}
