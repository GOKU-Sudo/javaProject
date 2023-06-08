import java.util.*;

public class Run{

      public static void main(String[] args) {

            while (true) {
                  Server s1 = new Server();
                  
                  Thread t3 = new Thread(
                        () -> {
                              try {
                                    s1.calling1();
                                    Thread.sleep(1000);
                                    // cli.calling2();
                              } catch (Exception e) {
                              }
                        });
                        t3.start();
                        Client cli = new Client();
                  System.out.println("hi");
                  cli.calling2();
                  System.out.println("hi");
                  System.out.println(s1.c1+" "+cli.c);
                  try{  
                        if(s1.c1>=5 || cli.c>=5){

                              cli.fc.dispose();
                              cli.s.close();
                              s1.skt.close();
                              s1.fs.dispose();
                              System.out.println("END");
                        }

                  }
                        catch(Exception skte){
                              cli.fc.dispose();
                              s1.fs.dispose();
                          System.out.println("Error in closing");
                          System.out.println("END");

                        }
                  }

                
            }

      }
