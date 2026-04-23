class NumberSystemConversion {
    public static void main(String[] args) {

        String binary = "1111";      
        String octal = "546";      
        String hex = "7F";           
        String decimal = "57"; 

        int decimalFromBinary = Integer.parseInt(binary, 2);
        int decimalFromOctal  = Integer.parseInt(octal, 8);
        int decimalFromHex    = Integer.parseInt(hex, 16);
        int decimalFromDecimal    = Integer.parseInt(decimal, 10);


        System.out.println("Binary to Decimal: " + decimalFromBinary);
        System.out.println("Octal to Decimal : " + decimalFromOctal);
        System.out.println("Hex to Decimal   : " + decimalFromHex);
        System.out.println("Decimal to Decimal   : " + decimalFromDecimal);

    }
}
