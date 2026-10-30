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
public abstract  class ticket {
    private int numofseat;
    private int hall_id;

    public ticket(int numofseat, int  hall_id ) {
        this.numofseat = numofseat;
        this.hall_id = hall_id;
    }

    public int getNumofseat() {
        return numofseat;
    }

   

    public void setNumofseat(int numofseat) {
        this.numofseat = numofseat;
    }

   
    public abstract double get_price();
    
}
