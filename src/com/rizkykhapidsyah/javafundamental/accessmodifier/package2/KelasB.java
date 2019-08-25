package com.rizkykhapidsyah.javafundamental.accessmodifier.package2;

import com.rizkykhapidsyah.javafundamental.accessmodifier.package1.KelasA;

public class KelasB extends KelasA {
    @Override
    protected void methodC(){
        super.methodC();
        System.out.println("Contoh Pemanggilan Protected dari Package Luar");
    }
}
