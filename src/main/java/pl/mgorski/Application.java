package pl.mgorski;

import org.apache.commons.lang3.StringUtils;

public class Application {

    public static void main(String[] args) {
        // capitalize function invoked only to test dependencies support: any additional jar
        System.out.println(StringUtils.capitalize("hello World!"));
    }

}
