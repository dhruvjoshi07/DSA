package strings;
//string comparison ,"aaabbcccdd" se bnta="a3b2c33d2"
public class g {
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            // Check if next character is same as current
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Agar character badal gaya ya string khatam ho gayi
                sb.append(str.charAt(i));
                sb.append(count);
                count = 1; // Reset count for next character
            }
        }

        System.out.println("Compressed String: " + sb.toString());
    }
}

