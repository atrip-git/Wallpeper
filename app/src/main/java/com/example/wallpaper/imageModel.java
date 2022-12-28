package com.example.wallpaper;

public class imageModel {

    private urlModel src;

    public urlModel getSrc(){
        return src;
    }

    public void setSrc(urlModel src){
        this.src = src;
    }
    public imageModel(urlModel src){
        this.src = src;
    }
}
