package Creational.FactoryMethod.Version0.OS;

import Creational.FactoryMethod.Version0.Package.ExePackage;
import Creational.FactoryMethod.Version0.Package.InstallPackage;

public class Windows implements OS{

    @Override
    public InstallPackage getPackageExtension() {
        //Erzeuge ExePackage
        return new ExePackage();
    }
}
