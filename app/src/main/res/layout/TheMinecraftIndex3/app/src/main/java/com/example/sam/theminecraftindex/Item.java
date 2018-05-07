package com.example.sam.theminecraftindex;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity(tableName = "items")
public class Item {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo (name = "name")
    private String name;

    @ColumnInfo(name = "craftable")
    private boolean craftable;

    @ColumnInfo(name = "tl")
    private int tl;

    @ColumnInfo(name = "tm")
    private int tm;

    @ColumnInfo(name = "tr")
    private int tr;

    @ColumnInfo(name = "ml")
    private int ml;

    @ColumnInfo(name = "mm")
    private int mm;

    @ColumnInfo(name = "mr")
    private int mr;

    @ColumnInfo(name = "bl")
    private int bl;

    @ColumnInfo(name = "bm")
    private int bm;

    @ColumnInfo(name = "br")
    private int br;


   //constructor


    public Item(int id, String name, boolean craftable, int tl, int tm, int tr, int ml, int mm, int mr, int bl, int bm, int br) {
        this.id = id;
        this.name = name;
        this.craftable = craftable;
        this.tl = tl;
        this.tm = tm;
        this.tr = tr;
        this.ml = ml;
        this.mm = mm;
        this.mr = mr;
        this.bl = bl;
        this.bm = bm;
        this.br = br;
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCraftable() {
        return craftable;
    }

    public void setCraftable(boolean craftable) {
        this.craftable = craftable;
    }

    public int getTl() {
        return tl;
    }

    public void setTl(int tl) {
        this.tl = tl;
    }

    public int getTm() {
        return tm;
    }

    public void setTm(int tm) {
        this.tm = tm;
    }

    public int getTr() {
        return tr;
    }

    public void setTr(int tr) {
        this.tr = tr;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getMr() {
        return mr;
    }

    public void setMr(int mr) {
        this.mr = mr;
    }

    public int getBl() {
        return bl;
    }

    public void setBl(int bl) {
        this.bl = bl;
    }

    public int getBm() {
        return bm;
    }

    public void setBm(int bm) {
        this.bm = bm;
    }

    public int getBr() {
        return br;
    }

    public void setBr(int br) {
        this.br = br;
    }
}
