public class Order {
    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }

        String[] wordsArr = words.split(" ");
        String[] result = new String[wordsArr.length];
        for (String word : wordsArr) {
            int index = Integer.parseInt(word.replaceAll("\\D", "")) - 1;
            result[index] = word;
        }
        return String.join(" ", result);
    }
}