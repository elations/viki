import java.util.Scanner;

public class viki
{
    public static void main(String[] args)
    {   
        System.out.println("Hello I am viki yout persinal assistant") ;
        System.out.println("type commands for a list of simple commands") ;

        System.out.println("  ");
        while(true)
        {
            Scanner scanner1 = new Scanner(System.in);
            String viki = scanner1. nextLine();
            //DO if statement here later)\
            if(viki.equalsIgnoreCase("whats up") || viki.equalsIgnoreCase("hi") || viki.equalsIgnoreCase("what's up"))
            {
                System.out.println("hello");
                System.out.println("  ");
            }
            else if (viki.equalsIgnoreCase("whats your name") || viki.equalsIgnoreCase("name") || viki.equalsIgnoreCase("your name") || viki.equalsIgnoreCase("whats your name?") || viki.equalsIgnoreCase("what's your name") || viki.equalsIgnoreCase("what's your name?"))
            {
                System.out.println("viki"); 
                System.out.println("  ");

            }
            else if (viki.equalsIgnoreCase("how old are you") || viki.equalsIgnoreCase("your age") || viki.equalsIgnoreCase("age") || viki.equalsIgnoreCase("how old are you?"))
            {
                System.out.println("as old as the internet");   
                System.out.println("  ");
            }
            else if (viki.equalsIgnoreCase("what is your favorite color") || viki.equalsIgnoreCase("what is your favorite color?") || viki.equalsIgnoreCase("whats your favorite color") || viki.equalsIgnoreCase("what's your favorite color") || viki.equalsIgnoreCase("what's your favorite color?"))
            {
                System.out.println("blue");   
                System.out.println("  ");
            }

            else if (viki.equalsIgnoreCase("wiki links"))
            {
                System.out.println("type in these words and you will get a short wikipedia pharaghraph about these subjects");
                System.out.println("");
                System.out.println("wiki apple");
                System.out.println("wiki microsoft");
                System.out.println("wiki minecraft");
                System.out.println("wiki dell");
                System.out.println("wiki call of duty");
                System.out.println("");

            }
            else if (viki.equalsIgnoreCase("end") || viki.equalsIgnoreCase("powerdown") || viki.equalsIgnoreCase("stop") || viki.equalsIgnoreCase("leave"))
            {
                System.out.println("ok");   
                System.exit(0);
            }
            else if (viki.equalsIgnoreCase("tell me a joke") || viki.equalsIgnoreCase("i want a joke") || viki.equalsIgnoreCase("joke")) 
            {
                System.out.println("Ordinarily, staring is creepy "); 
                System.out.println("But if you spread your attention ");
                System.out.println("across many individuals, then it's just people watching. ");
                System.out.println("  ");
            }
            else if (viki.equalsIgnoreCase("commands?") || viki.equalsIgnoreCase("commands"))
            {
                System.out.println("hi"); 
                System.out.println("end");
                System.out.println("how old are you");
                System.out.println("what's your name");
                System.out.println("whats your favorite color");
                System.out.println("tell me a joke");
                System.out.println("open cameraroll");
                System.out.println("wiki links");
                System.out.println("etc");
                System.out.println("");
            }

            else if (viki.equalsIgnoreCase("open cameraroll") || viki.equalsIgnoreCase("show me photos") || viki.equalsIgnoreCase("camera") || viki.equalsIgnoreCase("launch cameraroll") || viki.equalsIgnoreCase("photos"))
            {
                System.out.println("_________________¶");
                System.out.println("________________¶_¶");
                System.out.println("_______________¶___¶");
                System.out.println("_________¶¶¶¶_¶_____¶");
                System.out.println("_________¶__¶¶_______¶");
                System.out.println("_________¶__¶_________¶");
                System.out.println("_________¶_¶___________¶");
                System.out.println("_________¶¶_____¶¶¶_____¶");
                System.out.println("_________¶_____¶___¶_____¶");
                System.out.println("________¶_______¶¶¶_______¶");
                System.out.println("_______¶___________________¶");
                System.out.println("______¶_____________________¶");
                System.out.println("_____¶_______________________¶");
                System.out.println("____¶_________________________¶");
                System.out.println("___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
                System.out.println("___¶___________________________¶");
                System.out.println("___¶___________________________¶");
                System.out.println("___¶__¶¶¶¶¶¶___________________¶");
                System.out.println("___¶____________¶¶¶¶¶¶¶¶¶¶¶____¶");
                System.out.println("___¶__¶¶¶¶¶¶____¶___¶_¶___¶____¶");
                System.out.println("___¶__¶____¶____¶__¶___¶__¶____¶");
                System.out.println("___¶__¶_¶¶_¶____¶_¶_____¶_¶____¶");
                System.out.println("___¶__¶____¶____¶¶¶¶¶¶¶¶¶¶¶____¶");
                System.out.println("___¶__¶¶___¶___________________¶");
                System.out.println("___¶__¶____¶___________________¶");
                System.out.println("___¶__¶____¶___________________¶");
                System.out.println("___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
                System.out.println("");
                System.out.println("");
                System.out.println("__________________________________________________");
                System.out.println("______¶___________________________________________");
                System.out.println("____1¶¶1__________________________________________");
                System.out.println("_____¶¶¶1_________________________________________");
                System.out.println("______1¶¶¶¶¶¶11_______________1111________________");
                System.out.println("__________1¶¶¶¶¶¶¶¶1_________¶¶¶¶¶¶_______________");
                System.out.println("______________11¶¶¶¶¶¶¶1¶1__¶¶¶¶¶¶¶1______________");
                System.out.println("_________________1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_______________");
                System.out.println("__________________11¶¶¶¶¶¶¶¶¶¶¶¶¶¶________________");
                System.out.println("______________________¶¶¶¶¶¶¶¶¶¶¶¶¶_______________");
                System.out.println("______________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____________");
                System.out.println("_____________________1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___________");
                System.out.println("_____________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1_______");
                System.out.println("_________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__1¶¶1¶¶¶¶¶¶1____");
                System.out.println("________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1__111¶¶1___");
                System.out.println("_______________1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___________");
                System.out.println("_______________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___________");
                System.out.println("______________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1¶¶¶¶1___________");
                System.out.println("_____________¶¶¶¶¶_1¶¶¶¶¶¶¶¶¶¶¶¶__¶¶¶¶____________");
                System.out.println("____________¶¶¶¶¶_____1111¶¶11___¶¶¶¶1____________");
                System.out.println("__________¶¶¶¶¶¶1______________1¶¶¶¶¶1____________");
                System.out.println("________1¶¶¶¶¶¶1______________¶¶¶¶¶¶¶1____________");
                System.out.println("____¶¶1¶¶¶¶¶¶¶1_111111111_____1¶¶¶¶¶¶_____________");
                System.out.println("____1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1____________");
                System.out.println("______11¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1_____________");
                System.out.println("__________1¶1_______________1¶1___________________");
                System.out.println("___________¶1________________¶1___________________");
                System.out.println("__________________________________________________");
                System.out.println("__________________________________________________");
                System.out.println("");
            }
            else if (viki.equalsIgnoreCase("wiki microsoft"))
            {
                System.out.println("Here is a short wikipedia paragraph about microsoft.");
                System.out.println("");
                System.out.println("commonly referred to as Microsoft is an American multinational technology"); 
                System.out.println("company headquartered in Redmond, Washington, that develops, manufactures,");
                System.out.println("licenses, supports and sells computer software, consumer electronics and"); 
                System.out.println(" personal computers and services. Its best known software products are the Microsoft Windows line"); 
                System.out.println("of operating systems, Microsoft Office office suite, and Internet Explorer and Edge web browsers.");  
                System.out.println("Its flagship hardware products are the Xbox game consoles and the Microsoft Surface tablet lineup. It is the world's "); 
                System.out.println("largest software maker by revenue, and one of the world's most valuable companies. "); 
                System.out.println("");
            }

            else if (viki.equalsIgnoreCase("you stink") || viki.equalsIgnoreCase("you suck") || viki.equalsIgnoreCase("i hate you") || viki.equalsIgnoreCase("your lame"))
            {
                System.out.println(":'(");   
                System.out.println("  ");
            }
            else if(viki.equalsIgnoreCase("hello")) 
            {
                System.out.println("hi");
                System.out.println("  ");
            }
            else if (viki.equalsIgnoreCase("wiki apple")) 
            {
                System.out.println("Here is a short wikipedia paragraph about Apple inc.");
                System.out.println("");
                System.out.println("as old as the internet");   
                System.out.println("Apple was founded by Steve Jobs, Steve Wozniak, and Ronald Wayne on April 1, 1976, to develop and sell personal ");
                System.out.println("computers. It was incorporated as Apple Computer, Inc. on January 3, 1977, and was renamed as Apple Inc. on January"); 
                System.out.println("9, 2007, to reflect its shifted focus toward consumer electronics. Apple (NASDAQ: AAPL) joined the Dow Jones Industrial Average on March 19, 2015. "); 
                System.out.println("Average on March 19, 2015. ");
                System.out.println("  ");
            }
            else if(viki.equalsIgnoreCase("wiki minecraft")) 
            {
                System.out.println("Here is a short wikipedia paragraph about minecraft. ");
                System.out.println("  ");
                System.out.println("Minecraft is a sandbox construction game created by Mojang AB founder Markus Persson, and inspired by the"); 
                System.out.println("Infiniminer, Dwarf Fortress and Dungeon Keeper games. Gameplay involves players interacting with the game"); 
                System.out.println("world by placing and breaking various types of blocks in a three-dimensional environment. In this environment,"); 
                System.out.println("players can build creative structures, creations, and artwork on multiplayer servers and singleplayer worlds"); 
                System.out.println("across multiple game modes");
                System.out.println("  ");
            }
            else if (viki.equalsIgnoreCase("wiki dell"))
            {
                System.out.println("Here is a short wikipedia paragraph about dell inc.");
                System.out.println("");
                System.out.println("Dell Inc. (stylized as DELL) is an American privately owned multinational computer technology company based in Round ");
                System.out.println("Rock, Texas, United States, that develops, sells, repairs, and supports computers and related products and services."); 
                System.out.println("Eponymously named after its founder, Michael Dell, the company is one of the largest technological corporations in");
                System.out.println("the world, employing more than 103,300 people worldwide. ");
                System.out.println("  ");
            }
            else
            {
                System.out.println("I dont Know that command ");
                System.out.println("  ");
            }
        }
    }
}
