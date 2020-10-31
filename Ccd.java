import java.util.*;
public class Ccd {
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
       char c = in.next().charAt(0);
       int f=0;
       String st="";
       int n=in.nextInt();
       in.close();
       switch(c)
       {
           case 'c':
               {
               switch(n)
               {
               case 1: st="Espresso Coffee";
                        break;
               case 2: st="Cappuccino Coffee";
                        break;
               case 3: st="Latte Coffee";
                        break;
                default: f=1;
                            break;
                   
               }
                    break;
         }
         case 't':
             {
             switch(n) 
             {
             case 1:    st="Plain Tea";
                        break;
                        
             case 2:    st="Assam Tea";
                        break;
             case 3:    st="Ginger Tea";
                        break;
             case 4:    st="Cardamom Tea";
                        break;
             case 5:    st="Masala Tea";
                        break;
             case 6:    st="Lemon Tea";
                        break;
             case 7:    st="Green Tea";
                        break;
             case 8:    st="Organic Darjeeling Tea";
                        break;
            default: f=1;
                        break;
                 
             }
                        break;
         }
         case 's':
             {
             switch(n)
             {
             case 1: st="Hot and Sour Soup";
                        break;
             case 2: st="Veg Corn Soup";
                        break;
             case 3: st="Tomato Soup";
                        break;
             case 4: st="Spicy Tomato Soup";
                        break;
            default: f=1;
                        break;
                 
             }
                        break;
                        
         }
         case 'b':
             {
                 switch(n)
                 {
                     case 1: st="Hot Chocolate Drink";
                                break;
                     case 2: st="Badam Drink";
                                break;
                     case 3: st="Badam-Pista Drink";
                                break;
                     default: f=1;
                            break;
                 
             }
                    break;
         }
         default: f=1;
       }
        if(f==1)
        System.out.println("INVALID OPTION!");
        else
        {
            System.out.println("Welcome to CCD");
            System.out.println("Enjoy your "+st);
        }
    }
}