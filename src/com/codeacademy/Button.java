package com.codeacademy;

public class Button {
    private Long id;
    private String label;

    public Button() {
    }

    public String trigger() {
        return getLabel().concat(" is being clicked! Its ID: ") + getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
