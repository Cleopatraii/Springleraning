package network;

class messageBuilder {

    private static final char delimiter = ';';

    public static String build(Object... values) {
        StringBuilder outputString = new StringBuilder();
        for (Object i : values) {
            outputString.append(i);
            outputString.append(delimiter);
        }
        outputString = outputString.deleteCharAt(outputString.length()-1);
        return outputString.toString();
    }

    public static String[] split(String input) {
        return input.split(String.valueOf(delimiter));
    }
}
