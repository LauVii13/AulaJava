package model;

public class Prod {
    private int id;
    private String style;
    private String autor;
    private double sizeX;
    private double sizeY;

    public Prod(int id, String style, String autor, double sizeX, double sizeY) {
        this.id = id;
        this.style = style;
        this.autor = autor;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    
    public Prod() {
        this.id = 0;
        this.style = "";
        this.autor = "";
        this.sizeX = 0;
        this.sizeY = 0;
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
}
