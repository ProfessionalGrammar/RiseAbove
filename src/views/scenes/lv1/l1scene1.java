package views.scenes.lv1;

import views.scenes.*;
import utilities.*;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;





public class l1scene1 extends Scene {

   JFrame frame;
   DrawingCar draw = new DrawingCar();

   public void display (InputHandler handler) {
   
      frame = new JFrame ("Rise Above Mental Health Simulator: Intro Scene");
      frame.setSize(1400,800);
      JLayeredPane layeredPane = new JLayeredPane();
      draw.setBounds(0, 0, 1400, 800);  
      layeredPane.add(draw, Integer.valueOf(-1));
      
      frame.add(layeredPane);

        JLabel label = new JLabel("Hello, World!");
        label.setBounds(50, 600, 1300, 200);
        label.setBackground(new Color(0, 0, 0, 128)); // Set translucent background
        label.setForeground(Color.BLACK);

    
    
        label.setFont(new Font("Book Antiqua", Font.PLAIN, 25));


        layeredPane.add(label, Integer.valueOf(1));

        
        frame.add(layeredPane);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   
   
   }
   
   public class DrawingCar extends JComponent {
   
      public DrawingCar () {
      
      }
      public void paint(Graphics g){
       
       
       // sky outside the window
       Color sky1 = new Color (217,211,211);
       g.setColor (sky1);
       g.fillRect(0,0,1400,800);
       
       // mountain outside the windows
       
       Color green1 = new Color (101,81,54);
       int[] mountain1 = {535, 110, 617, 137, 766, 191, 834, 231, 932, 239, 989, 252, 1042, 265, 1111, 277, 1178, 300, 1226, 321, 1273, 337, 1278, 340, 1277, 786, 360, 785, 358, 54};
       fillShape(g,green1,mountain1);
       
       // mountain light dirt contour
       
       Color green2 = new Color (186,150,118);
       int[] mountain2 = {647, 196, 760, 243, 875, 286, 964, 330, 773, 293, 686, 281, 672, 295, 638, 346, 632, 387, 598, 455, 605, 501, 643, 532, 709, 538, 731, 601, 688, 643, 390, 687, 268, 80, 464, 67, 513, 105, };
       fillShape(g,green2,mountain2);
        
        
        // draws the grassy lower portion of the mountain
       Color green3 = new Color (126,104,54);
       int[] mountain3 = {685, 276, 721, 277, 746, 284, 768, 283, 784, 283, 806, 286, 875, 309, 946, 369, 1073, 406, 1078, 403, 1032, 379, 1004, 374, 1013, 371, 1022, 372, 1030, 377, 1042, 382, 1111, 395, 1124, 390, 1150, 388, 1171, 398, 1182, 397, 1148, 379, 1096, 357, 1074, 351, 1046, 340, 1034, 331, 1008, 322, 999, 314, 960, 299, 947, 293, 964, 292, 934, 277, 911, 267, 858, 234, 891, 231, 923, 238, 947, 242, 968, 244, 1013, 252, 1040, 259, 1073, 265, 1091, 269, 1138, 282, 1248, 322, 1278, 340, 1269, 522, 1202, 524, 1135, 523, 1088, 515, 997, 505, 924, 529, 912, 542, 898, 560, 868, 569, 847, 586, 851, 598, 838, 608, 766, 639, 766, 654, 752, 660, 741, 667, 737, 673, 691, 657, 677, 647, 708, 592, 699, 559, 681, 532, 632, 502, 583, 465, 633, 406, 653, 376, 639, 350, 656, 325, 672, 313, 679, 295, 670, 292, 675, 282, 682, 280};
       fillShape(g,green3,mountain3);
       
       
      
      
      // wall background
         Color grey2 = new Color (36,23,15);
         int[] wall1 = {0, 0, 386, 0, 480, 580, 698, 800, 0, 800,};
         fillShape(g,grey2,wall1);
      
      // hoodie hood part 2
      
         Color grey1 = new Color (48,37,35);
         int[] hoodie2 = {133, 571, 137, 538, 148, 509, 155, 474, 130, 443, 114, 421, 42, 464, 64, 490, 75, 516, 81, 527, 115, 556, 135, 570};
         fillShape(g,grey1,hoodie2);
      
      // draws the windowstill
         Color beige = new Color(225, 190, 158);   
         int[] windowStill = {387, 0, 387, 565, 699, 800, 781, 793, 463, 567, 459, 0};
         drawFillShape(g, beige, windowStill);
         
         // light brown segment of windowstill
         
         Color brown1 = new Color (167, 137, 109);
         int[] windowStill2 = {459, 0, 459, 595, 781, 800, 1015, 800, 551, 591, 551, 0};
         drawFillShape(g,brown1,windowStill2);
         
         // draws the two lines/ shadows of the windowstill
         
         Color brown2 = new Color (51, 37, 28);     
         int[] windowStillDetail1 = {459, 0, 459, 597, 783, 800, 941, 800, 469, 585, 469, 0};
         drawFillShape(g,brown2,windowStillDetail1);   
         
         int[] windowStillDetail2 = {481, 0, 481, 585, 977, 800, 1011, 800, 493, 575, 493, 0 };
         drawFillShape(g,brown2,windowStillDetail2);
         
         // draws the face of the kid
         
         Color skin1 = new Color (240, 206, 171);
         int[] face1 = {552, 362, 568, 373, 577, 411, 578, 437, 580, 484, 574, 523, 557, 540, 545, 549, 535, 556, 516, 572, 515, 577, 519, 586, 515, 595, 507, 601, 503, 609, 491, 622, 474, 633, 454, 646, 430, 657, 405, 666, 386, 671, 376, 678, 362, 687, 344, 689, 313, 679, 289, 668, 267, 661, 253, 661, 236, 668, 226, 675, 217, 662, 199, 642, 183, 626, 176, 617, 159, 600, 141, 580, 131, 567, 126, 559, 132, 527, 141, 508, 150, 496, 160, 487, 174, 478, 191, 470, 214, 460, 236, 452, 230, 440, 225, 424, 225, 414, 255, 390, 272, 382, 289, 381, 307, 386, 312, 394, 329, 391, 360, 378, 393, 375, 449, 360, 503, 341, 556, 366, 559, 373};
         fillShape(g,skin1, face1);
         
         // shadow contour of face
         
         Color skin2 = new Color (154, 101, 83);
         int[] face2 = {226, 675, 244, 668, 262, 663, 285, 668, 304, 679, 320, 686, 341, 695, 361, 693, 378, 683, 393, 674, 420, 666, 443, 659, 465, 647, 476, 641, 493, 628, 508, 613, 514, 601, 481, 609, 465, 609, 462, 619, 459, 626, 448, 635, 442, 644, 441, 651, 430, 646, 417, 639, 406, 641, 398, 643, 391, 648, 387, 656, 381, 664, 375, 668, 355, 673, 342, 662, 288, 586, 259, 540, 256, 523, 258, 511, 252, 473, 240, 466, 234, 467, 230, 488, 225, 476, 230, 543, 228, 563, 195, 638, 205, 647, };
         fillShape(g,skin2,face2);
         
         int[] face3 = {459, 577, 458, 589, 460, 600, 465, 612, 487, 610, 508, 602, 501, 594, 464, 580, 458, 581};
         fillShape(g,skin2, face3);
         
         
       
      
        // base of the hair
         Color brown3 = new Color (40,26,23);
         int[] hair1 = {598, 363, 610, 375, 617, 398, 619, 424, 615, 459, 607, 495, 600, 523, 590, 547, 574, 563, 565, 564, 548, 569, 519, 572, 518, 569, 524, 562, 542, 553, 559, 539, 558, 535, 552, 537, 538, 545, 556, 528, 550, 528, 542, 529, 536, 528, 557, 515, 566, 502, 573, 488, 574, 483, 564, 491, 554, 499, 545, 505, 535, 510, 544, 504, 523, 505, 539, 500, 516, 501, 508, 501, 522, 496, 515, 493, 556, 470, 543, 469, 558, 457, 574, 445, 579, 432, 580, 419, 578, 402, 576, 386, 569, 372, 558, 362, 550, 361, 542, 368, 491, 378, 419, 394, 396, 394, 378, 401, 346, 429, 334, 454, 328, 483, 324, 478, 327, 463, 332, 447, 339, 432, 347, 419, 340, 420, 324, 434, 318, 447, 312, 462, 308, 497, 304, 486, 300, 473, 303, 458, 309, 443, 300, 450, 305, 434, 309, 420, 311, 406, 315, 395, 309, 388, 292, 386, 277, 386, 263, 389, 247, 396, 235, 403, 227, 410, 224, 418, 228, 437, 234, 452, 238, 463, 233, 473, 230, 495, 226, 475, 224, 524, 223, 536, 218, 551, 185, 580, 194, 566, 202, 552, 201, 521, 194, 516, 179, 565, 133, 557, 140, 488, 69, 488, 116, 363, 90, 362, 110, 355, 136, 348, 126, 333, 149, 332, 175, 326, 213, 287, 286, 256, 357, 244, 410, 250, 456, 266, 495, 283, 526, 294, 544, 305, 547, 310, 556, 313, 571, 325, 584, 338, 598, 355, 597, 362};
         fillShape(g,brown3,hair1);
      
      
        // hair details
         Color brown4 = new Color (163,114, 81);
         int[] hair2 = {    215, 288, 247, 267, 323, 245, 398, 240, 405, 258, 394, 260, 449, 267, 408, 277, 363, 279, 384, 272, 347, 268, 319, 270, 348, 262 };
         fillShape(g,brown4,hair2);
         
         Color brown5 = new Color (92,63,49);
         int[] hair3 = {318, 260, 291, 268, 257, 278, 233, 293, 212, 314, 203, 334, 253, 319, 278, 314, 219, 337, 266, 332, 312, 315, 360, 302, 308, 325, 275, 341, 314, 345, 339, 354, 368, 352, 399, 350, 440, 347, 488, 340, 517, 335, 491, 315, 527, 308, 483, 280, 437, 279, 380, 292, 384, 276, 341, 264, 304, 266, 256, 282, 229, 318 };
         fillShape(g,brown5, hair3);
       
       
         Color brown6 = new Color (24,14,12);
         int[] hair4 = {552, 360, 574, 381, 579, 418, 577, 439, 585, 430, 592, 419, 599, 403, 601, 389, 599, 370, 593, 358, 584, 346, 568, 347, 552, 354, 531, 374, 469, 405, 491, 402, 535, 373, 552, 363, 563, 370, 572, 384};
         fillShape (g,brown6,hair4);
        
         int[] hair5 = {379, 293, 359, 303, 264, 345, 247, 351, 211, 353, 187, 366, 210, 369, 173, 399, 214, 376, 228, 385, 181, 434, 190, 454, 203, 450, 218, 426, 221, 432, 202, 464, 201, 493, 189, 519, 180, 573, 184, 602, 155, 584, 142, 498, 138, 487, 94, 523, 80, 497, 71, 474, 99, 441, 156, 382, 265, 334, 294, 325, 330, 311, 355, 301, 377, 294};
         fillShape (g,brown6,hair5);
        
         int[] hair6 = {570, 335, 583, 337, 594, 349, 580, 347, 559, 348, 537, 360, 492, 378, 467, 389, 372, 382, 318, 365, 299, 353, 282, 352, 265, 351, 271, 345, 295, 342, 339, 341, 341, 354, 365, 359, 397, 367, 427, 371, 463, 369, 491, 363, 453, 362, 430, 353, 480, 342, 587, 340};
         fillShape(g,brown4,hair6);
        
         int[] hair7 = {398, 384, 365, 386, 326, 373, 292, 362, 278, 354, 267, 348, 239, 349, 216, 348, 243, 340, 296, 322, 353, 301, 275, 336, 327, 341, 405, 335, 370, 340, 332, 346, 301, 345, 322, 358, 365, 375, 396, 388, 378, 394};
         fillShape(g,brown6,hair7);
        
         Color brown10 = new Color (149,97,83);
         int[] hair8 = {304, 386, 220, 386, 256, 376, 219, 364, 245, 367, 209, 353, 186, 363, 125, 388, 138, 373, 161, 362, 110, 367, 81, 356, 64, 346, 112, 351, 126, 351, 121, 340, 145, 345, 119, 320, 148, 336, 163, 337, 188, 327, 169, 338, 187, 343, 201, 347, 197, 335, 207, 344, 253, 351, 271, 369, 284, 381, 290, 387, 250, 384};
         fillShape(g,brown10, hair8);
        
         int[] hair9 = {135, 449, 113, 464, 90, 489, 104, 469, 101, 463, 81, 475, 105, 448, 82, 461, 95, 446, 114, 436, 149, 417, 135, 432, 124, 446, 137, 443, 130, 453};
         fillShape(g,brown10, hair9);
        
        
        //draws the base of the hoodie
        
         int[] hoodie1  = {0, 438, 38, 456, 65, 489, 86, 524, 89, 530, 116, 551, 140, 578, 170, 611, 191, 635, 218, 664, 233, 685, 252, 713, 258, 744, 257, 774, 256, 800, 0, 800, };
         fillShape(g,grey1,hoodie1);
         
         // draws the shadow contour for the ear
         
         int[] ear1 = {254, 426, 260, 428, 265, 432, 266, 436, 267, 442, 267, 446, 271, 446, 273, 444, 275, 439, 275, 432, 277, 427, 277, 420, 277, 417, 282, 417, 287, 417, 293, 413, 298, 410, 305, 405, 310, 398, 310, 391, 301, 390, 290, 387, 280, 388, 272, 390, 258, 395, 247, 398, 240, 403, 233, 408, 227, 421, 238, 410, 242, 409, 245, 413, 247, 417};
         fillShape(g,skin2,ear1);
         
         // draws the white box for the game prologue's text
         /*
         g.setColor(sky1);
         g.fillRect(670, 60, 565, 517);
         
         */
         
         // ^temporary bounding box for the game prologue text
         
      
      
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
}
