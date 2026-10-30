/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revesion.pkg2;

import java.util.List;
public class cinema {
   private String name;
   private hall h;
   private movie m;
   private List< hall> halls ;
   private List <movie> movie;

    public cinema(String name, int hall_id, int hall_capacity, movie m) {
        this.name = name;
        this.h=new hall( hall_id,  hall_capacity);
        halls.add(h);
        this.m = m;
    }
   public void add_movie(movie m ){
  
  movie.add(m);
  
}
 public void print_info(){
     System.out.println("the name of cinema"+name+"movies:");
 }  
}
