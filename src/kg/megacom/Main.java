package kg.megacom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws ParseException {
	// write your code here


        Comparator<Ipad> comparator = new Comparator<>() {
            @Override
            public int compare(Ipad o1, Ipad o2) {

                if ( (o1.getArrivedDate().after(o2.getArrivedDate()))){
                    return 1;
                }
                if ( (o2.getArrivedDate().after(o1.getArrivedDate()))){
                    return -1;
                }
                return 0;
            }
        };

        PriorityQueue<Ipad> ipadPriorityQueue = new PriorityQueue<>(comparator);
        ipadPriorityQueue.add(new Ipad("Air 2", new SimpleDateFormat("dd-MM-yy").parse("22-01-19")));
        ipadPriorityQueue.add(new Ipad("Air 1", new SimpleDateFormat("dd-MM-yy").parse("22-01-18")));
        ipadPriorityQueue.add(new Ipad("Air 8", new SimpleDateFormat("dd-MM-yy").parse("22-01-21")));
        ipadPriorityQueue.add(new Ipad("Air pro 2", new SimpleDateFormat("dd-MM-yy").parse("22-02-21")));

        while (!ipadPriorityQueue.isEmpty()){
            System.out.println(ipadPriorityQueue.poll().getArrivedDate());
        }

    }
}
