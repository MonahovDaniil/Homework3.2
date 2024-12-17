import java.util.ArrayList;
import java.util.Collections;
class StringArray {
    private ArrayList<String> strings;

    public StringArray() {
        strings = new ArrayList<>();
    }

    public void add(String string) {
        strings.add(string);
        Collections.sort(strings, (a, b) -> Integer.compare(a.length(), b.length()));
    }

    public String getMaxLengthString() {
        if (strings.isEmpty()) {
            return null;
        }
        String maxString = strings.get(0);
        for (String str : strings) {
            if (str.length() > maxString.length()) {
                maxString = str;
            }
        }
        return maxString;
    }

    public double getAverageLength() {
        if (strings.isEmpty()) {
            return 0;
        }
        int totalLength = 0;
        for (String str : strings) {
            totalLength += str.length();
        }
        return (double) totalLength / strings.size();
    }
}
