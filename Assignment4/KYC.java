package Assignment4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KYC {
    int[] getSplitDate(String date) {
        String[] splitDate = date.split("-");

        int day, month, year;
        day = Integer.parseInt(splitDate[0]);
        month = Integer.parseInt(splitDate[1]);
        year = Integer.parseInt(splitDate[2]);

        return new int[] {day, month, year };
    }

    void checkRange(LocalDate signUpDate, LocalDate currentDate) {
        if(signUpDate.isAfter(currentDate))
        {
            System.out.println("No range.");
            return;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");

        LocalDate currentYearSignUpDate = LocalDate.of(currentDate.getYear(), signUpDate.getMonth(), signUpDate.getDayOfMonth());

        LocalDate prevDate = currentYearSignUpDate.minusDays(30);
        System.out.print(formatter.format(prevDate));

        LocalDate futureDate = prevDate.plusDays(60);

        if(futureDate.isAfter(currentDate)) {
            System.out.println(" "+formatter.format(currentDate));
        }

        else {
            System.out.println(" "+formatter.format(futureDate));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        KYC kyc = new KYC();

        int n = Integer.parseInt(br.readLine());

        String[] signUpDates = new String[n];
        String[] currentDates = new String[n];

        for(int i=0; i<n; i++) {
            String[] inputDate = br.readLine().split(" ");
            signUpDates[i] = inputDate[0];
            currentDates[i] = inputDate[1];
        }

        for(int i=0; i<n; i++) {
            int[] signUpDateInt = kyc.getSplitDate(signUpDates[i]);
            int[] currentDateInt = kyc.getSplitDate(currentDates[i]);

            LocalDate signUpDate = LocalDate.of(signUpDateInt[2], signUpDateInt[1], signUpDateInt[0]);
            LocalDate currentDate = LocalDate.of(currentDateInt[2], currentDateInt[1], currentDateInt[0]);

            kyc.checkRange(signUpDate, currentDate);
        }
    }
}
