/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouv.model;

public class TShirt {

    private Color color;
    private Size size;
    private Fabric fabric;

    public TShirt(Color color, Size size, Fabric fabric) {
        this.color = color;
        this.size = size;
        this.fabric = fabric;
    }

    public TShirt() {
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public int getCi() {
        return this.color.ordinal();
    }

    public int getFi() {
        return this.fabric.ordinal();
    }

    public int getSi() {
        return this.size.ordinal();
    }

    @Override
    public String toString() {
        return "TShirt{" + "size=" + size + ", color=" + color + ", fabric=" + fabric + '}';
    }

    public TShirt tShirtGenerator() {
        TShirt tShirt = new TShirt();
        tShirt.setColor(Color.genRandomColor());
        tShirt.setFabric(Fabric.genRandomFabric());
        tShirt.setSize(Size.genRandomSize());

        return tShirt;
    }

}
