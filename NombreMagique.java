/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mansouri-Ons
 */
public class NombreMagique {
   public List<String> list = new ArrayList<String>();
    public  double nombre (int a, int b)
         
    {
     
        if (a<=b) {
        
        int i;
        for ( i=a+1;i<b;i++){
            if (((i % 3) != 0)&&((i % 5)!=0))
            
            { System.out.print(i + " ");
            list.add(String.valueOf(i));
            }
            else if (((i % 3) == 0)&&((i % 5)==0))
            {
                System.out.print("HS"+ " ");
                list.add("HS");
            }
            
            else if ((i % 3) == 0)
            
            { System.out.print('H'+ " ");
            list.add("H");
            }
            else  if ((i % 5) == 0)
            
            { System.out.print('S'+ " ");
            list.add("S");
            }
        }
        }
        if (a>=b)
        {
           int i;
        for ( i=a-1;i>b;i--){
            if (((i % 3) != 0)&&((i % 5)!=0))
            
            { System.out.print(i + " ");
            list.add(String.valueOf(i));
            }
            else if (((i % 3) == 0)&&((i % 5)==0))
         {
        System.out.print("HS"+ " ");
        list.add("HS");
        }
            else if ((i % 3) == 0)
            
            { System.out.print('H'+ " ");
            list.add("H");
            }
         else if ((i % 5) == 0)
            
            { System.out.print('S'+ " ");
            list.add("S");
            }
         }}
       System.out.println("");    
        return 0;
        
    }
        
    }
            
