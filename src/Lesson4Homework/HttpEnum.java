package Lesson4Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HttpEnum {

    public enum HttpErrors {BadRequest, Unauthorized, PaymentRequired, Forbidden, NotFound}

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your number of Http Error : ");
        int HttpError = Integer.parseInt(br.readLine());

        switch (HttpError) {
            case 400:
                System.out.println(HttpErrors.BadRequest);
                break;
            case 401:
                System.out.println(HttpErrors.Unauthorized);
                break;
            case 402:
                System.out.println(HttpErrors.PaymentRequired);
                break;
            case 403:
                System.out.println(HttpErrors.Forbidden);
                break;
            case 404:
                System.out.println(HttpErrors.NotFound);
                break;
            default:
                System.out.println("Such HttpError does not exist");

        }
    }
}
