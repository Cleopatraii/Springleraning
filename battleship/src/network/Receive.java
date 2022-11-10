package network;


import java.io.BufferedReader;
import java.io.IOException;

public class Receive implements Runnable{

    @Override
    public void run() {
        BufferedReader br = IOManager.getInstance().getBr();

        String readLine;
        while(true){
            try {
                readLine = br.readLine();
                String s[] = readLine.split(";");
                String command=s[0];

//                if(command.equals("HELLO")){
//                    new Resolve().hello(readLine.substring(5));
//                }


                if(command.equals("START")){
                    new Resolve().start(readLine);
                }

                if(command.equals("START_ACK")){
                    new Resolve().startAck(readLine);
                }

                if(command.equals("READY_PING")){
                    new Resolve().readyPing(readLine);
                }

                if(command.equals("READY_CHK")){
                    new Resolve().readyCheck(readLine);
                }

                if(command.equals("BEGIN")){
                    new Resolve().beginAck(readLine);
                }

                if(command.equals("BEGIN_ACK")){
                    new Resolve().beginAck(readLine);
                }

                if(command.equals("FIRE")){
                    new Resolve().fire(readLine);
                }

                if(command.equals("FIRE_ACK")){
                    new Resolve().fireAck(readLine);
                }
                if(command.equals("END")){
                    new Resolve().endAck(readLine);
                }



            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}