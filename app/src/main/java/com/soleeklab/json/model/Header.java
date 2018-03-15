
package com.soleeklab.json.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Header implements Serializable
{

    @SerializedName("WarehouseTitle")
    private String warehouseTitle;

    @SerializedName("WarehouseValue")
    private String warehouseValue;

    @SerializedName("SalesPersonTitle")
    private String salesPersonTitle;

    @SerializedName("SalesPersonValue")
    private String salesPersonValue;

    @SerializedName("CustomerTitle")
    private String customerTitle;

    @SerializedName("CustomerValue")
    private String customerValue;

    @SerializedName("MobileTitle")
    private String mobileTitle;

    @SerializedName("MobileValue")
    private String mobileValue;

    @SerializedName("DateTitle")
    private String dateTitle;

    @SerializedName("DateValue")
    private String dateValue;

    @SerializedName("TimeTitle")
    private String timeTitle;

    @SerializedName("TimeValue")
    private String timeValue;

    @SerializedName("OrderCodeTitle")
    private String orderCodeTitle;

    @SerializedName("OrderCodeValue")
    private String orderCodeValue;

    @SerializedName("NotesTitle")
    private String notesTitle;

    @SerializedName("NotesValue")
    private String notesValue;

    @SerializedName("ShippingConditionsTitle")
    private String shippingConditionsTitle;

    @SerializedName("ShippingConditionsValue")
    private String shippingConditionsValue;


    public Header(String warehouseTitle, String warehouseValue, String salesPersonTitle, String salesPersonValue, String customerTitle, String customerValue, String mobileTitle, String mobileValue, String dateTitle, String dateValue, String timeTitle, String timeValue, String orderCodeTitle, String orderCodeValue, String notesTitle, String notesValue, String shippingConditionsTitle, String shippingConditionsValue) {
        this.warehouseTitle = warehouseTitle;
        this.warehouseValue = warehouseValue;
        this.salesPersonTitle = salesPersonTitle;
        this.salesPersonValue = salesPersonValue;
        this.customerTitle = customerTitle;
        this.customerValue = customerValue;
        this.mobileTitle = mobileTitle;
        this.mobileValue = mobileValue;
        this.dateTitle = dateTitle;
        this.dateValue = dateValue;
        this.timeTitle = timeTitle;
        this.timeValue = timeValue;
        this.orderCodeTitle = orderCodeTitle;
        this.orderCodeValue = orderCodeValue;
        this.notesTitle = notesTitle;
        this.notesValue = notesValue;
        this.shippingConditionsTitle = shippingConditionsTitle;
        this.shippingConditionsValue = shippingConditionsValue;
    }

    public String getWarehouseTitle() {
        return warehouseTitle;
    }

    public void setWarehouseTitle(String warehouseTitle) {
        this.warehouseTitle = warehouseTitle;
    }

    public String getWarehouseValue() {
        return warehouseValue;
    }

    public void setWarehouseValue(String warehouseValue) {
        this.warehouseValue = warehouseValue;
    }

    public String getSalesPersonTitle() {
        return salesPersonTitle;
    }

    public void setSalesPersonTitle(String salesPersonTitle) {
        this.salesPersonTitle = salesPersonTitle;
    }

    public String getSalesPersonValue() {
        return salesPersonValue;
    }

    public void setSalesPersonValue(String salesPersonValue) {
        this.salesPersonValue = salesPersonValue;
    }

    public String getCustomerTitle() {
        return customerTitle;
    }

    public void setCustomerTitle(String customerTitle) {
        this.customerTitle = customerTitle;
    }

    public String getCustomerValue() {
        return customerValue;
    }

    public void setCustomerValue(String customerValue) {
        this.customerValue = customerValue;
    }

    public String getMobileTitle() {
        return mobileTitle;
    }

    public void setMobileTitle(String mobileTitle) {
        this.mobileTitle = mobileTitle;
    }

    public String getMobileValue() {
        return mobileValue;
    }

    public void setMobileValue(String mobileValue) {
        this.mobileValue = mobileValue;
    }

    public String getDateTitle() {
        return dateTitle;
    }

    public void setDateTitle(String dateTitle) {
        this.dateTitle = dateTitle;
    }

    public String getDateValue() {
        return dateValue;
    }

    public void setDateValue(String dateValue) {
        this.dateValue = dateValue;
    }

    public String getTimeTitle() {
        return timeTitle;
    }

    public void setTimeTitle(String timeTitle) {
        this.timeTitle = timeTitle;
    }

    public String getTimeValue() {
        return timeValue;
    }

    public void setTimeValue(String timeValue) {
        this.timeValue = timeValue;
    }

    public String getOrderCodeTitle() {
        return orderCodeTitle;
    }

    public void setOrderCodeTitle(String orderCodeTitle) {
        this.orderCodeTitle = orderCodeTitle;
    }

    public String getOrderCodeValue() {
        return orderCodeValue;
    }

    public void setOrderCodeValue(String orderCodeValue) {
        this.orderCodeValue = orderCodeValue;
    }

    public String getNotesTitle() {
        return notesTitle;
    }

    public void setNotesTitle(String notesTitle) {
        this.notesTitle = notesTitle;
    }

    public String getNotesValue() {
        return notesValue;
    }

    public void setNotesValue(String notesValue) {
        this.notesValue = notesValue;
    }

    public String getShippingConditionsTitle() {
        return shippingConditionsTitle;
    }

    public void setShippingConditionsTitle(String shippingConditionsTitle) {
        this.shippingConditionsTitle = shippingConditionsTitle;
    }

    public String getShippingConditionsValue() {
        return shippingConditionsValue;
    }

    public void setShippingConditionsValue(String shippingConditionsValue) {
        this.shippingConditionsValue = shippingConditionsValue;
    }

}
