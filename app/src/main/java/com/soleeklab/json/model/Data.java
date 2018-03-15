
package com.soleeklab.json.model;

import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data implements Serializable
{

    @SerializedName("ReportTitle")
    private String reportTitle;
    @SerializedName("HeaderImage")
    private String headerImage;
    @SerializedName("HeaderImageAlign")
    private String headerImageAlign;
    @SerializedName("HeaderText")
    private String headerText;
    @SerializedName("HeaderTextAlign")
    private String headerTextAlign;
    @SerializedName("Header")
    private Header header;
    @SerializedName("Details")
    private Details details;
    @SerializedName("ItemsCountTitle")
    private String itemsCountTitle;
    @SerializedName("ItemsCountValue")
    private String itemsCountValue;
    @SerializedName("TotalTitle")
    private String totalTitle;
    @SerializedName("TotalValue")
    private String totalValue;
    @SerializedName("DiscountRateTitle")
    private String discountRateTitle;
    @SerializedName("DiscountRateValue")
    private String discountRateValue;
    @SerializedName("DiscountTitle")

    private String discountTitle;
    @SerializedName("DiscountValue")

    private String discountValue;
    @SerializedName("TotalItemsDiscountsTitle")

    private String totalItemsDiscountsTitle;
    @SerializedName("TotalItemsDiscountsValue")

    private String totalItemsDiscountsValue;
    @SerializedName("SubTotalTitle")

    private String subTotalTitle;
    @SerializedName("SubTotalValue")

    private String subTotalValue;
    @SerializedName("VATTitle")

    private String vATTitle;
    @SerializedName("VatValue")

    private String vatValue;
    @SerializedName("AddedTaxTitle")

    private String addedTaxTitle;
    @SerializedName("AddedTaxValue")

    private String addedTaxValue;
    @SerializedName("NetTotalTitle")
    private String netTotalTitle;
    @SerializedName("NetTotalValue")

    private String netTotalValue;
    @SerializedName("PaidTitle")

    private String paidTitle;
    @SerializedName("PaidValue")

    private String paidValue;
    @SerializedName("ChangeTitle")

    private String changeTitle;
    @SerializedName("ChangeValue")

    private String changeValue;
    @SerializedName("FooterImage")

    private String footerImage;
    @SerializedName("FooterImageAlign")

    private String footerImageAlign;
    @SerializedName("FooterText")

    private String footerText;
    @SerializedName("FooterTextAlign")

    private String footerTextAlign;
    @SerializedName("Barcode")

    private String barcode;
    private final static long serialVersionUID = 3951546883457758739L;

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    public String getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(String headerImage) {
        this.headerImage = headerImage;
    }

    public String getHeaderImageAlign() {
        return headerImageAlign;
    }

    public void setHeaderImageAlign(String headerImageAlign) {
        this.headerImageAlign = headerImageAlign;
    }

    public String getHeaderText() {
        return headerText;
    }

    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    public String getHeaderTextAlign() {
        return headerTextAlign;
    }

    public void setHeaderTextAlign(String headerTextAlign) {
        this.headerTextAlign = headerTextAlign;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public String getItemsCountTitle() {
        return itemsCountTitle;
    }

    public void setItemsCountTitle(String itemsCountTitle) {
        this.itemsCountTitle = itemsCountTitle;
    }

    public String getItemsCountValue() {
        return itemsCountValue;
    }

    public void setItemsCountValue(String itemsCountValue) {
        this.itemsCountValue = itemsCountValue;
    }

    public String getTotalTitle() {
        return totalTitle;
    }

    public void setTotalTitle(String totalTitle) {
        this.totalTitle = totalTitle;
    }

    public String getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(String totalValue) {
        this.totalValue = totalValue;
    }

    public String getDiscountRateTitle() {
        return discountRateTitle;
    }

    public void setDiscountRateTitle(String discountRateTitle) {
        this.discountRateTitle = discountRateTitle;
    }

    public String getDiscountRateValue() {
        return discountRateValue;
    }

    public void setDiscountRateValue(String discountRateValue) {
        this.discountRateValue = discountRateValue;
    }

    public String getDiscountTitle() {
        return discountTitle;
    }

    public void setDiscountTitle(String discountTitle) {
        this.discountTitle = discountTitle;
    }

    public String getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(String discountValue) {
        this.discountValue = discountValue;
    }

    public String getTotalItemsDiscountsTitle() {
        return totalItemsDiscountsTitle;
    }

    public void setTotalItemsDiscountsTitle(String totalItemsDiscountsTitle) {
        this.totalItemsDiscountsTitle = totalItemsDiscountsTitle;
    }

    public String getTotalItemsDiscountsValue() {
        return totalItemsDiscountsValue;
    }

    public void setTotalItemsDiscountsValue(String totalItemsDiscountsValue) {
        this.totalItemsDiscountsValue = totalItemsDiscountsValue;
    }

    public String getSubTotalTitle() {
        return subTotalTitle;
    }

    public void setSubTotalTitle(String subTotalTitle) {
        this.subTotalTitle = subTotalTitle;
    }

    public String getSubTotalValue() {
        return subTotalValue;
    }

    public void setSubTotalValue(String subTotalValue) {
        this.subTotalValue = subTotalValue;
    }

    public String getVATTitle() {
        return vATTitle;
    }

    public void setVATTitle(String vATTitle) {
        this.vATTitle = vATTitle;
    }

    public String getVatValue() {
        return vatValue;
    }

    public void setVatValue(String vatValue) {
        this.vatValue = vatValue;
    }

    public String getAddedTaxTitle() {
        return addedTaxTitle;
    }

    public void setAddedTaxTitle(String addedTaxTitle) {
        this.addedTaxTitle = addedTaxTitle;
    }

    public String getAddedTaxValue() {
        return addedTaxValue;
    }

    public void setAddedTaxValue(String addedTaxValue) {
        this.addedTaxValue = addedTaxValue;
    }

    public String getNetTotalTitle() {
        return netTotalTitle;
    }

    public void setNetTotalTitle(String netTotalTitle) {
        this.netTotalTitle = netTotalTitle;
    }

    public String getNetTotalValue() {
        return netTotalValue;
    }

    public void setNetTotalValue(String netTotalValue) {
        this.netTotalValue = netTotalValue;
    }

    public String getPaidTitle() {
        return paidTitle;
    }

    public void setPaidTitle(String paidTitle) {
        this.paidTitle = paidTitle;
    }

    public String getPaidValue() {
        return paidValue;
    }

    public void setPaidValue(String paidValue) {
        this.paidValue = paidValue;
    }

    public String getChangeTitle() {
        return changeTitle;
    }

    public void setChangeTitle(String changeTitle) {
        this.changeTitle = changeTitle;
    }

    public String getChangeValue() {
        return changeValue;
    }

    public void setChangeValue(String changeValue) {
        this.changeValue = changeValue;
    }

    public String getFooterImage() {
        return footerImage;
    }

    public void setFooterImage(String footerImage) {
        this.footerImage = footerImage;
    }

    public String getFooterImageAlign() {
        return footerImageAlign;
    }

    public void setFooterImageAlign(String footerImageAlign) {
        this.footerImageAlign = footerImageAlign;
    }

    public String getFooterText() {
        return footerText;
    }

    public void setFooterText(String footerText) {
        this.footerText = footerText;
    }

    public String getFooterTextAlign() {
        return footerTextAlign;
    }

    public void setFooterTextAlign(String footerTextAlign) {
        this.footerTextAlign = footerTextAlign;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public static Data fromJson(String json){
        return new Gson().fromJson(json,Data.class);
    }
}
