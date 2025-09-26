import org.apache.commons.codec.binary.Base64;
public class Base64Example {
    public static void main(String[] args) {
        String encodedString = "This is Base64 encoding and decoding example";
        Base64 base64 = new Base64();
        String encodedVersion = new
                String(base64.encode(encodedString.getBytes()));
        System.out.println("Encoded Version is " + encodedVersion);
    //Encrypted String
        String decodedVersion = new
                String(base64.decode(encodedVersion.getBytes()));
        System.out.println("Decoded version is "+ decodedVersion);
    }
}