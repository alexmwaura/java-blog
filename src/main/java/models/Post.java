package models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post {
    private static ArrayList<Post> instances = new ArrayList<>();
    private String content;
    private boolean published;
    private LocalDateTime createdAt;
    private int id;
    public Post(String content){
        this.content = content;
        this.published = false;
        this.createdAt = LocalDateTime.now();
        instances.add(this);
        this.id = instances.size();
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
    public boolean getPublished(){
        return published;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public int getId(){
        return id;
    }
    public static Post findById(int id) {
        return instances.get(id-1);
    }
}
