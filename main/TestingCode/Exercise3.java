package TestingCode;

public class Exercise3 {

    private static final String[] clusters = new String[]{"tr", "fl", "pl", "sn", "bl", "cr"};
    public static String spoonerize(String words) {
        String[] splitWords = words.split("\\s");
        String firstWord = splitWords[0];
        String firstWordPrefix = findPrefix(firstWord).toLowerCase();
        String firstWordStripped = firstWord.substring(firstWordPrefix.length());

        String secondWord = splitWords[1];
        String secondWordPrefix = findPrefix(secondWord);
        secondWordPrefix = secondWordPrefix.length() == 1 ? secondWordPrefix.toUpperCase() :
                secondWordPrefix.substring(0, 1).toUpperCase() + secondWordPrefix.substring(1);
        String secondWordStripped = secondWord.substring(secondWordPrefix.length());

        StringBuilder sb = new StringBuilder(words.length());
        sb.append(secondWordPrefix)
                .append(firstWordStripped)
                .append(" ")
                .append(firstWordPrefix)
                .append(secondWordStripped);


        return sb.toString();
    }


    private static String findPrefix(String word) {
        for (String cluster : clusters) {
            if (word.toLowerCase().startsWith(cluster)) {
                return cluster;
            }
        }

        return word.substring(0, 1);
    }

}
