/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientUser;

/**
 *
 * @author adesu
 */
public class clientGetMyBooking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try { // Call Web Service Operation
            com.service.UserService_Service service = new com.service.UserService_Service();
            com.service.UserService port = service.getUserServicePort();
            // TODO initialize WS operation arguments here
            int userId = 0;
            java.lang.String token = "";
            // TODO process result here
            java.util.List<com.service.Booking> result = port.getMyBooking(userId, token);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }
}
