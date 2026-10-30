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
public class hall {
 private int hall_id;
 private int  hall_capacity;

    public hall(int hall_id, int hall_capacity) {
        this.hall_id = hall_id;
        this.hall_capacity = hall_capacity;
    }

    public int getHall_id() {
        return hall_id;
    }

    public int getHall_capacity() {
        return hall_capacity;
    }

    public void setHall_id(int hall_id) {
        this.hall_id = hall_id;
    }

    public void setHall_capacity(int hall_capacity) {
        this.hall_capacity = hall_capacity;
    }
  public void describe(){
      System.out.println("the hall id:"+hall_id+'\n'+"the hall capacity:"+hall_capacity);
  }
}
