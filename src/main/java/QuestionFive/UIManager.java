package QuestionFive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UIManager {
    List<Integer> characterList = new ArrayList<>();
    private static char CHARACTER;

    void initializeCharacterList(int numberOfCharacters, char character) {
        for (int i = 0; i < numberOfCharacters; i++) {
            characterList.add(i);
        }

        CHARACTER = character;
    }

    void initializeUI() {
        System.out.println("1. Draw Horizontal Line");
        System.out.println("2. Draw Vertical Line");
        System.out.println("3. Draw Infinite Square");
        System.out.println("4. Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                drawHorizontalLine();
                break;
            case 2:
                drawVerticalLine();
                break;
            case 3:
                drawSquare();
                break;
            default:
                System.out.println("Incorrect Command");
        }
    }

    void drawHorizontalLine() {
        for(Integer character : characterList) {
            System.out.print(CHARACTER);
        }
    }

    void drawVerticalLine() {
        for(Integer character : characterList) {
            System.out.println(CHARACTER);
        }
    }

    void drawSquare() {
        int rows = characterList.size();
        int col = characterList.size();
        drawSquare(rows, col);

        boolean exit = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Add Row");
            System.out.println("2. Add Column");
            System.out.println("3. Delete Row");
            System.out.println("4. Delete Column");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    drawSquare(++rows, col);
                    break;
                case 2:
                    drawSquare(rows, ++col);
                    break;
                case 3:
                    drawSquare(--rows, col);
                    break;
                case 4:
                    drawSquare(rows, --col);
                    break;
                case 5:
                    exit = true;
                default:
                    System.out.println("Incorrect Input");
                    break;
            }
        } while (!exit);

    }

    private void drawSquare(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(CHARACTER + "  ");
            }
            System.out.println();
        }
    }
}
