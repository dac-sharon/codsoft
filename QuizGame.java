package proj_codsoft;

import java.util.Scanner;
class QuizGame{
    public static void main(String[] args) {
        String[] questions = new String[10];
        questions[0] = "1.Which of the given compounds is used to make fireproof clothing?";
        questions[1] = "2.The driving force of an ecosystem is?";
        questions[2] = "3.Which canyon is known as 'The Grand Canyon of India' or The Arizona of India?";
        questions[3] = "4.Which of the given Mughal emperors had introduced the Mansabdari system?";
        questions[4] = "5.The Instrument Wind vane is used for measuring?";
        questions[5] = "6. Which among the following headstreams meets the Ganges in last?";
        questions[6] = "7.The hottest planet in the solar system?";
        questions[7] = "8.Galileo was an Italian astronomer who?";
        questions[8] = "9.Grand Central Terminal, Park Avenue, New York is the world’s?";
        questions[9] = "10.Entomology is the science that studies?";
        String[] options  = new String[10];
        options[0] = "a) Aluminum chloride \nb) Aluminum Sulphate\nc) Magnesium Chloride\nd) Magnesium Sulphate";
        options[1] = "a) Carbon Mono oxide \nb) Biogas \nc) Solar Energy  \nd) Carbon dioxide";
        options[2] = "a) Gandikota Canyon\nb) Colca Canyon \nc) Copper Canyon \nd) Grand Canyon";
        options[3] = "a) Babar\nb) Aurangzeb \nc) Shahjahan \nd) Akbar";
        options[4] = "a) Air pressure\nb) Direction of Wind\nc) Atmospheric pressure\nd) Velocity of Air";
        options[5] = "a) Alaknanda\nb) Pindar\nc) Mandakini\nd) Bhagirathi";
        options[6] = "a) Mercury\nb) Venus\nc) Mars\nd) Jupiter";
        options[7] = "a) developed the telescope\nb) discovered four satellites of Jupiter\nc) discovered that the movement of pendulum produces a regular time measurement\nd) All of the above.";
        options[8] = "a) highest railway station\nb) longest railway station\nc) largest railway station\nd) None of the above";
        options[9] = "a) The origin and history of technical and scientific terms\nb) Behavior of human beings\nc) Insects\nd) The formation of rocks";
        char answers[] = {'b','c','a','d','b','d','b','d','c','c'};
        char[] ans = new char[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            long start = System.currentTimeMillis();
            long end  = start + 300;
            System.out.println(questions[i]);
            System.out.println(options[i]);
            while (System.currentTimeMillis() < end){
                  System.out.print("Enter your option: ");
                 ans[i] = in.next().charAt(0);
            }
        }
        int score=0;
        for (int i = 0; i < ans.length; i++) {
            if(ans[i] == answers[i]){
                score++;
            }
        }
        System.out.println("Your score : "+score);
    }
}
