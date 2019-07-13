import COM.bank.app.Printer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();

        int i=0;
        while(i != -1) {
            i = printer.reader();
        }
    }
}
