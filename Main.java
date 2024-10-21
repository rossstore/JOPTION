/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package joptionross;

import javax.swing.JOptionPane;

/**
 *
 * @author Student
 */
public class Main {
    private static int quantity;
    private static boolean check;
    private static char NotChoice;
    private static int Notcode;
    private static int code;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int transactions=0 ;
        while (true){
        int num1 = 60;
        int num2 = 50;
        int num3 = 10;
        int num4 = 15;
        int num5= 25;
        int quantiy= 0;
        double money= 0.0;
        double totalcost= 0.0;
        double price;
        String productname= "";
        
        
        JOptionPane.showMessageDialog(null, "welcome to ross bakeshop");

        while (true) {
          String menu= ("Please select item\n")
                    + "Product--------Price----Code\n"
                    + "Pork sisig      P60        1\n"
                    + "Kaldereta       P50        2\n"
                    + "Pastil          P10        3\n"
                    + "Coke            P15        4\n"
                    + "Ice Cream       P25        5\n";

           String CodeInput = JOptionPane.showInputDialog(menu + "\nEnter Item number (1-5):");
                double Code = 0;

                if (CodeInput != null && CodeInput.length() == 1) {
                    char NotCode = CodeInput.charAt(0);
                    if (NotCode >= '1' && NotChoice <= '5') {
                      code = Character.getNumericValue(NotCode);
    }
}
        if (Notcode == 1) {
                    JOptionPane.showMessageDialog(null, "Invalid choice! Please select a valid item (1-5).");
                    continue;
}
                String quantityInput = JOptionPane.showInputDialog("Enter the quantity:");
                quantity = 0;

                 if (quantityInput != null && quantityInput.length() > 0) {
                    boolean validQuantity = true;
                    for (int i = 0; i < quantityInput.length(); i++) {
                        if (!Character.isDigit(quantityInput.charAt(i))) {
                            validQuantity = false;
                            break;
}
    }
       if (validQuantity) {
           quantity = Integer.parseInt(quantityInput);
}
            }
                if (quantity <= 0) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid quantity (positive integer).");
                    continue;
    }
                 switch (code) {
                     case 1:
                    price = 60;
                    productname = "Pork Sisig";
                    check = true;
                    break;
                case 2:
                    price = 50;
                    productname = "Kaldereta";
                    check = true;
                    break;
                case 3:
                    price = 10;
                    productname = "Pastil";
                    check = true;
                    break;
                case 4:
                    price = 15;
                    productname = "Coke";
                    check = true;
                    break;
                case 5:
                    price = 25;
                    productname = "Ice Cream";
                    check = true;
                    break;
                 }

                 String moreItemsInput = JOptionPane.showInputDialog("Do you want to buy more items? (Y for Yes, N for No):");
                if (moreItemsInput != null && (moreItemsInput.equals("Y") || moreItemsInput.equals("N"))) {
                    Code = Integer.parseInt(moreItemsInput);
                    if (Code == 0) {
                        break;
}
    }else {
        JOptionPane.showMessageDialog(null, "Invalid input! Please enter Y for Yes or N for No.");

    }
                 JOptionPane.showMessageDialog(null, "Your total purchase is: P" + totalcost);

            int attempts = 3;
            boolean insufficientCash = false;

            for (int i = 0; i < attempts; i++) {
                String cashInput = JOptionPane.showInputDialog("Enter the amount of cash:");

                if (cashInput != null && cashInput.length() > 0) {
                    boolean sufficientCash = true;
                    for (int j = 0; j < cashInput.length(); j++) {
                        if (!Character.isDigit(cashInput.charAt(j)) && cashInput.charAt(j) != '.') {
                            sufficientCash = false;
                            break;
                        }
    }
                    if (sufficientCash) {
                        money = Double.parseDouble(cashInput);
                        if (money >= totalcost) {
                            sufficientCash = true;
                            break;
}
    }
}
            }



    }
}
    }
}
