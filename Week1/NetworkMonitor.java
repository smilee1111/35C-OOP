public class NetworkMonitor {
    public static void main(String[] args) {
        
    }
}
interface NetworkDevice{
    public String getStatus();
    public boolean isAvailable();
}
class Router implements NetworkDevice{
    private boolean isFunctional;

    public Router(){
        this.isFunctional=true;
    }

    @Override
    public String  getStatus(){
      if(isFunctional){
        return "Rotuer is operational";
      }
      else{
        return "router is not functional";
      }
    }
    @Override
    public boolean isAvailable(){
        return isFunctional;
    }
}

class Switch implements NetworkDevice{
    private boolean isOnline;


    public Switch(){
        this.isOnline=true;
    }
    @Override
    public String  getStatus(){
       if (isOnline){
        return "Switch is online";
       }
       else{
        return "Switch is offline";
       }
    }
    @Override
    public boolean isAvailable(){
        return isOnline;
    }
}

class Hub implements NetworkDevice{
    private boolean isConnected;


    public Hub(){
        this.isConnected=true;
    }
    @Override
    public String  getStatus(){
       if (isConnected){
        return "Hub is connected";
       }
       else{
        return "Hub is not connected";
       }
    }
    @Override
    public boolean isAvailable(){
        return isConnected;
    }
}

