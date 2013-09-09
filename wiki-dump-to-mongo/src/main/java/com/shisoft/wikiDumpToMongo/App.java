package com.shisoft.wikiDumpToMongo;


import java.util.Scanner;

public class App
{

    static String database;

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wiki-Dump-To-Mongo. Import Wikipedia Dump Files to MongoDB. Assist Module for WebFusion MK II");
        System.out.println("(C) 2013 Shisoft Corporation");
        System.out.println("You Need To Put Uncompressed Data Files In Home Path To Continue. We Will Search And Import Automatically.");
        System.out.print("Tell me where is the database:");
        database = sc.next();
        System.out.println("Searching for XML and SQL files...");

    }
}
