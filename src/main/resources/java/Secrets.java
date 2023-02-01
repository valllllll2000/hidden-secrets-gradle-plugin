package YOUR_PACKAGE_GOES_HERE;

public class Secrets {

    // Method calls will be added by gradle task hideSecret
    // Example : native String getWellHiddenSecret(String packageName);

    static {
        System.loadLibrary("secrets");
    }
}