package network;
import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

import Controller.Controller;

public class Client implements Runnable{
    int port = 1515;
    ArrayList<InetAddress> hosts;
    ArrayList<String> names;
    PrintWriter OUT;
    Controller parent;
    int flag=0;
    
    public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
    
    public int getHostsSize(){
    	return hosts.size();
    }
    
    public Client(Controller parent){
        this.parent = parent;
        hosts = new ArrayList();
        names = new ArrayList();
        
        
        try {
        	//hosts.add(InetAddress.getByName("192.168.1.131"));
			//hosts.add(InetAddress.getByName("192.168.1.6"));
			//hosts.add(InetAddress.getByName("192.168.1.112"));
        	
        	hosts.add(InetAddress.getByName("192.168.1.148"));
        	hosts.add(InetAddress.getByName("192.168.1.105"));
        	
        	/*hosts.add(InetAddress.getByName("10.100.216.241"));
        	hosts.add(InetAddress.getByName("10.100.202.3"));*/
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //hosts.add(InetAddress.getByName("ip"));
        names.add("ALL_REGIONS");
        names.add("ASIA_AFRICA");
        
        
        //names.add("PALAWAN");
        
    }
    
    public void run(){
        try{
            try{
                CheckStream(); 
            }
            finally{
                //DISCONNECT();
            }
        }
        catch(Exception X){
        	X.printStackTrace();
            System.out.print(X);
        }
    }
    
    public void CheckStream(){
        while(true){
        	if(flag==1){
        		parent.printMessage("CLIENT STOPPED");
        		break;
        	}
            RECEIVE();
        }
    }
    
    public void RECEIVE(){
        
    }
    
    public void SEND (byte[] msg, InetAddress receiver){
    	try{
			Socket temp = new Socket(receiver,port);
			OutputStream output = temp.getOutputStream();
	        output.write(msg, 0, msg.length);
	        output.flush();
	        temp.close();
            output.close();
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
    
    public boolean checkAllRegionsIfExists(){
    	try{
    		Socket s = new Socket(hosts.get(names.indexOf("ALL_REGIONS")), port);
    		s.close();
    	}catch(IOException e){
    		e.printStackTrace();
    		return false;
    	}
    	return true;
    }
    
    public boolean checkAsiaAfricaIfExists(){
    	try{
    		Socket s = new Socket(hosts.get(names.indexOf("ASIA_AFRICA")), port);
    		s.close();
    	}catch(IOException e){
    		e.printStackTrace();
    		return false;
    	}
    	return true;
    }
    
    public boolean checkEuropeAmericaIfExists(){
    	try{
    		Socket s = new Socket(hosts.get(names.indexOf("EUROPE_AMERICA")), port);
    		s.close();
    	}catch(IOException e){
    		e.printStackTrace();
    		return false;
    	}
    	return true;
    }
    
    public InetAddress getAddressFromName(String name){
    	return hosts.get(names.indexOf(name));
    }
            
}
