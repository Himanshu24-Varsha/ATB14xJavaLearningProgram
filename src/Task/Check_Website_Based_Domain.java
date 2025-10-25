package Task;

import java.util.Scanner;

public class Check_Website_Based_Domain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter website url");
        String url = sc.nextLine();

        String websiteType = "";

        if (url.endsWith(".com")) {
            websiteType = "Commercial website";
        } else if (url.endsWith(".org")) {
            websiteType = "Non-profit organization";
        } else if (url.endsWith(".edu")) {
            websiteType = "Educational institution";
        } else if (url.endsWith(".gov")) {
            websiteType = "Government website";
        } else if (url.endsWith(".net")) {
            websiteType = "Network-related website";
        } else if (url.endsWith(".info")) {
            websiteType = "Informational website";
        } else {
            System.out.println("Unknown or other types of websites ");
            System.exit(0);
        }
        System.out.println("The website type is: " + websiteType);
    }
}
