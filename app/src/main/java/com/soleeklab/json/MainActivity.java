package com.soleeklab.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.soleeklab.json.model.Data;

public class MainActivity extends AppCompatActivity {
    String json = "{\n" +
            "\t\"ReportTitle\": \"SO Thermal Report\",\n" +
            "\t\"HeaderImage\": \"data:image/Bmp;base64,iVBORw0KGgoAAAANSUhEUgAAAHIAAABSCAIAAAAHExccAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAAD2SURBVHhe7doxDQJBEEDRBb8YgBoMYAIM4GZNYABIDgn3k7vkvWYnW/5iqjl83oPVHf8vq5I1IWtC1oSsCVkTsiZkTciakDUha0LWhKwJWROyJmRNyJqQNSFrQtaErAlZE7ImZE3ImpA1IWtC1oSsCVkTsiZ2ed/6fD3mnL/hfLosP1uzy6y3+3WzQReusRN2a0LWhKwJWROyJmRNyJqQNSFrQtaErAlZE7ImZE3ImpA1IWtC1oSsCVkTsiZkTciakDUha0LWhKwJWROyJmRNyJqQNSFrQtaErAlZE7ImZE3ImpA1IWtC1oSsCVkTsiZkTcgaGOMLLGgRZbNTfbMAAAAASUVORK5CYII=\\\"\",\n" +
            "\t\"HeaderImageAlign\": \"2\",\n" +
            "\t\"HeaderText\": \"header test text\",\n" +
            "\t\"HeaderTextAlign\": \"1\",\n" +
            "\t\"Header\": {\n" +
            "\t\t\"WarehouseTitle\": \"Warehouse :\",\n" +
            "\t\t\"WarehouseValue\": \"Zayed\",\n" +
            "\t\t\"SalesPersonTitle\": \"Sales Person:\",\n" +
            "\t\t\"SalesPersonValue\": \"Adel Zaki\",\n" +
            "\t\t\"CustomerTitle\": \"Customer :\",\n" +
            "\t\t\"CustomerValue\": \"a\",\n" +
            "\t\t\"MobileTitle\": \"Mobile\",\n" +
            "\t\t\"MobileValue\": \"\",\n" +
            "\t\t\"DateTitle\": \"Date :\",\n" +
            "\t\t\"DateValue\": \"13-03-2018\",\n" +
            "\t\t\"TimeTitle\": \"Time :\",\n" +
            "\t\t\"TimeValue\": \"14:45\",\n" +
            "\t\t\"OrderCodeTitle\": \"Order Code :\",\n" +
            "\t\t\"OrderCodeValue\": \"SO-1-11084\",\n" +
            "\t\t\"NotesTitle\": \"Notes\",\n" +
            "\t\t\"NotesValue\": \"\",\n" +
            "\t\t\"ShippingConditionsTitle\": \"Shipping Conditions\",\n" +
            "\t\t\"ShippingConditionsValue\": \"\"\n" +
            "\t},\n" +
            "\t\"Details\": {\n" +
            "\t\t\"Titles\": {\n" +
            "\t\t\t\"SR\": \"SR#\",\n" +
            "\t\t\t\"Description\": \"Description\",\n" +
            "\t\t\t\"QTY\": \"Qty\",\n" +
            "\t\t\t\"Price\": \"Price\",\n" +
            "\t\t\t\"Total\": \"Total\"\n" +
            "\t\t},\n" +
            "\t\t\"Values\": [{\n" +
            "\t\t\t\"SR\": \"1\",\n" +
            "\t\t\t\"Description\": \"10005-10005-10005-����� �������\",\n" +
            "\t\t\t\"SerialsNo\": [\"sn123\", \"2n345\"],\n" +
            "\t\t\t\"QTY\": \"2\",\n" +
            "\t\t\t\"Price\": \"14\",\n" +
            "\t\t\t\"ItemSubTotal\": \"28\"\n" +
            "\t\t},{\n" +
            "\t\t\t\"SR\": \"1\",\n" +
            "\t\t\t\"Description\": \"10005-10005-10005-����� �������\",\n" +
            "\t\t\t\"SerialsNo\": [\"sn123\", \"2n345\"],\n" +
            "\t\t\t\"QTY\": \"2\",\n" +
            "\t\t\t\"Price\": \"14\",\n" +
            "\t\t\t\"ItemSubTotal\": \"28\"\n" +
            "\t\t},{\n" +
            "\t\t\t\"SR\": \"1\",\n" +
            "\t\t\t\"Description\": \"10005-10005-10005-����� �������\",\n" +
            "\t\t\t\"SerialsNo\": [\"sn123\", \"2n345\"],\n" +
            "\t\t\t\"QTY\": \"2\",\n" +
            "\t\t\t\"Price\": \"14\",\n" +
            "\t\t\t\"ItemSubTotal\": \"28\"\n" +
            "\t\t},{\n" +
            "\t\t\t\"SR\": \"1\",\n" +
            "\t\t\t\"Description\": \"10005-10005-10005-����� �������\",\n" +
            "\t\t\t\"SerialsNo\": [\"sn123\", \"2n345\"],\n" +
            "\t\t\t\"QTY\": \"2\",\n" +
            "\t\t\t\"Price\": \"14\",\n" +
            "\t\t\t\"ItemSubTotal\": \"28\"\n" +
            "\t\t}]\n" +
            "\t},\n" +
            "\t\"ItemsCountTitle\": \"Items Count\",\n" +
            "\t\"ItemsCountValue\": \"2\",\n" +
            "\t\"TotalTitle\": \"Total\",\n" +
            "\t\"TotalValue\": \"28\",\n" +
            "\t\"DiscountRateTitle\": \"Discount Rate\",\n" +
            "\t\"DiscountRateValue\": \"2\",\n" +
            "\t\"DiscountTitle\": \"\",\n" +
            "\t\"DiscountValue\": \"\",\n" +
            "\t\"TotalItemsDiscountsTitle\": \"Items Discounts:\",\n" +
            "\t\"TotalItemsDiscountsValue\": \"10\",\n" +
            "\t\"SubTotalTitle\": \"SubTotal\",\n" +
            "\t\"SubTotalValue\": \"17.64\",\n" +
            "\t\"VATTitle\": \"VAT\",\n" +
            "\t\"VatValue\": \"2.47\",\n" +
            "\t\"AddedTaxTitle\": \"\",\n" +
            "\t\"AddedTaxValue\": \"\",\n" +
            "\t\"NetTotalTitle\": \"NetTotal\",\n" +
            "\t\"NetTotalValue\": \"20.11\",\n" +
            "\t\"PaidTitle\": \"\",\n" +
            "\t\"PaidValue\": \"\",\n" +
            "\t\"ChangeTitle\": \"\",\n" +
            "\t\"ChangeValue\": \"\",\n" +
            "\t\"FooterImage\": \"data:image/Bmp;base64,iVBORw0KGgoAAAANSUhEUgAAAHIAAABSCAIAAAAHExccAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAAD4SURBVHhe7dqxDcJAEABBQ0AriKYohASRUAgZRbkREuPgS/BKtjSjk16XbnDRn5bndWJr5/GyKVkTsiZkTciakDUha0LWhKwJWROyJmRNyJqQNSFrQtaErAlZE7ImZE3ImpA1IWtC1oSsCVkTsiZkTciakDUha+KQWb+31/tyX2fs+3PIrPM8P36fdca+P35jJ9zWhKwJWROyJmRNyJqQNSFrQtaErAlZE7ImZE3ImpA1IWtC1oSsCVkTsiZkTciakDUha0LWhKwJWROyJmRNyJqQNSFrQtaErAlZE7ImZE3ImpA1IWtC1oSsCVkTsiZkTciakDUwTX/35g3X32eGqQAAAABJRU5ErkJggg==\\\"\",\n" +
            "\t\"FooterImageAlign\": \"1\",\n" +
            "\t\"FooterText\": \"footer test text\",\n" +
            "\t\"FooterTextAlign\": \"1\",\n" +
            "\t\"Barcode\": \"SO-1-11084\"\n" +
            "}";
    TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        Data data = Data.fromJson(json);
        textView.setText(data.getDetails().getValues().get(0).getDescription());
    }
}
