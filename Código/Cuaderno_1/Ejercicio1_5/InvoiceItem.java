package Cuaderno_1.Ejercicio1_5;

public class InvoiceItem {
    private String id;
    private String desc;
    private  int qty;
    private double unitPrice;

    public InvoiceItem(String newId,String newdesc,int newqty,double newunitPrice){
        id=newId;
        desc=newdesc;
        qty=newqty;
        unitPrice=newunitPrice;
    }
    public String getId(){
        return id;
    }
    public String getDesc(){
        return desc;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int newqty){
        this.qty=newqty;

    }

    public double getUnitPrice(){

        return unitPrice;
    }
    public void setUnitPrice(double newUnitPrice){
        this.unitPrice=newUnitPrice;
    }

    public double getTotal(){
        return unitPrice*qty;
    }

    public String toString(){

        return "InvoiceItem[id=" + id + " desc=" + desc + " qty="+ qty + " unit price=" +unitPrice+"]";
    }
}
