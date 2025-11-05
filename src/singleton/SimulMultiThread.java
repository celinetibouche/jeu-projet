package singleton;

import Personnage.Personnage;

public class SimulMultiThread {


	public static void main(String[] args) {
		
        Runnable runnable = new RunnableMultiThread();

        Thread thread1 = new Thread(runnable);
        thread1.start();


        try {
            thread1.join();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(JournalisationSingleton.getInstance().terminerJournal());
    }


    }




