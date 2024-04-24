import java.util.ArrayList;
        import java.util.List;

public class encodeDecode {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            encoded.append(s.length()).append('/').append(s);
        }
        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int slashIndex = s.indexOf('/', i);
            int length = Integer.parseInt(s.substring(i, slashIndex));
            decoded.add(s.substring(slashIndex + 1, slashIndex + 1 + length));
            i = slashIndex + 1 + length;
        }
        return decoded;
    }

    // Test the codec
    public static void main(String[] args) {
        encodeDecode codec = new encodeDecode();
        List<String> original = new ArrayList<>();
        original.add("hello");
        original.add("world");
        original.add("java");
        System.out.println("Original"+original);
        String encoded = codec.encode(original);
        System.out.println("Encoded: " + encoded);
        List<String> decoded = codec.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
