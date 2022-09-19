package Creational.FactoryMethod.Version0.OS;

import Creational.FactoryMethod.Version0.Package.DebPackage;
import Creational.FactoryMethod.Version0.Package.InstallPackage;

public class Linux implements OS{
    @Override
    public InstallPackage getPackageExtension() {
        //Erzeuge DebPackage
        return new DebPackage();
    }
}
