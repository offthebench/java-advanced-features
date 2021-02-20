package QuestionFour;

import QuestionFour.constants.Constants;
import QuestionFour.entity.Bike;
import QuestionFour.entity.Car;
import QuestionFour.entity.Person;
import QuestionFour.entity.Vehicle;
import QuestionFour.exception.DatePatternMismatchException;
import QuestionFour.exception.IncorrectCommandException;
import QuestionFour.utils.DateParserUtils;

import java.time.LocalDate;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        //“John Smith born 3/24/1984”
        String[] userInfoArray = userInput.split(Constants.SPACE);

        if (userInfoArray.length == 4) {
            LocalDate dateOfBirth = null;
            if (DateParserUtils.matches(userInfoArray[3])) {
                dateOfBirth = DateParserUtils.formatDateFromString(userInfoArray[3]);
            } else {
                throw new DatePatternMismatchException();
            }

            String firstName = userInfoArray[0];
            String lastName = userInfoArray[1];
            Person person = new Person(
                    firstName,
                    lastName,
                    dateOfBirth);

            System.out.println("Profile Created");
            System.out.println("Choose the vehicle you need to buy: \n 1. Car \n 2. Bike");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    Vehicle car = new Car();
                    person.setVehicle(car);
                    person.setVehiclePurchaseDate(LocalDate.now());
                    break;
                case 2:
                    Vehicle bike = new Bike();
                    person.setVehicle(bike);
                    person.setVehiclePurchaseDate(LocalDate.now());
                    break;
                default:
                    System.out.println("Incorrect option");
            }


            System.out.println(person.toString());
            System.out.println("Bought "
                    + person.getVehicle().getType().name()
                    + " on " + person.getVehiclePurchaseDate());
        } else {
            throw new IncorrectCommandException();
        }
    }
}
