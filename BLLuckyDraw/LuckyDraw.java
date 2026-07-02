package BLLuckyDraw;

public class LuckyDraw {
    public static void main(String[] args) {

        System.out.println("════════════════════════════");
        System.out.println("       BL Lucky Draw         ");
        System.out.println("════════════════════════════");
        System.out.println();
        System.out.println(" Press Enter to spin!");

        String[] Dramas = {
            "Love in the Air",
            "KinnPorsche",
            "Sotus: The Series",
            "Only Friends",
            "Bed Friends",
            "Khemjira",
            "Naughty Babe",
            "Boss and Babe",
            "The Last Twilight",
            "Love By Chance",
            "Perfect 10 Liners",
            "We Are",
            "The Ex-Morning",
            "My School President",
            "HeartStopper",
            "Red, White and Royal Blue",
            "Cutie Pie",
            "Forever You: Arthit-Dao",
            "Forever You: Hill-Ter",
            "Forever You: Tonfah-Typhoon",
            "Bad Guy, My Boss",
            "Goddess Blessed you from Death",
            "The Edge of Horion",
            "Me and Thee",
            "When Oranges Fall",
            "Forever You: Lately, it's Winter Season",
            "My Stubborn",
            "My Magic Prophecy",
            "Love Upon the Time",
            "Until We Meet Again",
            "Your Sky",
            "Never Let me Go",
            "Wandee Goodday",
            "Century Of Love",
            "Only Boo",
            "Cherry Magic",
            "TharnType 1",
            "TharnType: Seven Years of Love",
            "Don't Say No",
            "Love in the Moonlight",
            "Boys in Love",
            "Until we Meet Again",
            "Unknown",
            "Double Helix",
            "The Heart Killers",
            "The Next Prince",
            "ABO Desire",
            "Dark Blue Kiss",
            "Moonlight Chicken",
            "Me and Who"
        };

        String[] Fortunes = {
    " Warning: Your next favorite green flag is loading...",
    " Today you'll accidentally fall in love with another fictional man.",
    " Your emotional support character is about to emotionally need support.",
    " Just one episode? That's the funniest joke you've told today.",
    " The BL gods have approved today's recommendation.",
    " Calories don't count during binge sessions. (Trust me... probably.)",
    " Homework can wait. This cliffhanger cannot.",
    " Hydrate before the emotional dehydration begins.",
    " Your couch has accepted its fate. You're not leaving today.",
    " You'll spend the next week listening to the OST on repeat.",
    " Congratulations! Your gallery is about to gain 47 new screenshots.",
    " Wallet Status: 'Do I really need another photobook?' Yes. No. Maybe.",
    " Side effects may include screaming into a pillow and kicking your blanket.",
    " Today's drink pairs perfectly with poor decision-making and great chemistry.",
    " If it starts raining, assume the universe is setting the mood.",
    " A random cat somewhere approves of your taste in BLs.",
    " Your standards have officially been ruined... again.",
    " Lucky you! Today's couple has more chemistry than your chemistry textbook.",
    " Prepare to defend fictional characters like they're paying your rent.",
    " Plot twist: You'll finish the series and immediately miss everyone."
        };

        int Dramalength = Dramas.length;
        int FortuneLength = Fortunes.length;

        int rand1 = (int)(Math.random() * Dramalength);
        int rand2 = (int)(Math.random() * FortuneLength);

        System.out.println(">>> Today's Lucky Pull <<<");
        System.out.println();
        System.out.println("Drama   : " + Dramas[rand1]);
        System.out.println();
        System.out.println("Fortune : " + Fortunes[rand2]);
        System.out.println();
        System.out.println("=================================");

        



    }
}