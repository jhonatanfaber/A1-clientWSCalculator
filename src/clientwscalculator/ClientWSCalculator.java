/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwscalculator;

/**
 *
 * @author entrar
 */
public class ClientWSCalculator {

    public static void main(String[] args) {
        System.out.println("La resta es: "+ res(2,3));
        System.out.println("La suma es: "+ res(2,3));
    }

    private static int res(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.res(n1, n2);
    }

    private static int sum(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.sum(n1, n2);
    }
    
    
    
}
