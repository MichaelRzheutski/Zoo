package academy.belhard;

import academy.belhard.animals.Animal;
import academy.belhard.animals.Lion;
import academy.belhard.animals.Panther;
import academy.belhard.animals.Tiger;
import academy.belhard.birds.Colibri;
import academy.belhard.birds.Parrot;
import academy.belhard.birds.Sparrow;
import academy.belhard.fishes.Fish;
import academy.belhard.fishes.Shark;
import academy.belhard.fishes.SwordFish;
import academy.belhard.fishes.Whale;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Animal> LIST_OF_ANIMALS = new ArrayList<>();
    private static final List<academy.belhard.birds.Bird> LIST_OF_BIRDS = new ArrayList<>();
    private static final List<Fish> LIST_OF_FISHES = new ArrayList<>();

    static int animalCounter = 1;
    static int birdCounter = 1;
    static int fishCounter = 1;

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Тигр", "полосатый");
        Lion lion = new Lion("Лев", "гривастый");
        Panther panther = new Panther("Пантера", "чёрная");

        Parrot parrot = new Parrot("Попугай", "цветастый");
        Colibri colibri = new Colibri("Колибри", "скоростная");
        Sparrow sparrow = new Sparrow("Воробей", "сизый");

        Shark shark = new Shark("Акула", "зубастая");
        Whale whale = new Whale("Кит", "огромный");
        SwordFish swordFish = new SwordFish("Рыба-меч", "длинноносая");

        LIST_OF_ANIMALS.add(tiger);
        LIST_OF_ANIMALS.add(lion);
        LIST_OF_ANIMALS.add(panther);

        LIST_OF_BIRDS.add(parrot);
        LIST_OF_BIRDS.add(colibri);
        LIST_OF_BIRDS.add(sparrow);

        LIST_OF_FISHES.add(shark);
        LIST_OF_FISHES.add(whale);
        LIST_OF_FISHES.add(swordFish);

        showMenu();
    }

    // Method shows main menu
    public static void showMenu() {
        System.out.println("1. Посмотреть животных");
        System.out.println("2. Посмотреть птиц");
        System.out.println("3. Посмотреть рыб");
        System.out.println("4. Посмотреть всех обитателей зоопарка");
        System.out.println("0. Выход");

        int enteredNum = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите номер пункта меню:");
            if (scanner.hasNextInt()) {
                enteredNum = scanner.nextInt();

                switch (enteredNum) {
                    case 0:
                        System.out.println("Вы завершили работу с программой");
                        break;
                    case 1:
                        showAllAnimals();
                        showAnimal();
                        break;
                    case 2:
                        showAllBirds();
                        showBird();
                        break;
                    case 3:
                        showAllFishes();
                        showFish();
                        break;
                    case 4:
                        showCreatures();
                        break;
                    default:
                        System.out.println("Вы ввели неверное число");
                        break;
                }
                break;
            } else {
                System.out.println("Вы ввели неправильный пункт меню, попробуйте снова");
            }
        }

    }

    // Method shows an animal
    public static void showAnimal() {
        Scanner scanner = new Scanner(System.in);
        int enteredNum;
        if (scanner.hasNextInt()) {
            enteredNum = scanner.nextInt() - 1;

            if (enteredNum < 0 || enteredNum >= LIST_OF_ANIMALS.size()) {
                System.out.println("Животного под таким номером не существует");
            }

            for (int i = 0; i < LIST_OF_ANIMALS.size(); i++) {
                if (i == enteredNum) {
                    Animal currentAnimal = LIST_OF_ANIMALS.get(enteredNum);
                    currentAnimal.showAnimalInfo();
                }
            }

        }
    }

    // Method shows a bird
    public static void showBird() {
        Scanner scanner = new Scanner(System.in);
        int enteredNum;
        if (scanner.hasNextInt()) {
            enteredNum = scanner.nextInt() - 1;

            if (enteredNum < 0 || enteredNum >= LIST_OF_BIRDS.size()) {
                System.out.println("Птицы под таким номером не существует");
            }

            for (int i = 0; i < LIST_OF_BIRDS.size(); i++) {
                if (i == enteredNum) {
                    academy.belhard.birds.Bird currentBird = LIST_OF_BIRDS.get(enteredNum);
                    currentBird.showBirdInfo();
                }
            }

        }
    }

    // Method shows a fish
    public static void showFish() {
        Scanner scanner = new Scanner(System.in);
        int enteredNum;
        if (scanner.hasNextInt()) {
            enteredNum = scanner.nextInt() - 1;

            if (enteredNum < 0 || enteredNum >= LIST_OF_FISHES.size()) {
                System.out.println("Рыбы под таким номером не существует");
            }

            for (int i = 0; i < LIST_OF_FISHES.size(); i++) {
                if (i == enteredNum) {
                    Fish currentFish = LIST_OF_FISHES.get(enteredNum);
                    currentFish.showFishInfo();
                }
            }

        }
    }

    // Method shows all creatures
    public static void showCreatures() {
        showAllAnimals();
        showAllBirds();
        showAllFishes();
    }

    // Method shows all animals
    public static void showAllAnimals() {
        System.out.println("Животные:");
        for (Animal animal : LIST_OF_ANIMALS) {
            System.out.println(animalCounter + ". " + animal.getAnimalType());
            animalCounter++;
        }
        System.out.println();
    }

    // Method shows all birds
    public static void showAllBirds() {
        System.out.println("Птицы:");
        for (academy.belhard.birds.Bird bird : LIST_OF_BIRDS) {
            System.out.println(birdCounter + ". " + bird.getBirdType());
            birdCounter++;
        }
        System.out.println();
    }

    // Method shows all fishes
    public static void showAllFishes() {
        System.out.println("Рыбы:");
        for (Fish fish : LIST_OF_FISHES) {
            System.out.println(fishCounter + ". " + fish.getFishType());
            fishCounter++;
        }
        System.out.println();
    }
}