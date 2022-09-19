package Creational.FactoryMethod.Version0.OS;

import Creational.FactoryMethod.Version0.Package.InstallPackage;

public interface OS {
    //Factory Method
    public InstallPackage getPackageExtension();
}
