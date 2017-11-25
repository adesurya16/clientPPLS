/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientUser;
import java.lang.String;
/**
 *
 * @author adesu
 */
public class clientRegister {
    public static void main(String[] args){
        String username = "adesuryaramadhani";
        String password = "12345678";
        String name = "ade surya";
        clientRegister client = new clientRegister();
        client.callRegister(username, password, name);
    }
    
    public void callRegister(String username,String password,String name){
        try { // Call Web Service Operation
            com.service.UserService_Service service = new com.service.UserService_Service();
            com.service.UserService port = service.getUserServicePort();
            // TODO initialize WS operation arguments here
            // TODO process result here
            com.service.User result = port.register(username, password, name);
            System.out.println("Result = "+ result);
            System.out.println("Token = " + result.getToken());
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            System.out.println(ex);
        }
    }
}


