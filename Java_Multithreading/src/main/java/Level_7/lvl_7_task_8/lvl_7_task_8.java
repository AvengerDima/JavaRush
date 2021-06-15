package Level_7.lvl_7_task_8;

/*
Убираем deadLock используя открытые вызовы
*/

import java.util.Set;

public class lvl_7_task_8 {
    public static void main(String[] args) {
        final long deadline = System.currentTimeMillis() + 5000; //waiting for 5 sec

        final RealEstate realEstate = new RealEstate();
        Set<Apartment> allApartments = realEstate.getAllApartments();

        final Apartment[] apartments = allApartments.toArray(new Apartment[allApartments.size()]);

        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        realEstate.revalidate();
                    }
                }
            }, "RealEstateThread" + i).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < apartments.length; i++) {
                        apartments[i].revalidate(true);
                    }
                }
            }, "ApartmentThread" + i).start();
        }

        Thread deamonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (System.currentTimeMillis() < deadline)
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ignored) {
                    }
                System.out.println("Deadlock occurred");
            }
        });
        deamonThread.setDaemon(true);
        deamonThread.start();
    }
}
