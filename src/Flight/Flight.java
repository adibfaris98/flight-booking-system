/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADIBFARIS
 */



public class Flight<T> {
        public static void main(String[] args) throws FileNotFoundException {
        Flight ayam = new Flight();
        ayam.booking();
        ayam.WriteFilemonday();

        ayam.ReadFilemonday();

    }

    Scanner input = new Scanner(System.in);
    String name1, passNo1, phone1;
    int status;
    public final int maxseat = 2;
    int flightNo = 7;
    String name, passportNo, phoneNo;

    int mondaypassenger = 0, tuesdaypassenger = 0, wednesdaypassenger = 0, thursdaypassenger = 0, fridaypassenger = 0, saturdaypassenger = 0, sundaypassenger = 0;

    ArrayList monName = new ArrayList(maxseat);
    ArrayList monPass = new ArrayList(maxseat);
    ArrayList monPhone = new ArrayList(maxseat);
    ArrayList monStat = new ArrayList(maxseat);
    MyQueue mondayName = new MyQueue(5);
    MyQueue mondayPass = new MyQueue(5);
    MyQueue mondayPhone = new MyQueue(5);
    MyQueue mondayStat = new MyQueue(5);

    ArrayList tuesPhone = new ArrayList(maxseat);
    ArrayList tuesName = new ArrayList(maxseat);
    ArrayList tuesPass = new ArrayList(maxseat);
    ArrayList tuesStat = new ArrayList(maxseat);
    MyQueue tuesdayName = new MyQueue(5);
    MyQueue tuesdayPass = new MyQueue(5);
    MyQueue tuesdayPhone = new MyQueue(5);
    MyQueue tuesdayStat = new MyQueue(5);

    ArrayList wedName = new ArrayList(maxseat);
    ArrayList wedPass = new ArrayList(maxseat);
    ArrayList wedPhone = new ArrayList(maxseat);
    ArrayList wedStat = new ArrayList(maxseat);
    MyQueue wednesdayName = new MyQueue(5);
    MyQueue wednesdayPass = new MyQueue(5);
    MyQueue wednesdayPhone = new MyQueue(5);
    MyQueue wednesdayStat = new MyQueue(5);

    ArrayList thursName = new ArrayList(maxseat);
    ArrayList thursPass = new ArrayList(maxseat);
    ArrayList thursPhone = new ArrayList(maxseat);
    ArrayList thursStat = new ArrayList(maxseat);
    MyQueue thursdayName = new MyQueue(5);
    MyQueue thursdayPass = new MyQueue(5);
    MyQueue thursdayPhone = new MyQueue(5);
    MyQueue thursdayStat = new MyQueue(5);

    ArrayList friName = new ArrayList(maxseat);
    ArrayList friPass = new ArrayList(maxseat);
    ArrayList friPhone = new ArrayList(maxseat);
    ArrayList friStat = new ArrayList(maxseat);
    MyQueue fridayName = new MyQueue(5);
    MyQueue fridayPass = new MyQueue(5);
    MyQueue fridayPhone = new MyQueue(5);
    MyQueue fridayStat = new MyQueue(5);

    ArrayList satName = new ArrayList(maxseat);
    ArrayList satPass = new ArrayList(maxseat);
    ArrayList satPhone = new ArrayList(maxseat);
    ArrayList satStat = new ArrayList(maxseat);
    MyQueue saturdayName = new MyQueue(5);
    MyQueue saturdayPass = new MyQueue(5);
    MyQueue saturdayPhone = new MyQueue(5);
    MyQueue saturdayStat = new MyQueue(5);

    ArrayList sunName = new ArrayList(maxseat);
    ArrayList sunPass = new ArrayList(maxseat);
    ArrayList sunPhone = new ArrayList(maxseat);
    ArrayList sunStat = new ArrayList(maxseat);
    MyQueue sundayName = new MyQueue(5);
    MyQueue sundayPass = new MyQueue(5);
    MyQueue sundayPhone = new MyQueue(5);
    MyQueue sundayStat = new MyQueue(5);

    public void booking() {

        System.out.println("\t\t\t\t\t**Welcome to RAWANG FLY NYIOW**");
        System.out.println("*****************************************");
        System.out.println("Press 1 for Book Ticket");
        System.out.println("Press 2 for Check Status");
        System.out.println("Press 3 for Edit Profile");
        System.out.println("Press 4 to cancel booking");
        System.out.println("Press 5 to quit");
        System.out.print("Choose : ");
        int choose = input.nextInt();

        while (choose != 5) {
            switch (choose) {

                case 1:
                    System.out.println();
                    System.out.println("Choose Your Ticket from 24 December 2018 - 30 December 2018 ");
                    System.out.println("1 : Monday (24 December 2018) - 0700H");
                    System.out.println("2 : Tuesday (25 December 2018) - 1000H");
                    System.out.println("3 : Wednesday (26 December 2018) - 0100H");
                    System.out.println("4 : Thursday (27 December 2018) - 1200H");
                    System.out.println("5 : Friday (28 December 2018) - 0600H");
                    System.out.println("6 : Saturday (29 December 2018) - 0900H");
                    System.out.println("7 : Sunday (30 December 2018) - 0000H");
                    System.out.print("\nChoose : ");
                    int d = input.nextInt();

                    switch (d) {
                        case 1:
                            mondayTicket();
                            break;
                        case 2:
                            tuesdayTicket();
                            break;
                        case 3:
                            wednesdayTicket();
                            break;
                        case 4:
                            thursdayTicket();
                            break;
                        case 5:
                            fridayTicket();
                            break;
                        case 6:
                            saturdayTicket();
                            break;
                        case 7:
                            sundayTicket();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                case 2:
                    checkstatus();
                    break;
                case 3:
                    editProfile();
                    break;
                case 4:
                    cancel();
                    break;
                default:
                    System.out.println("You have kicked out from the server");
                    break;
            }
            System.out.println("Press 1 for Book Ticket");
            System.out.println("Press 2 for Check Status");
            System.out.println("Press 3 for Edit Profile");
            System.out.println("Press 4 to cancel booking");
            System.out.println("Press 5 to quit");
            System.out.print("Choose :");
            choose = input.nextInt();
        }
    }

    public void mondayTicket() {
        if (mondaypassenger < maxseat) {
            System.out.println("\nThere is available seats !!");
            System.out.println("\n***************\n");
            System.out.println("Please fill this form:");
            System.out.print("Enter Name : ");
            name = input.next();
            monName.add(mondaypassenger, name);
            System.out.print("Enter Passport Number : ");
            monPass.add(mondaypassenger, input.next());
            System.out.print("Enter Phone Number : ");
            monPhone.add(mondaypassenger, input.next());

            System.out.println("\n******************");
            System.out.println("\t\t**RAWANG FLY**");
            System.out.println("This is your ticket details......");
            System.out.println("Date : Monday (24 December 2018)- 0700H");
            System.out.println("Name : " + monName.get(mondaypassenger));
            System.out.println("Passport : " + monPass.get(mondaypassenger));
            System.out.println("Contact Number : " + monPhone.get(mondaypassenger));
            System.out.println("You are in Comfirm List , Enjoy Your Flight!!!");
            System.out.println("****************\n");
            monStat.add(mondaypassenger, "1");
            mondaypassenger++;

        } else {
            System.out.println("Seats are not available , we will add your name to Waiting List : ");
            System.out.println("\n***************\n");
            System.out.println("Please fill this form:");
            System.out.print("Name : ");
            mondayName.enqueue(input.next());
            System.out.print("Passport Number : ");
            mondayPass.enqueue(input.next());
            System.out.print("Phone Number : ");
            mondayPhone.enqueue(input.next());

            System.out.println("\n***************");
            System.out.println();
            System.out.println("Date : Monday (24 December 2018)- 0700H)");
            System.out.println("Your status is Waiting List");
            System.out.println();
            System.out.println("***************\n");
            mondayStat.enqueue(2);
            mondaypassenger++;
        }
    }

    public void tuesdayTicket() {
        if (tuesdaypassenger < maxseat) {
            System.out.println("\nThere is available seats !!");
            System.out.println("\n***************\n");
            System.out.println("Please fill this form:");
            System.out.print("Enter Name : ");
            tuesName.add(tuesdaypassenger, input.next());
            System.out.print("Enter Passport Number : ");
            tuesPass.add(tuesdaypassenger, input.next());
            System.out.print("Enter Phone Number : ");
            tuesPhone.add(tuesdaypassenger, input.next());

            System.out.println("\n******************");
            System.out.println("\t\t**RAWANG FLY**");
            System.out.println("This is your ticket details......");
            System.out.println("Date : Tuesday (25 December 2018) - 1000H");
            System.out.println("Name : " + tuesName.get(tuesdaypassenger));
            System.out.println("Passport : " + tuesPass.get(tuesdaypassenger));
            System.out.println("Contact Number : " + tuesPhone.get(tuesdaypassenger));
            System.out.println("You are in Comfirm List , Enjoy Your Flight!!!");
            System.out.println("****************\n");
            tuesStat.add(tuesdaypassenger, 1);

            tuesdaypassenger++;
        } else {
            System.out.println("Seats are not available , we will add your name to Waiting List : ");
            System.out.println("\n***************\n");
            System.out.println("Please fill this form:");
            System.out.print("Name : ");
            tuesdayName.enqueue(input.next());
            System.out.print("Passport Number : ");
            tuesdayPass.enqueue(input.next());
            System.out.print("Phone Number : ");
            tuesdayPhone.enqueue(input.next());

            System.out.println("\n***************");
            System.out.println();
            System.out.println("Date : Tuesday (25 December 2018) - 1000H");
            System.out.println("Your status is Waiting List");
            System.out.println();
            System.out.println("***************\n");
            tuesdayStat.enqueue(2);
            tuesdaypassenger++;
        }

    }

    public void wednesdayTicket() {
        if (wednesdaypassenger < maxseat) {
            System.out.println("\nThere is available seats !!");
            System.out.println("\n***************\n");
            System.out.println("Please fill this form:");
            System.out.print("Enter Name : ");
            wedName.add(wednesdaypassenger, input.next());
            System.out.print("Enter Passport Number : ");
            wedPass.add(wednesdaypassenger, input.next());
            System.out.print("Enter Phone Number : ");
            wedPhone.add(wednesdaypassenger, input.next());

            System.out.println("\n******************");
            System.out.println("\t\t**RAWANG FLY**");
            System.out.println("This is your ticket details......");
            System.out.println("Date : Wednesday (26 December 2018) - 0100H");
            System.out.println("Name : " + wedName.get(wednesdaypassenger));
            System.out.println("Passport : " + wedPass.get(wednesdaypassenger));
            System.out.println("Contact Number : " + wedPhone.get(wednesdaypassenger));
            System.out.println("You are in Comfirm List , Enjoy Your Flight!!!");
            System.out.println("****************\n");
            wedStat.add(wednesdaypassenger, 1);
            wednesdaypassenger++;
        } else {
            System.out.println("Seats are not available , we will add your name to Waiting List : ");
            System.out.println("\n***************\n");
            System.out.println("Please fill this form:");
            System.out.print("Name : ");
            wednesdayName.enqueue(input.next());
            System.out.print("Passport Number : ");
            wednesdayPass.enqueue(input.next());
            System.out.print("Phone Number : ");
            wednesdayPhone.enqueue(input.next());

            System.out.println("\n***************");
            System.out.println();
            System.out.println("Date : Wednesday (26 December 2018) - 0100H");
            System.out.println("Your status is Waiting List");
            System.out.println("***************\n");
            System.out.println();
            wednesdayStat.enqueue(input.next());
            wednesdaypassenger++;
        }
    }

    public void thursdayTicket() {
        if (thursdaypassenger < maxseat) {
            System.out.println("\nThere is available seats !!");
            System.out.println("\n***************\n");
            System.out.println("Please fill this form:");
            System.out.print("Enter Name : ");
            thursName.add(thursdaypassenger, input.next());
            System.out.print("Enter Passport Number : ");
            thursPass.add(thursdaypassenger, input.next());
            System.out.print("Enter Phone Number : ");
            thursPhone.add(thursdaypassenger, input.next());

            System.out.println("\n******************");
            System.out.println("\t\t**RAWANG FLY**");
            System.out.println("This is your ticket details......");
            System.out.println("Date : Thursday (27 December 2018) - 1200H");
            System.out.println("Name : " + thursName.get(thursdaypassenger));
            System.out.println("Passport : " + thursPass.get(thursdaypassenger));
            System.out.println("Contact Number : " + thursPhone.get(thursdaypassenger));
            System.out.println("You are in Comfirm List , Enjoy Your Flight!!!");
            System.out.println("****************\n");
            thursStat.add(thursdaypassenger, 1);

            thursdaypassenger++;
        } else {
            System.out.println("Seats are not available , we will add your name to Waiting List : ");
            System.out.println("\n***************\n");
            System.out.println("Please fill this form:");
            System.out.print("Name : ");
            thursdayName.enqueue(input.next());
            System.out.print("Passport Number : ");
            thursdayPass.enqueue(input.next());
            System.out.print("Phone Number : ");
            thursdayPhone.enqueue(input.next());

            System.out.println("\n***************");
            System.out.println();
            System.out.println("Date : Thursday (27 December 2018) - 1200H");
            System.out.println("Your status is Waiting List");
            System.out.println();
            System.out.println("***************\n");
            thursdayStat.enqueue(input.next());

            thursdaypassenger++;
        }
    }

    public void fridayTicket() {
        if (fridaypassenger < maxseat) {
            System.out.println("\nThere is available seats !!");
            System.out.println("\n***************\n");
            System.out.println("Please fill this form:");
            System.out.print("Enter Name : ");
            friName.add(fridaypassenger, input.next());
            System.out.print("Enter Passport Number : ");
            friPass.add(fridaypassenger, input.next());
            System.out.print("Enter Phone Number : ");
            friPhone.add(fridaypassenger, input.next());

            System.out.println("\n******************");
            System.out.println("\t\t**RAWANG FLY**");
            System.out.println("This is your ticket details......");
            System.out.println("Date : Friday (28 December 2018) - 0600H");
            System.out.println("Name : " + friName.get(fridaypassenger));
            System.out.println("Passport : " + friPass.get(fridaypassenger));
            System.out.println("Contact Number : " + friPhone.get(fridaypassenger));
            System.out.println("You are in Comfirm List , Enjoy Your Flight!!!");
            System.out.println("****************\n");
            friStat.add(fridaypassenger, 1);

            fridaypassenger++;
        } else {
            System.out.println("Seats are not available , we will add your name to Waiting List : ");
            System.out.println("\n***************\n");
            System.out.println("Please fill this form:");
            System.out.print("Name : ");
            fridayName.enqueue(input.next());
            System.out.print("Passport Number : ");
            fridayPass.enqueue(input.next());
            System.out.print("Phone Number : ");
            fridayPhone.enqueue(input.next());

            System.out.println("***************");
            System.out.println();
            System.out.println("Date : Friday (28 December 2018) - 0600H");
            System.out.println("Your status is Waiting List");
            System.out.println();
            System.out.println("***************");
            fridayStat.enqueue(input.next());

            fridaypassenger++;
        }
    }

    public void saturdayTicket() {
        if (saturdaypassenger < maxseat) {
            System.out.println("\nThere is available seats !!");
            System.out.println("\n***************\n");
            System.out.println("Please fill this form:");
            System.out.print("Enter Name : ");
            satName.add(saturdaypassenger, input.next());
            System.out.print("Enter Passport Number : ");
            satPass.add(saturdaypassenger, input.next());
            System.out.print("Enter Phone Number : ");
            satPhone.add(saturdaypassenger, input.next());

            System.out.println("\n******************");
            System.out.println("\t\t**RAWANG FLY**");
            System.out.println("This is your ticket details......");
            System.out.println("Date : Saturday (29 December 2018) - 0900H");
            System.out.println("Name : " + satName.get(saturdaypassenger));
            System.out.println("Passport : " + satPass.get(saturdaypassenger));
            System.out.println("Contact Number : " + satPhone.get(saturdaypassenger));
            System.out.println("You are in Comfirm List , Enjoy Your Flight!!!");
            System.out.println("****************\n");
            satStat.add(saturdaypassenger, 1);

            saturdaypassenger++;
        } else {
            System.out.println("Seats are not available , we will add your name to Waiting List : ");
            System.out.println("\n***************\n");
            System.out.println("Please fill this form:");
            System.out.print("Name : ");
            saturdayName.enqueue(input.next());
            System.out.print("Passport Number : ");
            saturdayPass.enqueue(input.next());
            System.out.print("Phone Number : ");
            saturdayPhone.enqueue(input.next());

            System.out.println("\n***************");
            System.out.println();
            System.out.println("Date : Saturday (29 December 2018) - 0900H");
            System.out.println("Your status is Waiting List");
            System.out.println();
            System.out.println("***************\n");
            saturdayStat.enqueue(input.next());

            saturdaypassenger++;
        }
    }

    public void sundayTicket() {
        if (sundaypassenger < maxseat) {
            System.out.println("\nThere is available seats !!");
            System.out.println("\n***************\n");
            System.out.println("Please fill this form:");
            System.out.print("Enter Name : ");
            sunName.add(sundaypassenger, input.next());
            System.out.print("Enter Passport Number : ");
            sunPass.add(sundaypassenger, input.next());
            System.out.print("Enter Phone Number : ");
            sunPhone.add(sundaypassenger, input.next());

            System.out.println("\n******************");
            System.out.println("\t\t**RAWANG FLY**");
            System.out.println("This is your ticket details......");
            System.out.println("Date : Sunday (30 December 2018) - 0000H");
            System.out.println("Name : " + sunName.get(sundaypassenger));
            System.out.println("Passport : " + sunPass.get(sundaypassenger));
            System.out.println("Contact Number : " + sunPhone.get(sundaypassenger));
            System.out.println("You are in Comfirm List , Enjoy Your Flight!!!");
            System.out.println("****************\n");
            sunStat.add(sundaypassenger, 1);

            sundaypassenger++;
        } else {
            System.out.println("Seats are not available , we will add your name to Waiting List : ");
            System.out.println("\n***************\n");
            System.out.println("Please fill this form:");
            System.out.print("Name : ");
            sundayName.enqueue(input.next());
            System.out.print("Passport Number : ");
            sundayPass.enqueue(input.next());
            System.out.print("Phone Number : ");
            sundayPhone.enqueue(input.next());

            System.out.println("***************");
            System.out.println();
            System.out.println("Date : Sunday (30 December 2018) - 0000H");
            System.out.println("Your status is Waiting List");
            System.out.println();
            System.out.println("***************");
            sundayStat.enqueue(input.next());

            sundaypassenger++;
        }
    }

    public ArrayList getMonName() {
        return monName;
    }

    public ArrayList getMonPass() {
        return monPass;
    }

    public ArrayList getMonPhone() {
        return monPhone;
    }

    public ArrayList getMonStat() {
        return monStat;
    }

    public MyQueue getMondayName() {
        return mondayName;
    }

    public MyQueue getMondayPass() {
        return mondayPass;
    }

    public MyQueue getMondayPhone() {
        return mondayPhone;
    }

    public MyQueue getMondayStat() {
        return mondayStat;
    }

    public ArrayList getTuesPhone() {
        return tuesPhone;
    }

    public ArrayList getTuesName() {
        return tuesName;
    }

    public ArrayList getTuesPass() {
        return tuesPass;
    }

    public ArrayList getTuesStat() {
        return tuesStat;
    }

    public MyQueue getTuesdayName() {
        return tuesdayName;
    }

    public MyQueue getTuesdayPass() {
        return tuesdayPass;
    }

    public MyQueue getTuesdayPhone() {
        return tuesdayPhone;
    }

    public MyQueue getTuesdayStat() {
        return tuesdayStat;
    }

    public ArrayList getWedName() {
        return wedName;
    }

    public ArrayList getWedPass() {
        return wedPass;
    }

    public ArrayList getWedPhone() {
        return wedPhone;
    }

    public ArrayList getWedStat() {
        return wedStat;
    }

    public MyQueue getWednesdayName() {
        return wednesdayName;
    }

    public MyQueue getWednesdayPass() {
        return wednesdayPass;
    }

    public MyQueue getWednesdayPhone() {
        return wednesdayPhone;
    }

    public MyQueue getWednesdayStat() {
        return wednesdayStat;
    }

    public ArrayList getThursName() {
        return thursName;
    }

    public ArrayList getThursPass() {
        return thursPass;
    }

    public ArrayList getThursPhone() {
        return thursPhone;
    }

    public ArrayList getThursStat() {
        return thursStat;
    }

    public MyQueue getThursdayName() {
        return thursdayName;
    }

    public MyQueue getThursdayPass() {
        return thursdayPass;
    }

    public MyQueue getThursdayPhone() {
        return thursdayPhone;
    }

    public MyQueue getThursdayStat() {
        return thursdayStat;
    }

    public ArrayList getFriName() {
        return friName;
    }

    public ArrayList getFriPass() {
        return friPass;
    }

    public ArrayList getFriPhone() {
        return friPhone;
    }

    public ArrayList getFriStat() {
        return friStat;
    }

    public MyQueue getFridayName() {
        return fridayName;
    }

    public MyQueue getFridayPass() {
        return fridayPass;
    }

    public MyQueue getFridayPhone() {
        return fridayPhone;
    }

    public MyQueue getFridayStat() {
        return fridayStat;
    }

    public ArrayList getSatName() {
        return satName;
    }

    public ArrayList getSatPass() {
        return satPass;
    }

    public ArrayList getSatPhone() {
        return satPhone;
    }

    public ArrayList getSatStat() {
        return satStat;
    }

    public MyQueue getSaturdayName() {
        return saturdayName;
    }

    public MyQueue getSaturdayPass() {
        return saturdayPass;
    }

    public MyQueue getSaturdayPhone() {
        return saturdayPhone;
    }

    public MyQueue getSaturdayStat() {
        return saturdayStat;
    }

    public ArrayList getSunName() {
        return sunName;
    }

    public ArrayList getSunPass() {
        return sunPass;
    }

    public ArrayList getSunPhone() {
        return sunPhone;
    }

    public ArrayList getSunStat() {
        return sunStat;
    }

    public MyQueue getSundayName() {
        return sundayName;
    }

    public MyQueue getSundayPass() {
        return sundayPass;
    }

    public MyQueue getSundayPhone() {
        return sundayPhone;
    }

    public MyQueue getSundayStat() {
        return sundayStat;
    }

    public void WriteFilemonday() throws FileNotFoundException {
        java.io.File file = new java.io.File("Monday.txt");
        PrintWriter output = new PrintWriter(file);

//        if (file.exists()) {
//            System.out.println("File already exists");
//            System.exit(0);
//        }
        output.println("Confirmation List\n");
        output.println("Name : " + getMonName());
        output.println("Password : " + getMonPass());
        output.println("Phone : " + getMonPhone());
        output.println("Status : " + getMonStat());
        output.println();
        output.println("\n Waiting List");
        output.println("Name : " + mondayName.display1());
        output.println("Password : " + mondayPass.display1());
        output.println("Phone : " + mondayPhone.display1());
        output.println("Status : " + mondayStat.display1());
//        output.println(getMonName());
//        output.println(getMonPass());
//        output.println(getMonPhone());
//        output.println(getMonStat());
//
//        output.println(mondayName.display1());
//        output.println(mondayPass.display1());
//        output.println(mondayPhone.display1());
//        output.println(mondayStat.display1());

        input.close();
        output.close();
    }

    public void ReadFilemonday() {

        java.io.File file = new java.io.File("Monday.txt");
        // This will reference one line at a time
        String line = null;

        try {
            FileReader fileReader
                    = new FileReader(file);

            BufferedReader bufferedReader
                    = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                monName.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '"
                    + file + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + file + "'");
        }
    }

    public void WriteFiletuesday() throws FileNotFoundException {
        java.io.File file = new java.io.File("Tuesday.txt");
        PrintWriter output = new PrintWriter(file);

        output.println("Confirmation List\n");
        output.println("Name : " + getTuesName());
        output.println("Password : " + getTuesPass());
        output.println("Phone : " + getTuesPhone());
        output.println("Status : " + getTuesStat());
        output.println();
        output.println("\n Waiting List");
        output.println("Name : " + tuesdayName.display1());
        output.println("Password : " + tuesdayPass.display1());
        output.println("Phone : " + tuesdayPhone.display1());
        output.println("Status : " + tuesdayStat.display1());

        input.close();
        output.close();
    }

    public void WriteFilewednesday() throws FileNotFoundException {
        java.io.File file = new java.io.File("Wednesday.txt");
        PrintWriter output = new PrintWriter(file);

        output.println("Confirmation List\n");
        output.println("Name : " + getWedName());
        output.println("Password : " + getWedPass());
        output.println("Phone : " + getWedPhone());
        output.println("Status : " + getWedStat());
        output.println();
        output.println("\n Waiting List");
        output.println("Name : " + wednesdayName.display1());
        output.println("Password : " + wednesdayPass.display1());
        output.println("Phone : " + wednesdayPhone.display1());
        output.println("Status : " + wednesdayStat.display1());

        input.close();
        output.close();
    }

    public void WriteFilethursday() throws FileNotFoundException {
        java.io.File file = new java.io.File("Thursday.txt");
        PrintWriter output = new PrintWriter(file);

        output.println("Confirmation List\n");
        output.println("Name : " + getThursName());
        output.println("Password : " + getThursPass());
        output.println("Phone : " + getThursPhone());
        output.println("Status : " + getThursStat());
        output.println();
        output.println("\n Waiting List");
        output.println("Name : " + thursdayName.display1());
        output.println("Password : " + thursdayPass.display1());
        output.println("Phone : " + thursdayPhone.display1());
        output.println("Status : " + thursdayStat.display1());

        input.close();
        output.close();
    }

    public void WriteFilefriday() throws FileNotFoundException {
        java.io.File file = new java.io.File("Friday.txt");
        PrintWriter output = new PrintWriter(file);

        output.println("Confirmation List\n");
        output.println("Name : " + getFriName());
        output.println("Password : " + getFriPass());
        output.println("Phone : " + getFriPhone());
        output.println("Status : " + getFriStat());
        output.println();
        output.println("\n Waiting List");
        output.println("Name : " + fridayName.display1());
        output.println("Password : " + fridayPass.display1());
        output.println("Phone : " + fridayPhone.display1());
        output.println("Status : " + fridayStat.display1());

        input.close();
        output.close();
    }

    public void WriteFilesaturday() throws FileNotFoundException {
        java.io.File file = new java.io.File("Saturday.txt");
        PrintWriter output = new PrintWriter(file);

        output.println("Confirmation List\n");
        output.println("Name : " + getSatName());
        output.println("Password : " + getSatPass());
        output.println("Phone : " + getSatPhone());
        output.println("Status : " + getSatStat());
        output.println();
        output.println("\n Waiting List");
        output.println("Name : " + saturdayName.display1());
        output.println("Password : " + saturdayPass.display1());
        output.println("Phone : " + saturdayPhone.display1());
        output.println("Status : " + saturdayStat.display1());

        input.close();
        output.close();
    }

    public void WriteFilesunday() throws FileNotFoundException {
        java.io.File file = new java.io.File("Sunday.txt");
        PrintWriter output = new PrintWriter(file);

        output.println("Confirmation List\n");
        output.println("Name : " + getSunName());
        output.println("Password : " + getSunPass());
        output.println("Phone : " + getSunPhone());
        output.println("Status : " + getSunStat());
        output.println();
        output.println("\n Waiting List");
        output.println("Name : " + sundayName.display1());
        output.println("Password : " + sundayPass.display1());
        output.println("Phone : " + sundayPhone.display1());
        output.println("Status : " + sundayStat.display1());

        input.close();
        output.close();
    }

    public void checkstatus() {
        System.out.print("\nEnter Your Name : ");
        String namesearch = input.next();

        if (monName.contains(namesearch)) {

            System.out.println("\n******************");
            System.out.println("\t\t**RAWANG FLY**");
            System.out.println("This is your ticket details......");
            System.out.println("Date : Monday (24 December 2018)- 0700H");
//            System.out.println("Name : " + monName.get(mondaypassenger));
//            System.out.println("Passport : " + monPass.get(mondaypassenger));
//            System.out.println("Contact Number : " + monPhone.get(mondaypassenger));
            System.out.println("You are in Comfirm List , Enjoy Your Flight!!!");
            System.out.println("****************\n");
        } else if (tuesName.contains(namesearch)) {
            System.out.println("\n******************");
            System.out.println("\t\t**RAWANG FLY**");
            System.out.println("This is your ticket details......");
            System.out.println("Date : Tuesday (25 December 2018) - 1000H");
//            System.out.println("Name : " + tuesName.get(tuesdaypassenger));
//            System.out.println("Passport : " + tuesPass.get(tuesdaypassenger));
//            System.out.println("Contact Number : " + tuesPhone.get(tuesdaypassenger));
            System.out.println("You are in Comfirm List , Enjoy Your Flight!!!");
            System.out.println("****************\n");
        } else if (wedName.contains(namesearch)) {
            System.out.println("\n******************");
            System.out.println("\t\t**RAWANG FLY**");
            System.out.println("This is your ticket details......");
            System.out.println("Date : Wednesday (26 December 2018) - 0100H");
//            System.out.println("Name : " + wedName.get(wednesdaypassenger));
//            System.out.println("Passport : " + wedPass.get(wednesdaypassenger));
//            System.out.println("Contact Number : " + wedPhone.get(wednesdaypassenger));
            System.out.println("You are in Comfirm List , Enjoy Your Flight!!!");
            System.out.println("****************\n");
        } else if (thursName.contains(namesearch)) {
            System.out.println("\n******************");
            System.out.println("\t\t**RAWANG FLY**");
            System.out.println("This is your ticket details......");
            System.out.println("Date : Thursday (27 December 2018) - 1200H");
//            System.out.println("Name : " + thursName.get(thursdaypassenger));
//            System.out.println("Passport : " + thursPass.get(thursdaypassenger));
//            System.out.println("Contact Number : " + thursPhone.get(thursdaypassenger));
            System.out.println("You are in Comfirm List , Enjoy Your Flight!!!");
            System.out.println("****************\n");
        } else if (friName.contains(namesearch)) {
            System.out.println("\n******************");
            System.out.println("\t\t**RAWANG FLY**");
            System.out.println("This is your ticket details......");
            System.out.println("Date : Friday (28 December 2018) - 0600H");
//            System.out.println("Name : " + friName.get(fridaypassenger));
//            System.out.println("Passport : " + friPass.get(fridaypassenger));
//            System.out.println("Contact Number : " + friPhone.get(fridaypassenger));
            System.out.println("You are in Comfirm List , Enjoy Your Flight!!!");
            System.out.println("****************\n");
        } else if (satName.contains(namesearch)) {
            System.out.println("\n******************");
            System.out.println("\t\t**RAWANG FLY**");
            System.out.println("This is your ticket details......");
            System.out.println("Date : Saturday (29 December 2018) - 0900H");
//            System.out.println("Name : " + satName.get(saturdaypassenger));
//            System.out.println("Passport : " + satPass.get(saturdaypassenger));
//            System.out.println("Contact Number : " + satPhone.get(saturdaypassenger));
            System.out.println("You are in Comfirm List , Enjoy Your Flight!!!");
            System.out.println("****************\n");
        } else if (sunName.contains(namesearch)) {
            System.out.println("\n******************");
            System.out.println("\t\t**RAWANG FLY**");
            System.out.println("This is your ticket details......");
            System.out.println("Date : Sunday (30 December 2018) - 0000H");
//            System.out.println("Name : " + sunName.get(sundaypassenger));
//            System.out.println("Passport : " + sunPass.get(sundaypassenger));
//            System.out.println("Contact Number : " + sunPhone.get(sundaypassenger));
            System.out.println("You are in Comfirm List , Enjoy Your Flight!!!");
            System.out.println("****************\n");
        } else if (mondayName.check(namesearch) == false) {
            System.out.println("\n******************");
            System.out.println("Sorry to inform you that we have'nt found your flight yet.");
            System.out.println("You are in Waiting List");
            System.out.println("We will find flight for you as soon as posible");
            System.out.println("Sorry for the inconvenience");
            System.out.println("****************\n");

        } else {
            System.out.println("\n**No ticket is being booked**\n");
        }
    }

    public void editProfile() {
        String newname, newPassportNo, newPhoneNo;

        System.out.print("Current Name : ");
        String namesearch = input.next();

        if (monName.contains(namesearch)) {
            for (int i = 0; i < mondaypassenger; i++) {
                if (monName.get(i).equals(namesearch)) {

                    System.out.print("\nNew Name : ");
                    newname = input.next();
                    monName.set(i, newname);

                    System.out.print("New Passport Number: ");
                    newPassportNo = input.next();
                    monPass.set(i, newPassportNo);

                    System.out.print("New Phone Number : ");
                    newPhoneNo = input.next();
                    monPhone.set(i, newPhoneNo);

                    System.out.println("\n***************");
                    System.out.println("\t**Your updated Profile**");
                    System.out.println("Name : " + monName.get(i));
                    System.out.println("Passport number : " + monPass.get(i));
                    System.out.println("Phone number : " + monPhone.get(i));
                    System.out.println("***************\n");

                }
            }
        } else if (tuesName.contains(namesearch)) {
            for (int i = 0; i < tuesdaypassenger; i++) {
                if (tuesName.get(i).equals(namesearch)) {

                    System.out.println("\nNew Name : ");
                    newname = input.next();
                    tuesName.set(i, newname);

                    System.out.println("New Passport Number: ");
                    newPassportNo = input.next();
                    tuesPass.set(i, newPassportNo);

                    System.out.println("New Phone Number : ");
                    newPhoneNo = input.next();
                    tuesPhone.set(i, newPhoneNo);

                    System.out.println("\n***************");
                    System.out.println("\t**Your updated Profile**");
                    System.out.println("Name : " + tuesName.get(i));
                    System.out.println("Passport number : " + tuesPass.get(i));
                    System.out.println("Phone number : " + tuesPhone.get(i));
                    System.out.println("***************\n");

                }
            }
        } else if (wedName.contains(namesearch)) {
            for (int i = 0; i < wednesdaypassenger; i++) {
                if (wedName.get(i).equals(namesearch)) {

                    System.out.println("\nNew Name : ");
                    newname = input.next();
                    wedName.set(i, newname);

                    System.out.println("New Passport Number: ");
                    newPassportNo = input.next();
                    wedName.set(i, newPassportNo);

                    System.out.println("New Phone Number : ");
                    newPhoneNo = input.next();
                    wedName.set(i, newPhoneNo);

                    System.out.println("\n***************");
                    System.out.println("\t**Your updated Profile**");
                    System.out.println("Name : " + wedName.get(i));
                    System.out.println("Passport number : " + wedName.get(i));
                    System.out.println("Phone number : " + wedName.get(i));
                    System.out.println("***************\n");

                }
            }
        } else if (thursName.contains(namesearch)) {
            for (int i = 0; i < thursdaypassenger; i++) {
                if (thursName.get(i).equals(namesearch)) {

                    System.out.println("\nNew Name : ");
                    newname = input.next();
                    thursName.set(i, newname);

                    System.out.println("New Passport Number: ");
                    newPassportNo = input.next();
                    thursName.set(i, newPassportNo);

                    System.out.println("New Phone Number : ");
                    newPhoneNo = input.next();
                    thursName.set(i, newPhoneNo);

                    System.out.println("\n***************");
                    System.out.println("\t**Your updated Profile**");
                    System.out.println("Name : " + thursName.get(i));
                    System.out.println("Passport number : " + thursName.get(i));
                    System.out.println("Phone number : " + thursName.get(i));
                    System.out.println("***************\n");

                }
            }
        } else if (friName.contains(namesearch)) {
            for (int i = 0; i < fridaypassenger; i++) {
                if (friName.get(i).equals(namesearch)) {

                    System.out.println("\nNew Name : ");
                    newname = input.next();
                    friName.set(i, newname);

                    System.out.println("New Passport Number: ");
                    newPassportNo = input.next();
                    friName.set(i, newPassportNo);

                    System.out.println("New Phone Number : ");
                    newPhoneNo = input.next();
                    friName.set(i, newPhoneNo);

                    System.out.println("\n***************");
                    System.out.println("\t**Your updated Profile**");
                    System.out.println("Name : " + friName.get(i));
                    System.out.println("Passport number : " + friName.get(i));
                    System.out.println("Phone number : " + friName.get(i));
                    System.out.println("***************\n");

                }
            }
        } else if (satName.contains(namesearch)) {
            for (int i = 0; i < saturdaypassenger; i++) {
                if (satName.get(i).equals(namesearch)) {

                    System.out.println("\nNew Name : ");
                    newname = input.next();
                    satName.set(i, newname);

                    System.out.println("New Passport Number: ");
                    newPassportNo = input.next();
                    satName.set(i, newPassportNo);

                    System.out.println("New Phone Number : ");
                    newPhoneNo = input.next();
                    satName.set(i, newPhoneNo);

                    System.out.println("\n***************");
                    System.out.println("\t**Your updated Profile**");
                    System.out.println("Name : " + satName.get(i));
                    System.out.println("Passport number : " + satName.get(i));
                    System.out.println("Phone number : " + satName.get(i));
                    System.out.println("***************\n");

                }
            }
        } else if (sunName.contains(namesearch)) {
            for (int i = 0; i < sundaypassenger; i++) {
                if (sunName.get(i).equals(namesearch)) {

                    System.out.println("\nNew Name : ");
                    newname = input.next();
                    sunName.set(i, newname);

                    System.out.println("New Passport Number: ");
                    newPassportNo = input.next();
                    sunName.set(i, newPassportNo);

                    System.out.println("New Phone Number : ");
                    newPhoneNo = input.next();
                    sunName.set(i, newPhoneNo);

                    System.out.println("\n***************");
                    System.out.println("\t**Your updated Profile**");
                    System.out.println("Name : " + sunName.get(i));
                    System.out.println("Passport number : " + sunName.get(i));
                    System.out.println("Phone number : " + sunName.get(i));
                    System.out.println("***************\n");

                }
            }
        } else {
            System.out.println("\n**No ticket is being booked**\n");
        }
    }

    public void cancel() {
        System.out.println("\nEnter your booking name to cancel your flight : ");
        String cancelName = input.next();

        if (monName.contains(cancelName)) {
            for (int i = 0; i < mondaypassenger; i++) {
                if (monName.get(i).equals(cancelName)) {
                    monName.remove(i);
                    monStat.remove(i);
                    monPhone.remove(i);
                    mondaypassenger--;
                    System.out.println("\t\n**YOUR FLIGHT HAS BEEN CANCELED**\n");
                    T temp = (T) (Object) mondayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    monName.add(i, temp);

                    T temp2 = (T) (Object) mondayPass.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    monPass.add(i, temp2);

                    T temp3 = (T) (Object) mondayPhone.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    monPhone.add(i, temp3);

                    System.out.println("\t\n**YOUR FLIGHT HAS BEEN CANCELED**\n");
                }
            }

        } else if (tuesName.contains(cancelName)) {
            for (int i = 0; i < tuesdaypassenger; i++) {
                if (tuesName.get(i).equals(cancelName)) {
                    tuesName.remove(i);
                    tuesStat.remove(i);
                    tuesPhone.remove(i);
                    tuesdaypassenger--;
                    System.out.println("\t\n**YOUR FLIGHT HAS BEEN CANCELED**\n");
                    T temp = (T) (Object) tuesdayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    tuesName.add(i, temp);

                    T temp2 = (T) (Object) tuesdayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    tuesStat.add(i, temp2);

                    T temp3 = (T) (Object) tuesdayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    tuesPhone.add(i, temp3);

                    System.out.println("\t\n**YOUR FLIGHT HAS BEEN CANCELED**\n");
                }
            }
        } else if (wedName.contains(cancelName)) {
            for (int i = 0; i < wednesdaypassenger; i++) {
                if (wedName.get(i).equals(cancelName)) {
                    wedName.remove(i);
                    wedStat.remove(i);
                    wedPhone.remove(i);
                    wednesdaypassenger--;
                    System.out.println("\t\n**YOUR FLIGHT HAS BEEN CANCELED**\n");
                    T temp = (T) (Object) wednesdayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    wedName.add(i, temp);

                    T temp2 = (T) (Object) wednesdayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    wedStat.add(i, temp2);

                    T temp3 = (T) (Object) wednesdayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    wedPhone.add(i, temp3);

                    System.out.println("\t\n**YOUR FLIGHT HAS BEEN CANCELED**\n");
                }
            }
        } else if (thursName.contains(cancelName)) {
            for (int i = 0; i < thursdaypassenger; i++) {
                if (thursName.get(i).equals(cancelName)) {
                    thursName.remove(i);
                    thursStat.remove(i);
                    thursPhone.remove(i);
                    thursdaypassenger--;
                    System.out.println("\t\n**YOUR FLIGHT HAS BEEN CANCELED**\n");
                    T temp = (T) (Object) thursdayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    thursName.add(i, temp);

                    T temp2 = (T) (Object) thursdayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    thursPhone.add(i, temp2);

                    T temp3 = (T) (Object) thursdayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    tuesPhone.add(i, temp3);
                    System.out.println("\t\n**YOUR FLIGHT HAS BEEN CANCELED**\n");
                }
            }
        } else if (friName.contains(cancelName)) {
            for (int i = 0; i < fridaypassenger; i++) {
                if (friName.get(i).equals(cancelName)) {
                    friName.remove(i);
                    friStat.remove(i);
                    friPhone.remove(i);
                    fridaypassenger--;
                    System.out.println("\t\n**YOUR FLIGHT HAS BEEN CANCELED**\n");
                    T temp = (T) (Object) fridayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    friName.add(i, temp);

                    T temp2 = (T) (Object) fridayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    friStat.add(i, temp2);

                    T temp3 = (T) (Object) fridayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    friPhone.add(i, temp3);
                    System.out.println("\t\n**YOUR FLIGHT HAS BEEN CANCELED**\n");
                }
            }
        } else if (satName.contains(cancelName)) {
            for (int i = 0; i < saturdaypassenger; i++) {
                if (satName.get(i).equals(cancelName)) {
                    satName.remove(i);
                    satStat.remove(i);
                    satPhone.remove(i);
                    saturdaypassenger--;
                    System.out.println("\t\n**YOUR FLIGHT HAS BEEN CANCELED**\n");
                    T temp = (T) (Object) saturdayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    satName.add(i, temp);

                    T temp2 = (T) (Object) saturdayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    satStat.add(i, temp2);

                    T temp3 = (T) (Object) saturdayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    satPhone.add(i, temp3);
                    System.out.println("\t\n**YOUR FLIGHT HAS BEEN CANCELED**\n");
                }
            }
        } else if (sunName.contains(cancelName)) {
            for (int i = 0; i < sundaypassenger; i++) {
                if (sunName.get(i).equals(cancelName)) {
                    sunName.remove(i);
                    sunStat.remove(i);
                    sunPhone.remove(i);
                    sundaypassenger--;
                    System.out.println("\t\n**YOUR FLIGHT HAS BEEN CANCELED**\n");
                    T temp = (T) (Object) sundayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    sunName.add(i, temp);

                    T temp2 = (T) (Object) sundayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    sunStat.add(i, temp2);

                    T temp3 = (T) (Object) sundayName.dequeue();
                    System.out.println("DEQUEUE SUCCESS!!!");
                    sunPhone.add(i, temp3);
                    System.out.println("\t\n**YOUR FLIGHT HAS BEEN CANCELED**\n");
                }
            }
        } else {
            System.out.println("\n**No ticket is being booked**\n");
        }
    }

}
