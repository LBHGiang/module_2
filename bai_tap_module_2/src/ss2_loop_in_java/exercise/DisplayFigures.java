package ss2_loop_in_java.exercise;

import java.util.Scanner;

public class DisplayFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1: Print the rectangle");
        System.out.println("2: Print the square triangle");
        System.out.println("3: Print isosceles triangle");
        System.out.println("4: Exit!");

        int menuChoose = Integer.parseInt(scanner.nextLine());

        while (menuChoose != 1 && menuChoose != 2 && menuChoose != 3 && menuChoose != 4) {
            System.out.println("Invalid input value, retype:");
            menuChoose = Integer.parseInt(scanner.nextLine());
        }

        switch (menuChoose) {
            case 4: {
                System.out.println("Exit!");
                break;
            }

            case 1: {
                System.out.println("Enter the length of the rectangle:");
                int length = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter the width of the rectangle:");
                int width = Integer.parseInt(scanner.nextLine());

                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }

            case 2: {
                System.out.println("Enter the side length of the triangle");
                int side = Integer.parseInt(scanner.nextLine());

                System.out.println("Choose the cornerChoose:");
                System.out.println("1: top-left");
                System.out.println("2: top-right");
                System.out.println("3: botton-left");
                System.out.println("4: botton-right");
                System.out.println("5: Exit!");

                int cornerChoose = Integer.parseInt(scanner.nextLine());

                while (cornerChoose != 1 && cornerChoose != 2 && cornerChoose != 3
                        && cornerChoose != 4 && cornerChoose != 5) {
                    System.out.println("Invalid input value, retype:");
                    cornerChoose = Integer.parseInt(scanner.nextLine());
                }

                switch (cornerChoose) {
                    case 1: {
                        for (int i = side; i > 0; i--) {
                            for (int j = 0; j < i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }

                        break;
                    }
                    case 2: {
                        for (int i = 0; i < side; i++) {
                            for (int j = 0; j < side; j++) {
                                if (j < i) {
                                    System.out.print("  ");
                                } else {
                                    System.out.print("* ");
                                }
                            }
                            System.out.println();
                        }
                        break;
                    }
                    case 3: {
                        for (int i = 1; i <= side; i++) {
                            for (int j = 0; j < i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                    }
                    case 4: {
                        for (int i = side - 1; i >= 0; i--) {
                            for (int j = 0; j < side; j++) {
                                if (j < i) {
                                    System.out.print("  ");
                                } else {
                                    System.out.print("* ");
                                }
                            }
                            System.out.println();
                        }
                        break;
                    }
                    case 5: {
                        break;
                    }
                }

                break;
            }

            case 3: {
                System.out.println("Enter the height of the triangle");
                int height = Integer.parseInt(scanner.nextLine());

                System.out.println("Choose the type of isosceles triangle:");
                System.out.println("1: Solid");
                System.out.println("2: Hollow");
                System.out.println("3: Exit!");

                int typeChoose = Integer.parseInt(scanner.nextLine());

                while (typeChoose != 1 && typeChoose != 2 && typeChoose != 3) {
                    System.out.println("Invalid input value, retype:");
                    typeChoose = Integer.parseInt(scanner.nextLine());
                }

                switch (typeChoose) {
                    case 1: {
                        for (int i = 0; i < height; i++) {
                            for (int j = -height; j <= height; j++) {
                                if (j < -i || j > i) {
                                    System.out.print(" ");
                                } else {
                                    System.out.print("*");
                                }
                            }
                            System.out.println();
                        }

                        break;
                    }
                    case 2: {
                        for (int i = 0; i < height; i++) {
                            for (int j = -height + 1; j < height; j++) {
                                if (j == -i || j == i || i == height - 1) {
                                    System.out.print("*");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
                        break;
                    }
                    case 3: {
                        break;
                    }
                }

                break;
            }

        }
    }
}
