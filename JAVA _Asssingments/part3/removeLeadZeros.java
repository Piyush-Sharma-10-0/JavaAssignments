public class removeLeadZeros {
    public static void main(String[] args) {
        String str = "000001230569";
        // using reg ex to remove leading zeros
        str = str.replaceAll("^0+", "");
        System.out.println(str);
    }
}
