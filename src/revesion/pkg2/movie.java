/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revesion.pkg2;

/**
 *
 * @author SyrianTechnology
 */
public class movie {
    private String title;
    private double duration ;

    public movie(String title, double duration) {
        this.title = title;
        this.setDuration(duration);
    }
    

    

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(double duration) {
        if (duration>0){
         this.duration = duration;
        }
    }
      
   public void get_info(){
       System.out.println("the title of movie:"+title+'\n'+"the duration of movie"+duration );
   } 
}
