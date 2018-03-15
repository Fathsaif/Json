
package com.soleeklab.json.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Titles implements Serializable
{

    @SerializedName("SR")
    private String sR;
    @SerializedName("Description")
    private String description;
    @SerializedName("QTY")
    private String qTY;
    @SerializedName("Price")
    private String price;
    @SerializedName("Total")

    private String total;
    private final static long serialVersionUID = -6170538916584969624L;

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

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}
