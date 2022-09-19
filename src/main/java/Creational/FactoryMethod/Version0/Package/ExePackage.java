package Creational.FactoryMethod.Version0.Package;

public class ExePackage implements InstallPackage {

    @Override
    public String getExtension() {
        return ".exe";
    }
}
