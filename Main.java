import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String hexInput;
        int i = 0;
        int hexLength;
        long decOutput = 0;
        long decPart;

        System.out.print("Enter a hexadecimal number: ");
        hexInput = input.nextLine();

        if (hexInput.substring(0,2).equals("0x")) { //eliminates the )0x if it is typed
            hexInput = hexInput.substring(2); //returns the rest of hexinput after the 0x
        }

        hexLength = hexInput.length();


        while (i < hexInput.length()) {
            char loopChar = hexInput.charAt(hexLength - 1); // this returns the character that we will be working with

            if (loopChar == 'A' || loopChar == 'a') { // if the letter is upper or lowercase
                decPart = 10;
            }
            else if (loopChar == 'B' || loopChar == 'b') {
                decPart = 11;
            }
            else if (loopChar == 'C' || loopChar == 'c') {
                decPart = 12;
            }
            else if (loopChar == 'D' || loopChar == 'd') {
                decPart = 13;
            }
            else if (loopChar == 'E' || loopChar == 'e') {
                decPart = 14;
            }
            else if (loopChar == 'F' || loopChar == 'f') {
                decPart = 15;
            }
            else {
                decPart = Character.getNumericValue(loopChar);
            }
            decPart = (decPart * (int) Math.pow(16, i)); // this returns the number that we will add to the end decimal number
            decOutput += decPart;

            hexLength--;
            i++;

        }


        System.out.println("Your number is " + decOutput + " in decimal");
    }

}
