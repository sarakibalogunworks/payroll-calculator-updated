package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the employee file to process: ");
        String inputFile = scanner.nextLine();

        System.out.println("Enter the name of the payroll file to create: ");
        String outputFile = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            PrintWriter writer = new PrintWriter(new FileWriter(outputFile));

            writer.println("id|name|gross pay");

            String line;

            while ((line = reader.readLine()) != null) {
                String [] parts = line.split("\\|");

                int id = Integer


            }
        }
    }

    }
