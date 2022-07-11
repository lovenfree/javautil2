package tct.twotwo.sub1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueServiceLauncher {
    static Queue<String> message = new LinkedList<>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String recievedMessage;
        String line;
        while ((line = scanner.nextLine()) != null) {
            if (line.startsWith("SEND")) {
                recievedMessage = convString(line);
                message.offer(recievedMessage);

            } else if (line.startsWith("RECEIVE")) {
                System.out.println(message.poll());
            } else if (line.startsWith("QUIT")) {
                break;
            }
        }

    }

    private static String convString(String line){
        String[] tmp = line.split(" ");
        return tmp[1];
    }
}
