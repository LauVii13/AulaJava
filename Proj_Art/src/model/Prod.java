package model;

public class Prod {
    private int id;
    private String style;
    private String autor;
    private double sizeX;
    private double sizeY;
    private String name;
    private double value;
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Prod(int id, String name, String style, String autor, String desc, double sizeX, double sizeY, double value) {
        this.id = id;
        this.name = name;
        this.style = style;
        this.autor = autor;
        this.desc = desc;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.value = value;
    }
    
    public Prod() {
        this.id = 0;
        this.name = "";
        this.style = "";
        this.autor = "";
        this.desc = "";
        this.sizeX = 0;
        this.sizeY = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getSizeX() {
        return sizeX;
    }

    public void setSizeX(double sizeX) {
        this.sizeX = sizeX;
    }

    public double getSizeY() {
        return sizeY;
    }

    public void setSizeY(double sizeY) {
        this.sizeY = sizeY;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
