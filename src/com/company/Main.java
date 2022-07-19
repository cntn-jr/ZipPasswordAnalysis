package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ZipAttack securityHole = new SecurityHoleAttack();
        ZipAttack roundRobinNum = new RoundRobinNumberAttack();
        ZipAttack dictionary = new DictionaryAttack();
        ZipAttack filenameAt = new FileNameAttack();
        ZipAttack roundRobin = new RoundRobinAttack();

        filenameAt.setNext(securityHole).setNext(dictionary).setNext(roundRobinNum).setNext(roundRobin);

        String filename;
        String pass;
        int version;

        do {

            System.out.print("ファイル名を入力してください。: ");
            Scanner scan = new Scanner(System.in);
            filename = scan.nextLine();

            System.out.print("パスワードを入力してください。: ");
            scan = new Scanner(System.in);
            pass = scan.nextLine();

            System.out.print("バージョンを入力してください。: ");
            scan = new Scanner(System.in);
            version = Integer.parseInt(scan.nextLine());

            ZipFile zipfile = new ZipFile(filename, pass, version);

            filenameAt.attack(zipfile);



            System.out.println("---------------------------------");

        }while( filename.length() != 0 );
    }
}
