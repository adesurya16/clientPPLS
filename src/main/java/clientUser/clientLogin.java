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
public class clientLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clientLogin client = new clientLogin();
        String username = "adesuryaramadhani";
        String password = "12345678";
        client.callLogin(username, password);
    }
    
    public void callLogin (String username,String password){
        // call login
        try { // Call Web Service Operation
            com.service.UserService_Service service = new com.service.UserService_Service();
            com.service.UserService port = service.getUserServicePort();
            
            // TODO process result here
            com.service.User result = port.login(username, password);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            System.out.println(ex);
        }

    }
}
