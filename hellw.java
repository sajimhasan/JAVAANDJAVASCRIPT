import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

import javax.swing.text.Style;

public class hellw {  // Class names should start with an uppercase letter
//    static int x = 3 ;
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)throws  InterruptedException {

       Random random = new Random();
        /*
        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        boolean hasWon = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        
        while (!hasWon && attempts < 7) {
            System.out.print("Enter your guess (attempt " + (attempts + 1) + "/7): ");
            
            // Input validation
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                scanner.next(); // Clear invalid input
            }
            
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == numberToGuess) {
                hasWon = true;
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts!");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        
        if (!hasWon) {
            System.out.println("Game Over! The number was: " + numberToGuess);
        }
        */

        /*double num1 ;
        double num2 ;
        char oprator ;
        double result =0;
        boolean vaildOperrator= true  ;

        System.out.println("enter a number ");
        num1 = scanner.nextDouble();

        System.out.println("Enter an opertor (+ , - , * , / , ^) :");
        oprator = scanner.next().trim().charAt(0);

        System.out.println("Enter the 2nd number : ");
        num2 = scanner.nextDouble();

        switch (oprator){
            case '+' -> result = num1 + num2 ;
            case '-' -> result = num1 - num2 ;
            case '*' -> result = num1 * num2 ;
            case '/' -> {
                if (num2==0){
                    System.out.println("cannot divide by zero");
                    vaildOperrator = false;
                }else{
                    result = num1 / num2 ;
                }
            }

            case '^' -> result = Math.pow(num1 , num2);
            default -> {
                System.out.println("Invalid operretor ");
                 vaildOperrator = false;

            }

        }
        System.out.println(result);

         */
       /* double temp =-0 ;
        boolean issunny = true;

        if (temp <= 100 && temp >= 6){
            // && this condition buth be true then print !!
            System.out.println("this the the good day ");
        } else if (temp <=110 || temp >= 120 || !issunny) {
            System.out.println("this the cold day and sunny day ");

        }

        */

       /* String username ;

        System.out.println("Enter the username");
        username = scanner.next();

        if (username.length() < 4|| username.length() > 12){
            System.out.println("username is the good");
        } else if (username.contains("  ")|| username.contains("_")) {
            System.out.println("you can't enter any underscor and the space ");

        } else {
            System.out.println("welcame this platfrom "+username);
        }

        */

        /* String name = "" ;
        while (name.isEmpty()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();

        }

        System.out.println("Hello "+ name);

         */
//         while (1 ==1 ){
//             System.out.println("israt");
//         }

       /* String reponse ="" ;

        while(!reponse.equals("Q")){
            System.out.println("this the fuck your mom ");
            System.out.println("pass Q exit");
            reponse = scanner.next();
        }
        System.out.println("you have eixted ");

        */
//        int age  = 0 ;
//        int number = 0 ;


//        System.out.println( " Enter your age : ");
//        age = scanner.nextInt();

//    do {
//            System.out.println("Enter your real age : ");
//            age = scanner.nextInt();
//
//        }    while(age < 0 );
//        System.out.println("you are " + age + "years old ");

      /*  while (number < 1 || number > 10){
            System.out.println("Enter the number 1 - 10: ");
            number= scanner.nextInt();
        }
        System.out.println("you picked number is "+ number +" !!");

       */
        // number guessing game is !! have a while and do loop using !!
        /* Random random= new Random();
         int gess ;

         int attempts= 0  ;
         int min =0 ;
         int max = 100 ;

         int randomnuber = random.nextInt( min , max + 1) ;

        System.out.println("gess the number ");
        System.out.printf("this the between %d-%d\n", min ,max);

        do {
            System.out.println("Guess the number : " );
            gess = scanner.nextInt();
            attempts++;

            if (gess < randomnuber){
                System.out.println("this number is the so low !!");
            } else if (gess > randomnuber) {
                System.out.println("this number is the so high !!");

            }else {
                System.out.println("this the CORRECT number  "+ gess);
                System.out.println("the attempts is "+attempts);
            }
        }while(gess != randomnuber);

         */

//        for ( int i = 0 ; i < 1000000000 ; i++ ){
//            System.out.println(i);
//
//        }


// for ( int i = 10 ; i > 0; i -- ){
//     System.out.println(i);
// }
// for (int i = 10 ; i > 0 ; i-= 3){
//     System.out.println(i);
// }

//
//        System.out.println("Enter the how many time for the using loop : ");
//        int max = scanner.nextInt();
//        for (int i =1 ; i <=max ; i++){
//            System.out.println(i);
//        }
//        System.out.println("how many time to contdown from? : ");
//        int start = scanner.nextInt() ;
//         for (int i = start ; i > 0 ; i--){
//     System.out.println(i);
//     Thread.sleep(1000);
//
// }
//        System.out.println("Happy new year");

//        for(int i = 0 ; i < 10 ; i++ ){
//            if (i == 5 ){
//                continue;
//            }
//            System.out.println(i + " ");
//        }

        /*for (int i = 1 ; i <= 9 ; i++ ){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 1 ; i <= 9 ; i++ ){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 1 ; i <= 9 ; i++ ){
            System.out.print(i+" ");
        }

         */

//        for (int j = 1 ; j <= 3 ; j ++ ){
//            System.out.println();
//            for (int i = 1 ; i <= 9 ; i++ ){
//                System.out.print(i+" ");
//                }
//        }

        /* int rows;
        int colum;
        char symbol;

        System.out.print("enter the # of rows : ");
        rows = scanner.nextInt();

        System.out.print("Enter the # columns : ");
        colum = scanner.nextInt();

        System.out.print("Enter the symbol to use : ");
        symbol = scanner.next().charAt(0);
    for (int j = 0 ; j < rows ; j ++){
        for (int i = 0; i < colum; i++) {
            System.out.print(" " + symbol);
        }
    }
        System.out.println();

         */

        /*
        String name= "sajim ";
        int age = 20 ;
//       happybirthday(name, age);
//       happybirthday(name , age );
//       happybirthday(name , age );
      double result = square(3);
        System.out.println(result);
        scanner.close();
        String fullname = getfullname("Sajim ", "hasaan");
        System.out.println(fullname);
        if (agecheack(age)){
            System.out.println("You can sign up ");

        }else {
            System.out.println("need 18 or 18+ age for this !!");
        }
    }
   static void happybirthday(String name , int age ){


       System.out.println("Happy brithday to you !!"+name);
       System.out.printf("Happy birthday to you dear %s!\n", name);
       System.out.printf("you are the %d  year old \n  ", age);
       System.out.println("happy Birthday to you ");
       System.out.println();
    }
   static double square (double number ){
        return number * number ;

    }

   static double cube(double number){
        return  number * number* number ;
    }
    static  String getfullname(String First , String last){
        return First + " " + last ;
    }
    static  boolean agecheack(int age  ){
        if (age >= 18){
           return  true ;

        }else {
            return  false ;
        }
    }

         */

        /*
       String pizza = bakepizza("flat bread" , "Mojo ") ;
        System.out.println(pizza);

    }
    static String bakepizza (String bread){
        return bread+ "pizza";
    }
    static String bakepizza (String bread ,String chieass){
        return chieass + bread+ " pizza";

         */

       /* int x = 1 ;
        System.out.println(x);
        dosomething();

    }
    static void dosomething (){
        int x = 2 ;
        System.out.println(x);

        */
        /*
         double balance = 0;
         boolean isrunning = true ;
         int choice ;
         while (isrunning == true){
             System.out.println("**************");
             System.out.println("BAKING PROGRAM");
             System.out.println("**************");
             System.out.println("1. show Balance");
             System.out.println("2. Deposit");
             System.out.println("3. Withdrow");
             System.out.println("4. Exit");
             System.out.println("**************");

             System.out.println("Enter your choise (1-4) : ");
             choice=scanner.nextInt();

             switch (choice){
                 case 1 -> showbalance(balance);
                 case 2 -> balance += diposit();
                 case 3 -> balance -= withdrow(balance);
                 case 4 -> isrunning = false ;
                 default -> System.out.println("INVAID CHOISE");
             }
         }
        System.out.println("***************************");
        System.out.println("Thank you,,have a nice day!!");
        System.out.println("***************************");

        scanner.close();
    }
    static void showbalance(double balanec){
        System.out.println("**************");
        System.out.printf("$%f\n", balanec );
    }
    static double diposit() {
        double amaount;
        System.out.print("Enter the amaount for the diposite");
        amaount = scanner.nextDouble();
        if (amaount< 0){
            System.out.println("amaount can't be nagotive !!");
            return 0 ;
        }else {
            return  amaount ;

        }

    }

    static double withdrow(double balance) {
        double amaount;
        System.out.print("Enter amaount to be withdrow: ");
        amaount = scanner.nextDouble();

        if (amaount > balance) {
            System.out.println("INSUFFICIENT FONDS");
            return 0 ;
        } else if (amaount < 0) {
            System.out.println("THIS AMAOUNT IS THE NAGITIVE!! ");
            return 0 ;

        }
    return amaount ;

         */

        // this the discos program
       /* int numofdice;
        int total = 0;

        System.out.println("Enter the # of  dice to roll: ");
        numofdice = scanner.nextInt();

        if (numofdice > 0 ){
           for (int i = 0 ; i < numofdice ; i++){
               int roll = random.nextInt(1,5);
               printdie(roll);
               System.out.println("your rolled is : "+roll);
               total += roll;
           }
            System.out.println("total: "+ total);
        }else {
            System.out.println("# of dice must be greater then 0");
        }

    }
    static void printdie (int roll){
        String dicel1 = """
                ---------
                |       |
                |   @   |
                |       | 
                ---------
                """;
        String dicel2 = """
                ---------
                | @     |
                |   @   |
                |       | 
                ---------
                """;
        String dicel3 = """
                ---------
                | @   @ |
                |       |
                | @   @ | 
                ---------
                """;
        String dicel5 = """
                ---------
                | @   @ |
                |   @   |
                | @   @ | 
                ---------
                """;
  switch (roll){
      case 1 -> System.out.println(dicel1);
      case 2 -> System.out.println(dicel2);
      case 3 -> System.out.println(dicel3);
      case 5 -> System.out.println(dicel5);
  }

        */

/*
        String[] fruit={"apple ", "orege" , "banana", "bangi"};
//        fruits[0]= "pinapple";
        int numberfuits=fruit.length;



//        for (int i = 0 ; i < fruit.length ; i++){
//            System.out.print(fruit[i] + " ");
//        }

        Arrays.fill(fruit , "java ");

        for (String fruits: fruit){
            System.out.println(fruits);
        }

 */
/*
        String[] foods;
        int size ;


        System.out.println("Enter a food do you want ? : ");
        size = scanner.nextInt();

        foods =new String[size];




        for (int i = 0 ; i < foods.length ; i++){
            System.out.println("Enter a food: ");
            foods[i] =scanner.nextLine();
        }

       for (String food : foods){
           System.out.println(food);
       }

 */
        int[] number = { 1 , 2 , 3 , 4 , 5};
        int terget = 3 ;
        boolean isFound= false;


        for (int i = 0 ; i < number.length ; i++){
            if (terget == number[i]){
                System.out.println("this the result : " + i );
                isFound = true ;

                break;

            }
        }
        if (!isFound){
            System.out.println("Element is not found in the array !!");
        }


    }
}