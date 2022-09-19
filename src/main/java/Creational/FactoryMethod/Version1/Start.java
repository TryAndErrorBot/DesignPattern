package Creational.FactoryMethod.Version1;

import Creational.FactoryMethod.Version1.Button.IButton;
import Creational.FactoryMethod.Version1.Dialog.IDialog;
import Creational.FactoryMethod.Version1.Dialog.WebDialog;
import Creational.FactoryMethod.Version1.Dialog.WindowsDialog;

public class Start {
    public static void main(String[] args) {
        IDialog windowsDialog = new WindowsDialog();
        IDialog webDialog = new WebDialog();



        IButton buttonOne = windowsDialog.createButton();
        IButton buttonTwo = webDialog.createButton();

        System.out.println(buttonTwo.printButton());
        System.out.println(buttonOne.printButton());
    }
}
