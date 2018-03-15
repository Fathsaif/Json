
package com.soleeklab.json.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Value implements Serializable
{

    @SerializedName("SR")
    private String sR;
    @SerializedName("Description")
    private String description;
    @SerializedName("SerialsNo")
    private List<String> serialsNo = null;
    @SerializedName("QTY")
    private String qTY;
    @SerializedName("Price")
    private String price;
    @SerializedName("ItemSubTotal")

    private String itemSubTotal;
    private final static long serialVersionUID = -7717164680812200777L;

    public String getSR() {
        return sR;
    }

    public void setSR(String sR) {
        this.sR = sR;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getSerialsNo() {
        return serialsNo;
    }

    public void setSerialsNo(List<String> serialsNo) {
        this.serialsNo = serialsNo;
    }

    public String getQTY() {
        return qTY;
    }

    public void setQTY(String qTY) {
        this.qTY = qTY;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getItemSubTotal() {
        return itemSubTotal;
    }

    public void setItemSubTotal(String itemSubTotal) {
        this.itemSubTotal = itemSubTotal;
    }

}
