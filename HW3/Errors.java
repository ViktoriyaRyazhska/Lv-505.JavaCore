package HW3;

import javax.swing.plaf.ViewportUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Errors {
    public enum Error { HTTPError400("The server did not understand the request."),
        HTTPError401("The requested page needs a username and a password."),
        HTTPError402("You can not use this code yet.");

        public final String description;

        private Error(String description){
            this.description = description;
        }
    }
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        System.out.println("Enter an error code: ");
        String msg = br.readLine();
        switch (msg){
            case "400":
                System.out.println(Error.HTTPError400.description);
                break;
            case "401":
                System.out.println(Error.HTTPError401.description);
                break;
            case "402":
                System.out.println(Error.HTTPError402.description);
                break;
            default:
                System.out.println("Error not found in this tiny enum.");
        }
    }
}
