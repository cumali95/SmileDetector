package com.example.smiledetector;

public class FaceDetectionModel {

    private int id;
    private String Text;

    public FaceDetectionModel(int id, String text) {
        this.id = id;
        Text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }
}
