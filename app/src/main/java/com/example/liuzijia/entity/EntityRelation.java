package com.example.liuzijia.entity;

public class EntityRelation {
    public String relation;
    public String url;
    public String label;
    public Boolean forward;
    public EntityRelation(){}
    public EntityRelation(String relation, String url, String label, Boolean forward) {
        this.relation = relation;
        this.url = url;
        this.label = label;
        this.forward = forward;
    }

    public String toString(){
        return relation + " " + label;
    }
}
