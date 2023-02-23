package Section6.Challenges;

public class TraditionalSwitchChallenge {

    //NATO Phonetic alphabet
    //Easy
    public static void main(String[] args) {

        char letter = 'D';
        switch (letter) {
            case 'A':
                System.out.println(letter +" - Alpha");
                break;
            case 'B':
                System.out.println(letter +" - Bravo");
                break;
            case 'C':
                System.out.println(letter +" - Charlie");

            case 'D':
                System.out.println(letter +" - Dog");

            case 'E':
                System.out.println(letter +" - Echo");

            default:
                System.out.println(letter + " not found");
        }
    }

}
