package utils;

import java.util.HashMap;

public class TestData {

    public static HashMap<String, String> testData = new HashMap<>();

    public static void set(String key, String value) {
        testData.put(key, value);
        Log.logInfo("TC data stored -" + " Key: " + key + ", Value: " + value);
    }

    public static String get(String key) {
        Log.logInfo("TC data obtained -" + " Key: " + key + ", Value: " + testData.get(key));
        return testData.get(key);
    }

    public static Boolean containsKey(String key) {
        return testData.containsKey(key);
    }
}
