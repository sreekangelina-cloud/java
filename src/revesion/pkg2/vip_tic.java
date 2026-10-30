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
public class vip_tic extends ticket {
    private static double price=1000;

    public vip_tic(int numofseat, int hall_id) {
        super(numofseat, hall_id);
    }
    
    @Override
    public double get_price(){
        return price;
    }
}
