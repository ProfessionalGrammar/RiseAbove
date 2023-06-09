package views.scenes.lv1;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class l1scene5{

   JFrame frame;
   DrawingCar draw = new DrawingCar();

   public l1scene5 () {
   
      frame = new JFrame ("Rise Above Mental Health Simulator: Therapy Room Scene");
      frame.setSize(1400,800);
      frame.setVisible(true);
      frame.add(draw);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
   
   
   
   }
   
   public class DrawingCar extends JComponent {
   
      public DrawingCar () {
      
      }
      public void paint(Graphics g){
         //background wall 
         g.setColor(new Color (255, 234, 213));
         g.fillRect(0,0,1400, 800);

         
         //windows frame 
         Color brown1 = new Color (223, 192, 164);
         
         int [] w1 = {7, 688, 8, 792, 1391, 791, 1390, 531, 468, 529, 9, 687};
         fillShape(g,brown1, w1);
         
         //back wall fill
        Color wall2 = new Color (196, 130, 104);
        int [] w2 ={9, 655, 103, 625, 103, 0, 497, 0, 500, 401, 397, 561, 268, 577, 267, 601, 7, 686, 9, 657};
        fillShape(g, wall2, w2);
        
        int [] w2rest = {704, 529, 703, 517, 664, 517, 664, 530, 704, 530};
        fillShape(g, wall2,w2rest);
         
         
         //wall white part
         Color offwhite1 = new Color (247, 235, 223);
          int [] w3 = {103, 277, 101, 482, 500, 389, 500, 225, 102, 276};
         fillShape(g,offwhite1, w3);
          
          
         //table 
         Color table1 = new Color (174, 120, 96);
         int [] t1 = {267, 659, 395, 705, 663, 559, 665, 321, 396, 360, 269, 345};
         fillShape(g,table1, t1);
         
    // table corner 
          
          int [] t2 = {367, 357, 434, 351, 410, 699, 397, 703, 368, 357};
          fillShape(g,offwhite1, t2);
          
          Color tableTop1 = new Color(255, 226, 182);
          int [] t3 = {248, 343, 249, 336, 301, 323, 398, 331, 591, 305, 695, 309, 695, 315, 397, 359, 250, 341};
          fillShape(g,tableTop1, t3);
          
          
          
          
          
          
          //windows
          int [] z1 = {704, 0, 704, 532, 1389, 532, 1391, 0, 704, 0};
          fillShape(g,tableTop1, z1);
          
          
          //window panes 
          int [] p1 = {789, 0, 790, 77, 886, 77, 887, 0, 789, 0};
          int [] p2 = {892, 0, 893, 77, 1045, 75, 1046, 0, 893, 0};
          int [] p3 = {1051, 0, 1052, 77, 1205, 75, 1205, 0, 1051, 0};
          int [] p4 = {1211, 0, 1212, 77, 1365, 75, 1364, 0, 1210, 0};
          int [] p5 = {1370, 0, 1371, 77, 1400, 75, 1400, 0, 1369, 0};
          int [] p6 = {791, 83, 885, 83, 887, 369, 791, 369, 791, 83};
          int [] p7 = {892, 83, 1043, 83, 1045, 370, 894, 369, 893, 8};
          int [] p8 = {1053, 83, 1205, 83, 1205, 369, 1053, 369, 1053, 83};
          int [] p9 = {1211, 83, 1363, 83, 1363, 370, 1211, 369, 1212, 83};
          int [] p10 = {1371, 83, 1370, 370, 1391, 369, 1392, 83, 1371, 83};
          
          fillShape(g,offwhite1, p1);
          fillShape(g,offwhite1, p2);
          fillShape(g,offwhite1, p3);
          fillShape(g,offwhite1, p4);
          fillShape(g,offwhite1, p5);
          fillShape(g,offwhite1, p6);
          fillShape(g,offwhite1, p7);
          fillShape(g,offwhite1, p8);
          fillShape(g,offwhite1, p9);
          fillShape(g,offwhite1, p10);
         
         
         //wall small outline frame
         Color wallframe1 = new Color( 237, 198, 157);
         int [] w4 = {704, 518, 704, 0, 790, 0, 790, 517, 1400, 517, 1400, 532, 704, 532};
        fillShape(g,wallframe1, w4);
                  
         
         //clock
         Color clockframe = new Color(236, 232, 231);
         Color clockframeshadow = new Color(221, 192, 194);
         Color white = new Color(255,255,255);
         
         int [] c1 = {314, 50, 309, 50, 307, 50, 303, 52, 296, 54, 291, 58, 289, 61, 286, 63, 283, 67, 282, 69, 277, 79, 276, 83, 276, 87, 275, 89, 274, 93, 274, 96, 274, 100, 273, 106, 276, 111, 280, 118, 282, 123, 286, 128, 291, 134, 294, 137, 296, 138, 299, 140, 302, 141, 306, 142, 309, 143, 312, 143, 315, 143, 320, 143, 329, 137, 352, 122, 358, 107, 361, 83, 354, 68, 346, 58, 343, 54, 341, 53, 332, 50, 327, 50, 323, 50, 317, 51, 315, 50};
         int [] c2 = {330, 49, 324, 49, 320, 50, 315, 51, 309, 55, 304, 57, 301, 59, 295, 65, 293, 68, 287, 78, 287, 82, 284, 87, 284, 96, 284, 100, 286, 109, 284, 104, 286, 110, 288, 114, 290, 119, 292, 123, 296, 128, 301, 133, 309, 140, 315, 142, 320, 143, 325, 143, 329, 143, 339, 141, 344, 138, 352, 131, 355, 127, 360, 121, 362, 120, 364, 114, 366, 110, 367, 104, 369, 98, 367, 86, 366, 80, 365, 76, 361, 74, 364, 74, 362, 72, 360, 69, 357, 66, 356, 63, 354, 61, 351, 58, 349, 56, 346, 54, 340, 52, 339, 52, 337, 51, 332, 50, 325, 49, 324, 49, 320, 49};
         int [] c3 = {325, 59, 322, 59, 317, 61, 304, 69, 304, 70, 301, 73, 300, 74, 294, 97, 294, 100, 295, 108, 298, 114, 301, 121, 303, 124, 304, 125, 311, 128, 312, 129, 317, 131, 327, 133, 330, 132, 333, 130, 343, 126, 347, 122, 348, 120, 350, 118, 350, 117, 350, 114, 352, 111, 355, 108, 355, 105, 355, 102, 355, 102, 356, 96, 358, 89, 357, 85, 356, 82, 355, 80, 354, 78, 354, 77, 351, 75, 351, 73, 351, 72, 349, 71, 344, 69, 338, 64, 334, 62, 329, 59, 328, 59, 327, 59, 326, 60};
         
         fillShape(g,clockframeshadow, c1);
         fillShape(g,clockframe, c2);
         fillShape(g,Color.white, c3);
         
         //clock arms 
         Color clockarms = new Color( 180, 96, 94);
         int [] c4 = {324, 91, 323, 91, 323, 93, 321, 93, 322, 97, 322, 98, 324, 100, 324, 100, 326, 101, 326, 101, 328, 100, 328, 98, 329, 97, 329, 97, 347, 96, 347, 95, 330, 95, 330, 95, 330, 94, 330, 94, 329, 92, 329, 92, 328, 92, 327, 91, 327, 90, 327, 90, 326, 90, 327, 66, 325, 65, 325, 90, 324, 90, 323, 91, 323, 91, 321, 92, 321, 95, 324, 99, 325, 99, 326, 99};
         fillShape(g,clockarms, c4);
         
        int [] c5 = {324, 90, 321, 91, 323, 97, 330, 101, 329, 96, 329, 93, 327, 91, 325, 89, 323, 91};
        fillShape(g,clockarms, c5);
         
         
         
         
         //person at desk
         Color p1skin = new Color (242, 170, 148);
         Color p1shirt = new Color(202, 218, 243);
         Color p1jacket = new Color(79, 62, 80);
         Color p1hair = new Color(139, 79,79);
         
         int [] person1 = {471, 104, 483, 105, 490, 101, 502, 101, 506, 109, 507, 128, 504, 153, 499, 159, 498, 166, 498, 177, 484, 184, 471, 178, 456, 159, 457, 150, 463, 137, 449, 117, 463, 99, 480, 99, 489, 102};
         fillShape(g, p1skin, person1);

          int [] person12 = {455, 159, 459, 157, 486, 168, 488, 163, 503, 169, 506, 181, 510, 193, 510, 209, 509, 227, 511, 264, 510, 283, 510, 289, 496, 299, 474, 296, 469, 275, 450, 208, 451, 175, 450, 165, 454, 159};
         fillShape(g,p1shirt, person12);
         
          int [] person13 = {502, 167, 522, 179, 530, 199, 536, 267, 537, 310, 415, 327, 419, 304, 421, 285, 421, 242, 420, 205, 422, 183, 429, 172, 442, 164, 454, 159, 461, 166, 469, 183, 472, 197, 473, 210, 475, 247, 477, 276, 477, 290, 493, 289, 506, 289, 506, 272, 509, 241, 510, 221, 509, 188, 507, 178, 503, 172, 501, 169};
         fillShape(g,p1jacket, person13);
         
         int [] person14 = {464, 136, 461, 141, 459, 149, 454, 135, 451, 127, 447, 119, 446, 111, 448, 99, 466, 85, 474, 81, 488, 83, 497, 86, 504, 91, 505, 92, 506, 98, 507, 103, 501, 103, 494, 103, 490, 105, 486, 106, 481, 106, 478, 103, 470, 121, 470, 129, 468, 135, 467, 135, 467, 128, 468, 125, 466, 122, 464, 120, 462, 118, 461, 118, 460, 120, 458, 120, 459, 127, 460, 129, 462, 133, 464, 136, 462, 138, 459, 140, 459, 147};
         fillShape(g,p1hair, person14);
         
         
         
         
         
         
      
      }
      
      public void fillShape (Graphics g, Color tempColor, int[] coords ) { // method to simplify the polygon drawing in Java. draws polygons based off coordinates inputted         
         boolean isX = true;
         List<Integer> polyX = new ArrayList<>();
         List<Integer> polyY = new ArrayList<>();
      
         for (int k = 0; k < coords.length; k++){
         
            if (isX){
            
               polyX.add(coords[k]);
               isX = false;
            
            }
            else {
               polyY.add(coords[k]);
               isX=true;
            
            }
            
         }
         
         int[] arrayPolyX = polyX.stream().mapToInt(Integer::intValue).toArray();
         int[] arrayPolyY = polyY.stream().mapToInt(Integer::intValue).toArray();
         
         g.setColor(tempColor);
      
         g.fillPolygon(arrayPolyX, arrayPolyY, arrayPolyX.length);         
      
      
      }
      
      
      public void drawFillShape ( Graphics g, Color tempColor, int[] coords) {
      
         boolean isX = true;
         List<Integer> polyX = new ArrayList<>();
         List<Integer> polyY = new ArrayList<>();
      
         for (int k = 0; k < coords.length; k++){
         
            if (isX){
            
               polyX.add(coords[k]);
               isX = false;
            
            }
            else {
               polyY.add(coords[k]);
               isX=true;
            
            }
            
         }
         
         int[] arrayPolyX = polyX.stream().mapToInt(Integer::intValue).toArray();
         int[] arrayPolyY = polyY.stream().mapToInt(Integer::intValue).toArray();
         
         g.setColor(tempColor);
      
         g.fillPolygon(arrayPolyX, arrayPolyY, arrayPolyX.length); 
         
         g.setColor(Color.black);
         g.drawPolygon(arrayPolyX, arrayPolyY, arrayPolyX.length);    
      
      
      }
   }
   
   
   
   public static void main (String [] args) {
   
      new l1scene5();
   }



}
