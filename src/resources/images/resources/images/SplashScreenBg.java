/*
Name: Yi Song Ding
Date: 2023-05-28th final edit
Description: Submission of semi-functional splash screen animation. 

*/

package resources.images.*;

import views.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SplashScreenBg extends JPanel{

   public static boolean splashScreenExit = false;
   private static boolean splashFinished  = false;
   
   public void display () {
      boolean gameRun = true;
      Drawing draw1 = new Drawing();
      this.add(draw1);      
      
      this.addKeyListener(
         new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
            
               if (splashFinished ){ 
                  splashScreenExit = true;
                                 
               }
            }
         });      
   
      while (gameRun) {         
         if (SplashScreen.splashScreenExit) {
         
            System.out.println(SplashScreen.splashScreenExit);
         
            new MainMenu();
            SplashScreen.splashScreenExit = false;
         
         }
      }  
   }
   
   public static class Drawing extends JComponent {
      private int step = 0;
      private int stepLineLast = 0;
      private int stepLine = 0;
      private Timer timer;
      private Timer timerLine;
      
      
   
      Drawing() {
         timer = new Timer(900, 
            e -> {
               step++;
               repaint(); // Trigger repaint to update the graphics
               if (step >= 7) {
                  splashFinished = true;
                  timer.stop(); // Stop the timer after 7 steps
               }
            });
         timer.start(); // Start the timer
      }
   
      public void paint(Graphics g) {
      
      
         
         Graphics2D g2d = (Graphics2D) g;
         Stroke oldStroke = g2d.getStroke();
         Stroke newStroke = new BasicStroke(2);
         Stroke thickerStroke = new BasicStroke(10);
         
         Stroke thickStroke = new BasicStroke(6);
            
            
         int windowWidth = getWidth();
         int windowHeight = getHeight();
      
         Font splashScreenTitle = new Font("Roboto", Font.BOLD, 67);
      
         Color navyBlue = new Color(29, 54, 111);
         Color green1 = new Color(8, 192, 118);
         Color green2 = new Color(13, 157, 115);
         Color green3 = new Color(17, 122, 114);
         
         Color oliveGreen = new Color(103, 160, 69);
      
         g.setColor(navyBlue);
         g.fillRect(0, 0, windowWidth, windowHeight);
      
         g.setFont(splashScreenTitle);
         g.setColor(Color.white);
         g.drawString("SYNTHESIS CREATIONS", 245, 441);
      
         g.setColor(green1);
         g.setFont(new Font("Times New Roman", Font.PLAIN, 35));
         g.drawString("Actualizing your wildest dreams.", 571, 483);
      
         // Draw the rectangles based on the step
         if (step >= 1) {
            g.setColor(green1);
            g.fillRect(1045, 367, 37, 137); // First leftmost rectangle
         }
      
         if (step >= 2) {
            g.setColor(green2);
            g.fillRect(1089, 367, 37, 137); // Second middle rectangle
         }
      
         if (step >= 3) {
            g.setColor(green3);
            g.fillRect(1133, 367, 37, 137); // Third rightmost rectangle
         
            stepLineLast = -1; // cues in the fade-out animation
         }
      
         if (step >= 5) {
            g.setColor(navyBlue);
            g.fillRect(0, 0, 1400, 800); // brings out the splashscreen to a blue backdrop
         }
         
         if (step >= 6){
         
           // draws the game title
            g.setFont(new Font ("Roboto", Font.BOLD, 77));
            g.setColor(Color.white);
            g.drawString("RISE ABOVE", 470,437);
            
            g2d.setStroke(newStroke);
            
            // draws the top, first leftmost leaf on the title screen
            g.setColor(oliveGreen);
            int[] leafX1 = {370, 429, 436, 458, 492, 472, 434, 414, 363, 380, 410, 381};
            int[] leafY1 = {289, 246, 200, 216, 216, 166, 184, 142, 144, 176, 183, 225};
            g.fillPolygon(leafX1, leafY1, 12);
            g.setColor(Color.black);
            g.drawPolygon(leafX1, leafY1, 12);
            
            // draws second top-left leaf
            g.setColor(oliveGreen);
            int[] leafX2 = {516, 545, 560, 565, 590, 615, 616, 596, 623, 642, 601, 568, 539, 533};
            int[] leafY2 = {126, 135, 159, 133, 108, 72, 122, 164, 167, 177, 201, 181, 181, 154};
            g.fillPolygon(leafX2, leafY2, 14);
            g.setColor(Color.black);
            g.drawPolygon(leafX2, leafY2, 14);
            
            // draws the third top-middle leaf
            
            g.setColor(oliveGreen);
            int[] leafX3 = {610, 654, 681, 693, 681, 686, 707, 716, 710, 742, 748, 714, 711, 695, 648};
            int[] leafY3 = {250, 231, 218, 219, 201, 169, 180, 202, 233, 248, 279, 267, 247, 262, 261};
            
            
            g.fillPolygon(leafX3, leafY3, 15);
            g.setColor(Color.black);
            g.drawPolygon(leafX3, leafY3, 15);
            
            //draws the forth top leaf
            
            g.setColor(oliveGreen);
            int[] leafX4 = {743,785, 802, 794, 816, 833, 829, 860, 881, 838, 812, 789, 742};
            int [] leafY4 = {299, 282, 289, 259, 200, 243, 285, 279, 291, 313, 300, 316, 299};
            g.fillPolygon(leafX4, leafY4, leafX4.length);
            g.setColor(Color.black);
            g.drawPolygon(leafX4, leafY4, leafX4.length);
            
            
            // draw the fifth top leaf
            
            g.setColor(oliveGreen);
            int [] leafX5 = {903, 940, 982, 1003, 1056, 1032, 998, 1020,1034, 974, 972,947};  
            int [] leafY5 = {317, 262, 271, 244, 251, 272, 276, 297, 359, 312, 286, 305};
            g.fillPolygon(leafX5, leafY5, leafX5.length);
            
            g2d.setStroke(newStroke);
            
            g.setColor(Color.black);
            g.drawPolygon(leafX5, leafY5, leafX5.length);
            
            // draw the first left bottom leaf
            
            g.setColor(oliveGreen);
            int[] leafX6 = {391, 452, 487, 493, 520, 570, 549, 532, 487, 464, 389, 434,459,417};   
            int [] leafY6 = {465, 489, 530, 547, 516, 489, 553, 575, 575, 616, 611, 572, 565, 533};
            g.fillPolygon(leafX6, leafY6, leafX6.length);
            g.setColor(Color.black);
            g.drawPolygon(leafX6, leafY6, leafX6.length);
            
            // draws the second left bottom leaf
            
            g.setColor(oliveGreen);
            int[] leafX7 =     {610, 647,680,701,726, 792,754, 734, 718, 730, 721, 682, 682, 646};    
            int[] leafY7 = {518, 487, 479, 493, 466, 468, 502, 511, 507, 525, 616, 556, 515, 527};
            g.fillPolygon(leafX7, leafY7, leafX7.length);
            g.setColor(Color.black);
            g.drawPolygon(leafX7, leafY7, leafX7.length);
            
            // draws the third bottom leaf near the middle 
            
            g.setColor(oliveGreen);
            int[] leafX8 =     {789, 840, 846, 867, 970, 922,902,877, 891, 899 ,850, 852, 820};
            int[] leafY8 = {503, 515, 535, 512, 499,  539, 563, 568, 581, 616, 599, 556, 552};
            g.fillPolygon(leafX8, leafY8, leafX8.length);
            g.setColor(Color.black);
            g.drawPolygon(leafX8, leafY8, leafX8.length);
         
            
            // first intra-leaf lines
             
            g.drawLine(372, 284, 434, 184);
            g.drawLine(437, 183, 492, 213);
            g.drawLine(429, 177, 363, 144);
            
            // second intra-left lines
            
            g.drawLine(518, 126, 540, 152);
            g.drawLine(540, 152, 568, 177);
            g.drawLine(568, 177, 585, 141);
            g.drawLine(585, 141, 616, 89);
            g.drawLine(568, 177, 611, 178);
            g.drawLine(611, 178, 639, 178);
            
            
            // third middle-left top leaf lines
            
            g.drawLine(615, 250, 673, 246);
            g.drawLine(673, 246, 704, 231);
            g.drawLine(685, 172, 702, 196);
            g.drawLine(702, 196, 707, 234);
            g.drawLine(707, 234, 729, 253);
            g.drawLine(729, 253, 742, 277);
            
            // forth top left intra-leaf lines
            
            g.drawLine(745, 300, 789, 293);
            g.drawLine(789, 293, 808, 299);
            g.drawLine(813, 296, 818, 203);
            g.drawLine(813, 298, 846, 288);
            g.drawLine(846, 288, 872, 295);
            
            // fifth top right intra-leaf lines
            
            g.drawLine(907, 315, 955, 286);
            g.drawLine(955, 286, 971, 268);
            g.drawLine(977, 269, 994, 299);
            g.drawLine(994, 299, 1033, 352);
            g.drawLine(978, 265, 1026, 259);
            g.drawLine(1026, 259, 1054, 251);
            
            // sixth bottom left intra-leaf lines
            
            g.drawLine(395, 472, 450, 518);
            g.drawLine(450, 518, 487, 575); 
            
            g.drawLine(388, 612, 449, 586);
            g.drawLine(449, 586, 488, 577);
            g.drawLine(488, 577, 534, 531);
            g.drawLine(534, 531, 572, 492);
           
            
            // seventh bottom leaf intra-leaf lines
            
            g.drawLine(611, 517, 660, 513);
            g.drawLine(660, 513, 697, 493);
            g.drawLine(697, 493, 704, 556);
            g.drawLine(704, 556, 715, 616);
            g.drawLine(704, 491, 745, 492);
            g.drawLine(791, 472, 745, 492);
            
            
            // eigth bottom leaf intra-leaf lines
            
            g.drawLine(794, 503, 822, 534);
            g.drawLine(822, 534, 855, 552);
            g.drawLine(855, 552, 874, 601);
            
            g.drawLine(853, 551, 896, 529);
            g.drawLine(969, 505, 896, 529);
            
            g2d.setStroke(oldStroke);
            
      
            // draws the connecting vines between each leaf
            
            g2d.setStroke(thickStroke);
            g.setColor(Color.black);
            
            int xCorrect = 7; // variable to fix wrongnly formatted x values 
            
            int yCorrect = 27; // variable to fix wrongly formatted y values
            
            g.drawLine(331 + xCorrect ,133 + yCorrect, 359+ xCorrect , 157 + yCorrect);
            g.drawLine(359+ xCorrect , 157 + yCorrect, 397+ xCorrect , 158 + yCorrect);
            
            g.drawLine (485, 168 + yCorrect, 532, 167);
            
            g.drawLine(627, 192, 654, 202);
            g.drawLine(654, 202, 687, 217);
            
            g.drawLine(747, 274, 768, 284);
            
            g.drawLine(867, 304, 903, 299);
            g.drawLine(903, 299, 926, 279);
            
            g.drawLine(334, 643, 431, 644);
            g.drawLine(431, 644, 487, 619);
            g.drawLine(487, 619, 506, 576);
            
            g.drawLine(558, 533, 595, 506);
            g.drawLine(595, 506, 629, 499);
            
            g.drawLine(762, 497, 791, 509);
                      
            g2d.setStroke(oldStroke);
            
            
            // bounding box and text to continue to main menu
            g.setColor(Color.white);
          
            g.setFont(new Font("Roboto", Font.PLAIN, 20));
            g.drawString("Press any key to continue to MAIN MENU", 900, 700);
            
            g2d.setStroke(thickerStroke);
            g.drawRect(888,656, 414, 64);
            g2d.setStroke(oldStroke);       
         } 
      }
   }
}
