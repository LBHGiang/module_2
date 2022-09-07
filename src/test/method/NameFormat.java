package test.method;

public class NameFormat {
    public static String formatName(String name) {
        String[] arr = name.trim().toLowerCase().split("\\s+");
        StringBuilder newString = new StringBuilder();
        for (String str : arr
        ) {
            str = String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1) + " ";
            newString.append(str);
        }
        return newString.substring(0, newString.length() - 1);
    }
}
