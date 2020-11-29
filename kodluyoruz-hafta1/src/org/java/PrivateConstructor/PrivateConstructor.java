package org.java.PrivateConstructor;

public class PrivateConstructor {

    String isim = new String();

    private PrivateConstructor() {

        System.out.println("Constructor olusturuldu.");
    }

    public PrivateConstructor(String isim){
        this.isim=isim;
        System.out.println(isim);
    }
}
