package com.company;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;
import java.net.URISyntaxException;

public class JavaProgramToMakeYoutubeSearch {
    public static void main(String[] args) throws URISyntaxException, IOException {
        Scanner sc =new Scanner(System.in);
        System.out.println("What do you want to search(for searching two or more words use _ between two words) ");
        String search = sc.next();

        Desktop desk = Desktop.getDesktop();
        desk.browse(new URI("https://www.youtube.com/results?search_query=" + search ));

    }
}











