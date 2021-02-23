package com.codeacademy;

public class PlaceHolder {

    private String label;

    public PlaceHolder(String label) {
        this.label = label;
    }

    public String getLabel() {
        // just a sample comment
        return label;
    }

    public void setLabelToNull() {
        label = null;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
