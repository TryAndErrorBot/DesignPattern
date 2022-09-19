package Creational.FactoryMethod.Version0.Package;

public class DebPackage implements InstallPackage {

    @Override
    public String getExtension() {
        return ".deb";
    }
}
