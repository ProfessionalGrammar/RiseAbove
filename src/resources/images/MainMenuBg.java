import java.awt.*;
import javax.swing.*;



public class MainMenuBg extends Background {

   DrawingOfMenu draw2 = new DrawingOfMenu();

   public MainMenuBg () {
      this.add(draw2);
      
   }
   
   public class DrawingOfMenu extends JComponent {
   
      public void paint (Graphics g){
      
         Color green1 = new Color (149, 176, 157);
         Color green2 = new Color (102, 156, 106);
         Color green3 =  new Color (119, 169, 120);
      
         g.setColor(green1);
         g.fillRect(0,0,1400,800);  // draws the light green sky background
         
         // top sky darkness 
         
         Color green9 = new Color (128, 168, 141);
         int[] skyDarkX =    {0, 1400,1400,  0};        
         int[] skyDarkY = {0, 0, 247, 95};
         
         g.setColor(green9);
         g.fillPolygon(skyDarkX, skyDarkY, 4);
         
      
         // leftmost mountains
         int[] mountainX = {0, 41, 73, 177, 263, 265, 303, 311,315,  373, 405, 421,  479, 495, 495, 0, 0};
      
         int[] mountainY = {433, 407, 399, 315, 339, 357, 367, 389, 393, 401, 401, 419, 431, 449, 800, 800,433};
         g.setColor(green2);
         g.fillPolygon(mountainX, mountainY, mountainX.length);
         
         // lighter detail shadowing on leftmost mountains
         int[] lMountainX1 =    {0,41, 53, 35, 0};
         int[] lMountainY1 = {433, 407, 421, 461, 477};
         g.setColor(green3);
         g.fillPolygon(lMountainX1, lMountainY1, 5);
      
         int[] lMountainX2 =    {73,177,155,169, 143,121};
         int[] lMountainY2 = {399, 315, 383, 405, 397, 411};
         g.fillPolygon(lMountainX2, lMountainY2, 6);
         
         
         int[] lMountainX3 = {264, 241, 277,269};  
         int[] lMountainY3 = {356, 429, 360, 361};
         g.fillPolygon(lMountainX3, lMountainY3, 4);
         
         int[] lMountainX4 =   {357, 403,389, 385,374, 370, 360};  
         int[] lMountainY4 = {401, 400, 412, 429, 433, 417, 409};
         g.fillPolygon(lMountainX4, lMountainY4, 7);
         
         // rightmost mountain
         int[] mountainX2 =  {1023,1123, 1153, 1188,1210, 1228,1265,1308, 1400, 1400, 500, 995};   
         int[] mountainY2 = {398, 356, 324, 335, 358, 356, 373, 433, 435, 700, 800, 449};
         g.setColor(green2);
         g.fillPolygon(mountainX2, mountainY2, mountainX2.length);
         
         // rightmost mountain lighter shadowing details
         int[] rMountainX2 =   {1023,1123,1153, 1153, 1126};
         int[] rMountainY2 = {398, 356, 324, 360, 434};
         
         g.setColor(green3);
         g.fillPolygon(rMountainX2, rMountainY2, rMountainX2.length);
         
         // last detail on right mountain, rightmost side
         int[] rMountainX3 =    {1210, 1262,1229,1222};
         int[] rMountainY3 = {356,372, 393, 379};
         g.fillPolygon(rMountainX3, rMountainY3, rMountainX3.length);
         
         
         // draws the foreground's city background
         Color green4 = new Color (99, 138, 81);
         
         int[] cityX1 =    {271, 315, 346, 353, 380, 382,384,406,415, 426,  442,492, 508, 517, 520, 533, 535, 544, 546, 562, 562, 597, 595,605,  605, 639, 663, 667, 677, 679, 705, 706, 714, 718, 730, 762, 767, 793, 797, 827, 827, 837, 845, 866, 898,  923,966, 998, 992, 989, 999, 1008,1024,1085,1169, 1171,1200, 1400,244};        
         int[] cityY1 = {508, 468, 453, 447, 445, 444, 464, 480, 467, 435, 453, 455, 435, 445, 425, 416, 396, 396, 406, 401, 380, 380, 397, 406, 387, 403, 379, 329, 329, 377, 366, 348, 343, 349, 295, 295, 330, 325, 288, 287, 319, 308, 313, 315, 295, 291, 303, 325, 331, 346, 348, 359, 383, 406, 407, 430, 430, 508, 545};
      
         g.setColor(green4);
         g.fillPolygon(cityX1, cityY1, cityX1.length);
         
         // draws the second back to front foreground of city
         
         Color green5 = new Color(73, 116, 45);
         int[] cityX2 =    {460, 481, 486, 538, 539, 565, 582,589,630, 659,658, 683, 684, 698, 694, 758, 754, 809, 819, 873, 922, 941, 945,1008, 1006,1061,1068,1098, 1042, 682};   
         int[] cityY2 = {511, 504, 484, 468, 481, 486, 476, 475, 447, 448, 423, 417, 436, 432, 407, 403, 429, 437, 458, 447, 441, 438, 453, 462, 437, 436, 470, 462, 740, 520};
      
         g.setColor(green5);
         g.fillPolygon(cityX2, cityY2, cityX2.length);
         
         // draws the front grass field
         Color green6 = new Color (63, 94, 34);
         
         int[] grassX = {0, 89, 174,210,  273, 373, 474, 527, 679, 712, 715, 767, 855, 837, 935, 981, 1067, 1090, 1104, 1112, 1131,1195, 1245, 1330, 1400, 1400, 0,};
         int[] grassY = {501, 489, 491, 509, 510, 516, 501, 493, 481, 482, 494, 496, 497, 514, 517, 490, 479, 462, 460, 450, 453, 457, 446, 451, 464, 800, 800};
         g.setColor(green6);
         g.fillPolygon(grassX, grassY, grassX.length);
         
         // green foreground river
         
         Color green10 = new Color (128, 144, 81);
         g.setColor(green10);
         int[] riverX1 = {445, 609 ,  479, 493, 521, 575, 685, 785, 863, 870, 862, 893, 842, 841, 850, 774, 733, 685, 587, 523, 490, 464, 444, 433, 550 }; 
         int[] riverY1 = {640, 649,  599, 585, 571,  560, 553, 543, 539, 531, 525, 519, 520, 526, 534, 535, 536, 546, 550,  556, 562, 573, 578, 593, 730};
         
         g.fillPolygon(riverX1, riverY1, riverX1.length);
         
         
         // red foreground
         
         Color red1 = new Color (115, 70, 29);
         int[] redX1 =   {0, 131, 221, 223, 275, 265, 277, 379, 377, 367, 373, 371, 353, 343, 351, 355, 371, 397, 403, 521, 761, 995, 1135,1181,1187,1179,1219, 1249,1255,1243,1249,1259,1271,1281,1397, 1400,0};             
         int[] redY1 = {559, 587, 567, 573, 553, 477, 467, 479, 485, 487, 493, 511, 513, 531, 553, 563, 553, 567, 585, 611, 553, 605, 557, 569, 533, 529,  507, 533, 549, 555, 589, 571, 557, 585, 615, 800, 800};
         g.setColor(red1);
         g.fillPolygon(redX1, redY1, redX1.length);
         
         // redforeground river
         
         Color red2 = new Color(147, 122, 100);
         g.setColor(red2);
         int[] riverX2 = {893, 739, 735, 773, 703, 617, 573, 531, 549, 567, 629, 707, 817, 851, 845, 1015};
         int[] riverY2 = {773, 701, 683, 669, 651, 637, 627, 613, 611, 615, 627, 635, 645, 657, 679, 750};
         g.fillPolygon(riverX2, riverY2, riverX2.length);
         
         
         // dark brown frontal foreground
         
         Color brown1 = new Color(56, 41, 18);
         int[] rockX = {0, 57, 73, 37,       95, 107, 105, 69, 153,   197, 223, 267,299,  295, 325, 353, 531, 623, 651, 663, 767, 861, 889, 969, 1009, 1057, 1105,  1123, 1167,1221,1239, 1271,1287,1275,1291,1317, 1323,1317,1377,1400, 1400, 0};          
         int[] rockY = {541, 521, 551, 591, 623, 637, 659, 727, 769,  707, 675, 681, 699, 719, 775, 787, 739, 741, 771, 783, 765,  735, 701, 701, 593, 603,  608,   629, 717, 779, 759, 727,    737, 597, 569, 581, 533, 501, 493, 511,   800, 800};
        g.setColor(brown1);
        System.out.println(rockX.length);
        System.out.println(rockY.length);
        g.fillPolygon(rockX, rockY, rockX.length);
        
        
      
         
         
         // sky leftmost sun's rays' highlights
         
         Color green8 = new Color (140, 180, 153);
         int [] rayX1 =  {0, 0, 323, 269};
         int[] rayY1 = {167, 185, 0, 0};
         g.setColor(green8);
         g.fillPolygon(rayX1, rayY1, 4);
         
         // sky second leftmost sun's ray's details
         
         int[] rayX2=   {0, 563, 637, 181, 697,1037,0};    
         int[] rayY2 = {303, 0, 0, 231, 0, 0, 357};
         g.fillPolygon(rayX2, rayY2, rayX2.length);
         
      }
      
   }
}
  

