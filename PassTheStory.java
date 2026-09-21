public class PassTheStory {
    public static void main(String[] args) {

        String[] story = new String[10];

        story[0] = "Once upon a time, a kid discovered a mysterious door in the forest, and then.";
        story[1] = "The kid opened the door and found a raccoon wearing sunglasses holding a golden potato, and then.";

        for (String sentence : story) {
            if (sentence != null) {
                System.out.println(sentence);
            }
        }
    }
}
