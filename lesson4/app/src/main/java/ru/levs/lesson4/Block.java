package ru.levs.lesson4;

import java.util.ArrayList;
import java.util.List;

public class Block {

    public int image;
    public String textTitle;
    public String textNotify;

    public Block(int image, String textTitle, String textNotify){
        this.image = image;
        this.textTitle = textTitle;
        this.textNotify = textNotify;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTextTitle(String textTitle) {
        this.textTitle = textTitle;
    }

    public void setTextNotify(String textNotify) {
        this.textNotify = textNotify;
    }

    public int getImage() {
        return this.image;
    }

    public String getTextTitle() {
        return this.textTitle;
    }

    public String getTextNotify() {
        return this.textNotify;
    }
}
