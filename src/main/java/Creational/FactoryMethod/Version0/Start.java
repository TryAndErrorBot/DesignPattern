package Creational.FactoryMethod.Version0;

import Creational.FactoryMethod.Version0.OS.Linux;
import Creational.FactoryMethod.Version0.OS.OS;
import Creational.FactoryMethod.Version0.OS.Windows;

public class Start {
    public static void main(String[] args) {
        //Instanzen werden erzeugt
        OS windows = new Windows();
        OS linux = new Linux();

        //Factory Methoden werden erzeugt (nicht zugewiesen, aber geladen)
        System.out.println(windows.getPackageExtension().getExtension());
        System.out.println(linux.getPackageExtension().getExtension());

    }
}
