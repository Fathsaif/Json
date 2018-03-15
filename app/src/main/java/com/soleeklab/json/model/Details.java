
package com.soleeklab.json.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Details implements Serializable
{
    @SerializedName("Titles")
    private Titles titles;
    @SerializedName("Values")
    private List<Value> values = null;
    private final static long serialVersionUID = 1640425417622770919L;

    public Titles getTitles() {
        return titles;
    }

    public void setTitles(Titles titles) {
        this.titles = titles;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

}
