package com.codeacademy.lecture11.exceptionExample;

class VaziuoklesIsskleidimoKlaida extends Exception {

    private String priezastis;

    public VaziuoklesIsskleidimoKlaida(String priezastis) {
        this.priezastis = priezastis;
    }

    public String getPriezastis() {
        return priezastis;
    }

    public void setPriezastis(String priezastis) {
        this.priezastis = priezastis;
    }
}
