public interface size {
    static String Checker(String[] ChooserPossibilities) {

        String str = Main.input.next().toLowerCase();
        if (str.equals(ChooserPossibilities[0]) || str.equals(ChooserPossibilities[1])) {
            return capitalized(ChooserPossibilities[1]);
        } else if (str.equals(ChooserPossibilities[2]) || str.equals(ChooserPossibilities[3])) {
            return capitalized(ChooserPossibilities[3]);
        } else if (str.equals(ChooserPossibilities[4]) || str.equals(ChooserPossibilities[5])) {
            return capitalized(ChooserPossibilities[5]);
        } else if (str.equals(ChooserPossibilities[6]) || str.equals(ChooserPossibilities[7])) {
            return capitalized(ChooserPossibilities[7]);
        } else {
            System.out.println("Wrong input,please try again");
            return null;
        }
    }

    static String capitalized(String word) {
        String Word = word.substring(0, 1).toUpperCase();
        Word += word.substring(1).toLowerCase() + " ";
        return Word.trim();
    }

    static int noChecker(int noChecker) {
        if (noChecker > 9) {
            System.out.println();
            System.out.println("Do not play with my program >:(");
            System.out.println();
            return 0;
        } else if (noChecker <= 0) {
            System.out.println();
            System.out.println("nta keda rewsh e3ny :|");
            System.out.println();
            return 0;
        } else return noChecker;
    }


}
