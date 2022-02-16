package Assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PingAHost {
    static void pingAHost(String hostName, int noOfPings) throws Exception {
        ArrayList<String> commandList = new ArrayList<String>();
        commandList.add("ping");
        commandList.add("-n");
        commandList.add(String.valueOf(noOfPings));
        commandList.add(hostName);


        ProcessBuilder build = new ProcessBuilder(commandList);
        Process process = build.start();

        BufferedReader input = new BufferedReader(new InputStreamReader
                (process.getInputStream()));

        String s = null;
        int count = 0;

        ArrayList<Float> pingTimes = new ArrayList<Float>();

        while((s = input.readLine()) != null)
        {
            System.out.println(s);
            String[] tokens = s.split(" ");

            if(count > 1 && count < noOfPings+2) {
                pingTimes.add(Float.valueOf(tokens[4].substring(5,7)));
            }

            count++;
        }

        System.out.println("\nPing times are: "+pingTimes);

        float median = getMedianTimeToPing(pingTimes);
        System.out.println("The median time of the pings are: "+median);
    }

    public static float getMedianTimeToPing(ArrayList<Float> pingTimes) {
        int pingsCount = pingTimes.size();
        float median = 0.0f;

        if(pingTimes.size() == 0) {
            return 0;
        }

        Collections.sort(pingTimes);

        if(pingsCount%2 == 0) {
            median = (pingTimes.get((pingsCount/2)-1)+pingTimes.get((pingsCount)/2))/2;
        }

        else {
            median = pingTimes.get(pingsCount/2);
        }

        return median;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a host name: ");
        String hostName = sc.nextLine();

        System.out.println("Enter the number of times to ping the host: ");
        int noOfPings = sc.nextInt();
        try {
            pingAHost(hostName, noOfPings);
        }

        catch(Exception exception) {
            System.out.println("Exception: "+exception.getMessage());
        }
    }
}
