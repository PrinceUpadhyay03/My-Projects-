//Author: - Prince Upadhyay
//Course CSCI 204 and program name is MusicalChairs
//Date:- October 15th

package musicalChairs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MusicalChairs {

    public static void main(String[] args) {
        String filename = "Musical Chairs.txt"; 
        String allNames = getInputFromFile(filename);

        if (allNames != null) {
            String[] names = breakNamesApart(allNames);
            List playerList = new List();
            for (String name : names) {
                playerList.insert(name.trim());
            }

            playgame(playerList);
        }
    }

    public static String getInputFromFile(String filename) {
        File file = new File(filename);
        Scanner readInputFile = null;
        try {
            readInputFile = new Scanner(file);
            if (readInputFile.hasNextLine()) {
                return readInputFile.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No such file. Try again.");
        } finally {
            if (readInputFile != null) {
                readInputFile.close();
            }
        }
        return null;
    }

    public static String[] breakNamesApart(String allNames) {
        String[] names = allNames.split(",");
        return names;
    }

    private static void inputName(List playerList, Node current, String input) {
        String playerName = input.trim();
        playerList.removeByName(playerName, current);
    }

    private static void eliminateAndMoveToNext(List playerList, Node current) {
        System.out.println("Eliminating player: " + current.data);
        playerList.remove(current);
        if (current.next != null) {
            current = current.next;
        } else {
            current = playerList.head;
        }
    }
    

    public static void playgame(List playerList) {
        Scanner scanner = new Scanner(System.in);
        Node current = playerList.head;

        while (playerList.head != playerList.tail) {
            System.out.println("Current players: " + playerList.toString());
            System.out.println("Enter a name or a number (positive/negative) to eliminate a player: ");
            String input = scanner.nextLine();

            if (isNumber(input)) {
                int step = Integer.parseInt(input);
                
                if (step == 0) {
                    System.out.println("Error: Please enter a non-zero number.");
                    continue; // Redo the loop
                }
              //Does the Negative Number check.
                if (step > 0) { 
                    for (int i = 0; i < step; i++) {
                        current = current.next;
                        if (current == null) {
                            // Wrap around to the beginning
                            current = playerList.head;
                        }
                    }
                } else {
                    for (int i = 0; i < Math.abs(step); i++) {
                        if (current.prev != null) {
                            current = current.prev;
                        } else {
                            current = playerList.tail;
                        }
                        if (current == null) {
                            // Wrap around to the end
                            current = playerList.tail;
                        }
                    }
                }
                eliminateAndMoveToNext(playerList, current);
            } else {
                inputName(playerList, current, input);
            }
        }

        System.out.println("Winner: " + playerList.head.data);
        scanner.close();
    }

    private static boolean isNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
