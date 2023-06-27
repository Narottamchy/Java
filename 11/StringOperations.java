public class StringOperations {
    private String string;
    public StringOperations(String string) {
        this.string = string;
    }
    public boolean isEqual(String otherString) {
        return this.string.equals(otherString);
    }
    public String reverseString() {
        return new StringBuilder(this.string).reverse().toString();
    }
    public String changeCase() {
        char[] chars = this.string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
    // Testing the StringOperations class
    public static void main(String[] args) {
        StringOperations string1 = new StringOperations("Hello World!");
        StringOperations string2 = new StringOperations("hello world!");
        StringOperations string3 = new StringOperations("dlroW olleH");

        System.out.println(string1.isEqual(string2.string));
        System.out.println(string1.reverseString());
        System.out.println(string1.changeCase());

        System.out.println(string2.isEqual(string3.string));
        System.out.println(string2.reverseString());
        System.out.println(string2.changeCase());
    }
}