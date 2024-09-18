import java.util.*;
import java.awt.*;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        //sprimitive types
        int myAge = 23;
        int herAge = myAge;
        byte age = 32;
        long videoViews = 3123_456_789L;
        float price = 123.45F;
        char letter = 'a';
        boolean isEligable = true;

        byte x = 2;
        byte y = x;
        x = 6;

        System.out.println(y);
        //reference types
        Date now = new Date();
        System.out.println(now);

        Point point1 = new Point(1, 3);
        Point point2 = point1;
        point1.x = 45;

        String message = " I long for !poverty " + "!! ";
       // escape sequence
        String messages = "Hello Mr \"Hamadani\" ";
        String path = "c:\\Desktop\\Euchalili";
        String fruits = "Mangoes,\nBananas,\nOranges";
        String Fire = "My mother \t said I'm too romantic\t She says im dancing in the movies";

        //arrays

        int[] numbers = new int[6];
        numbers[3] = 45;
        numbers[0] = 32;

        String[] names = { "Holly", "Cooper", "Oliver" };
        int[] ages = { 12, 45, 23, 45 };
        Arrays.sort(ages);

        System.out.println(Arrays.toString(ages));
        System.out.println(names.length);
        System.out.println(Arrays.toString(names));

        System.out.println(Arrays.toString(numbers));
        System.out.println(messages);
        System.out.println(path);
        System.out.println(fruits);
        System.out.println(Fire);

        System.out.println(message.endsWith("! !"));
        System.out.println(message.length());
        System.out.println(message.indexOf("p"));
        System.out.println(message.replace("for", "the"));
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
        System.out.println(point2);
        System.out.println(herAge);

        //Multi-deimensional arrays

        int[][] numbers = new int[4][5];
        numbers[0][3] = 23;
        System.out.println(Arrays.deepToString(numbers));

        String[][] neighbours = { { "I love", "a boy", "he might" }, { "never feel",
        "the same", "way I do" } };
        System.out.println(Arrays.deepToString(neighbours));

       // Constants

        final float PI = 3.14F;
        System.out.println(PI);

        //Arithmetic Expressions

        int add = 10 + 4;
        int div = 10 / 4;
        int min = 10 - 4;
        int mod = 10 % 4;
        int mul = 10 * 4;

        double results = (double) 123 / (double) 21;

        int ad = 23;
        int mn = 45;
        int y = ad++;
        int z = ++ad;
        ad++;
        --mn;
        int age = 23;
        age = age-5;
        age -= 5;

        System.out.println(add);
        System.out.println(min);
        System.out.println(div);
        System.out.println(mod);
        System.out.println(mul);
        System.out.println(results);
        System.out.println(ad);
        System.out.println(mn);
        System.out.println(y);
        System.out.println(z);
        System.out.println(age);

        //oder of operations BODMAS

        int rex = (10 - 2) * 6 + 2;
        System.out.println(rex);

        //casting

        byte az = 4;
        int ay = az + 5;
        System.out.println(ay);

        double bz = 2.4;
        double by = bz + 5;
        System.out.println(by);

        double cz = 4.8;
        int cy = (int) cz + 3;
        System.out.println(cy);

        String dz = "34";
        int dy = Integer.parseInt(dz) + 3;
        System.out.println(dy);

        String ez = "45.6";
        double ey = Double.parseDouble(ez) + 2.5;
        System.out.println(ey);

        //math class
        int resu = Math.round(23.67F);
        System.out.println(resu);

        int ceil = (int) Math.ceil(3.7);
        System.out.println(ceil);

        double sakafu = Math.floor(12.5);
        System.out.println(sakafu);

        int big = Math.max(resu, ceil);
        System.out.println(big);

        int rando = (int) Math.round(Math.random() * 100);
        System.out.println(rando);

       // Number Formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String cash = currency.format(12344556.894);
        System.out.println(cash);

        NumberFormat asilimia = NumberFormat.getPercentInstance();
        String parc = asilimia.format(0.894);
        System.out.println(parc);

        String money = NumberFormat.getCurrencyInstance().format(234567744.4567); //
       // method Chaining
        System.out.println(money);

        //Reading inputs

        Scanner scanner = new Scanner(System.in);
        System.out.print("Age :");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);

        Scanner scan = new Scanner(System.in);
        System.out.print("What's your name ?");
        String name = scan.next();
        System.out.println(name + " becomes her");

        Scanner scann = new Scanner(System.in);
        System.out.print("What do you want in life ?");
        String want = scann.nextLine().trim();
        System.out.println(want);

        //Comparison operators
        int x = 89;
        int y = 34;

        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x <= y);

        //logical operators
        int temprature = 55;
        boolean isWarm = temprature > 20 && temprature < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecords = false;
        boolean isEligable = (hasHighIncome || hasGoodCredit) && !hasCriminalRecords;
        System.out.println(isEligable);

       // The if statement
        int temp = 22;
        if (temp > 35) {
        System.out.println("It's a mighty Hot day");
        System.out.println("Remember to dehydrate");
        } else if (temp > 20 && temp < 30) {
        System.out.println("The weather is Perfect like you");
        } else {
        System.out.println("Its Freezing Today");
        }

        //simplifying if statement

        int income = 120_000;
        boolean financiallyStable = (income > 100_000);
        System.out.println(financiallyStable);

        //tenary operators
        int income = 230_000;
        String ClassName = income > 150_000 ? "first Class" : "Economy";

        String lover = "Chad";
        String fate = lover == "nad" ? "Kids and get married" : "always be my maybe";
        System.out.println(fate);

        String Acceptor = "mom";
        String message = Acceptor == "mom" ? "How the tables have turned" : "Thank you, Merci";
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);
        byte Age = scanner.nextByte();

        String Authorization = Age > 20 ? "Welcome Aboard" : "we are sorry to informyou aint old enough";
        System.out.println(Authorization);

       // Switch Statements
        
          String dream = "Wealth";
          
          switch (dream) {
          case "wealth":
          System.out.println("You want Immense Wealth");
          break;
          case "Family":
          System.out.println("You Want Love");
          break;
          default:
          System.out.println("Lonely cat lady");
          
          }
          
          
         // fizzbuzz exercise
          Scanner scanner = new Scanner(System.in);
          System.out.println("Number: ");
          int num = scanner.nextInt();
          
          if (((num % 5) == 0) && ((num % 3) == 0)) {
         System.out.println("fizzBuzz");
          } else if ((num % 5) == 0) {
         System.out.println("fizz");
          } else if ((num % 3) == 0) {
         System.out.println("buzz");
          } else {
         System.out.println(num);
          }
          
         // The for loop
         
          for (int i = 0; i <= 5; i++)
          System.out.println("Hello World " + i);
         
          for (int j = 10; j >= 2; j--)
          System.out.println("Chewing Gum x " + j);
          
          
          Scanner scanner = new Scanner(System.in);
          String input = " ";
          while (!input.equals("quit")) {
          System.out.print("Input: ");
          input = scanner.next().toLowerCase();
          System.out.println(input);
         
         }
          
          int den = 2;
          while (den < 9) {
          System.out.println("we are fine " + den);
          den++;
          
          }
         
          String input = " ";
          do {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Input: ");
          System.out.println(input);
          } while (!input.equals("quit"));
          
          // Break and Continue Statement
         
          Scanner scanner = new Scanner(System.in);
          String input = " ";
          while (true) {
          System.out.print("Input: ");
          input = scanner.next().toLowerCase();
          if (input.equals("pass"))
          continue;
          if (input.equals("quit"))
          break;
          System.out.println(input);
          }
         
        String[] queens = { "Raja", "Manilla", "Monet", "Doja" };
        for (int i = 0; i < queens.length; i++)
            System.out.println(queens[i]);

        Cities
        String[] Cities = { "Nairobi", "Dar-es-Salam", "Kigali", "Entebe", "Riwa" };
        for (String city : Cities)
            System.out.println(city);

    }

}
